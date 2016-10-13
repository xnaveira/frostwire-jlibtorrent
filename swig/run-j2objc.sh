#!/bin/bash

j2objc -sourcepath ../src/main/java -d objc \
    --doc-comments \
    --strip-reflection \
    --swift-friendly \
    -use-arc \
    --no-package-directories \
    --prefix com.frostwire.jlibtorrent.swig= \
    `find ../src/main/java/com/frostwire/jlibtorrent/swig -name '*.java'`
