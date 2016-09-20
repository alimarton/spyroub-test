#!/bin/env bash

# copy the newest version of the index.html to the remote server
scp -P 22 website/index.html $USER_NAME:$PASSWORD@$HOST:$TARGET_FOLDER
