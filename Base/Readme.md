<table>
<tr>
<th>Requirement</th> <th>Description</th> <th>Notes</th>
</tr>
<tr>
<td>Use unique package name</td>
<td>Each mod must be contained within a package unique to that mod, else conflicts may occur upon loading.</td>
<td>Best practice: Use your name as the first component of the package path.  E.g. dhuntley1023.simplestmod</td>
</tr>
<tr>
<td>Place the @Mod annotation just before your main mod class</td>
<td>The @Mod annotation tells Forge that this is a mod to be loaded.  It includes the Mod ID and version, and cn optionally include a human-readable name (though this can be overridden in the mcmod.info file.  E.g.<br>
<code>@Mod(modid = SimplestMod.MODID, name="Simplest Mod", 
      version=SimplestMod.VERSION)
</code></td>
<td>
<ul><li>Requires the following import<br>
 <code>cpw.mods.fml.common.Mod</code>
 	</li>
 	<li>You'll use your mod id string in several places during your mod development.  Define it as a static field in your mod class and reference it wherever you use it to allow you to easily change it later.
 	</li>
 	</ul>
</td>
</tr>
</table>
|}
