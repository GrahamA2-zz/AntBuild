Ant Build Script
----------------

Ant build script for use with Jenkins


----------


Ant build script showing how to:

 1. Split a build across multiple files; the build xml uses separate common, test and doc scripts.  This allows the same set of common tasks to be used for multiple jars.  The common jars can be moved to a parent director
 2. Moving libraries from a lib folder into dist/lib and setting up the manifest.  Useful for projects that need to create multiple jars while keeping third party libraries separate
 3. Separat unit (fast) and other slower tests
