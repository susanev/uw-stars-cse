_CSE 143_

# Comparable class Answers
## Final Study Session

1. TeamData. One possible solution appears below.

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