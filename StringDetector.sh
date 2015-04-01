#!/bin/bash
echo "the file to be detected is: $1\n"
Strings $1 > string.txt
