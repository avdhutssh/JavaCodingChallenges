#!/bin/bash

# Create a temporary file to hold the commit message
temp_file=$(mktemp /tmp/commit_msg.XXXXXX)

# Open the default text editor to write the commit message
${EDITOR:-nano} "$temp_file"

# Read the commit message from the temporary file
commit_msg=$(cat "$temp_file")

# Check if the commit message is not empty
if [[ -z "$commit_msg" ]]; then
  echo "Aborting commit due to empty commit message."
  exit 1
fi

# Execute git commands
git add .
git commit -m "$commit_msg"
git push origin

# Clean up the temporary file
rm "$temp_file"

# Print a success message
echo "Changes have been successfully pushed to the repository."
