_CSE 143_
# Quiz Answers
## Week 5

1. Recursive Tracing

	| Call | Output |
	| :--- | :--- |
	| `mystery("sce", 'c');` | `cse` | 
	| `mystery("static", 't');` | `ttsaic` |  
	| `mystery("banana", 'a');` | `aaabnn` |  
	| `mystery("java", 'j');` | `java` |  
	| `mystery("ALL", 'L');` | `LLA` | 

1. Write what the method returns, given the specified inputs. If the method will enter an infinite recursion, say "infinite recursion".

	| Call | Output |
	| :--- | :--- |
	| `mystery(6,5);` | `**` |
	| `mystery(-5,-4)` | `!**` |
	| `mystery(3,1)` | infinite recursion |
	| `mystery(4,6)` | `!**!` |
	| `mystery(3,6)` | `!**!!**` |