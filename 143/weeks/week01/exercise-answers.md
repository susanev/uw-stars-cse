_CSE 143_
# Exercise Answers
## Week 1

1. Two possible answers are shown below.

	```java
	public void stutter() {
		for (int i = size - 1; i >= 0; i--) {
			elementData[2 * i + 1] = elementData[i];
			elementData[2 * i] = elementData[i];
		}
		size *= 2;
	}
	```

	```java
	public void stutter() {
		int index = size - 1;
		for (int i = size * 2 - 1; i > 0; i-=2) {
			elementData[i] = elementData[index];
			elementData[i - 1] = elementData[index];
			index--;
		}
		size *= 2;
	}
	```

1. One possible answer is shown below.

	```java
  public void mirror() {
  	for (int i = size; i < size * 2; i++) {
  		elementData[i] = elementData[size * 2 - 1 - i];
  	}
  	size *= 2;
  }
	```