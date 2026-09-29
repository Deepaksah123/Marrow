package kotlin;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.AbstractFloatValueParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u001f\u0010\u000e\u001a\u00020\u00162\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ!\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010\u000e\u001a\u00020 2\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u000e\u0010!JA\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\"J\u001d\u0010$\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b$\u0010%J?\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070&H\u0002¢\u0006\u0004\b\u000e\u0010'JG\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b\u000e\u0010(JO\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060&H\u0002¢\u0006\u0004\b\u000e\u0010)J\u001f\u0010\u001e\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010*J1\u0010+\u001a\u00020 2\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b+\u0010,JI\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b+\u0010/J%\u0010$\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\n2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b$\u00100J]\u0010\u0010\u001a\u00020 2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010.\u001a\u00020\n2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0010\u00102JW\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\n2\u0016\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u00103Jm\u0010\u0010\u001a\u00020 2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010.\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u00101\u001a\u00020\n2\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0010\u00105J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u00108J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u00107J;\u0010+\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u00109J?\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020-H\u0002¢\u0006\u0004\b+\u0010:J1\u0010\u0010\u001a\u00020 2\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010;JA\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020-H\u0002¢\u0006\u0004\b\u0010\u0010:J\u001d\u0010<\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b<\u0010%J!\u0010\u0010\u001a\u00020\u00162\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160=¢\u0006\u0004\b\u0010\u0010>J#\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160=H\u0002¢\u0006\u0004\b\u0018\u0010>J1\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u001aJ7\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010?J3\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160=2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020-H\u0002¢\u0006\u0004\b\u0018\u0010@JC\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160=2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020-H\u0002¢\u0006\u0004\b\u0018\u0010AJw\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160=2\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060B2\u0014\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060BH\u0002¢\u0006\u0004\b\u0013\u0010CJ \u0010D\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bD\u0010EJG\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b\u0018\u0010/J\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000FH\u0096\u0002¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000IH\u0016¢\u0006\u0004\bJ\u0010KJ\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I2\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\bJ\u0010LJ%\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060M2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010LR\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR \u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010PR\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010PR\u001c\u0010+\u001a\u00020\n8\u0001@\u0000X\u0080\f¢\u0006\f\n\u0004\b\u0018\u0010Q\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0013\u001a\u00020R8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010SR8\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\b+\u0010\u001dR4\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b+\u0010P\u001a\u0004\bN\u0010\u001dR$\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\b\u0018\u0010\u000f"}, d2 = {"Lo/parseFloatingPointLiteral;", "E", "Lo/UpgradePlanResponseV2;", "Lo/AbstractFloatValueParser$AudioAttributesCompatParcelizer;", "Lo/AbstractFloatValueParser;", "p0", "", "", "p1", "p2", "", "p3", "<init>", "(Lo/AbstractFloatValueParser;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "read", "()I", "IconCompatParcelizer", "()Lo/AbstractFloatValueParser;", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "(I)I", "AudioAttributesImplApi21Parcelizer", "", "([Ljava/lang/Object;)Z", "write", "([Ljava/lang/Object;)[Ljava/lang/Object;", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "(Ljava/lang/Object;)[Ljava/lang/Object;", "MediaBrowserCompatCustomActionResultReceiver", "()[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)Z", "", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "", "addAll", "(Ljava/util/Collection;)Z", "", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "(ILjava/lang/Object;)V", "RemoteActionCompatParcelizer", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Lo/AbstractJavaFloatingPointBitsFromCharArray;", "p4", "([Ljava/lang/Object;IILjava/lang/Object;Lo/AbstractJavaFloatingPointBitsFromCharArray;)[Ljava/lang/Object;", "(ILjava/util/Collection;)Z", "p5", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "p6", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "(I)[Ljava/lang/Object;", "([Ljava/lang/Object;III)Ljava/lang/Object;", "([Ljava/lang/Object;IILo/AbstractJavaFloatingPointBitsFromCharArray;)[Ljava/lang/Object;", "([Ljava/lang/Object;II)V", "removeAll", "Lkotlin/Function1;", "(Lo/getAnswerMap;)Z", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "(Lo/getAnswerMap;ILo/AbstractJavaFloatingPointBitsFromCharArray;)I", "(Lo/getAnswerMap;[Ljava/lang/Object;ILo/AbstractJavaFloatingPointBitsFromCharArray;)I", "", "(Lo/getAnswerMap;[Ljava/lang/Object;IILo/AbstractJavaFloatingPointBitsFromCharArray;Ljava/util/List;Ljava/util/List;)I", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "", "MediaBrowserCompatItemReceiver", "Lo/AbstractFloatValueParser;", "[Ljava/lang/Object;", "I", "Lo/estimateNumBits;", "Lo/estimateNumBits;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class parseFloatingPointLiteral<E> extends UpgradePlanResponseV2<E> implements AbstractFloatValueParser.AudioAttributesCompatParcelizer<E> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Object[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private Object[] read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private estimateNumBits AudioAttributesCompatParcelizer = new estimateNumBits();

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private Object[] IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private AbstractFloatValueParser<? extends E> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Object[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public parseFloatingPointLiteral(AbstractFloatValueParser<? extends E> abstractFloatValueParser, Object[] objArr, Object[] objArr2, int i) {
        this.write = abstractFloatValueParser;
        this.read = objArr;
        this.IconCompatParcelizer = objArr2;
        this.RemoteActionCompatParcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = this.read;
        this.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = this.write.size();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Object[] getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Object[] getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.UpgradePlanResponseV2
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int read() {
        return ((AbstractList) this).modCount;
    }

    @Override // o.AbstractFloatValueParser.AudioAttributesCompatParcelizer
    public final AbstractFloatValueParser<E> IconCompatParcelizer() {
        parseDecFloatLiteral parsedecfloatliteral;
        if (this.MediaBrowserCompatCustomActionResultReceiver == this.read && this.AudioAttributesImplBaseParcelizer == this.IconCompatParcelizer) {
            parsedecfloatliteral = this.write;
        } else {
            this.AudioAttributesCompatParcelizer = new estimateNumBits();
            Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
            this.read = objArr;
            Object[] objArr2 = this.AudioAttributesImplBaseParcelizer;
            this.IconCompatParcelizer = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    parsedecfloatliteral = lookupHex.read();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, size());
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
                    parsedecfloatliteral = new valueOfHexLiteral(objArrCopyOf);
                }
            } else {
                toMagicModuleMetaRepoModel.write(objArr);
                parsedecfloatliteral = new parseDecFloatLiteral(objArr, this.AudioAttributesImplBaseParcelizer, size(), this.RemoteActionCompatParcelizer);
            }
        }
        this.write = parsedecfloatliteral;
        return (AbstractFloatValueParser<E>) parsedecfloatliteral;
    }

    private final int AudioAttributesImplApi26Parcelizer() {
        if (size() <= 32) {
            return 0;
        }
        return lookupHex.IconCompatParcelizer(size());
    }

    private final int AudioAttributesCompatParcelizer(int p0) {
        return p0 <= 32 ? p0 : p0 - lookupHex.IconCompatParcelizer(p0);
    }

    private final int AudioAttributesImplApi21Parcelizer() {
        return AudioAttributesCompatParcelizer(size());
    }

    private final boolean read(Object[] p0) {
        return p0.length == 33 && p0[32] == this.AudioAttributesCompatParcelizer;
    }

    private final Object[] write(Object[] p0) {
        if (p0 == null) {
            return MediaBrowserCompatCustomActionResultReceiver();
        }
        return read(p0) ? p0 : getOrderDetails.read(p0, MediaBrowserCompatCustomActionResultReceiver(), 0, getQues.RemoteActionCompatParcelizer(p0.length, 32), 6);
    }

    private final Object[] AudioAttributesCompatParcelizer(Object[] p0, int p1) {
        if (read(p0)) {
            return getOrderDetails.RemoteActionCompatParcelizer(p0, p0, p1, 0, 32 - p1);
        }
        return getOrderDetails.RemoteActionCompatParcelizer(p0, MediaBrowserCompatCustomActionResultReceiver(), p1, 0, 32 - p1);
    }

    private final Object[] AudioAttributesCompatParcelizer(Object p0) {
        Object[] objArr = new Object[33];
        objArr[0] = p0;
        objArr[32] = this.AudioAttributesCompatParcelizer;
        return objArr;
    }

    private final Object[] MediaBrowserCompatCustomActionResultReceiver() {
        Object[] objArr = new Object[33];
        objArr[32] = this.AudioAttributesCompatParcelizer;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E p0) {
        ((AbstractList) this).modCount++;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (iAudioAttributesImplApi21Parcelizer < 32) {
            Object[] objArrWrite = write(this.AudioAttributesImplBaseParcelizer);
            objArrWrite[iAudioAttributesImplApi21Parcelizer] = p0;
            this.AudioAttributesImplBaseParcelizer = objArrWrite;
            this.AudioAttributesImplApi26Parcelizer = size() + 1;
        } else {
            read(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer(p0));
        }
        return true;
    }

    private final void read(Object[] p0, Object[] p1, Object[] p2) {
        int size = size();
        int i = this.RemoteActionCompatParcelizer;
        if ((size >> 5) > (1 << i)) {
            this.MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(p0), p1, this.RemoteActionCompatParcelizer + 5);
            this.AudioAttributesImplBaseParcelizer = p2;
            this.RemoteActionCompatParcelizer += 5;
            this.AudioAttributesImplApi26Parcelizer = size() + 1;
            return;
        }
        if (p0 == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = p1;
            this.AudioAttributesImplBaseParcelizer = p2;
            this.AudioAttributesImplApi26Parcelizer = size() + 1;
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer(p0, p1, i);
            this.AudioAttributesImplBaseParcelizer = p2;
            this.AudioAttributesImplApi26Parcelizer = size() + 1;
        }
    }

    private final Object[] AudioAttributesCompatParcelizer(Object[] p0, Object[] p1, int p2) {
        int iWrite = lookupHex.write(size() - 1, p2);
        Object[] objArrWrite = write(p0);
        if (p2 == 5) {
            objArrWrite[iWrite] = p1;
            return objArrWrite;
        }
        objArrWrite[iWrite] = AudioAttributesCompatParcelizer((Object[]) objArrWrite[iWrite], p1, p2 - 5);
        return objArrWrite;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> p0) {
        if (p0.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        Iterator<? extends E> it = p0.iterator();
        if (32 - iAudioAttributesImplApi21Parcelizer >= p0.size()) {
            this.AudioAttributesImplBaseParcelizer = read(write(this.AudioAttributesImplBaseParcelizer), iAudioAttributesImplApi21Parcelizer, it);
            this.AudioAttributesImplApi26Parcelizer = size() + p0.size();
        } else {
            int size = ((p0.size() + iAudioAttributesImplApi21Parcelizer) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = read(write(this.AudioAttributesImplBaseParcelizer), iAudioAttributesImplApi21Parcelizer, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = read(MediaBrowserCompatCustomActionResultReceiver(), 0, it);
            }
            this.MediaBrowserCompatCustomActionResultReceiver = read(this.MediaBrowserCompatCustomActionResultReceiver, AudioAttributesImplApi26Parcelizer(), objArr);
            this.AudioAttributesImplBaseParcelizer = read(MediaBrowserCompatCustomActionResultReceiver(), 0, it);
            this.AudioAttributesImplApi26Parcelizer = size() + p0.size();
        }
        return true;
    }

    private final Object[] read(Object[] p0, int p1, Iterator<? extends Object> p2) {
        while (p1 < 32 && p2.hasNext()) {
            p0[p1] = p2.next();
            p1++;
        }
        return p0;
    }

    private final Object[] read(Object[] p0, int p1, Object[][] p2) {
        Object[] objArrWrite;
        Iterator<Object[]> itAudioAttributesCompatParcelizer = r8lambda_QgM1da7JykGH9FQp_oipiZItrY.AudioAttributesCompatParcelizer(p2);
        int i = this.RemoteActionCompatParcelizer;
        if ((p1 >> 5) < (1 << i)) {
            objArrWrite = read(p0, p1, i, itAudioAttributesCompatParcelizer);
        } else {
            objArrWrite = write(p0);
        }
        while (itAudioAttributesCompatParcelizer.hasNext()) {
            this.RemoteActionCompatParcelizer += 5;
            objArrWrite = AudioAttributesCompatParcelizer(objArrWrite);
            int i2 = this.RemoteActionCompatParcelizer;
            read(objArrWrite, 1 << i2, i2, itAudioAttributesCompatParcelizer);
        }
        return objArrWrite;
    }

    private final Object[] read(Object[] p0, int p1, int p2, Iterator<Object[]> p3) {
        if (!p3.hasNext()) {
            getInputCodeUtf8JsNames.write("invalid buffersIterator");
        }
        if (p2 < 0) {
            getInputCodeUtf8JsNames.write("negative shift");
        }
        if (p2 == 0) {
            return p3.next();
        }
        Object[] objArrWrite = write(p0);
        int iWrite = lookupHex.write(p1, p2);
        int i = p2 - 5;
        objArrWrite[iWrite] = read((Object[]) objArrWrite[iWrite], p1, i, p3);
        while (true) {
            iWrite++;
            if (iWrite >= 32 || !p3.hasNext()) {
                break;
            }
            objArrWrite[iWrite] = read((Object[]) objArrWrite[iWrite], 0, i, p3);
        }
        return objArrWrite;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int p0, E p1) {
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, size());
        if (p0 == size()) {
            add(p1);
            return;
        }
        ((AbstractList) this).modCount++;
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (p0 >= iAudioAttributesImplApi26Parcelizer) {
            RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, p0 - iAudioAttributesImplApi26Parcelizer, p1);
            return;
        }
        AbstractJavaFloatingPointBitsFromCharArray abstractJavaFloatingPointBitsFromCharArray = new AbstractJavaFloatingPointBitsFromCharArray(null);
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(objArr);
        RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(objArr, this.RemoteActionCompatParcelizer, p0, p1, abstractJavaFloatingPointBitsFromCharArray), 0, abstractJavaFloatingPointBitsFromCharArray.getAudioAttributesCompatParcelizer());
    }

    private final void RemoteActionCompatParcelizer(Object[] p0, int p1, E p2) {
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        Object[] objArrWrite = write(this.AudioAttributesImplBaseParcelizer);
        if (iAudioAttributesImplApi21Parcelizer < 32) {
            getOrderDetails.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, objArrWrite, p1 + 1, p1, iAudioAttributesImplApi21Parcelizer);
            objArrWrite[p1] = p2;
            this.MediaBrowserCompatCustomActionResultReceiver = p0;
            this.AudioAttributesImplBaseParcelizer = objArrWrite;
            this.AudioAttributesImplApi26Parcelizer = size() + 1;
            return;
        }
        Object[] objArr = this.AudioAttributesImplBaseParcelizer;
        Object obj = objArr[31];
        getOrderDetails.RemoteActionCompatParcelizer(objArr, objArrWrite, p1 + 1, p1, 31);
        objArrWrite[p1] = p2;
        read(p0, objArrWrite, AudioAttributesCompatParcelizer(obj));
    }

    private final Object[] RemoteActionCompatParcelizer(Object[] p0, int p1, int p2, Object p3, AbstractJavaFloatingPointBitsFromCharArray p4) {
        Object obj;
        int iWrite = lookupHex.write(p2, p1);
        if (p1 == 0) {
            p4.AudioAttributesCompatParcelizer(p0[31]);
            Object[] objArrRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(p0, write(p0), iWrite + 1, iWrite, 31);
            objArrRemoteActionCompatParcelizer[iWrite] = p3;
            return objArrRemoteActionCompatParcelizer;
        }
        Object[] objArrWrite = write(p0);
        int i = p1 - 5;
        Object obj2 = objArrWrite[iWrite];
        toMagicModuleMetaRepoModel.read(obj2, "");
        objArrWrite[iWrite] = RemoteActionCompatParcelizer((Object[]) obj2, i, p2, p3, p4);
        while (true) {
            iWrite++;
            if (iWrite >= 32 || (obj = objArrWrite[iWrite]) == null) {
                break;
            }
            toMagicModuleMetaRepoModel.read(obj, "");
            objArrWrite[iWrite] = RemoteActionCompatParcelizer((Object[]) obj, i, 0, p4.getAudioAttributesCompatParcelizer(), p4);
        }
        return objArrWrite;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int p0, Collection<? extends E> p1) {
        Object[] objArrRemoteActionCompatParcelizer;
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, size());
        if (p0 == size()) {
            return addAll(p1);
        }
        if (p1.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i = (p0 >> 5) << 5;
        int size = (((size() - i) + p1.size()) - 1) / 32;
        if (size == 0) {
            createPowersOfTenFloor16Map.IconCompatParcelizer(p0 >= AudioAttributesImplApi26Parcelizer());
            int i2 = p0 & 31;
            int size2 = p1.size();
            Object[] objArr = this.AudioAttributesImplBaseParcelizer;
            Object[] objArrRemoteActionCompatParcelizer2 = getOrderDetails.RemoteActionCompatParcelizer(objArr, write(objArr), (((p0 + size2) - 1) & 31) + 1, i2, AudioAttributesImplApi21Parcelizer());
            read(objArrRemoteActionCompatParcelizer2, i2, p1.iterator());
            this.AudioAttributesImplBaseParcelizer = objArrRemoteActionCompatParcelizer2;
            this.AudioAttributesImplApi26Parcelizer = size() + p1.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(size() + p1.size());
        if (p0 >= AudioAttributesImplApi26Parcelizer()) {
            objArrRemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
            IconCompatParcelizer(p1, p0, this.AudioAttributesImplBaseParcelizer, iAudioAttributesImplApi21Parcelizer, objArr2, size, objArrRemoteActionCompatParcelizer);
        } else if (iAudioAttributesCompatParcelizer > iAudioAttributesImplApi21Parcelizer) {
            int i3 = iAudioAttributesCompatParcelizer - iAudioAttributesImplApi21Parcelizer;
            objArrRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, i3);
            IconCompatParcelizer(p1, p0, i3, objArr2, size, objArrRemoteActionCompatParcelizer);
        } else {
            int i4 = iAudioAttributesImplApi21Parcelizer - iAudioAttributesCompatParcelizer;
            objArrRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, MediaBrowserCompatCustomActionResultReceiver(), 0, i4, iAudioAttributesImplApi21Parcelizer);
            int i5 = 32 - i4;
            Object[] objArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer, i5);
            int i6 = size - 1;
            objArr2[i6] = objArrAudioAttributesCompatParcelizer;
            IconCompatParcelizer(p1, p0, i5, objArr2, i6, objArrAudioAttributesCompatParcelizer);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = read(this.MediaBrowserCompatCustomActionResultReceiver, i, objArr2);
        this.AudioAttributesImplBaseParcelizer = objArrRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = size() + p1.size();
        return true;
    }

    private final void IconCompatParcelizer(Collection<? extends E> p0, int p1, int p2, Object[][] p3, int p4, Object[] p5) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i = p1 >> 5;
        Object[] objArrWrite = write(i, p2, p3, p4, p5);
        int iAudioAttributesImplApi26Parcelizer = p4 - (((AudioAttributesImplApi26Parcelizer() >> 5) - 1) - i);
        if (iAudioAttributesImplApi26Parcelizer < p4) {
            p5 = p3[iAudioAttributesImplApi26Parcelizer];
            toMagicModuleMetaRepoModel.write(p5);
        }
        IconCompatParcelizer(p0, p1, objArrWrite, 32, p3, iAudioAttributesImplApi26Parcelizer, p5);
    }

    private final Object[] write(int p0, int p1, Object[][] p2, int p3, Object[] p4) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            throw new IllegalStateException("root is null".toString());
        }
        ListIterator<Object[]> listIteratorIconCompatParcelizer = IconCompatParcelizer(AudioAttributesImplApi26Parcelizer() >> 5);
        while (listIteratorIconCompatParcelizer.previousIndex() != p0) {
            Object[] objArrPrevious = listIteratorIconCompatParcelizer.previous();
            getOrderDetails.RemoteActionCompatParcelizer(objArrPrevious, p4, 0, 32 - p1, 32);
            p4 = AudioAttributesCompatParcelizer(objArrPrevious, p1);
            p3--;
            p2[p3] = p4;
        }
        return listIteratorIconCompatParcelizer.previous();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int p0) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        return (E) RemoteActionCompatParcelizer(p0)[p0 & 31];
    }

    private final Object[] RemoteActionCompatParcelizer(int p0) {
        if (AudioAttributesImplApi26Parcelizer() <= p0) {
            return this.AudioAttributesImplBaseParcelizer;
        }
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(objArr);
        for (int i = this.RemoteActionCompatParcelizer; i > 0; i -= 5) {
            Object[] objArr2 = objArr[lookupHex.write(p0, i)];
            toMagicModuleMetaRepoModel.read(objArr2, "");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.UpgradePlanResponseV2
    public final E write(int p0) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        ((AbstractList) this).modCount++;
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (p0 >= iAudioAttributesImplApi26Parcelizer) {
            return (E) RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iAudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, p0 - iAudioAttributesImplApi26Parcelizer);
        }
        AbstractJavaFloatingPointBitsFromCharArray abstractJavaFloatingPointBitsFromCharArray = new AbstractJavaFloatingPointBitsFromCharArray(this.AudioAttributesImplBaseParcelizer[0]);
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(objArr);
        RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(objArr, this.RemoteActionCompatParcelizer, p0, abstractJavaFloatingPointBitsFromCharArray), iAudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, 0);
        return (E) abstractJavaFloatingPointBitsFromCharArray.getAudioAttributesCompatParcelizer();
    }

    private final Object RemoteActionCompatParcelizer(Object[] p0, int p1, int p2, int p3) {
        int size = size() - p1;
        createPowersOfTenFloor16Map.IconCompatParcelizer(p3 < size);
        if (size == 1) {
            Object obj = this.AudioAttributesImplBaseParcelizer[0];
            IconCompatParcelizer(p0, p1, p2);
            return obj;
        }
        Object[] objArr = this.AudioAttributesImplBaseParcelizer;
        Object obj2 = objArr[p3];
        Object[] objArrRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(objArr, write(objArr), p3, p3 + 1, size);
        objArrRemoteActionCompatParcelizer[size - 1] = null;
        this.MediaBrowserCompatCustomActionResultReceiver = p0;
        this.AudioAttributesImplBaseParcelizer = objArrRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = (p1 + size) - 1;
        this.RemoteActionCompatParcelizer = p2;
        return obj2;
    }

    private final Object[] RemoteActionCompatParcelizer(Object[] p0, int p1, int p2, AbstractJavaFloatingPointBitsFromCharArray p3) {
        int iWrite = lookupHex.write(p2, p1);
        if (p1 == 0) {
            Object obj = p0[iWrite];
            Object[] objArrRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer(p0, write(p0), iWrite, iWrite + 1, 32);
            objArrRemoteActionCompatParcelizer[31] = p3.getAudioAttributesCompatParcelizer();
            p3.AudioAttributesCompatParcelizer(obj);
            return objArrRemoteActionCompatParcelizer;
        }
        int iWrite2 = p0[31] == null ? lookupHex.write(AudioAttributesImplApi26Parcelizer() - 1, p1) : 31;
        Object[] objArrWrite = write(p0);
        int i = p1 - 5;
        int i2 = iWrite + 1;
        if (i2 <= iWrite2) {
            while (true) {
                Object obj2 = objArrWrite[iWrite2];
                toMagicModuleMetaRepoModel.read(obj2, "");
                objArrWrite[iWrite2] = RemoteActionCompatParcelizer((Object[]) obj2, i, 0, p3);
                if (iWrite2 == i2) {
                    break;
                }
                iWrite2--;
            }
        }
        Object obj3 = objArrWrite[iWrite];
        toMagicModuleMetaRepoModel.read(obj3, "");
        objArrWrite[iWrite] = RemoteActionCompatParcelizer((Object[]) obj3, i, p2, p3);
        return objArrWrite;
    }

    private final void IconCompatParcelizer(Object[] p0, int p1, int p2) {
        if (p2 == 0) {
            this.MediaBrowserCompatCustomActionResultReceiver = null;
            if (p0 == null) {
                p0 = new Object[0];
            }
            this.AudioAttributesImplBaseParcelizer = p0;
            this.AudioAttributesImplApi26Parcelizer = p1;
            this.RemoteActionCompatParcelizer = p2;
            return;
        }
        AbstractJavaFloatingPointBitsFromCharArray abstractJavaFloatingPointBitsFromCharArray = new AbstractJavaFloatingPointBitsFromCharArray(null);
        toMagicModuleMetaRepoModel.write(p0);
        Object[] objArrIconCompatParcelizer = IconCompatParcelizer(p0, p2, p1, abstractJavaFloatingPointBitsFromCharArray);
        toMagicModuleMetaRepoModel.write(objArrIconCompatParcelizer);
        Object audioAttributesCompatParcelizer = abstractJavaFloatingPointBitsFromCharArray.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
        this.AudioAttributesImplBaseParcelizer = (Object[]) audioAttributesCompatParcelizer;
        this.AudioAttributesImplApi26Parcelizer = p1;
        if (objArrIconCompatParcelizer[1] == null) {
            this.MediaBrowserCompatCustomActionResultReceiver = (Object[]) objArrIconCompatParcelizer[0];
            this.RemoteActionCompatParcelizer = p2 - 5;
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = objArrIconCompatParcelizer;
            this.RemoteActionCompatParcelizer = p2;
        }
    }

    private final Object[] IconCompatParcelizer(Object[] p0, int p1, int p2, AbstractJavaFloatingPointBitsFromCharArray p3) {
        Object[] objArrIconCompatParcelizer;
        int iWrite = lookupHex.write(p2 - 1, p1);
        if (p1 == 5) {
            p3.AudioAttributesCompatParcelizer(p0[iWrite]);
            objArrIconCompatParcelizer = null;
        } else {
            Object obj = p0[iWrite];
            toMagicModuleMetaRepoModel.read(obj, "");
            objArrIconCompatParcelizer = IconCompatParcelizer((Object[]) obj, p1 - 5, p2, p3);
        }
        if (objArrIconCompatParcelizer == null && iWrite == 0) {
            return null;
        }
        Object[] objArrWrite = write(p0);
        objArrWrite[iWrite] = objArrIconCompatParcelizer;
        return objArrWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final Collection<?> p0) {
        return IconCompatParcelizer(new getAnswerMap() { // from class: o.nan
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(parseFloatingPointLiteral.write(p0, obj));
            }
        });
    }

    public final boolean IconCompatParcelizer(getAnswerMap<? super E, Boolean> p0) {
        boolean zWrite = write(p0);
        if (zWrite) {
            ((AbstractList) this).modCount++;
        }
        return zWrite;
    }

    private final boolean write(getAnswerMap<? super E, Boolean> p0) {
        Object[] objArr;
        int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        AbstractJavaFloatingPointBitsFromCharArray abstractJavaFloatingPointBitsFromCharArray = new AbstractJavaFloatingPointBitsFromCharArray(null);
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            return write(p0, iAudioAttributesImplApi21Parcelizer, abstractJavaFloatingPointBitsFromCharArray) != iAudioAttributesImplApi21Parcelizer;
        }
        ListIterator<Object[]> listIteratorIconCompatParcelizer = IconCompatParcelizer(0);
        int iWrite = 32;
        while (iWrite == 32 && listIteratorIconCompatParcelizer.hasNext()) {
            iWrite = write(p0, listIteratorIconCompatParcelizer.next(), 32, abstractJavaFloatingPointBitsFromCharArray);
        }
        if (iWrite == 32) {
            createPowersOfTenFloor16Map.IconCompatParcelizer(!listIteratorIconCompatParcelizer.hasNext());
            int iWrite2 = write(p0, iAudioAttributesImplApi21Parcelizer, abstractJavaFloatingPointBitsFromCharArray);
            if (iWrite2 == 0) {
                IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, size(), this.RemoteActionCompatParcelizer);
            }
            return iWrite2 != iAudioAttributesImplApi21Parcelizer;
        }
        int iPreviousIndex = listIteratorIconCompatParcelizer.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iAudioAttributesCompatParcelizer = iWrite;
        while (listIteratorIconCompatParcelizer.hasNext()) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, listIteratorIconCompatParcelizer.next(), 32, iAudioAttributesCompatParcelizer, abstractJavaFloatingPointBitsFromCharArray, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i = iPreviousIndex;
        int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(p0, this.AudioAttributesImplBaseParcelizer, iAudioAttributesImplApi21Parcelizer, iAudioAttributesCompatParcelizer, abstractJavaFloatingPointBitsFromCharArray, arrayList2, arrayList);
        Object audioAttributesCompatParcelizer = abstractJavaFloatingPointBitsFromCharArray.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
        Object[] objArr2 = (Object[]) audioAttributesCompatParcelizer;
        getOrderDetails.AudioAttributesCompatParcelizer(objArr2, (Object) null, iAudioAttributesCompatParcelizer2, 32);
        if (arrayList.isEmpty()) {
            objArr = this.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.write(objArr);
        } else {
            objArr = read(this.MediaBrowserCompatCustomActionResultReceiver, i, this.RemoteActionCompatParcelizer, arrayList.iterator());
        }
        int size = i + (arrayList.size() << 5);
        this.MediaBrowserCompatCustomActionResultReceiver = read(objArr, size);
        this.AudioAttributesImplBaseParcelizer = objArr2;
        this.AudioAttributesImplApi26Parcelizer = size + iAudioAttributesCompatParcelizer2;
        return true;
    }

    private final int write(getAnswerMap<? super E, Boolean> p0, int p1, AbstractJavaFloatingPointBitsFromCharArray p2) {
        int iWrite = write(p0, this.AudioAttributesImplBaseParcelizer, p1, p2);
        if (iWrite == p1) {
            createPowersOfTenFloor16Map.IconCompatParcelizer(p2.getAudioAttributesCompatParcelizer() == this.AudioAttributesImplBaseParcelizer);
            return p1;
        }
        Object audioAttributesCompatParcelizer = p2.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
        Object[] objArr = (Object[]) audioAttributesCompatParcelizer;
        getOrderDetails.AudioAttributesCompatParcelizer(objArr, (Object) null, iWrite, p1);
        this.AudioAttributesImplBaseParcelizer = objArr;
        this.AudioAttributesImplApi26Parcelizer = size() - (p1 - iWrite);
        return iWrite;
    }

    private final int write(getAnswerMap<? super E, Boolean> p0, Object[] p1, int p2, AbstractJavaFloatingPointBitsFromCharArray p3) {
        Object[] objArrWrite = p1;
        int i = p2;
        boolean z = false;
        for (int i2 = 0; i2 < p2; i2++) {
            Object obj = p1[i2];
            if (p0.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrWrite = write(p1);
                    z = true;
                    i = i2;
                }
            } else if (z) {
                objArrWrite[i] = obj;
                i++;
            }
        }
        p3.AudioAttributesCompatParcelizer(objArrWrite);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int AudioAttributesCompatParcelizer(getAnswerMap<? super E, Boolean> p0, Object[] p1, int p2, int p3, AbstractJavaFloatingPointBitsFromCharArray p4, List<Object[]> p5, List<Object[]> p6) {
        Object[] objArrMediaBrowserCompatCustomActionResultReceiver;
        if (read(p1)) {
            p5.add(p1);
        }
        Object audioAttributesCompatParcelizer = p4.getAudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.read(audioAttributesCompatParcelizer, "");
        Object[] objArr = (Object[]) audioAttributesCompatParcelizer;
        Object[] objArr2 = objArr;
        for (int i = 0; i < p2; i++) {
            Object obj = p1[i];
            if (!p0.invoke(obj).booleanValue()) {
                if (p3 == 32) {
                    if (!p5.isEmpty()) {
                        objArrMediaBrowserCompatCustomActionResultReceiver = p5.remove(p5.size() - 1);
                    } else {
                        objArrMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                    }
                    objArr2 = objArrMediaBrowserCompatCustomActionResultReceiver;
                    p3 = 0;
                }
                objArr2[p3] = obj;
                p3++;
            }
        }
        p4.AudioAttributesCompatParcelizer(objArr2);
        if (objArr != p4.getAudioAttributesCompatParcelizer()) {
            p6.add(objArr);
        }
        return p3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int p0, E p1) {
        fillPowersOfNFloor16Recursive.read(p0, size());
        if (AudioAttributesImplApi26Parcelizer() <= p0) {
            Object[] objArrWrite = write(this.AudioAttributesImplBaseParcelizer);
            if (objArrWrite != this.AudioAttributesImplBaseParcelizer) {
                ((AbstractList) this).modCount++;
            }
            int i = p0 & 31;
            E e = (E) objArrWrite[i];
            objArrWrite[i] = p1;
            this.AudioAttributesImplBaseParcelizer = objArrWrite;
            return e;
        }
        AbstractJavaFloatingPointBitsFromCharArray abstractJavaFloatingPointBitsFromCharArray = new AbstractJavaFloatingPointBitsFromCharArray(null);
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.write(objArr);
        this.MediaBrowserCompatCustomActionResultReceiver = write(objArr, this.RemoteActionCompatParcelizer, p0, p1, abstractJavaFloatingPointBitsFromCharArray);
        return (E) abstractJavaFloatingPointBitsFromCharArray.getAudioAttributesCompatParcelizer();
    }

    private final Object[] write(Object[] p0, int p1, int p2, E p3, AbstractJavaFloatingPointBitsFromCharArray p4) {
        int iWrite = lookupHex.write(p2, p1);
        Object[] objArrWrite = write(p0);
        if (p1 == 0) {
            if (objArrWrite != p0) {
                ((AbstractList) this).modCount++;
            }
            p4.AudioAttributesCompatParcelizer(objArrWrite[iWrite]);
            objArrWrite[iWrite] = p3;
            return objArrWrite;
        }
        Object obj = objArrWrite[iWrite];
        toMagicModuleMetaRepoModel.read(obj, "");
        objArrWrite[iWrite] = write((Object[]) obj, p1 - 5, p2, p3, p4);
        return objArrWrite;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int p0) {
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, size());
        return new negativeInfinity(this, p0);
    }

    private final ListIterator<Object[]> IconCompatParcelizer(int p0) {
        Object[] objArr = this.MediaBrowserCompatCustomActionResultReceiver;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer() >> 5;
        fillPowersOfNFloor16Recursive.IconCompatParcelizer(p0, iAudioAttributesImplApi26Parcelizer);
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return new positiveInfinity(objArr, p0);
        }
        return new charAt(objArr, p0, iAudioAttributesImplApi26Parcelizer, i / 5);
    }

    private final void IconCompatParcelizer(Collection<? extends E> p0, int p1, Object[] p2, int p3, Object[][] p4, int p5, Object[] p6) {
        Object[] objArrMediaBrowserCompatCustomActionResultReceiver;
        if (p5 <= 0) {
            getInputCodeUtf8JsNames.write("requires at least one nullBuffer");
        }
        Object[] objArrWrite = write(p2);
        p4[0] = objArrWrite;
        int i = p1 & 31;
        int size = ((p1 + p0.size()) - 1) & 31;
        int i2 = (p3 - i) + size;
        if (i2 < 32) {
            getOrderDetails.RemoteActionCompatParcelizer(objArrWrite, p6, size + 1, i, p3);
        } else {
            if (p5 == 1) {
                objArrMediaBrowserCompatCustomActionResultReceiver = objArrWrite;
            } else {
                objArrMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                p5--;
                p4[p5] = objArrMediaBrowserCompatCustomActionResultReceiver;
            }
            int i3 = p3 - (i2 - 31);
            getOrderDetails.RemoteActionCompatParcelizer(objArrWrite, p6, 0, i3, p3);
            getOrderDetails.RemoteActionCompatParcelizer(objArrWrite, objArrMediaBrowserCompatCustomActionResultReceiver, size + 1, i, i3);
            p6 = objArrMediaBrowserCompatCustomActionResultReceiver;
        }
        Iterator<? extends E> it = p0.iterator();
        read(objArrWrite, i, it);
        for (int i4 = 1; i4 < p5; i4++) {
            p4[i4] = read(MediaBrowserCompatCustomActionResultReceiver(), 0, it);
        }
        read(p6, 0, it);
    }

    private final Object[] read(Object[] p0, int p1) {
        if ((p1 & 31) != 0) {
            getInputCodeUtf8JsNames.write("invalid size");
        }
        if (p1 == 0) {
            this.RemoteActionCompatParcelizer = 0;
            return null;
        }
        int i = p1 - 1;
        while (true) {
            int i2 = this.RemoteActionCompatParcelizer;
            if ((i >> i2) == 0) {
                this.RemoteActionCompatParcelizer = i2 - 5;
                Object[] objArr = p0[0];
                toMagicModuleMetaRepoModel.read(objArr, "");
                p0 = objArr;
            } else {
                return AudioAttributesCompatParcelizer(p0, i, i2);
            }
        }
    }

    private final Object[] AudioAttributesCompatParcelizer(Object[] p0, int p1, int p2) {
        if (p2 < 0) {
            getInputCodeUtf8JsNames.write("shift should be positive");
        }
        if (p2 == 0) {
            return p0;
        }
        int iWrite = lookupHex.write(p1, p2);
        Object obj = p0[iWrite];
        toMagicModuleMetaRepoModel.read(obj, "");
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Object[]) obj, p1, p2 - 5);
        if (iWrite < 31) {
            int i = iWrite + 1;
            if (p0[i] != null) {
                if (read(p0)) {
                    getOrderDetails.AudioAttributesCompatParcelizer(p0, (Object) null, i, 32);
                }
                p0 = getOrderDetails.RemoteActionCompatParcelizer(p0, MediaBrowserCompatCustomActionResultReceiver(), 0, 0, i);
            }
        }
        if (objAudioAttributesCompatParcelizer == p0[iWrite]) {
            return p0;
        }
        Object[] objArrWrite = write(p0);
        objArrWrite[iWrite] = objAudioAttributesCompatParcelizer;
        return objArrWrite;
    }
}
