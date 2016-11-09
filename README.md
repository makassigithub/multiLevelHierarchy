# multiLevelHierarchy

This sample program is to demonstrate how multi-level inheritance works in java.
1.One of the advantages of inheritance is that is makes a code reusable and save some time in hard coding.
2.A superclass can have as many as subclass possible but a subclass can have only one superclass
3.A subclass can also be a superclass when extended.this can be qualified as multilevel inheritance.
4.if a class A is extended by a class B, which is extended by a class C, B inherits the all the members of A 
and C inherits both the members of A and B
5. If the constructor of A takes parameters, the "super" called in B must provide the parameters within A constructor and so on.
6. the "super" keyword in the subclass must be called before the specific parameters of the constructor is initialized.
7. during runtime, the superclass object is created before the subclass object. this is demonstrated by the empty constructor in the code
8. the  "super" keyword not only call on the superclass constructor, but can also be used to access the superclass members(instance variable)
    in case those menbers are hidden by the subclass members. but as for methods, JVM use dynamic-method-dispatch to solve ambiguity issues
    (refer to dynamic-method dispatch in the repository list).
    
    
    
    
    Ce programme démontre comment l'héritage multi-niveau fonctionne en Java.
1.Un des avantages de l'héritage est que ca rend un code réutilisable et économise du temps de codage.
2. Une superclasse peut avoir autant que la sous-classe possible, mais une sous-classe peut avoir une seule superclasse
3. Une sous-classe peut également être une superclasse quand quand elle se fait heriter.ceci peut-etre qualifié d'héritage multiniveau.
4.si une classe A est heritée par une classe B, qui est heritée par une classe C, B hérite de tous les membres de A
Et C hérite à la fois les membres de A et B
5. Si le constructeur de A prend des paramètres, le «super» appelé dans B doit fournir les meme paramètres que dans le constructeur de A et ainsi de suite.
6. Le mot-clé "super" dans la sous-classe doit être appelé avant que les paramètres spécifiques du constructeur ne soient initialisé.
7. Pendant l'exécution, l'objet superclasse est créé avant l'objet de sous-classe. Cela est démontré par le constructeur vide dans le code
8. le mot-clé "super" n'appelle pas seulement le constructeur de la superclasse, mais peut aussi être utilisé pour accéder aux membres de la superclasse (variable d'instance)
    Dans le cas où ces membres sont masqués par les membres de la sous-classe. Mais en ce qui concerne les méthodes, la JVM utilise la méthode dynamique de répartition pour résoudre les problèmes d'ambiguïté
    (Reportez-vous à l'envoi de la méthode dynamique be mon compte).
