package com.logic.spEl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class SpExpression {
		
	@Value("#{22+11}")
	private int x;
	@Value("#{22+54+6+2+9}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{8>3}")
	private boolean check;
	
	
	
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "SpExpression [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", check=" + check + "]";
	}
	
	
	
}
