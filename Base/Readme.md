{|
! Requirement!! Description !! Notes
|-
|Use unique package name
|Each mod must be contained within a package unique to that mod, else conflicts may occur upon loading.
|Best practice: Use your name as the first component of the package path.  E.g. 
 dhuntley1023.simplestmod
|-
|Place the @Mod annotation just before your main mod class
|The @Mod annotation tells Forge that this is a mod to be loaded.  It includes the Mod ID and version, and cn optionally include a human-readable name (though this can be overridden in the mcmod.info file.  E.g.
 @Mod(modid = SimplestMod.MODID, name="Simplest Mod", 
      version=SimplestMod.VERSION)
|*Requires the following import
 cpw.mods.fml.common.Mod
*You'll use your mod id string in several places during your mod development.  Define it as a static field in your mod class and reference it wherever you use it to allow you to easily change it later.
|}