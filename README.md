Compilation.
</br>1)cd ..there should be path to the root directory of our project
</br>2)mkdir bin
</br>3)javac -sourcepath ./src -d bin src/main/java/com/leverx/kazlovich/Main.java
</br>
</br>Create jar.
</br>1)echo main-class: main.java.com.leverx.kazlovich.Main>manifest.mf
</br>2)jar -cmf manifest.mf main.jar -C bin .
</br>
</br>Interpretation.
</br>1)java -jar main.jar
</br>You will get a custom Exception.
