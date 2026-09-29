package kotlin;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 #*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0012#B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u001cJ3\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u001dJ;\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u001eJ+\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u001fJ?\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0002¢\u0006\u0004\b\u000f\u0010!J?\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\"J?\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010$J-\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010%J5\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010&JQ\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0018\u0010*JK\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010+JS\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010,J]\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010'\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00012\u0006\u0010)\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b#\u0010.J-\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010%JA\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0002¢\u0006\u0004\b\u000f\u0010/J%\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u001cJ9\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0002¢\u0006\u0004\b\u000f\u00100J\u0017\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u00101J\u0019\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b#\u00102J-\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0018\u00103J?\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0002¢\u0006\u0004\b\u0011\u00104J%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u00105J9\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0002¢\u0006\u0004\b\u0018\u00106JA\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0002¢\u0006\u0004\b\u000f\u00104J?\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u0002072\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u00108J[\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u0002072\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0002¢\u0006\u0004\b\u0012\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010\u0013J#\u0010\u0011\u001a\u00020\u00142\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010;J%\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010<J'\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b#\u0010=JQ\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u0002072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b\u0012\u0010>J;\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010?JM\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b#\u0010@J3\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010AJW\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010BJG\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b#\u0010CJ_\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010DJO\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b\u0011\u0010@R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010ER\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010GR4\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\b#\u0010I"}, d2 = {"Lo/tryToParseEightHexDigits;", "K", "V", "", "", "p0", "p1", "", "p2", "Lo/estimateNumBits;", "p3", "<init>", "(II[Ljava/lang/Object;Lo/estimateNumBits;)V", "(II[Ljava/lang/Object;)V", "Lo/tryToParseEightHexDigits$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/tryToParseEightHexDigits$RemoteActionCompatParcelizer;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "()I", "", "(I)Z", "MediaBrowserCompatCustomActionResultReceiver", "(I)I", "read", "AudioAttributesImplApi21Parcelizer", "(I)Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "(I)Lo/tryToParseEightHexDigits;", "(ILjava/lang/Object;Ljava/lang/Object;)Lo/tryToParseEightHexDigits;", "(ILjava/lang/Object;Ljava/lang/Object;Lo/estimateNumBits;)Lo/tryToParseEightHexDigits;", "(ILjava/lang/Object;)Lo/tryToParseEightHexDigits;", "Lo/toBigInteger;", "(ILjava/lang/Object;Lo/toBigInteger;)Lo/tryToParseEightHexDigits;", "(IILo/tryToParseEightHexDigits;)Lo/tryToParseEightHexDigits;", "write", "(ILo/tryToParseEightHexDigits;Lo/estimateNumBits;)Lo/tryToParseEightHexDigits;", "(II)Lo/tryToParseEightHexDigits;", "(IILo/estimateNumBits;)Lo/tryToParseEightHexDigits;", "p4", "p5", "p6", "(IIILjava/lang/Object;Ljava/lang/Object;ILo/estimateNumBits;)[Ljava/lang/Object;", "(IIILjava/lang/Object;Ljava/lang/Object;I)Lo/tryToParseEightHexDigits;", "(IIILjava/lang/Object;Ljava/lang/Object;ILo/estimateNumBits;)Lo/tryToParseEightHexDigits;", "p7", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILo/estimateNumBits;)Lo/tryToParseEightHexDigits;", "(IILo/toBigInteger;)Lo/tryToParseEightHexDigits;", "(ILo/toBigInteger;)Lo/tryToParseEightHexDigits;", "(Ljava/lang/Object;)Z", "(Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;)Lo/tryToParseEightHexDigits$RemoteActionCompatParcelizer;", "(Ljava/lang/Object;Ljava/lang/Object;Lo/toBigInteger;)Lo/tryToParseEightHexDigits;", "(Ljava/lang/Object;)Lo/tryToParseEightHexDigits;", "(Ljava/lang/Object;Lo/toBigInteger;)Lo/tryToParseEightHexDigits;", "Lo/tryDecToFloatWithFastAlgorithm;", "(Lo/tryToParseEightHexDigits;Lo/tryDecToFloatWithFastAlgorithm;Lo/estimateNumBits;)Lo/tryToParseEightHexDigits;", "(Lo/tryToParseEightHexDigits;IILo/tryDecToFloatWithFastAlgorithm;Lo/toBigInteger;)Lo/tryToParseEightHexDigits;", "MediaBrowserCompatItemReceiver", "(Lo/tryToParseEightHexDigits;)Z", "(ILjava/lang/Object;I)Z", "(ILjava/lang/Object;I)Ljava/lang/Object;", "(Lo/tryToParseEightHexDigits;ILo/tryDecToFloatWithFastAlgorithm;Lo/toBigInteger;)Lo/tryToParseEightHexDigits;", "(ILjava/lang/Object;Ljava/lang/Object;I)Lo/tryToParseEightHexDigits$RemoteActionCompatParcelizer;", "(ILjava/lang/Object;Ljava/lang/Object;ILo/toBigInteger;)Lo/tryToParseEightHexDigits;", "(ILjava/lang/Object;I)Lo/tryToParseEightHexDigits;", "(Lo/tryToParseEightHexDigits;Lo/tryToParseEightHexDigits;II)Lo/tryToParseEightHexDigits;", "(ILjava/lang/Object;ILo/toBigInteger;)Lo/tryToParseEightHexDigits;", "(Lo/tryToParseEightHexDigits;Lo/tryToParseEightHexDigits;IILo/estimateNumBits;)Lo/tryToParseEightHexDigits;", "I", "AudioAttributesImplApi26Parcelizer", "Lo/estimateNumBits;", "[Ljava/lang/Object;", "()[Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class tryToParseEightHexDigits<K, V> {

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Object[] write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final estimateNumBits read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RemoteActionCompatParcelizer = 8;
    private static final tryToParseEightHexDigits AudioAttributesCompatParcelizer = new tryToParseEightHexDigits(0, 0, new Object[0]);

    public tryToParseEightHexDigits(int i, int i2, Object[] objArr, estimateNumBits estimatenumbits) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = estimatenumbits;
        this.write = objArr;
    }

    public tryToParseEightHexDigits(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\n\u0010\u000eR\u001a\u0010\f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/tryToParseEightHexDigits$RemoteActionCompatParcelizer;", "K", "V", "", "Lo/tryToParseEightHexDigits;", "p0", "", "p1", "<init>", "(Lo/tryToParseEightHexDigits;I)V", "AudioAttributesCompatParcelizer", "Lo/tryToParseEightHexDigits;", "write", "()Lo/tryToParseEightHexDigits;", "(Lo/tryToParseEightHexDigits;)V", "RemoteActionCompatParcelizer", "I", "IconCompatParcelizer", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer<K, V> {
        private tryToParseEightHexDigits<K, V> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final int write;

        public RemoteActionCompatParcelizer(tryToParseEightHexDigits<K, V> trytoparseeighthexdigits, int i) {
            this.AudioAttributesCompatParcelizer = trytoparseeighthexdigits;
            this.write = i;
        }

        public final void AudioAttributesCompatParcelizer(tryToParseEightHexDigits<K, V> trytoparseeighthexdigits) {
            this.AudioAttributesCompatParcelizer = trytoparseeighthexdigits;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        public final tryToParseEightHexDigits<K, V> write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private final RemoteActionCompatParcelizer<K, V> IconCompatParcelizer() {
        return new RemoteActionCompatParcelizer<>(this, 1);
    }

    private final RemoteActionCompatParcelizer<K, V> AudioAttributesCompatParcelizer() {
        return new RemoteActionCompatParcelizer<>(this, 0);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Object[] getWrite() {
        return this.write;
    }

    public final int RemoteActionCompatParcelizer() {
        return Integer.bitCount(this.IconCompatParcelizer);
    }

    public final boolean IconCompatParcelizer(int p0) {
        return (this.IconCompatParcelizer & p0) != 0;
    }

    private final boolean MediaBrowserCompatCustomActionResultReceiver(int p0) {
        return (this.RemoteActionCompatParcelizer & p0) != 0;
    }

    public final int RemoteActionCompatParcelizer(int p0) {
        return Integer.bitCount(this.IconCompatParcelizer & (p0 - 1)) << 1;
    }

    public final int read(int p0) {
        return (this.write.length - 1) - Integer.bitCount(this.RemoteActionCompatParcelizer & (p0 - 1));
    }

    private final K AudioAttributesImplApi21Parcelizer(int p0) {
        return (K) this.write[p0];
    }

    private final V AudioAttributesImplBaseParcelizer(int p0) {
        return (V) this.write[p0 + 1];
    }

    public final tryToParseEightHexDigits<K, V> AudioAttributesCompatParcelizer(int p0) {
        Object obj = this.write[p0];
        toMagicModuleMetaRepoModel.read(obj, "");
        return (tryToParseEightHexDigits) obj;
    }

    private final tryToParseEightHexDigits<K, V> read(int p0, K p1, V p2) {
        return new tryToParseEightHexDigits<>(p0 | this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, writeIntBE.write(this.write, RemoteActionCompatParcelizer(p0), p1, p2));
    }

    private final tryToParseEightHexDigits<K, V> read(int p0, K p1, V p2, estimateNumBits p3) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        if (this.read == p3) {
            this.write = writeIntBE.write(this.write, iRemoteActionCompatParcelizer, p1, p2);
            this.IconCompatParcelizer = p0 | this.IconCompatParcelizer;
            return this;
        }
        return new tryToParseEightHexDigits<>(p0 | this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, writeIntBE.write(this.write, iRemoteActionCompatParcelizer, p1, p2), p3);
    }

    private final tryToParseEightHexDigits<K, V> AudioAttributesCompatParcelizer(int p0, V p1) {
        Object[] objArr = this.write;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        objArrCopyOf[p0 + 1] = p1;
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, objArrCopyOf);
    }

    private final tryToParseEightHexDigits<K, V> IconCompatParcelizer(int p0, V p1, toBigInteger<K, V> p2) {
        if (this.read == p2.getIconCompatParcelizer()) {
            this.write[p0 + 1] = p1;
            return this;
        }
        p2.write(p2.getAudioAttributesCompatParcelizer() + 1);
        Object[] objArr = this.write;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        objArrCopyOf[p0 + 1] = p1;
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, objArrCopyOf, p2.getIconCompatParcelizer());
    }

    private final tryToParseEightHexDigits<K, V> IconCompatParcelizer(int p0, int p1, tryToParseEightHexDigits<K, V> p2) {
        Object[] objArr = p2.write;
        if (objArr.length == 2 && p2.RemoteActionCompatParcelizer == 0) {
            if (this.write.length == 1) {
                p2.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
                return p2;
            }
            return new tryToParseEightHexDigits<>(this.IconCompatParcelizer ^ p1, this.RemoteActionCompatParcelizer ^ p1, writeIntBE.IconCompatParcelizer(this.write, p0, RemoteActionCompatParcelizer(p1), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.write;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        objArrCopyOf[p0] = p2;
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, objArrCopyOf);
    }

    private final tryToParseEightHexDigits<K, V> write(int p0, tryToParseEightHexDigits<K, V> p1, estimateNumBits p2) {
        Object[] objArr = this.write;
        if (objArr.length == 1 && p1.write.length == 2 && p1.RemoteActionCompatParcelizer == 0) {
            p1.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
            return p1;
        }
        if (this.read == p2) {
            objArr[p0] = p1;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        objArrCopyOf[p0] = p1;
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, objArrCopyOf, p2);
    }

    private final tryToParseEightHexDigits<K, V> RemoteActionCompatParcelizer(int p0, int p1) {
        Object[] objArr = this.write;
        if (objArr.length == 1) {
            return null;
        }
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer ^ p1, writeIntBE.read(objArr, p0));
    }

    private final tryToParseEightHexDigits<K, V> read(int p0, int p1, estimateNumBits p2) {
        Object[] objArr = this.write;
        if (objArr.length == 1) {
            return null;
        }
        if (this.read == p2) {
            this.write = writeIntBE.read(objArr, p0);
            this.RemoteActionCompatParcelizer ^= p1;
            return this;
        }
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer ^ p1, writeIntBE.read(objArr, p0), p2);
    }

    private final Object[] read(int p0, int p1, int p2, K p3, V p4, int p5, estimateNumBits p6) {
        K kAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(p0);
        return writeIntBE.RemoteActionCompatParcelizer(this.write, p0, read(p1) + 1, write(kAudioAttributesImplApi21Parcelizer != null ? kAudioAttributesImplApi21Parcelizer.hashCode() : 0, kAudioAttributesImplApi21Parcelizer, AudioAttributesImplBaseParcelizer(p0), p2, p3, p4, p5 + 5, p6));
    }

    private final tryToParseEightHexDigits<K, V> IconCompatParcelizer(int p0, int p1, int p2, K p3, V p4, int p5) {
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer ^ p1, this.RemoteActionCompatParcelizer | p1, read(p0, p1, p2, p3, p4, p5, null));
    }

    private final tryToParseEightHexDigits<K, V> IconCompatParcelizer(int p0, int p1, int p2, K p3, V p4, int p5, estimateNumBits p6) {
        if (this.read == p6) {
            this.write = read(p0, p1, p2, p3, p4, p5, p6);
            this.IconCompatParcelizer ^= p1;
            this.RemoteActionCompatParcelizer |= p1;
            return this;
        }
        return new tryToParseEightHexDigits<>(this.IconCompatParcelizer ^ p1, this.RemoteActionCompatParcelizer | p1, read(p0, p1, p2, p3, p4, p5, p6), p6);
    }

    private final tryToParseEightHexDigits<K, V> write(int p0, K p1, V p2, int p3, K p4, V p5, int p6, estimateNumBits p7) {
        Object[] objArr;
        if (p6 > 30) {
            return new tryToParseEightHexDigits<>(0, 0, new Object[]{p1, p2, p4, p5}, p7);
        }
        int i = writeIntBE.read(p0, p6);
        int i2 = writeIntBE.read(p3, p6);
        if (i != i2) {
            if (i < i2) {
                objArr = new Object[]{p1, p2, p4, p5};
            } else {
                objArr = new Object[]{p4, p5, p1, p2};
            }
            return new tryToParseEightHexDigits<>((1 << i) | (1 << i2), 0, objArr, p7);
        }
        return new tryToParseEightHexDigits<>(0, 1 << i, new Object[]{write(p0, p1, p2, p3, p4, p5, p6 + 5, p7)}, p7);
    }

    private final tryToParseEightHexDigits<K, V> write(int p0, int p1) {
        Object[] objArr = this.write;
        if (objArr.length == 2) {
            return null;
        }
        return new tryToParseEightHexDigits<>(p1 ^ this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, writeIntBE.AudioAttributesCompatParcelizer(objArr, p0));
    }

    private final tryToParseEightHexDigits<K, V> IconCompatParcelizer(int p0, int p1, toBigInteger<K, V> p2) {
        p2.AudioAttributesCompatParcelizer(p2.size() - 1);
        p2.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(p0));
        if (this.write.length == 2) {
            return null;
        }
        if (this.read == p2.getIconCompatParcelizer()) {
            this.write = writeIntBE.AudioAttributesCompatParcelizer(this.write, p0);
            this.IconCompatParcelizer ^= p1;
            return this;
        }
        return new tryToParseEightHexDigits<>(p1 ^ this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, writeIntBE.AudioAttributesCompatParcelizer(this.write, p0), p2.getIconCompatParcelizer());
    }

    private final tryToParseEightHexDigits<K, V> write(int p0) {
        Object[] objArr = this.write;
        if (objArr.length == 2) {
            return null;
        }
        return new tryToParseEightHexDigits<>(0, 0, writeIntBE.AudioAttributesCompatParcelizer(objArr, p0));
    }

    private final tryToParseEightHexDigits<K, V> IconCompatParcelizer(int p0, toBigInteger<K, V> p1) {
        p1.AudioAttributesCompatParcelizer(p1.size() - 1);
        p1.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(p0));
        if (this.write.length == 2) {
            return null;
        }
        if (this.read == p1.getIconCompatParcelizer()) {
            this.write = writeIntBE.AudioAttributesCompatParcelizer(this.write, p0);
            return this;
        }
        return new tryToParseEightHexDigits<>(0, 0, writeIntBE.AudioAttributesCompatParcelizer(this.write, p0), p1.getIconCompatParcelizer());
    }

    private final boolean IconCompatParcelizer(K p0) {
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.write[read])) {
                if (read != audioAttributesCompatParcelizer) {
                    read += iconCompatParcelizer;
                }
            }
            return true;
        }
        return false;
    }

    private final V write(K p0) {
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer <= 0 || read > audioAttributesCompatParcelizer) && (iconCompatParcelizer >= 0 || audioAttributesCompatParcelizer > read)) {
            return null;
        }
        while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AudioAttributesImplApi21Parcelizer(read))) {
            if (read == audioAttributesCompatParcelizer) {
                return null;
            }
            read += iconCompatParcelizer;
        }
        return AudioAttributesImplBaseParcelizer(read);
    }

    private final RemoteActionCompatParcelizer<K, V> read(K p0, V p1) {
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AudioAttributesImplApi21Parcelizer(read))) {
                if (read != audioAttributesCompatParcelizer) {
                    read += iconCompatParcelizer;
                }
            }
            if (p1 == AudioAttributesImplBaseParcelizer(read)) {
                return null;
            }
            Object[] objArr = this.write;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            objArrCopyOf[read + 1] = p1;
            return new tryToParseEightHexDigits(0, 0, objArrCopyOf).AudioAttributesCompatParcelizer();
        }
        return new tryToParseEightHexDigits(0, 0, writeIntBE.write(this.write, 0, p0, p1)).IconCompatParcelizer();
    }

    private final tryToParseEightHexDigits<K, V> AudioAttributesCompatParcelizer(K p0, V p1, toBigInteger<K, V> p2) {
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AudioAttributesImplApi21Parcelizer(read))) {
                if (read != audioAttributesCompatParcelizer) {
                    read += iconCompatParcelizer;
                }
            }
            p2.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(read));
            if (this.read == p2.getIconCompatParcelizer()) {
                this.write[read + 1] = p1;
                return this;
            }
            p2.write(p2.getAudioAttributesCompatParcelizer() + 1);
            Object[] objArr = this.write;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
            objArrCopyOf[read + 1] = p1;
            return new tryToParseEightHexDigits<>(0, 0, objArrCopyOf, p2.getIconCompatParcelizer());
        }
        p2.AudioAttributesCompatParcelizer(p2.size() + 1);
        return new tryToParseEightHexDigits<>(0, 0, writeIntBE.write(this.write, 0, p0, p1), p2.getIconCompatParcelizer());
    }

    private final tryToParseEightHexDigits<K, V> read(K p0) {
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AudioAttributesImplApi21Parcelizer(read))) {
                if (read != audioAttributesCompatParcelizer) {
                    read += iconCompatParcelizer;
                }
            }
            return write(read);
        }
        return this;
    }

    private final tryToParseEightHexDigits<K, V> read(K p0, toBigInteger<K, V> p1) {
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AudioAttributesImplApi21Parcelizer(read))) {
                if (read != audioAttributesCompatParcelizer) {
                    read += iconCompatParcelizer;
                }
            }
            return IconCompatParcelizer(read, p1);
        }
        return this;
    }

    private final tryToParseEightHexDigits<K, V> IconCompatParcelizer(K p0, V p1, toBigInteger<K, V> p2) {
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, this.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (true) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AudioAttributesImplApi21Parcelizer(read)) || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplBaseParcelizer(read))) {
                    if (read == audioAttributesCompatParcelizer) {
                        break;
                    }
                    read += iconCompatParcelizer;
                } else {
                    return IconCompatParcelizer(read, p2);
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final tryToParseEightHexDigits<K, V> read(tryToParseEightHexDigits<K, V> p0, tryDecToFloatWithFastAlgorithm p1, estimateNumBits p2) {
        createPowersOfTenFloor16Map.IconCompatParcelizer(this.RemoteActionCompatParcelizer == 0);
        createPowersOfTenFloor16Map.IconCompatParcelizer(this.IconCompatParcelizer == 0);
        createPowersOfTenFloor16Map.IconCompatParcelizer(p0.RemoteActionCompatParcelizer == 0);
        createPowersOfTenFloor16Map.IconCompatParcelizer(p0.IconCompatParcelizer == 0);
        Object[] objArr = this.write;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + p0.write.length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf, "");
        int length = this.write.length;
        getDecryptedContent getdecryptedcontentWrite = getQues.write(getQues.IconCompatParcelizer(0, p0.write.length), 2);
        int read = getdecryptedcontentWrite.getRead();
        int audioAttributesCompatParcelizer = getdecryptedcontentWrite.getAudioAttributesCompatParcelizer();
        int iconCompatParcelizer = getdecryptedcontentWrite.getIconCompatParcelizer();
        if ((iconCompatParcelizer > 0 && read <= audioAttributesCompatParcelizer) || (iconCompatParcelizer < 0 && audioAttributesCompatParcelizer <= read)) {
            while (true) {
                if (!IconCompatParcelizer(p0.write[read])) {
                    Object[] objArr2 = p0.write;
                    objArrCopyOf[length] = objArr2[read];
                    objArrCopyOf[length + 1] = objArr2[read + 1];
                    length += 2;
                } else {
                    p1.AudioAttributesCompatParcelizer(p1.getWrite() + 1);
                }
                if (read == audioAttributesCompatParcelizer) {
                    break;
                }
                read += iconCompatParcelizer;
            }
        }
        if (length == this.write.length) {
            return this;
        }
        if (length == p0.write.length) {
            return p0;
        }
        if (length == objArrCopyOf.length) {
            return new tryToParseEightHexDigits<>(0, 0, objArrCopyOf, p2);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objArrCopyOf2, "");
        return new tryToParseEightHexDigits<>(0, 0, objArrCopyOf2, p2);
    }

    private final tryToParseEightHexDigits<K, V> RemoteActionCompatParcelizer(tryToParseEightHexDigits<K, V> p0, int p1, int p2, tryDecToFloatWithFastAlgorithm p3, toBigInteger<K, V> p4) {
        if (MediaBrowserCompatCustomActionResultReceiver(p1)) {
            tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(read(p1));
            if (p0.MediaBrowserCompatCustomActionResultReceiver(p1)) {
                return trytoparseeighthexdigitsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0.AudioAttributesCompatParcelizer(p0.read(p1)), p2 + 5, p3, p4);
            }
            if (!p0.IconCompatParcelizer(p1)) {
                return trytoparseeighthexdigitsAudioAttributesCompatParcelizer;
            }
            int iRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(p1);
            K kAudioAttributesImplApi21Parcelizer = p0.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer);
            V vAudioAttributesImplBaseParcelizer = p0.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer);
            int size = p4.size();
            tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsWrite = trytoparseeighthexdigitsAudioAttributesCompatParcelizer.write(kAudioAttributesImplApi21Parcelizer != null ? kAudioAttributesImplApi21Parcelizer.hashCode() : 0, kAudioAttributesImplApi21Parcelizer, vAudioAttributesImplBaseParcelizer, p2 + 5, p4);
            if (p4.size() == size) {
                p3.AudioAttributesCompatParcelizer(p3.getWrite() + 1);
            }
            return trytoparseeighthexdigitsWrite;
        }
        if (p0.MediaBrowserCompatCustomActionResultReceiver(p1)) {
            tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer2 = p0.AudioAttributesCompatParcelizer(p0.read(p1));
            if (!IconCompatParcelizer(p1)) {
                return trytoparseeighthexdigitsAudioAttributesCompatParcelizer2;
            }
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(p1);
            K kAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer2);
            int i = p2 + 5;
            if (!trytoparseeighthexdigitsAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer(kAudioAttributesImplApi21Parcelizer2 != null ? kAudioAttributesImplApi21Parcelizer2.hashCode() : 0, kAudioAttributesImplApi21Parcelizer2, i)) {
                return trytoparseeighthexdigitsAudioAttributesCompatParcelizer2.write(kAudioAttributesImplApi21Parcelizer2 != null ? kAudioAttributesImplApi21Parcelizer2.hashCode() : 0, kAudioAttributesImplApi21Parcelizer2, AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer2), i, p4);
            }
            p3.AudioAttributesCompatParcelizer(p3.getWrite() + 1);
            return trytoparseeighthexdigitsAudioAttributesCompatParcelizer2;
        }
        int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(p1);
        K kAudioAttributesImplApi21Parcelizer3 = AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer3);
        V vAudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer3);
        int iRemoteActionCompatParcelizer4 = p0.RemoteActionCompatParcelizer(p1);
        K kAudioAttributesImplApi21Parcelizer4 = p0.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer4);
        return write(kAudioAttributesImplApi21Parcelizer3 != null ? kAudioAttributesImplApi21Parcelizer3.hashCode() : 0, kAudioAttributesImplApi21Parcelizer3, vAudioAttributesImplBaseParcelizer2, kAudioAttributesImplApi21Parcelizer4 != null ? kAudioAttributesImplApi21Parcelizer4.hashCode() : 0, kAudioAttributesImplApi21Parcelizer4, p0.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer4), p2 + 5, p4.getIconCompatParcelizer());
    }

    private final int MediaBrowserCompatItemReceiver() {
        if (this.RemoteActionCompatParcelizer == 0) {
            return this.write.length / 2;
        }
        int iBitCount = Integer.bitCount(this.IconCompatParcelizer);
        int length = this.write.length;
        for (int i = iBitCount << 1; i < length; i++) {
            iBitCount += AudioAttributesCompatParcelizer(i).MediaBrowserCompatItemReceiver();
        }
        return iBitCount;
    }

    private final boolean AudioAttributesCompatParcelizer(tryToParseEightHexDigits<K, V> p0) {
        if (this == p0) {
            return true;
        }
        if (this.RemoteActionCompatParcelizer != p0.RemoteActionCompatParcelizer || this.IconCompatParcelizer != p0.IconCompatParcelizer) {
            return false;
        }
        int length = this.write.length;
        for (int i = 0; i < length; i++) {
            if (this.write[i] != p0.write[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean RemoteActionCompatParcelizer(int p0, K p1, int p2) {
        int i = 1 << writeIntBE.read(p0, p2);
        if (IconCompatParcelizer(i)) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer(i)));
        }
        if (!MediaBrowserCompatCustomActionResultReceiver(i)) {
            return false;
        }
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(read(i));
        if (p2 == 30) {
            return trytoparseeighthexdigitsAudioAttributesCompatParcelizer.IconCompatParcelizer(p1);
        }
        return trytoparseeighthexdigitsAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1, p2 + 5);
    }

    public final V write(int p0, K p1, int p2) {
        int i = 1 << writeIntBE.read(p0, p2);
        if (IconCompatParcelizer(i)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer))) {
                return AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer);
            }
            return null;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver(i)) {
            return null;
        }
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(read(i));
        if (p2 == 30) {
            return trytoparseeighthexdigitsAudioAttributesCompatParcelizer.write(p1);
        }
        return trytoparseeighthexdigitsAudioAttributesCompatParcelizer.write(p0, p1, p2 + 5);
    }

    public final tryToParseEightHexDigits<K, V> RemoteActionCompatParcelizer(tryToParseEightHexDigits<K, V> p0, int p1, tryDecToFloatWithFastAlgorithm p2, toBigInteger<K, V> p3) {
        if (this == p0) {
            p2.IconCompatParcelizer(MediaBrowserCompatItemReceiver());
            return this;
        }
        if (p1 > 30) {
            return read(p0, p2, p3.getIconCompatParcelizer());
        }
        int i = this.RemoteActionCompatParcelizer | p0.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        int i3 = p0.IconCompatParcelizer;
        int i4 = (i2 ^ i3) & (~i);
        int i5 = i2 & i3;
        int i6 = i4;
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer(iLowestOneBit)), p0.AudioAttributesImplApi21Parcelizer(p0.RemoteActionCompatParcelizer(iLowestOneBit)))) {
                i6 |= iLowestOneBit;
            } else {
                i |= iLowestOneBit;
            }
            i5 ^= iLowestOneBit;
        }
        if ((i & i6) != 0) {
            getInputCodeUtf8JsNames.read("Check failed.");
        }
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigits = (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, p3.getIconCompatParcelizer()) && this.IconCompatParcelizer == i6 && this.RemoteActionCompatParcelizer == i) ? this : new tryToParseEightHexDigits<>(i6, i, new Object[(Integer.bitCount(i6) << 1) + Integer.bitCount(i)]);
        int i7 = 0;
        int i8 = i;
        int i9 = 0;
        while (i8 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i8);
            trytoparseeighthexdigits.write[(r5.length - 1) - i9] = RemoteActionCompatParcelizer(p0, iLowestOneBit2, p1, p2, p3);
            i9++;
            i8 ^= iLowestOneBit2;
        }
        while (i6 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i6);
            int i10 = i7 << 1;
            if (!p0.IconCompatParcelizer(iLowestOneBit3)) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iLowestOneBit3);
                trytoparseeighthexdigits.write[i10] = AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer);
                trytoparseeighthexdigits.write[i10 + 1] = AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer);
            } else {
                int iRemoteActionCompatParcelizer2 = p0.RemoteActionCompatParcelizer(iLowestOneBit3);
                trytoparseeighthexdigits.write[i10] = p0.AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer2);
                trytoparseeighthexdigits.write[i10 + 1] = p0.AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer2);
                if (IconCompatParcelizer(iLowestOneBit3)) {
                    p2.AudioAttributesCompatParcelizer(p2.getWrite() + 1);
                }
            }
            i7++;
            i6 ^= iLowestOneBit3;
        }
        return AudioAttributesCompatParcelizer(trytoparseeighthexdigits) ? this : p0.AudioAttributesCompatParcelizer(trytoparseeighthexdigits) ? p0 : trytoparseeighthexdigits;
    }

    public final RemoteActionCompatParcelizer<K, V> IconCompatParcelizer(int p0, K p1, V p2, int p3) {
        RemoteActionCompatParcelizer<K, V> remoteActionCompatParcelizerIconCompatParcelizer;
        int i = 1 << writeIntBE.read(p0, p3);
        if (IconCompatParcelizer(i)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer))) {
                if (AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer) == p2) {
                    return null;
                }
                return AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer, p2).AudioAttributesCompatParcelizer();
            }
            return IconCompatParcelizer(iRemoteActionCompatParcelizer, i, p0, p1, p2, p3).IconCompatParcelizer();
        }
        if (MediaBrowserCompatCustomActionResultReceiver(i)) {
            int i2 = read(i);
            tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i2);
            if (p3 == 30) {
                remoteActionCompatParcelizerIconCompatParcelizer = trytoparseeighthexdigitsAudioAttributesCompatParcelizer.read(p1, p2);
                if (remoteActionCompatParcelizerIconCompatParcelizer == null) {
                    return null;
                }
            } else {
                remoteActionCompatParcelizerIconCompatParcelizer = trytoparseeighthexdigitsAudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1, p2, p3 + 5);
                if (remoteActionCompatParcelizerIconCompatParcelizer == null) {
                    return null;
                }
            }
            remoteActionCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer(IconCompatParcelizer(i2, i, remoteActionCompatParcelizerIconCompatParcelizer.write()));
            return remoteActionCompatParcelizerIconCompatParcelizer;
        }
        return read(i, p1, p2).IconCompatParcelizer();
    }

    public final tryToParseEightHexDigits<K, V> write(int p0, K p1, V p2, int p3, toBigInteger<K, V> p4) {
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsWrite;
        int i = 1 << writeIntBE.read(p0, p3);
        if (IconCompatParcelizer(i)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer))) {
                p4.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer));
                if (AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer) != p2) {
                    return IconCompatParcelizer(iRemoteActionCompatParcelizer, p2, p4);
                }
            } else {
                p4.AudioAttributesCompatParcelizer(p4.size() + 1);
                return IconCompatParcelizer(iRemoteActionCompatParcelizer, i, p0, p1, p2, p3, p4.getIconCompatParcelizer());
            }
        } else if (MediaBrowserCompatCustomActionResultReceiver(i)) {
            int i2 = read(i);
            tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i2);
            if (p3 == 30) {
                trytoparseeighthexdigitsWrite = trytoparseeighthexdigitsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p1, p2, p4);
            } else {
                trytoparseeighthexdigitsWrite = trytoparseeighthexdigitsAudioAttributesCompatParcelizer.write(p0, p1, p2, p3 + 5, p4);
            }
            if (trytoparseeighthexdigitsAudioAttributesCompatParcelizer != trytoparseeighthexdigitsWrite) {
                return write(i2, trytoparseeighthexdigitsWrite, p4.getIconCompatParcelizer());
            }
        } else {
            p4.AudioAttributesCompatParcelizer(p4.size() + 1);
            return read(i, p1, p2, p4.getIconCompatParcelizer());
        }
        return this;
    }

    public final tryToParseEightHexDigits<K, V> AudioAttributesCompatParcelizer(int p0, K p1, int p2) {
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer;
        int i = 1 << writeIntBE.read(p0, p2);
        if (IconCompatParcelizer(i)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer)) ? write(iRemoteActionCompatParcelizer, i) : this;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver(i)) {
            return this;
        }
        int i2 = read(i);
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(i2);
        if (p2 == 30) {
            trytoparseeighthexdigitsAudioAttributesCompatParcelizer = trytoparseeighthexdigitsAudioAttributesCompatParcelizer2.read(p1);
        } else {
            trytoparseeighthexdigitsAudioAttributesCompatParcelizer = trytoparseeighthexdigitsAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(p0, p1, p2 + 5);
        }
        return AudioAttributesCompatParcelizer(trytoparseeighthexdigitsAudioAttributesCompatParcelizer2, trytoparseeighthexdigitsAudioAttributesCompatParcelizer, i2, i);
    }

    private final tryToParseEightHexDigits<K, V> AudioAttributesCompatParcelizer(tryToParseEightHexDigits<K, V> p0, tryToParseEightHexDigits<K, V> p1, int p2, int p3) {
        if (p1 == null) {
            return RemoteActionCompatParcelizer(p2, p3);
        }
        return p0 != p1 ? IconCompatParcelizer(p2, p3, p1) : this;
    }

    public final tryToParseEightHexDigits<K, V> write(int p0, K p1, int p2, toBigInteger<K, V> p3) {
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsWrite;
        int i = 1 << writeIntBE.read(p0, p2);
        if (IconCompatParcelizer(i)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer)) ? IconCompatParcelizer(iRemoteActionCompatParcelizer, i, p3) : this;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver(i)) {
            return this;
        }
        int i2 = read(i);
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i2);
        if (p2 == 30) {
            trytoparseeighthexdigitsWrite = trytoparseeighthexdigitsAudioAttributesCompatParcelizer.read((Object) p1, (toBigInteger) p3);
        } else {
            trytoparseeighthexdigitsWrite = trytoparseeighthexdigitsAudioAttributesCompatParcelizer.write(p0, p1, p2 + 5, p3);
        }
        return RemoteActionCompatParcelizer(trytoparseeighthexdigitsAudioAttributesCompatParcelizer, trytoparseeighthexdigitsWrite, i2, i, p3.getIconCompatParcelizer());
    }

    private final tryToParseEightHexDigits<K, V> RemoteActionCompatParcelizer(tryToParseEightHexDigits<K, V> p0, tryToParseEightHexDigits<K, V> p1, int p2, int p3, estimateNumBits p4) {
        if (p1 == null) {
            return read(p2, p3, p4);
        }
        return (this.read == p4 || p0 != p1) ? write(p2, p1, p4) : this;
    }

    public final tryToParseEightHexDigits<K, V> AudioAttributesCompatParcelizer(int p0, K p1, V p2, int p3, toBigInteger<K, V> p4) {
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer;
        int i = 1 << writeIntBE.read(p0, p3);
        if (IconCompatParcelizer(i)) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            return (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, AudioAttributesImplApi21Parcelizer(iRemoteActionCompatParcelizer)) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p2, AudioAttributesImplBaseParcelizer(iRemoteActionCompatParcelizer))) ? IconCompatParcelizer(iRemoteActionCompatParcelizer, i, p4) : this;
        }
        if (!MediaBrowserCompatCustomActionResultReceiver(i)) {
            return this;
        }
        int i2 = read(i);
        tryToParseEightHexDigits<K, V> trytoparseeighthexdigitsAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(i2);
        if (p3 == 30) {
            trytoparseeighthexdigitsAudioAttributesCompatParcelizer = trytoparseeighthexdigitsAudioAttributesCompatParcelizer2.IconCompatParcelizer(p1, p2, p4);
        } else {
            trytoparseeighthexdigitsAudioAttributesCompatParcelizer = trytoparseeighthexdigitsAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer(p0, p1, p2, p3 + 5, p4);
        }
        return RemoteActionCompatParcelizer(trytoparseeighthexdigitsAudioAttributesCompatParcelizer2, trytoparseeighthexdigitsAudioAttributesCompatParcelizer, i2, i, p4.getIconCompatParcelizer());
    }

    /* JADX INFO: renamed from: o.tryToParseEightHexDigits$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/tryToParseEightHexDigits$write;", "", "<init>", "()V", "Lo/tryToParseEightHexDigits;", "", "AudioAttributesCompatParcelizer", "Lo/tryToParseEightHexDigits;", "IconCompatParcelizer", "()Lo/tryToParseEightHexDigits;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final tryToParseEightHexDigits IconCompatParcelizer() {
            return tryToParseEightHexDigits.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
