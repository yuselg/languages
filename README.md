# Languages
Comparison of some first year teaching languages for beginners. How do we get **engagement** -- versus, how do we get competence in **computational thinking** (basic algorithms and data structures)?

* Javascript
* Python 
* Java


#  A simple problem
---
**Fizzbuzz**: [A common coding question in interviews](https://medium.freecodecamp.org/a-software-engineering-survival-guide-fe3eafb47166):

**Interviews** They can be awful for everybody involved. Having been both an interviewer and an interviewee, I can attest that interviews are a big time sink, extremely stressful and a really bad indicator of future job performance. Nevertheless, they are a necessary evil that you and your résumé better be prepared for. If you’re considering a career in Software Engineering, make sure to learn some of the most commonly asked programming interview questions, such as ‘FizzBuzz’:

“Write a program that prints the numbers from 1 to 100. But for multiples of three print ‘Fizz’ instead of the number and for the multiples of five print ‘Buzz’. For numbers which are multiples of both three and five print ‘FizzBuzz’.”
(Coding Horror)

Sounds simple enough, right?

Well, the vast majority of interviewees fail this simple test, let alone its more complex variants. (Of course, you also need to know basic algorithms and datas structures, etc. ..)

[Why Can't Programmers.. Program?](https://blog.codinghorror.com/why-cant-programmers-program/)

I was incredulous when I read this observation from Reginald Braithwaite:

Like me, the author is having trouble with the fact that 199 out of 200 applicants for every programming job can't write code at all. I repeat: they can't write any code whatsoever. ...

A surprisingly large fraction of applicants, even those with masters' degrees and PhDs in computer science, fail during interviews when asked to carry out basic programming tasks. 

---

## Javascript

The web page should look as follows (execute it [here](https://www.eecs.yorku.ca/~eiffel/langs/fizzbuzz.html)):

![png](javascript/fizzbuzz.png)

Javascript embedded in the html scaffolding ([source](javascript/fizzbuzz.html)) would look something like:

![png](javascript/html.png)

Students have to learn html, css and Javascript just to write procedural programs. The HTML scaffolding gets in the way of the procedural learning. Flashy webapps have more to do with colourful buttons and forms rather than writing loops (algorithmic thinking). 

We could use **nano** (JS at the server end) to write and test pure Javascript code free of its scaffolding, but then we would lose student engagement (flashy web apps). We might then consider simpler languages such as Python. 

In the web-app mode, it is also relatively difficult for students to write unit tests (see Qunit, for example). Debuggers in browsers are also fairly hard to master.

## Java

A Java version of Fizzbuzz ([source](Java/Fizzbuzz.java))  might look as follows:

![png](Java/java.png)

Although we do not have the distraction of HTML scaffolding, we do need to inform beginning students to ignore kewords such as **static** and **void**, and OO concepts such as `Scanner input = new Scanner(System.in);` just to get input.

IDE's such as Eclipse are available and support unit tests, but there is a learning curve and Unit testing requires some knowledge of OO. 

Static typing is a plus for student comprehension of computation.

**Object Oriented thinking** and **Procedural thinking** are intertwined in Java and cause confussion for beginners.

## Python

A Python version of Fizzbuzz ([source](Python/fizzbuzz.py))  might look as follows:

![png](Python/python.png)

Relatively simple IDE's such as VS Code support debugging. There is no HTLM scaffolding, or the distraction of OO. Thus beginning students can focus on the computational core.

How do we get engagement? Perhaps at the end of the course with nice examples from Data Science, Machine Learning or webapps (such as Flask). But that would come at the end, not the beginning. 






