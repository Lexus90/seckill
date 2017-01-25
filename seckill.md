### 一、创建

1. mvn archetype:generate -DgroupId=org.seckill -DartifactId=seckill -DarchetypeArtifactId=maven-archetype-webapp


### github


1. List your existing remotes in order to get the name of the remote you want to change.
	
		git remote -v 

2. Change your remote's URL from SSH to HTTPS with the git remote set-url command.

		git remote set-url origin 
		
3. update remote repository 

		1. git add some file
		2. git commit -m "describe"
		3. git push
		
4. git status