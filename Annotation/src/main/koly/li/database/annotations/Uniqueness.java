package koly.li.database.annotations;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
