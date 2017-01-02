_CSE 143_
# Exercise Answers
## Week 1

1. One possible answer is shown below.

	```java
	public void stutter() {
		int index = size - 1;
		for (int i = size * 2 - 1; i > 0; i-=2) {
			int element = elementData[index];
			index--;
			elementData[i] = element;
			elementData[i - 1] = element;
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