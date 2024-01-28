# Notes

These notations are marked for deprecation:

  ```java
  int i = 10;
  Integer iWrapped = new Integer(i);
  ```

Output:
> | Warning:
>
>| Integer(int) in java.lang.Integer has been deprecated and marked for removal
>
>| Integer iWrap = new Integer(i);

Use:

```java
Integer integer = Integer.valueOf(i);
```

To get the value:

```java
int unWrapped = iWrap.intValue();
```



