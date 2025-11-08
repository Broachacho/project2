package main;

import object.Obj_Key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp)
    {
        this.gp = gp;
    }
    
    public void setObject(){
    	gp.obj[0]= new Obj_Key();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;
        
        gp.obj[1] = new Obj_Key();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 * gp.tileSize;

        gp.obj[2] = new Obj_Key();
        gp.obj[2].worldX = 37 * gp.tileSize;
        gp.obj[2].worldY = 7 * gp.tileSize;

         gp.obj[2] = new Obj_Boots();
        gp.obj[2].worldX = 37 * gp.tileSize;
        gp.obj[2].worldY = 42 * gp.tileSize;
    }
}

