package com.codewithsnake;

public class Player1 {
        private String name;

        private String weapon1;

        private String weapon2;
        private int health;

        public Player1(String name, String weapon1,String weapon2,int health) {
            this.name = name;
            this.weapon1 = weapon1;
            this.weapon2 = weapon2;
            if(health < 0 || health > 100){
                this.health = 100;
            }else this.health = health;
        }

        public void damageByGun1(){
            this.health -= 30;
            if(this.health <=0){
                this.health = 0;
            }
            System.out.println("Got hit by weapon1("+weapon1 +" ).Health is reduced by 30" +
                    ". New health is "+ this.health);
            if(this.health == 0){
                System.out.println(getName()+" is dead");
            }
        }
        public void damageByGun2(){
            this.health -= 50;
            if(this.health <=0){
                this.health = 0;
            }
            System.out.println("Got hit by weapon2("+weapon2+"). Health is reduced by 50" +
                    ". New health is "+ this.health);
            if(this.health == 0){
                System.out.println(getName()+" is dead");
            }
        }

        public void heal(){
            if(this.health <= 0 ) System.out.println("Player is dead. Heal not possible");
            else{
                this.health = 100;
                System.out.println("Health is "+this.health);
            }
        }

        public void painkiller(){
             this.health -= 50;
             if(this.health<=50) {
                 this.health = 70;
             }
                 System.out.println("The player had used the pain killer.Now the health is " + this.health);
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWeapon1() {
            return weapon1;
        }

        public void setWeapon1(String weapon1) {
            this.weapon1 = weapon1;
        }

        public String getWeapon2() {
             return weapon2;
        }

        public void setWeapon2(String weapon2) {
             this.weapon2 = weapon2;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }
    }



