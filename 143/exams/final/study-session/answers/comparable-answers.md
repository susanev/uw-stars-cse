_CSE 143_

# Comparable class Answers
## Final Study Session

1. TeamData. One possible solution appears below.

	```java
	public class TeamData implements Comparable<TeamData> {
		private String name;
		private int solved;
		private int totalTime;
		private int problems;

		public TeamData(String name, int problems) {
			this.name = name;
			this.problems = problems;
			this.totalTime = 0;
			this.solved = 0;
		}

		public void success(int problem, int time) {
			solved++;
			totalTime += time;
		}

		public String toString() {
			return name + " solved " + solved + " of " + problems + " in "
					+ totalTime + " minutes";
		}

		public int solved() {
			return solved;
		}

		public int time() {
			return totalTime;
		}

		public double percentCorrect() {
			return 100.0 * solved / problems;
		}

		public int compareTo(TeamData other) {
			if (solved != other.solved)
				return other.solved - solved;
			else
				return totalTime - other.totalTime;
		}
	}
	```

1. RadioStation. One possible solution appears below.

	```java
	public class RadioStation implements Comparable<RadioStation> {
		private String name;
		private String band;
		private double station;
		private RadioStation link;

		public RadioStation(String name, String band, double station) {
			this.name = name;
			this.band = band;
			this.station = station;
		}

		public int compareTo(RadioStation other) {
			if (!band.equals(other.band))
				return band.compareTo(other.band);
			double difference = station - other.station;
			if (difference < 0)
				return -1;
			else if (difference == 0)
				return 0;
			else // difference > 0
				return 1;
		}

		public String getName() {
			return name;
		}

		public String getBand() {
			return band;
		}

		public double getStation() {
			return station;
		}

		public void simulcast(RadioStation other) {
			link = other;
			other.link = this;
		}

		public String toString() {
			String result = name + " " + band + " " + station;
			if (link != null)
				result += " (simulcast on " + link.band + " " + link.station + ")";
			return result;
		}
	}
	```

1. AdmissionsEntry. One possible solution appears below.

	```java
	public class AdmissionsEntry implements Comparable<AdmissionsEntry> {
		private String ID;
		private int ratings;
		private double total;
		private boolean discuss;

		public AdmissionsEntry(String ID) {
			this.ID = ID;
			this.ratings = 0;
			this.total = 0.0;
			this.discuss = false;
		}

		public void rate(double rating) {
			ratings++;
			total += rating;
			if (rating >= 4) {
				discuss = true;
			}
		}

		public void flag() {
			discuss = true;
		}

		public String getID() {
			return ID;
		}

		public double getRating() {
			if (ratings == 0) {
				return 0.0;
			} else {
				return total / ratings;
			}
		}

		public String toString() {
			return ID + ": " + Math.round(100 * getRating()) / 100.0;
		}

		public int compareTo(AdmissionsEntry other) {
			if (discuss && !other.discuss) {
				return -1;
			} else if (!discuss && other.discuss) {
				return 1;
			} else if (getRating() > other.getRating()) {
				return -1;
			} else if (getRating() < other.getRating()) {
				return 1;
			} else {
				return ID.compareTo(other.ID);
			}
		}
	}
	```

1. RentalCar. One possible solution appears below.

	```java
	public class RentalCar implements Comparable<RentalCar> {
		private String model;
		private String name;
		private double mileage;
		private RentalCar replaced;

		public RentalCar(String model, String name, double mileage) {
			if (mileage < 0) {
				throw new IllegalArgumentException();
			}
			this.model = model;
			this.name = name;
			this.mileage = mileage;
		}

		public void setReplaced(RentalCar other) {
			replaced = other;
		}

		public boolean isReplacement() {
			return replaced != null;
		}


		public int compareTo(RentalCar other) {
			if (!model.equals(other.model)) {
				return model.compareTo(other.model);
			}
			double diff = mileage - other.mileage;
			if (diff < 0) {
				return -1;
			} else if (diff > 0) {
				return 1;
			} else {
				return 0;
			}
		}

		public String toString() {
			String result = model + ", " + name + ": " + mileage + " miles";
			if (replaced != null) {
				result += (" (replaced " + replaced.model + ", " + replaced.name + ")");
			}
			return result;
		}
	}
	```