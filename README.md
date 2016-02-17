
# PainlessPrefs [![](https://jitpack.io/v/cesarferreira/painlessprefs.svg)](https://jitpack.io/#cesarferreira/painlessprefs)

> Static way to set/get shared preferences

As simple as it gets:

```java
// save key/value pair
PainlessPrefs.getInstance(context)
	.save("some boolean key", true);

// getting it back
boolean someBoolean =
	PainlessPrefs.getInstance(context)
	.getBoolean("some boolean key", false);

```

## Installation

Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

Now add your dependency:
```groovy
dependencies {
	compile 'com.github.cesarferreira:painlessprefs:0.1.0'
}
```
