package com.warofcosmo.cosmo;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public abstract class AbstractEntity implements ActionListener,IEntity{
	
	protected Image _gfx;
	protected Board _board;
	protected int _x;
	protected int _y;
	protected int _width;
	protected int _height;
	protected int _speed=1;
	protected int _direction;
	protected int _dy;
	protected int _dx;
	protected ArrayList<ImageIcon> _shipimg;
	private int curhealth;
	private int maxhealth;
        protected ArrayList<ImageIcon> _staticimg;
	
	public AbstractEntity(Board brd){
		
		_shipimg = new ArrayList<ImageIcon>();
		
                ImageIcon i = new ImageIcon(getClass().getResource("/s0.png"));
                _gfx = i.getImage();


		fillCycleImages();
		_board = brd;
	}
	
	protected void fillCycleImages(){
		//for(int i = 0; i < 3; i++){
			_shipimg.add(new ImageIcon(getClass().getResource("/s0.png")));
                        _shipimg.add(new ImageIcon(getClass().getResource("/su.png")));
                        _shipimg.add(new ImageIcon(getClass().getResource("/sd.png")));
		//}
	}
        
   
	
	@Override
	public int getX() {
		return _x;
	}

	@Override
	public int getY() {
		return _y;
	}


	@Override
	public void setX(int x) {
		_x = x;
	}

	@Override
	public void setY(int y) {
		_y = y;
	}

	
	@Override
	public int getHealth() {
		return curhealth;
	}

	@Override
	public int getMaxHealth() {
		return maxhealth;
	}

	
	@Override
	public Image getImage() {
		return _gfx;
	}
	
	@Override
	public int getDx() {
		return _dx;
	}
	
        @Override
	public int getDy() {
		return _dy;
	}
	
        @Override
	public void setDx(int dx) {
		_dx = dx;
	}
	
        @Override
	public void setDy(int dy) {
		_dy = dy;
	}
	
        @Override
	public void setGFX(Image i) {
		_gfx = i;
	}
        
        @Override
	public Image getGFX() {
		return _gfx;
	}
	
        @Override
	public Board getBoard() {
		return _board;
	}
        
        @Override
	public int getDirection() {
		return _direction;
	}
        
        @Override
	public void setDirection(int dir) {
		_direction = dir;
	}
}
