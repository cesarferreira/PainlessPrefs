
# PainlessPrefs [![](https://jitpack.io/v/cesarferreira/PainlessPrefs.svg)](https://jitpack.io/#cesarferreira/PainlessPrefs)

> Static way to set/get shared preferences

As simple as it gets:

```java
// save key/value pair
PainlessPrefs.getInstance(context)
	.save("SOME_KEY", true);

// getting it back
boolean someBoolean =
	PainlessPrefs.getInstance(context)
	.getBoolean("SOME_KEY", DEFAULT_VALUE);

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
	compile 'com.github.cesarferreira:PainlessPrefs:0.1.0'
}
```
