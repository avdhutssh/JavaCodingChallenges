#!/bin/bash

# Prompt the user for a commit message
read -p "Enter commit message: " commit_msg

# Execute git commands
git add .
git commit -m "$commit_msg"
git push origin

# Print a success message
echo "Changes have been successfully pushed to the repository."

