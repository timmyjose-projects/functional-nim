This is a simple implementation of the `Nim` game in a functional style in Java (8 and above).

The inspiration for this is the beautiful implementation in Haskell by Professor Graham Hutton in his
book, "Programming in Haskell" (2nd Edition).


## Usage
```
	$ mvn exec:java -Dexec.mainClass=com.z0ltan.functional.nim.App
```

or

```
	$ java -jar target/functional-nim-1.0-SNAPSHOT.jar
```


## Build
```
	$ mvn clean && mvn compile
```

or

```
	$ mvn clean && mvn package
```


## Demo

Using `mvn clean && mvn compile`:

```

Macushla:functional-nim z0ltan$ mvn exec:java -Dexec.mainClass=com.z0ltan.functional.nim.App
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building functional-nim 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ functional-nim ---
1: * * * * *
2: * * * *
3: * * *
4: * *
5: *
Player 1 Enter a row number: 1
Enter the number of stars to remove: 6
ERROR: invalid move!
1: * * * * *
2: * * * *
3: * * *
4: * *
5: *
Player 1 Enter a row number: 1
Enter the number of stars to remove: 4
1: *
2: * * * *
3: * * *
4: * *
5: *
Player 2 Enter a row number: 2
Enter the number of stars to remove: 4
1: *
2:
3: * * *
4: * *
5: *
Player 1 Enter a row number: 5
Enter the number of stars to remove: 1
1: *
2:
3: * * *
4: * *
5:
Player 2 Enter a row number: 3
Enter the number of stars to remove: 4
ERROR: invalid move!
1: *
2:
3: * * *
4: * *
5:
Player 2 Enter a row number: 3
Enter the number of stars to remove: 3
1: *
2:
3:
4: * *
5:
Player 1 Enter a row number: 1
Enter the number of stars to remove: 1
1:
2:
3:
4: * *
5:
Player 2 Enter a row number: 4
Enter the number of stars to remove: 2
1:
2:
3:
4:
5:
Player 2 wins
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 50.627 s
[INFO] Finished at: 2017-07-11T00:32:31+05:30
[INFO] Final Memory: 9M/32M
[INFO] ------------------------------------------------------------------------

```

Using `mvn package`:

```

Macushla:functional-nim z0ltan$ java -jar target/functional-nim-1.0-SNAPSHOT.jar
1: * * * * *
2: * * * *
3: * * *
4: * *
5: *
Player 1 Enter a row number: 1
Enter the number of stars to remove: 5
1:
2: * * * *
3: * * *
4: * *
5: *
Player 2 Enter a row number: 2
Enter the number of stars to remove: 4
1:
2:
3: * * *
4: * *
5: *
Player 1 Enter a row number: 3
Enter the number of stars to remove: 2
1:
2:
3: *
4: * *
5: *
Player 2 Enter a row number: 3
Enter the number of stars to remove: 1
1:
2:
3:
4: * *
5: *
Player 1 Enter a row number: 4
Enter the number of stars to remove: 2
1:
2:
3:
4:
5: *
Player 2 Enter a row number: 5
Enter the number of stars to remove: 1
1:
2:
3:
4:
5:
Player 2 wins

```
