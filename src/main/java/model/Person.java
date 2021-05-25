package model;

import lombok.*;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderMethodName = "PersonBuilder")
public class Person {
    @NonNull
    @EqualsAndHashCode.Include
    private int id;
    @EqualsAndHashCode.Exclude
    @ToString.Include
    private String name;
    @EqualsAndHashCode.Exclude
     private String surName;
    @EqualsAndHashCode.Exclude
     @Getter(AccessLevel.PRIVATE)
     private int number;
    @EqualsAndHashCode.Exclude
     private int years;
     @ToString.Include
     public int years(){
         return this.years;
     }

}
