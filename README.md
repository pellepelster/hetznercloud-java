Hetzner Cloud API for Java
==========================

Simple Java client for the Hetzner Cloud API.

The current version is **0.1**.

It would be nice, if you submit pull requests.

## Compile

You can simply compile it with Maven.

Just run ``mvn clean install`` to install it in your local Maven-repository.

## How to use

##### Maven

Repository:

```xml
<repositories>
    <repository>
           <id>hetznercloud-api</id>
           <url>https://maven.tomsdevsn.me/repository/hetznercloud-api/</url>
    </repository>
</repositories>
```

Dependency:

```xml
<dependencies>
    <dependency>
        <groupId>me.tomsdevsn</groupId>
        <artifactId>hetznercloud-api</artifactId>
        <version>0.1</version>
        <scope>compile</scope>
    </dependency>
</dependencies>
```

##### Gradle 

You have to edit the ``build.gradle``

```
repositories({
    maven {
        url 'https://maven.tomsdevsn.me/repository/hetznercloud-api/'
    }
})

dependencies({
    compile "me.tomsdevsn:hetznercloud-api:0.1"
})
```