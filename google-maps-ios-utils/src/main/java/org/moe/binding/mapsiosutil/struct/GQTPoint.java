package org.moe.binding.mapsiosutil.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class GQTPoint extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public GQTPoint() {
		super(GQTPoint.class);
	}

	@Generated
	protected GQTPoint(Pointer peer) {
		super(peer);
	}

	@Generated
	public GQTPoint(double x, double y) {
		super(GQTPoint.class);
		setX(x);
		setY(y);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native double x();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setX(double value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native double y();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setY(double value);
}