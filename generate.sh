#!/bin/bash
./gradlew cleanArch 
./gradlew generate -Dcom.orctom.gradle.archetype.binding.camelName=SbmvtAbc -i
