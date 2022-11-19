
    public class Boss extends GameEntity {
    String bossWeapon = new String();

        public String getBossWeapon(WeaponType steel) {
            return bossWeapon;
        }

        public void setBossWeapon(String bossWeapon) {
            this.bossWeapon = bossWeapon;
        }
    }
