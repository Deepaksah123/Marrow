package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.hexToChar;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0016\u001eBQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u000f\u0010#\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010\u0019J\u000f\u0010$\u001a\u00020\u0015H\u0000¢\u0006\u0004\b$\u0010\u0019J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\u0015H\u0000¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0015H\u0000¢\u0006\u0004\b'\u0010\u0019J\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010\u0017J!\u0010%\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020\u0015H\u0002¢\u0006\u0004\b)\u0010\u0019J\u000f\u0010*\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010\u0019J\u000f\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\b+\u0010\u0019J#\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010,2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b\u0016\u0010.J\u000f\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b0\u0010\u0019J!\u00101\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b1\u0010\u001fJ\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u0019J\r\u00103\u001a\u00020\u0015¢\u0006\u0004\b3\u0010\u0019J\r\u00104\u001a\u00020\u0015¢\u0006\u0004\b4\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J=\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u00105\"\u0004\b\u0001\u0010,2\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001506H\u0016¢\u0006\u0004\b\u0016\u00107J\u0011\u00108\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b8\u00109J\u0011\u0010:\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b:\u00109J\u0019\u0010\u001e\u001a\u00020;2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010<J\u0019\u0010\u001a\u001a\u00020;2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001a\u0010<J\u0017\u0010\u001e\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020=H\u0016¢\u0006\u0004\b\u001e\u0010>J\u0017\u0010\u001e\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020;H\u0016¢\u0006\u0004\b\u001e\u0010?J\u0017\u0010\u001a\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020@H\u0016¢\u0006\u0004\b\u001a\u0010AJ\u0017\u0010\u001a\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020BH\u0016¢\u0006\u0004\b\u001a\u0010CJ\u0017\u0010\u001a\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020DH\u0016¢\u0006\u0004\b\u001a\u0010EJ\u0017\u0010%\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010FJ\u0019\u0010G\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u00100\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b0\u0010HJ\u0019\u00101\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b1\u0010HJ\u000f\u0010I\u001a\u00020\u0014H\u0002¢\u0006\u0004\bI\u0010JJ\u001d\u0010%\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150-H\u0016¢\u0006\u0004\b%\u0010.J\u000f\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010\u001b\u001a\u00020K2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010NJ\u001f\u0010\u0016\u001a\u00020K2\u0006\u0010\u0003\u001a\u00020K2\u0006\u0010\u0005\u001a\u00020KH\u0002¢\u0006\u0004\b\u0016\u0010OJ\u001b\u0010%\u001a\u00020\u00152\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030PH\u0016¢\u0006\u0004\b%\u0010QJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020KH\u0002¢\u0006\u0004\b\u0016\u0010RJ\u000f\u0010S\u001a\u00020\u0015H\u0016¢\u0006\u0004\bS\u0010\u0019J#\u0010\u001a\u001a\u00020\u00152\u0012\u0010\u0003\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030P0TH\u0016¢\u0006\u0004\b\u001a\u0010UJ\u000f\u0010G\u001a\u00020\u0015H\u0016¢\u0006\u0004\bG\u0010\u0019J#\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000VH\u0016¢\u0006\u0004\b1\u0010WJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010XJ\u000f\u0010Y\u001a\u00020\u0015H\u0002¢\u0006\u0004\bY\u0010\u0019J\u000f\u0010Z\u001a\u00020\u0015H\u0002¢\u0006\u0004\bZ\u0010\u0019J\u000f\u0010[\u001a\u00020\u0015H\u0002¢\u0006\u0004\b[\u0010\u0019J!\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020;2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001a\u0010\\J3\u00101\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020]2\b\u0010\n\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b1\u0010^J!\u00101\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020;2\b\u0010\u0005\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0004\b1\u0010`J\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020;H\u0002¢\u0006\u0004\b\u001e\u0010aJ\u0017\u0010%\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020;H\u0002¢\u0006\u0004\b%\u0010bJ\u000f\u0010c\u001a\u00020\u0015H\u0002¢\u0006\u0004\bc\u0010\u0019J\u0017\u0010G\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\bG\u0010dJ\u001f\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010eJ/\u00101\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u0010fJ\u0017\u00100\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010dJ\u0017\u0010g\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\bg\u0010dJ\u001f\u00101\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u0010eJ\u000f\u0010h\u001a\u00020\u0015H\u0002¢\u0006\u0004\bh\u0010\u0019J'\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010iJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010eJ/\u00101\u001a\u00060Bj\u0002`j2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\n\u0010\u0007\u001a\u00060Bj\u0002`jH\u0002¢\u0006\u0004\b1\u0010kJ\u001b\u00101\u001a\u00020\u0014*\u00020l2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u0010mJ!\u0010\u001a\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001a\u0010oJ\u000f\u0010p\u001a\u00020\u0015H\u0016¢\u0006\u0004\bp\u0010\u0019J\u000f\u0010q\u001a\u00020\u0015H\u0002¢\u0006\u0004\bq\u0010\u0019J\u001f\u0010%\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010rJ\u000f\u0010s\u001a\u00020\u0015H\u0016¢\u0006\u0004\bs\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020;H\u0016¢\u0006\u0004\b\u001a\u0010bJ\u0017\u00101\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b1\u0010tJ\u000f\u0010u\u001a\u00020\u0015H\u0002¢\u0006\u0004\bu\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020nH\u0002¢\u0006\u0004\b\u001a\u0010vJ\u0011\u0010x\u001a\u0004\u0018\u00010wH\u0016¢\u0006\u0004\bx\u0010yJ%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u0015\u0018\u00010z2\u0006\u0010\u0003\u001a\u00020nH\u0002¢\u0006\u0004\b\u0016\u0010|J9\u0010\u001a\u001a\u00020\u00152\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0}2\u0006\u0010\u0005\u001a\u00020K2\b\u0010\u0007\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020;H\u0002¢\u0006\u0004\b\u001a\u0010~J/\u0010%\u001a\u00020\u00152\u001d\u0010\u0003\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010\u0080\u00010\u007fH\u0016¢\u0006\u0005\b%\u0010\u0082\u0001J/\u0010\u001a\u001a\u00020\u00152\u001d\u0010\u0003\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010\u0080\u00010\u007fH\u0002¢\u0006\u0005\b\u001a\u0010\u0082\u0001Jj\u0010%\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0083\u00012\u000b\b\u0002\u0010\u0003\u001a\u0005\u0018\u00010\u0084\u00012\u000b\b\u0002\u0010\u0005\u001a\u0005\u0018\u00010\u0084\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00142\u001d\b\u0002\u0010\n\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0080\u00010\u007f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0002¢\u0006\u0005\b%\u0010\u0085\u0001J\u001b\u0010\u0016\u001a\u00030\u0086\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0005\b\u0016\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J)\u0010\u0016\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u007f2\u0006\u0010\u0003\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0005\b\u0016\u0010\u008b\u0001J\u0017\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u007f¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J>\u00101\u001a\u00020\u00152\u0013\u0010\u0003\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u008e\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00150-2\t\u0010\u0007\u001a\u0005\u0018\u00010\u008f\u0001H\u0000¢\u0006\u0005\b1\u0010\u0090\u0001J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150-H\u0000¢\u0006\u0004\b\u001a\u0010.J0\u0010%\u001a\u00020;2\u0013\u0010\u0003\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u008e\u00012\t\u0010\u0005\u001a\u0005\u0018\u00010\u008f\u0001H\u0000¢\u0006\u0005\b%\u0010\u0091\u0001J#\u0010\u001e\u001a\u00020\u00152\u0013\u0010\u0003\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u008e\u0001¢\u0006\u0005\b\u001e\u0010\u0092\u0001J5\u0010\u0016\u001a\u00020\u00152\u0013\u0010\u0003\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u008e\u00012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010-H\u0002¢\u0006\u0005\b\u0016\u0010\u0093\u0001J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001d*\u00020l2\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u001a\u0010\u0094\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0095\u0001\u0010\u0019J\u0011\u0010\u0096\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0019J\u0019\u00101\u001a\u00020\u00152\u0007\u0010\u0003\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0005\b1\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u0019J\u0017\u0010S\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0014H\u0002¢\u0006\u0004\bS\u0010\u0017J\u0011\u0010\u009a\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0019J\u0011\u0010\u009b\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u0019J\u0011\u0010\u009c\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u009c\u0001\u0010\u0019J\u0013\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b\u009d\u0001\u00109J\u0019\u0010%\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b%\u0010HJ\u0019\u00101\u001a\u00020\u00152\u0007\u0010\u0003\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0005\b1\u0010\u009f\u0001R \u00101\u001a\u0006\u0012\u0002\b\u00030\u00028\u0017X\u0096\u0004¢\u0006\u000e\n\u0005\b \u0010 \u0001\u001a\u0005\bg\u0010¡\u0001R\u0015\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b4\u0010¢\u0001R\u0015\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bh\u0010£\u0001R\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010¤\u0001R\u0017\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bS\u0010¥\u0001R\u0017\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010¥\u0001R\u0015\u0010G\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b$\u0010¦\u0001R\u001e\u00100\u001a\u00020\u00108\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001f\u0010\u001b\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010_0«\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010 \u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b'\u0010®\u0001R\u0018\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010g\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b±\u0001\u0010°\u0001R\u0019\u0010§\u0001\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010°\u0001R\u0016\u00102\u001a\u00030²\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b&\u0010³\u0001R\u001a\u0010x\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bs\u0010µ\u0001R\u001b\u0010¸\u0001\u001a\u0005\u0018\u00010¶\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b/\u0010·\u0001R\u0019\u0010¹\u0001\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010»\u0001\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010º\u0001R\u0018\u0010±\u0001\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b+\u0010º\u0001R\u001f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010¼\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Á\u0001\u001a\u00030²\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b»\u0001\u0010³\u0001R\u0018\u0010\u009d\u0001\u001a\u00020K8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b:\u0010Â\u0001R\"\u0010Å\u0001\u001a\u000b\u0012\u0004\u0012\u00020K\u0018\u00010Ã\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b©\u0001\u0010Ä\u0001R\u0019\u0010Ç\u0001\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010º\u0001R\u0018\u0010¾\u0001\u001a\u00030²\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010³\u0001R\u0018\u0010\u001c\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010º\u0001R\u0017\u0010s\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bp\u0010°\u0001R\u0017\u0010+\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bG\u0010°\u0001R\u0017\u0010*\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010°\u0001R\u0017\u0010/\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bu\u0010º\u0001R\u0016\u00104\u001a\u00030Ê\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bg\u0010Ë\u0001R\u001d\u0010'\u001a\t\u0012\u0004\u0012\u00020n0«\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010\u00ad\u0001R'\u0010$\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020;8\u0001@BX\u0081\u000e¢\u0006\u000f\n\u0005\b*\u0010º\u0001\u001a\u0006\bÉ\u0001\u0010Ì\u0001R\u001f\u0010&\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020;8\u0000@BX\u0081\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010º\u0001R\u0017\u0010¯\u0001\u001a\u00020;8AX\u0080\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010Ì\u0001R \u0010Æ\u0001\u001a\u00020l8\u0001@\u0000X\u0081\f¢\u0006\u000f\n\u0005\b8\u0010Í\u0001\u001a\u0006\bÈ\u0001\u0010Î\u0001R\u0018\u0010È\u0001\u001a\u00020\u00068\u0000@\u0000X\u0081\f¢\u0006\u0007\n\u0005\b%\u0010£\u0001R\u001a\u0010©\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010Ð\u0001R\u0018\u0010Ñ\u0001\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b3\u0010º\u0001R\u001b\u0010¬\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Â\u0001R!\u0010p\u001a\u0004\u0018\u00010\u000b8\u0001@\u0000X\u0081\f¢\u0006\u000f\n\u0005\bx\u0010¥\u0001\u001a\u0006\bÆ\u0001\u0010Ò\u0001R\u0016\u0010:\u001a\u00030Ó\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b0\u0010Ô\u0001R\u001a\u0010É\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010Õ\u0001R\u0019\u00108\u001a\u00030Ö\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010×\u0001R\u001b\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b#\u0010Ø\u0001R!\u0010h\u001a\u0005\u0018\u00010Ù\u00018AX\u0081\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Ú\u0001\u001a\u0006\b¬\u0001\u0010Û\u0001R\u001e\u0010#\u001a\u00030Ü\u00018\u0017X\u0097\u0004¢\u0006\u000f\n\u0005\b\u001b\u0010Ý\u0001\u001a\u0006\b§\u0001\u0010Þ\u0001R\u0016\u0010u\u001a\u00020;8WX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010Ì\u0001R(\u00103\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020;8\u0017@RX\u0097\u000e¢\u0006\u0010\n\u0006\bÇ\u0001\u0010º\u0001\u001a\u0006\bÅ\u0001\u0010Ì\u0001R\u0017\u0010\u009c\u0001\u001a\u00020;8WX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Ì\u0001R0\u0010\u0088\u0001\u001a\u00060Bj\u0002`j2\n\u0010\u0003\u001a\u00060Bj\u0002`j8\u0017@RX\u0097\u000e¢\u0006\u000f\n\u0005\b2\u0010ß\u0001\u001a\u0006\b¹\u0001\u0010à\u0001R\u0015\u0010\"\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010JR\u001a\u0010Z\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010â\u0001R\u0017\u0010L\u001a\u00030á\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010ã\u0001R\u0017\u0010(\u001a\u00030ä\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010å\u0001R\u0019\u0010\u009b\u0001\u001a\u0004\u0018\u00010n8AX\u0080\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010æ\u0001R\u001c\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001d*\u00020l8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u001e\u0010ç\u0001R\u0019\u0010Y\u001a\u0005\u0018\u00010\u009e\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010è\u0001"}, d2 = {"Lo/_parseIntValue;", "Lo/_handleUnrecognizedCharacterEscape;", "Lo/_closeInput;", "p0", "Lo/convertNumberToLong;", "p1", "Lo/releaseTokenBuffer;", "p2", "", "Lo/allocReadIOBuffer;", "p3", "Lo/_full3;", "p4", "p5", "Lo/resetFloat;", "p6", "Lo/getTokenLineNr;", "p7", "<init>", "(Lo/_closeInput;Lo/convertNumberToLong;Lo/releaseTokenBuffer;Ljava/util/Set;Lo/_full3;Lo/_full3;Lo/resetFloat;Lo/getTokenLineNr;)V", "", "", "read", "(I)V", "RatingCompat", "()V", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "onPrepare", "", "AudioAttributesCompatParcelizer", "(ILjava/lang/Object;)V", "MediaBrowserCompatItemReceiver", "accessaddObserverForBackInvoker", "ResultReceiver", "MediaSessionCompatResultReceiverWrapper", "onRemoveQueueItem", "RemoteActionCompatParcelizer", "onSeekTo", "onRewind", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "accessgetReportFullyDrawnExecutorp", "onPlayFromSearch", "onPrepareFromMediaId", "T", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)V", "onPlayFromUri", "AudioAttributesImplBaseParcelizer", "write", "MediaDescriptionCompat", "ParcelableVolumeInfo", "onPrepareFromUri", "V", "Lkotlin/Function2;", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V", "onStop", "()Ljava/lang/Object;", "onSkipToPrevious", "", "(Ljava/lang/Object;)Z", "", "(C)Z", "(Z)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "(I)Z", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/Object;)V", "accessensureViewModelStore", "()I", "Lo/hexToChar;", "PlaybackStateCompatCustomAction", "()Lo/hexToChar;", "(I)Lo/hexToChar;", "(Lo/hexToChar;Lo/hexToChar;)Lo/hexToChar;", "Lo/ContentReference;", "(Lo/ContentReference;)V", "(Lo/hexToChar;)V", "AudioAttributesImplApi26Parcelizer", "", "([Lo/ContentReference;)V", "Lo/getTokenColumnNr;", "(Lo/getTokenColumnNr;)Ljava/lang/Object;", "()Lo/convertNumberToLong;", "r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "_init_lambda3", "(ZLjava/lang/Object;)V", "Lo/_verifyAllowedMatches;", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Lo/get7BitOutputEscapes;", "(ZLo/get7BitOutputEscapes;)V", "(IZ)V", "(Z)V", "_init_lambda2", "(I)I", "(II)V", "(IIII)I", "MediaMetadataCompat", "PlaybackStateCompat", "(III)V", "Lo/CompositeKeyHashCode;", "(IIJ)J", "Lo/releaseBase64Buffer;", "(Lo/releaseBase64Buffer;I)I", "Lo/rawReference;", "(Lo/rawReference;Ljava/lang/Object;)Z", "setSessionImpl", "_init_lambda5", "(ZI)Z", "onPrepareFromSearch", "(I)Lo/_handleUnrecognizedCharacterEscape;", "MediaSessionCompatToken", "(Lo/rawReference;)V", "Lo/releaseNameCopyBuffer;", "MediaBrowserCompatSearchResultReceiver", "()Lo/releaseNameCopyBuffer;", "Lkotlin/Function1;", "Lo/createChildArrayContext;", "(Lo/rawReference;)Lo/getAnswerMap;", "Lo/createRootContext;", "(Lo/createRootContext;Lo/hexToChar;Ljava/lang/Object;Z)V", "", "Lo/getSubscriptionExpiresOn;", "Lo/getFilter;", "(Ljava/util/List;)V", "R", "Lo/_reportMissingRootWS;", "(Lo/_reportMissingRootWS;Lo/_reportMissingRootWS;Ljava/lang/Integer;Ljava/util/List;Lo/getCreatedOnDateMs;)Ljava/lang/Object;", "Lo/_verifyPrettyValueWrite;", "(Ljava/lang/Object;)Lo/_verifyPrettyValueWrite;", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "()Lo/_verifyPrettyValueWrite;", "Lo/JsonGeneratorImpl;", "(ILjava/lang/Integer;)Ljava/util/List;", "onSkipToQueueItem", "()Ljava/util/List;", "Lo/getAndClear;", "Lo/isResourceManaged;", "(Lo/setKeyListener;Lo/MagicModuleSubmissionRequestBody;Lo/isResourceManaged;)V", "(Lo/setKeyListener;Lo/isResourceManaged;)Z", "(Lo/setKeyListener;)V", "(Lo/setKeyListener;Lo/MagicModuleSubmissionRequestBody;)V", "(Lo/releaseBase64Buffer;I)Ljava/lang/Object;", "accessonBackPresseds1027565324", "ensureViewModelStore", "Lo/_parseSlowFloat;", "(Lo/_parseSlowFloat;)V", "r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0", "_init_lambda4", "r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28", "MediaSessionCompatQueueItem", "onPause", "Lo/escapesFor;", "(Lo/escapesFor;)V", "Lo/_closeInput;", "()Lo/_closeInput;", "Lo/convertNumberToLong;", "Lo/releaseTokenBuffer;", "Ljava/util/Set;", "Lo/_full3;", "Lo/resetFloat;", "MediaBrowserCompatMediaItem", "Lo/getTokenLineNr;", "onSetPlaybackSpeed", "()Lo/getTokenLineNr;", "Lo/parseLong;", "onSetCaptioningEnabled", "Ljava/util/ArrayList;", "Lo/get7BitOutputEscapes;", "onRemoveQueueItemAt", "I", "onAddQueueItem", "Lo/filterFinishArray;", "Lo/filterFinishArray;", "", "[I", "Lo/setExpandActivityOverflowButtonContentDescription;", "Lo/setExpandActivityOverflowButtonContentDescription;", "onCommand", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Z", "onCustomAction", "", "Lo/filterStartObject;", "onFastForward", "Ljava/util/List;", "handleMediaPlayPauseIfPendingOnHandler", "onPlay", "Lo/hexToChar;", "Lo/setProvider;", "Lo/setProvider;", "onPlayFromMediaId", "onSetShuffleMode", "onMediaButtonEvent", "onSetRepeatMode", "onSkipToNext", "Lo/_parseIntValue$write;", "Lo/_parseIntValue$write;", "()Z", "Lo/releaseBase64Buffer;", "()Lo/releaseBase64Buffer;", "Lo/setEncoding;", "Lo/setEncoding;", "onSetRating", "()Lo/_full3;", "Lo/parseLong19;", "Lo/parseLong19;", "Lo/_parseSlowFloat;", "Lo/_outputUptoBillion;", "Lo/_outputUptoBillion;", "Lo/isResourceManaged;", "Lo/_checkDup;", "Lo/_checkDup;", "()Lo/_checkDup;", "Lo/CurrentQuery;", "Lo/CurrentQuery;", "()Lo/CurrentQuery;", "J", "()J", "Lo/JsonReadContext;", "Lo/JsonReadContext;", "()Lo/JsonReadContext;", "Lo/_getCharDesc;", "()Lo/_getCharDesc;", "()Lo/rawReference;", "(Lo/releaseBase64Buffer;)Ljava/lang/Object;", "()Lo/escapesFor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _parseIntValue implements _handleUnrecognizedCharacterEscape {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private JsonReadContext r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int onPrepareFromMediaId;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private _full3 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final parseLong19 onSkipToPrevious;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public boolean onSeekTo;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final CurrentQuery MediaSessionCompatResultReceiverWrapper;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final _closeInput<?> write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final getTokenLineNr AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private _full3 setSessionImpl;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final write onPrepareFromUri;

    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: from kotlin metadata */
    private setEncoding onSetPlaybackSpeed;

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from kotlin metadata */
    private isResourceManaged onSkipToQueueItem;

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from kotlin metadata */
    private boolean onPlayFromUri;

    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: from kotlin metadata */
    private boolean onSetRating;

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from kotlin metadata */
    private final releaseTokenBuffer read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int onPlayFromSearch;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public releaseTokenBuffer onSetRepeatMode;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final _checkDup PlaybackStateCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private int MediaMetadataCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private boolean onCustomAction;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private boolean ParcelableVolumeInfo;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private _parseSlowFloat onSkipToNext;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final ArrayList<rawReference> onRewind;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private _outputUptoBillion onStop;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private boolean onRemoveQueueItem;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private setExpandActivityOverflowButtonContentDescription onCommand;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private _full3 AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private boolean onAddQueueItem;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private int[] MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final convertNumberToLong IconCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final resetFloat AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private int RatingCompat;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private get7BitOutputEscapes MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private setProvider<hexToChar> onPlayFromMediaId;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private hexToChar onSetCaptioningEnabled;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private boolean onMediaButtonEvent;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private boolean onPrepare;

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private releaseBase64Buffer onSetShuffleMode;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Set<allocReadIOBuffer> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private final ArrayList<get7BitOutputEscapes> MediaBrowserCompatCustomActionResultReceiver = parseLong.IconCompatParcelizer(null, 1, null);

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final filterFinishArray MediaDescriptionCompat = new filterFinishArray();

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final List<filterStartObject> handleMediaPlayPauseIfPendingOnHandler = new ArrayList();

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final filterFinishArray onPlay = new filterFinishArray();

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private hexToChar onPause = imagIdx.write();

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private final filterFinishArray onFastForward = new filterFinishArray();

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private int onPrepareFromSearch = -1;

    private final int AudioAttributesImplApi21Parcelizer(int p0) {
        return (-2) - p0;
    }

    public _parseIntValue(_closeInput<?> _closeinput, convertNumberToLong convertnumbertolong, releaseTokenBuffer releasetokenbuffer, Set<allocReadIOBuffer> set, _full3 _full3Var, _full3 _full3Var2, resetFloat resetfloat, getTokenLineNr gettokenlinenr) {
        this.write = _closeinput;
        this.IconCompatParcelizer = convertnumbertolong;
        this.read = releasetokenbuffer;
        this.RemoteActionCompatParcelizer = set;
        this.AudioAttributesCompatParcelizer = _full3Var;
        this.AudioAttributesImplApi26Parcelizer = _full3Var2;
        this.AudioAttributesImplApi21Parcelizer = resetfloat;
        this.AudioAttributesImplBaseParcelizer = gettokenlinenr;
        this.onPlayFromUri = convertnumbertolong.getAudioAttributesCompatParcelizer() || convertnumbertolong.write();
        this.onPrepareFromUri = new write();
        this.onRewind = parseLong.IconCompatParcelizer(null, 1, null);
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = releasetokenbuffer.MediaBrowserCompatMediaItem();
        releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
        this.onSetShuffleMode = releasebase64bufferMediaBrowserCompatMediaItem;
        releaseTokenBuffer releasetokenbuffer2 = new releaseTokenBuffer();
        if (convertnumbertolong.getAudioAttributesCompatParcelizer()) {
            releasetokenbuffer2.write();
        }
        if (convertnumbertolong.write()) {
            releasetokenbuffer2.IconCompatParcelizer();
        }
        this.onSetRepeatMode = releasetokenbuffer2;
        setEncoding setencodingOnAddQueueItem = releasetokenbuffer2.onAddQueueItem();
        setencodingOnAddQueueItem.read(true);
        this.onSetPlaybackSpeed = setencodingOnAddQueueItem;
        this.onSkipToPrevious = new parseLong19(this, this.AudioAttributesCompatParcelizer);
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem2 = this.onSetRepeatMode.MediaBrowserCompatMediaItem();
        try {
            _parseSlowFloat _parseslowfloatIconCompatParcelizer = releasebase64bufferMediaBrowserCompatMediaItem2.IconCompatParcelizer(0);
            releasebase64bufferMediaBrowserCompatMediaItem2.IconCompatParcelizer();
            this.onSkipToNext = _parseslowfloatIconCompatParcelizer;
            this.onStop = new _outputUptoBillion();
            this.PlaybackStateCompat = new _checkDup(this);
            CurrentQuery onPlayFromSearch = convertnumbertolong.getOnPlayFromSearch();
            CurrentQuery currentQueryOnSetCaptioningEnabled = onSetCaptioningEnabled();
            this.MediaSessionCompatResultReceiverWrapper = onPlayFromSearch.plus(currentQueryOnSetCaptioningEnabled == null ? VideoSessionResponseBody.RemoteActionCompatParcelizer : currentQueryOnSetCaptioningEnabled);
        } catch (Throwable th) {
            releasebase64bufferMediaBrowserCompatMediaItem2.IconCompatParcelizer();
            throw th;
        }
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final _closeInput<?> MediaMetadataCompat() {
        return this.write;
    }

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from getter */
    public final getTokenLineNr getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/_parseIntValue$write;", "Lo/reportOverflowInt;", "Lo/reportInvalidNumber;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/reportInvalidNumber;)V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements reportOverflowInt {
        write() {
        }

        @Override // kotlin.reportOverflowInt
        public final void RemoteActionCompatParcelizer(reportInvalidNumber<?> p0) {
            _parseIntValue.this.onPrepareFromMediaId++;
        }

        @Override // kotlin.reportOverflowInt
        public final void read(reportInvalidNumber<?> p0) {
            _parseIntValue.this.onPrepareFromMediaId--;
        }
    }

    /* JADX INFO: renamed from: onSkipToNext, reason: from getter */
    public final boolean getOnRemoveQueueItem() {
        return this.onRemoveQueueItem;
    }

    public final boolean onRemoveQueueItemAt() {
        return this.onPrepareFromMediaId > 0;
    }

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from getter */
    public final releaseBase64Buffer getOnSetShuffleMode() {
        return this.onSetShuffleMode;
    }

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from getter */
    public final _full3 getSetSessionImpl() {
        return this.setSessionImpl;
    }

    public final _checkDup onSetCaptioningEnabled() {
        if (this.IconCompatParcelizer.MediaDescriptionCompat()) {
            return this.PlaybackStateCompat;
        }
        return null;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final CurrentQuery getMediaSessionCompatResultReceiverWrapper() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void read(int p0) {
        write(p0, (Object) null, _verifyAllowedMatches.INSTANCE.write(), (Object) null);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void RatingCompat() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void IconCompatParcelizer(int p0) {
        if (this.MediaBrowserCompatItemReceiver != null) {
            write(p0, (Object) null, _verifyAllowedMatches.INSTANCE.write(), (Object) null);
            return;
        }
        ensureViewModelStore();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateLeft(Long.rotateLeft(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3) ^ ((long) p0), 3) ^ ((long) this.MediaBrowserCompatMediaItem);
        this.MediaBrowserCompatMediaItem++;
        releaseBase64Buffer releasebase64buffer = this.onSetShuffleMode;
        if (getParcelableVolumeInfo()) {
            releasebase64buffer.RemoteActionCompatParcelizer();
            this.onSetPlaybackSpeed.RemoteActionCompatParcelizer(p0, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer());
            write(false, (get7BitOutputEscapes) null);
            return;
        }
        if (releasebase64buffer.MediaBrowserCompatMediaItem() == p0 && !releasebase64buffer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            releasebase64buffer.onPrepareFromSearch();
            write(false, (get7BitOutputEscapes) null);
            return;
        }
        if (!releasebase64buffer.onPlay()) {
            int i = this.RatingCompat;
            int write2 = releasebase64buffer.getWrite();
            r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
            this.onSkipToPrevious.IconCompatParcelizer(i, releasebase64buffer.onPlayFromSearch());
            convertNumberToBigDecimal.IconCompatParcelizer((List<filterStartObject>) this.handleMediaPlayPauseIfPendingOnHandler, write2, releasebase64buffer.getWrite());
        }
        releasebase64buffer.RemoteActionCompatParcelizer();
        this.ParcelableVolumeInfo = true;
        this.onSetCaptioningEnabled = null;
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        setEncoding setencoding = this.onSetPlaybackSpeed;
        setencoding.AudioAttributesCompatParcelizer();
        int audioAttributesImplApi26Parcelizer = setencoding.getAudioAttributesImplApi26Parcelizer();
        setencoding.RemoteActionCompatParcelizer(p0, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer());
        this.onSkipToNext = setencoding.read(audioAttributesImplApi26Parcelizer);
        write(false, (get7BitOutputEscapes) null);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void onPrepare() {
        write(-127, (Object) null, _verifyAllowedMatches.INSTANCE.write(), (Object) null);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void IconCompatParcelizer() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        rawReference rawreferenceOnSetRating = onSetRating();
        if (rawreferenceOnSetRating == null || !rawreferenceOnSetRating.MediaBrowserCompatMediaItem()) {
            return;
        }
        rawreferenceOnSetRating.AudioAttributesCompatParcelizer(true);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean onFastForward() {
        rawReference rawreferenceOnSetRating;
        return !onPlay() || this.onMediaButtonEvent || ((rawreferenceOnSetRating = onSetRating()) != null && rawreferenceOnSetRating.RemoteActionCompatParcelizer());
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void AudioAttributesCompatParcelizer(int p0, Object p1) {
        write(p0, p1, _verifyAllowedMatches.INSTANCE.write(), (Object) null);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void MediaBrowserCompatItemReceiver() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
    }

    private final void accessaddObserverForBackInvoker() {
        this.MediaBrowserCompatMediaItem = 0;
        this.onSetShuffleMode = this.read.MediaBrowserCompatMediaItem();
        MediaBrowserCompatItemReceiver(100);
        this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
        hexToChar hextocharMediaBrowserCompatCustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        this.onFastForward.RemoteActionCompatParcelizer(convertNumberToBigDecimal.write(this.onMediaButtonEvent));
        this.onMediaButtonEvent = AudioAttributesCompatParcelizer(hextocharMediaBrowserCompatCustomActionResultReceiver);
        this.onSetCaptioningEnabled = null;
        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.IconCompatParcelizer.getWrite();
        }
        if (!this.onPlayFromUri) {
            this.onPlayFromUri = this.IconCompatParcelizer.getAudioAttributesCompatParcelizer();
        }
        if (this.onPlayFromUri) {
            getTokenColumnNr<expectComma> gettokencolumnnr = JsonWriteContext.read();
            toMagicModuleMetaRepoModel.read(gettokencolumnnr, "");
            hextocharMediaBrowserCompatCustomActionResultReceiver = hextocharMediaBrowserCompatCustomActionResultReceiver.read(gettokencolumnnr, new parseFloat(onSetCaptioningEnabled()));
        }
        this.onPause = hextocharMediaBrowserCompatCustomActionResultReceiver;
        Set<JsonReadContext> set = (Set) resetInt.read(hextocharMediaBrowserCompatCustomActionResultReceiver, _handleOddName2.read());
        if (set != null) {
            set.add(onAddQueueItem());
            this.IconCompatParcelizer.IconCompatParcelizer(set);
        }
        MediaBrowserCompatItemReceiver(Long.hashCode(this.IconCompatParcelizer.getRemoteActionCompatParcelizer()));
    }

    private final void ResultReceiver() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.IconCompatParcelizer.read();
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.onSkipToPrevious.read();
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        this.onSetShuffleMode.IconCompatParcelizer();
        this.onCustomAction = false;
        this.onMediaButtonEvent = convertNumberToBigDecimal.AudioAttributesCompatParcelizer(this.onFastForward.AudioAttributesCompatParcelizer());
    }

    private final void MediaSessionCompatResultReceiverWrapper() {
        MediaSessionCompatQueueItem();
        parseLong.read(this.MediaBrowserCompatCustomActionResultReceiver);
        this.MediaDescriptionCompat.read();
        this.onPlay.read();
        this.onFastForward.read();
        this.onPlayFromMediaId = null;
        this.onStop.IconCompatParcelizer();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 0L;
        this.onPrepareFromMediaId = 0;
        this.onAddQueueItem = false;
        this.ParcelableVolumeInfo = false;
        this.onPrepare = false;
        this.onRemoveQueueItem = false;
        this.onCustomAction = false;
        this.onPrepareFromSearch = -1;
        if (!this.onSetShuffleMode.getAudioAttributesCompatParcelizer()) {
            this.onSetShuffleMode.IconCompatParcelizer();
        }
        if (this.onSetPlaybackSpeed.getWrite()) {
            return;
        }
        _init_lambda3();
    }

    public final void onRemoveQueueItem() {
        this.onPlayFromMediaId = null;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final boolean getParcelableVolumeInfo() {
        return this.ParcelableVolumeInfo;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean onPlay() {
        rawReference rawreferenceOnSetRating;
        return (getParcelableVolumeInfo() || this.onPrepare || this.onMediaButtonEvent || (rawreferenceOnSetRating = onSetRating()) == null || rawreferenceOnSetRating.AudioAttributesImplBaseParcelizer() || this.onCustomAction) ? false : true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final long getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void RemoteActionCompatParcelizer() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        this.onPlayFromUri = true;
        this.read.write();
        this.onSetRepeatMode.write();
        this.onSetPlaybackSpeed.handleMediaPlayPauseIfPendingOnHandler();
    }

    public final void onRewind() {
        parseLong.read(this.onRewind);
        this.handleMediaPlayPauseIfPendingOnHandler.clear();
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        this.onPlayFromMediaId = null;
    }

    private final void MediaBrowserCompatItemReceiver(int p0) {
        write(p0, (Object) null, _verifyAllowedMatches.INSTANCE.write(), (Object) null);
    }

    private final void RemoteActionCompatParcelizer(int p0, Object p1) {
        write(p0, p1, _verifyAllowedMatches.INSTANCE.write(), (Object) null);
    }

    private final void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        RemoteActionCompatParcelizer(false);
    }

    private final void accessgetReportFullyDrawnExecutorp() {
        this.MediaMetadataCompat += this.onSetShuffleMode.onPlayFromSearch();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void onPlayFromSearch() {
        write(125, (Object) null, _verifyAllowedMatches.INSTANCE.RemoteActionCompatParcelizer(), (Object) null);
        this.onAddQueueItem = true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void onPrepareFromMediaId() {
        write(125, (Object) null, _verifyAllowedMatches.INSTANCE.read(), (Object) null);
        this.onAddQueueItem = true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final <T> void read(getCreatedOnDateMs<? extends T> p0) {
        accessonBackPresseds1027565324();
        if (!getParcelableVolumeInfo()) {
            _validJsonValueList.AudioAttributesCompatParcelizer("createNode() can only be called when inserting");
        }
        int iRemoteActionCompatParcelizer = this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        setEncoding setencoding = this.onSetPlaybackSpeed;
        _parseSlowFloat _parseslowfloat = setencoding.read(setencoding.getOnCommand());
        this.MediaMetadataCompat++;
        this.onStop.RemoteActionCompatParcelizer(p0, iRemoteActionCompatParcelizer, _parseslowfloat);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void onPlayFromUri() {
        accessonBackPresseds1027565324();
        if (getParcelableVolumeInfo()) {
            _validJsonValueList.AudioAttributesCompatParcelizer("useNode() called while inserting");
        }
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onSetShuffleMode);
        this.onSkipToPrevious.write(objAudioAttributesCompatParcelizer);
        if (this.onPrepare && (objAudioAttributesCompatParcelizer instanceof _getByteArrayBuilder)) {
            this.onSkipToPrevious.IconCompatParcelizer(objAudioAttributesCompatParcelizer);
        }
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void AudioAttributesImplBaseParcelizer() {
        RemoteActionCompatParcelizer(true);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void write(int p0, Object p1) {
        if (!getParcelableVolumeInfo() && this.onSetShuffleMode.MediaBrowserCompatMediaItem() == p0 && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(), p1) && this.onPrepareFromSearch < 0) {
            this.onPrepareFromSearch = this.onSetShuffleMode.getWrite();
            this.onPrepare = true;
        }
        write(p0, (Object) null, _verifyAllowedMatches.INSTANCE.write(), p1);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void MediaDescriptionCompat() {
        if (this.onPrepare && this.onSetShuffleMode.getMediaDescriptionCompat() == this.onPrepareFromSearch) {
            this.onPrepareFromSearch = -1;
            this.onPrepare = false;
        }
        RemoteActionCompatParcelizer(false);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void AudioAttributesCompatParcelizer() {
        this.onPrepare = false;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void write() {
        this.onPrepare = this.onPrepareFromSearch >= 0;
    }

    public final void ParcelableVolumeInfo() {
        this.onPrepareFromSearch = 100;
        this.onPrepare = true;
    }

    public final void onPrepareFromUri() {
        if (this.onRemoveQueueItem || this.onPrepareFromSearch != 100) {
            getInputCodeUtf8JsNames.write("Cannot disable reuse from root if it was caused by other groups");
        }
        this.onPrepareFromSearch = -1;
        this.onPrepare = false;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final int onCommand() {
        return getParcelableVolumeInfo() ? -this.onSetPlaybackSpeed.getOnCommand() : this.onSetShuffleMode.getMediaDescriptionCompat();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void AudioAttributesCompatParcelizer(int p0) {
        if (p0 < 0) {
            int i = -p0;
            setEncoding setencoding = this.onSetPlaybackSpeed;
            while (true) {
                int onCommand = setencoding.getOnCommand();
                if (onCommand <= i) {
                    return;
                } else {
                    RemoteActionCompatParcelizer(setencoding.MediaMetadataCompat(onCommand));
                }
            }
        } else {
            if (getParcelableVolumeInfo()) {
                setEncoding setencoding2 = this.onSetPlaybackSpeed;
                while (getParcelableVolumeInfo()) {
                    RemoteActionCompatParcelizer(setencoding2.MediaMetadataCompat(setencoding2.getOnCommand()));
                }
            }
            releaseBase64Buffer releasebase64buffer = this.onSetShuffleMode;
            while (true) {
                int mediaDescriptionCompat = releasebase64buffer.getMediaDescriptionCompat();
                if (mediaDescriptionCompat <= p0) {
                    return;
                } else {
                    RemoteActionCompatParcelizer(releasebase64buffer.AudioAttributesImplBaseParcelizer(mediaDescriptionCompat));
                }
            }
        }
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final <V, T> void read(V p0, MagicModuleSubmissionRequestBody<? super T, ? super V, getShowPopup> p1) {
        if (getParcelableVolumeInfo()) {
            this.onStop.IconCompatParcelizer(p0, p1);
        } else {
            this.onSkipToPrevious.AudioAttributesCompatParcelizer(p0, p1);
        }
    }

    public final Object onStop() {
        if (getParcelableVolumeInfo()) {
            ensureViewModelStore();
            return _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
        }
        Object objOnPrepare = this.onSetShuffleMode.onPrepare();
        return (!this.onPrepare || (objOnPrepare instanceof allocWriteEncodingBuffer)) ? objOnPrepare : _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
    }

    public final Object onSkipToPrevious() {
        if (getParcelableVolumeInfo()) {
            ensureViewModelStore();
            return _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
        }
        Object objOnPrepare = this.onSetShuffleMode.onPrepare();
        return (!this.onPrepare || (objOnPrepare instanceof allocWriteEncodingBuffer)) ? objOnPrepare instanceof constructReadConstrainedTextBuffer ? ((constructReadConstrainedTextBuffer) objOnPrepare).getWrite() : objOnPrepare : _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean AudioAttributesCompatParcelizer(Object p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(onStop(), p0)) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(p0);
        return true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean IconCompatParcelizer(Object p0) {
        if (onStop() == p0) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(p0);
        return true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean AudioAttributesCompatParcelizer(char p0) {
        Object objOnStop = onStop();
        if ((objOnStop instanceof Character) && p0 == ((Character) objOnStop).charValue()) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(Character.valueOf(p0));
        return true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean AudioAttributesCompatParcelizer(boolean p0) {
        Object objOnStop = onStop();
        if ((objOnStop instanceof Boolean) && p0 == ((Boolean) objOnStop).booleanValue()) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(Boolean.valueOf(p0));
        return true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean IconCompatParcelizer(float p0) {
        Object objOnStop = onStop();
        if ((objOnStop instanceof Float) && p0 == ((Number) objOnStop).floatValue()) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(Float.valueOf(p0));
        return true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean IconCompatParcelizer(long p0) {
        Object objOnStop = onStop();
        if ((objOnStop instanceof Long) && p0 == ((Number) objOnStop).longValue()) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(Long.valueOf(p0));
        return true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean IconCompatParcelizer(double p0) {
        Object objOnStop = onStop();
        if ((objOnStop instanceof Double) && p0 == ((Number) objOnStop).doubleValue()) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(Double.valueOf(p0));
        return true;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean RemoteActionCompatParcelizer(int p0) {
        Object objOnStop = onStop();
        if ((objOnStop instanceof Integer) && p0 == ((Number) objOnStop).intValue()) {
            return false;
        }
        AudioAttributesImplBaseParcelizer(Integer.valueOf(p0));
        return true;
    }

    private final void AudioAttributesImplApi21Parcelizer(Object p0) {
        onStop();
        AudioAttributesImplBaseParcelizer(p0);
    }

    public final void AudioAttributesImplBaseParcelizer(Object p0) {
        if (getParcelableVolumeInfo()) {
            this.onSetPlaybackSpeed.AudioAttributesCompatParcelizer(p0);
            return;
        }
        if (this.onSetShuffleMode.getMediaBrowserCompatItemReceiver()) {
            int iMediaMetadataCompat = this.onSetShuffleMode.MediaMetadataCompat() - 1;
            if (this.onSkipToPrevious.AudioAttributesImplBaseParcelizer()) {
                parseLong19 parselong19 = this.onSkipToPrevious;
                releaseBase64Buffer releasebase64buffer = this.onSetShuffleMode;
                parselong19.read(p0, releasebase64buffer.IconCompatParcelizer(releasebase64buffer.getMediaDescriptionCompat()), iMediaMetadataCompat);
                return;
            }
            this.onSkipToPrevious.AudioAttributesCompatParcelizer(p0, iMediaMetadataCompat);
            return;
        }
        parseLong19 parselong192 = this.onSkipToPrevious;
        releaseBase64Buffer releasebase64buffer2 = this.onSetShuffleMode;
        parselong192.read(releasebase64buffer2.IconCompatParcelizer(releasebase64buffer2.getMediaDescriptionCompat()), p0);
    }

    public final void write(Object p0) {
        boolean z = p0 instanceof allocReadIOBuffer;
        Object obj = p0;
        if (z) {
            constructReadConstrainedTextBuffer constructreadconstrainedtextbuffer = new constructReadConstrainedTextBuffer((allocReadIOBuffer) p0, accessensureViewModelStore());
            if (getParcelableVolumeInfo()) {
                this.onSkipToPrevious.read(constructreadconstrainedtextbuffer);
            }
            this.RemoteActionCompatParcelizer.add(p0);
            obj = constructreadconstrainedtextbuffer;
        }
        AudioAttributesImplBaseParcelizer(obj);
    }

    private final int accessensureViewModelStore() {
        return this.MediaBrowserCompatMediaItem - 1;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final JsonReadContext onAddQueueItem() {
        JsonReadContext jsonReadContext = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        if (jsonReadContext != null) {
            return jsonReadContext;
        }
        convertNumberToInt convertnumbertoint = new convertNumberToInt(getAudioAttributesImplBaseParcelizer());
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = convertnumbertoint;
        return convertnumbertoint;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        this.onSkipToPrevious.IconCompatParcelizer(p0);
    }

    private final hexToChar PlaybackStateCompatCustomAction() {
        hexToChar hextochar = this.onSetCaptioningEnabled;
        return hextochar != null ? hextochar : MediaBrowserCompatCustomActionResultReceiver(this.onSetShuffleMode.getMediaDescriptionCompat());
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final _getCharDesc handleMediaPlayPauseIfPendingOnHandler() {
        return PlaybackStateCompatCustomAction();
    }

    private final hexToChar MediaBrowserCompatCustomActionResultReceiver(int p0) {
        hexToChar hextocharAudioAttributesCompatParcelizer;
        if (getParcelableVolumeInfo() && this.onSetRating) {
            int onCommand = this.onSetPlaybackSpeed.getOnCommand();
            while (onCommand > 0) {
                if (this.onSetPlaybackSpeed.MediaBrowserCompatCustomActionResultReceiver(onCommand) == 202 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetPlaybackSpeed.AudioAttributesImplApi21Parcelizer(onCommand), _validJsonValueList.read())) {
                    Object objIconCompatParcelizer = this.onSetPlaybackSpeed.IconCompatParcelizer(onCommand);
                    toMagicModuleMetaRepoModel.read(objIconCompatParcelizer, "");
                    hexToChar hextochar = (hexToChar) objIconCompatParcelizer;
                    this.onSetCaptioningEnabled = hextochar;
                    return hextochar;
                }
                onCommand = this.onSetPlaybackSpeed.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(onCommand);
            }
        }
        if (this.onSetShuffleMode.getAudioAttributesImplBaseParcelizer() > 0) {
            while (p0 > 0) {
                if (this.onSetShuffleMode.read(p0) == 202 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetShuffleMode.AudioAttributesImplApi21Parcelizer(p0), _validJsonValueList.read())) {
                    setProvider<hexToChar> setprovider = this.onPlayFromMediaId;
                    if (setprovider == null || (hextocharAudioAttributesCompatParcelizer = setprovider.AudioAttributesCompatParcelizer(p0)) == null) {
                        Object objWrite = this.onSetShuffleMode.write(p0);
                        toMagicModuleMetaRepoModel.read(objWrite, "");
                        hextocharAudioAttributesCompatParcelizer = (hexToChar) objWrite;
                    }
                    this.onSetCaptioningEnabled = hextocharAudioAttributesCompatParcelizer;
                    return hextocharAudioAttributesCompatParcelizer;
                }
                p0 = this.onSetShuffleMode.RatingCompat(p0);
            }
        }
        hexToChar hextochar2 = this.onPause;
        this.onSetCaptioningEnabled = hextochar2;
        return hextochar2;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void RemoteActionCompatParcelizer(ContentReference<?> p0) {
        _leading3<?> _leading3Var;
        hexToChar hextocharPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction();
        RemoteActionCompatParcelizer(201, _validJsonValueList.AudioAttributesCompatParcelizer());
        Object objOnPause = onPause();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objOnPause, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) {
            _leading3Var = null;
        } else {
            toMagicModuleMetaRepoModel.read(objOnPause, "");
            _leading3Var = (_leading3) objOnPause;
        }
        getTokenColumnNr<?> gettokencolumnnrWrite = p0.write();
        toMagicModuleMetaRepoModel.read(gettokencolumnnrWrite, "");
        toMagicModuleMetaRepoModel.read(p0, "");
        _leading3<?> _leading3VarIconCompatParcelizer = gettokencolumnnrWrite.IconCompatParcelizer(p0, _leading3Var);
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_leading3VarIconCompatParcelizer, _leading3Var);
        if (!zRemoteActionCompatParcelizer) {
            RemoteActionCompatParcelizer(_leading3VarIconCompatParcelizer);
        }
        boolean z = false;
        if (getParcelableVolumeInfo()) {
            if (p0.getMediaBrowserCompatCustomActionResultReceiver() || !resetInt.write(hextocharPlaybackStateCompatCustomAction, gettokencolumnnrWrite)) {
                hextocharPlaybackStateCompatCustomAction = hextocharPlaybackStateCompatCustomAction.read(gettokencolumnnrWrite, _leading3VarIconCompatParcelizer);
            }
            this.onSetRating = true;
        } else {
            releaseBase64Buffer releasebase64buffer = this.onSetShuffleMode;
            Object objWrite = releasebase64buffer.write(releasebase64buffer.getWrite());
            toMagicModuleMetaRepoModel.read(objWrite, "");
            hexToChar hextochar = (hexToChar) objWrite;
            if ((!onPlay() || !zRemoteActionCompatParcelizer) && (p0.getMediaBrowserCompatCustomActionResultReceiver() || !resetInt.write(hextocharPlaybackStateCompatCustomAction, gettokencolumnnrWrite))) {
                hextocharPlaybackStateCompatCustomAction = hextocharPlaybackStateCompatCustomAction.read(gettokencolumnnrWrite, _leading3VarIconCompatParcelizer);
            } else if ((zRemoteActionCompatParcelizer && !this.onMediaButtonEvent) || !this.onMediaButtonEvent) {
                hextocharPlaybackStateCompatCustomAction = hextochar;
            }
            if (this.onPrepare || hextochar != hextocharPlaybackStateCompatCustomAction) {
                z = true;
            }
        }
        if (z && !getParcelableVolumeInfo()) {
            read(hextocharPlaybackStateCompatCustomAction);
        }
        this.onFastForward.RemoteActionCompatParcelizer(convertNumberToBigDecimal.write(this.onMediaButtonEvent));
        this.onMediaButtonEvent = z;
        this.onSetCaptioningEnabled = hextocharPlaybackStateCompatCustomAction;
        write(202, _validJsonValueList.read(), _verifyAllowedMatches.INSTANCE.write(), hextocharPlaybackStateCompatCustomAction);
    }

    private final void read(hexToChar p0) {
        setProvider<hexToChar> setprovider = this.onPlayFromMediaId;
        if (setprovider == null) {
            setprovider = new setProvider<>(0, 1, null);
            this.onPlayFromMediaId = setprovider;
        }
        setprovider.write(this.onSetShuffleMode.getWrite(), p0);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void AudioAttributesImplApi26Parcelizer() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.onMediaButtonEvent = convertNumberToBigDecimal.AudioAttributesCompatParcelizer(this.onFastForward.AudioAttributesCompatParcelizer());
        this.onSetCaptioningEnabled = null;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void IconCompatParcelizer(ContentReference<?>[] p0) {
        hexToChar hextochar;
        hexToChar hextocharPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction();
        RemoteActionCompatParcelizer(201, _validJsonValueList.AudioAttributesCompatParcelizer());
        boolean z = true;
        if (getParcelableVolumeInfo()) {
            hextochar = read(hextocharPlaybackStateCompatCustomAction, resetInt.RemoteActionCompatParcelizer$default(p0, hextocharPlaybackStateCompatCustomAction, null, 4, null));
            this.onSetRating = true;
        } else {
            Object objRemoteActionCompatParcelizer = this.onSetShuffleMode.RemoteActionCompatParcelizer(0);
            toMagicModuleMetaRepoModel.read(objRemoteActionCompatParcelizer, "");
            hexToChar hextochar2 = (hexToChar) objRemoteActionCompatParcelizer;
            Object objRemoteActionCompatParcelizer2 = this.onSetShuffleMode.RemoteActionCompatParcelizer(1);
            toMagicModuleMetaRepoModel.read(objRemoteActionCompatParcelizer2, "");
            hexToChar hextochar3 = (hexToChar) objRemoteActionCompatParcelizer2;
            hexToChar hextocharRemoteActionCompatParcelizer = resetInt.RemoteActionCompatParcelizer(p0, hextocharPlaybackStateCompatCustomAction, hextochar3);
            if (!onPlay() || this.onPrepare || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(hextochar3, hextocharRemoteActionCompatParcelizer)) {
                hextochar = read(hextocharPlaybackStateCompatCustomAction, hextocharRemoteActionCompatParcelizer);
                if (!this.onPrepare && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(hextochar, hextochar2)) {
                }
                if (z && !getParcelableVolumeInfo()) {
                    read(hextochar);
                }
                this.onFastForward.RemoteActionCompatParcelizer(convertNumberToBigDecimal.write(this.onMediaButtonEvent));
                this.onMediaButtonEvent = z;
                this.onSetCaptioningEnabled = hextochar;
                write(202, _validJsonValueList.read(), _verifyAllowedMatches.INSTANCE.write(), hextochar);
            }
            accessgetReportFullyDrawnExecutorp();
            hextochar = hextochar2;
        }
        z = false;
        if (z) {
            read(hextochar);
        }
        this.onFastForward.RemoteActionCompatParcelizer(convertNumberToBigDecimal.write(this.onMediaButtonEvent));
        this.onMediaButtonEvent = z;
        this.onSetCaptioningEnabled = hextochar;
        write(202, _validJsonValueList.read(), _verifyAllowedMatches.INSTANCE.write(), hextochar);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void AudioAttributesImplApi21Parcelizer() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.onMediaButtonEvent = convertNumberToBigDecimal.AudioAttributesCompatParcelizer(this.onFastForward.AudioAttributesCompatParcelizer());
        this.onSetCaptioningEnabled = null;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final <T> T write(getTokenColumnNr<T> p0) {
        return (T) resetInt.read(PlaybackStateCompatCustomAction(), p0);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final convertNumberToLong read() {
        RemoteActionCompatParcelizer(206, _validJsonValueList.MediaBrowserCompatItemReceiver());
        if (getParcelableVolumeInfo()) {
            setEncoding.write(this.onSetPlaybackSpeed, 0, 1, (Object) null);
        }
        Object objOnStop = onStop();
        allocWriteEncodingBuffer allocwriteencodingbuffer = objOnStop instanceof constructReadConstrainedTextBuffer ? (constructReadConstrainedTextBuffer) objOnStop : null;
        if (allocwriteencodingbuffer == null) {
            allocwriteencodingbuffer = new allocWriteEncodingBuffer(new read(new AudioAttributesCompatParcelizer(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onPlayFromUri, getAudioAttributesImplBaseParcelizer().getOnCommand())), -1);
            AudioAttributesImplBaseParcelizer(allocwriteencodingbuffer);
        }
        allocReadIOBuffer write2 = allocwriteencodingbuffer.getWrite();
        toMagicModuleMetaRepoModel.read(write2, "");
        read readVar = (read) write2;
        readVar.getAudioAttributesCompatParcelizer().IconCompatParcelizer(PlaybackStateCompatCustomAction());
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        return readVar.getAudioAttributesCompatParcelizer();
    }

    public final rawReference onSetRating() {
        ArrayList<rawReference> arrayList = this.onRewind;
        if (this.onPrepareFromMediaId == 0 && parseLong.MediaBrowserCompatCustomActionResultReceiver(arrayList)) {
            return (rawReference) parseLong.AudioAttributesImplApi21Parcelizer(arrayList);
        }
        return null;
    }

    private final void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        if (this.onSetPlaybackSpeed.getWrite()) {
            setEncoding setencodingOnAddQueueItem = this.onSetRepeatMode.onAddQueueItem();
            this.onSetPlaybackSpeed = setencodingOnAddQueueItem;
            setencodingOnAddQueueItem.onCommand();
            this.onSetRating = false;
            this.onSetCaptioningEnabled = null;
        }
    }

    private final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        if (!this.onSetPlaybackSpeed.getWrite()) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Check failed");
        }
        _init_lambda3();
    }

    private final void _init_lambda3() {
        releaseTokenBuffer releasetokenbuffer = new releaseTokenBuffer();
        if (this.onPlayFromUri) {
            releasetokenbuffer.write();
        }
        if (this.IconCompatParcelizer.write()) {
            releasetokenbuffer.IconCompatParcelizer();
        }
        this.onSetRepeatMode = releasetokenbuffer;
        setEncoding setencodingOnAddQueueItem = releasetokenbuffer.onAddQueueItem();
        setencodingOnAddQueueItem.read(true);
        this.onSetPlaybackSpeed = setencodingOnAddQueueItem;
    }

    private final void IconCompatParcelizer(boolean p0, Object p1) {
        if (p0) {
            this.onSetShuffleMode.onPlayFromUri();
            return;
        }
        if (p1 != null && this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver() != p1) {
            this.onSkipToPrevious.read(p1);
        }
        this.onSetShuffleMode.onPrepareFromSearch();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void write(int r14, java.lang.Object r15, int r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseIntValue.write(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void write(boolean p0, get7BitOutputEscapes p1) {
        parseLong.write(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver);
        this.MediaBrowserCompatItemReceiver = p1;
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this.RatingCompat);
        if (p0) {
            this.RatingCompat = 0;
        }
        this.MediaMetadataCompat = 0;
        this.MediaBrowserCompatMediaItem = 0;
    }

    private final void AudioAttributesCompatParcelizer(int p0, boolean p1) {
        get7BitOutputEscapes get7bitoutputescapes = (get7BitOutputEscapes) parseLong.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        if (get7bitoutputescapes != null && !p1) {
            get7bitoutputescapes.read(get7bitoutputescapes.getRemoteActionCompatParcelizer() + 1);
        }
        this.MediaBrowserCompatItemReceiver = get7bitoutputescapes;
        this.RatingCompat = this.MediaDescriptionCompat.AudioAttributesCompatParcelizer() + p0;
        this.MediaBrowserCompatMediaItem = this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
        this.MediaMetadataCompat = this.MediaDescriptionCompat.AudioAttributesCompatParcelizer() + p0;
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        long jRotateRight;
        long j;
        int iOnAddQueueItem;
        Set set;
        List<includeProperty> list;
        long jRotateRight2;
        long j2;
        int iIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer() - 1;
        if (getParcelableVolumeInfo()) {
            int onCommand = this.onSetPlaybackSpeed.getOnCommand();
            int iMediaBrowserCompatCustomActionResultReceiver = this.onSetPlaybackSpeed.MediaBrowserCompatCustomActionResultReceiver(onCommand);
            Object objAudioAttributesImplApi21Parcelizer = this.onSetPlaybackSpeed.AudioAttributesImplApi21Parcelizer(onCommand);
            Object objIconCompatParcelizer = this.onSetPlaybackSpeed.IconCompatParcelizer(onCommand);
            if (objAudioAttributesImplApi21Parcelizer == null) {
                if (objIconCompatParcelizer != null && iMediaBrowserCompatCustomActionResultReceiver == 207 && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objIconCompatParcelizer, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) {
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(((long) objIconCompatParcelizer.hashCode()) ^ Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() ^ ((long) iIconCompatParcelizer), 3), 3);
                } else {
                    jRotateRight2 = Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() ^ ((long) iIconCompatParcelizer), 3);
                    j2 = iMediaBrowserCompatCustomActionResultReceiver;
                }
            } else {
                int iOrdinal = objAudioAttributesImplApi21Parcelizer instanceof Enum ? ((Enum) objAudioAttributesImplApi21Parcelizer).ordinal() : objAudioAttributesImplApi21Parcelizer.hashCode();
                jRotateRight2 = Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3);
                j2 = iOrdinal;
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(jRotateRight2 ^ j2, 3);
        } else {
            int mediaDescriptionCompat = this.onSetShuffleMode.getMediaDescriptionCompat();
            int i = this.onSetShuffleMode.read(mediaDescriptionCompat);
            Object objAudioAttributesImplApi21Parcelizer2 = this.onSetShuffleMode.AudioAttributesImplApi21Parcelizer(mediaDescriptionCompat);
            Object objWrite = this.onSetShuffleMode.write(mediaDescriptionCompat);
            if (objAudioAttributesImplApi21Parcelizer2 == null) {
                if (objWrite != null && i == 207 && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objWrite, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) {
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(((long) objWrite.hashCode()) ^ Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() ^ ((long) iIconCompatParcelizer), 3), 3);
                } else {
                    jRotateRight = Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() ^ ((long) iIconCompatParcelizer), 3);
                    j = i;
                }
            } else {
                int iOrdinal2 = objAudioAttributesImplApi21Parcelizer2 instanceof Enum ? ((Enum) objAudioAttributesImplApi21Parcelizer2).ordinal() : objAudioAttributesImplApi21Parcelizer2.hashCode();
                jRotateRight = Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3);
                j = iOrdinal2;
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(jRotateRight ^ j, 3);
        }
        int i2 = this.MediaMetadataCompat;
        get7BitOutputEscapes get7bitoutputescapes = this.MediaBrowserCompatItemReceiver;
        if (get7bitoutputescapes != null && get7bitoutputescapes.AudioAttributesCompatParcelizer().size() > 0) {
            List<includeProperty> listAudioAttributesCompatParcelizer = get7bitoutputescapes.AudioAttributesCompatParcelizer();
            List<includeProperty> listRemoteActionCompatParcelizer = get7bitoutputescapes.RemoteActionCompatParcelizer();
            Set setRemoteActionCompatParcelizer = JavaFloatBitsFromCharArray.RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listRemoteActionCompatParcelizer.size();
            int size2 = listAudioAttributesCompatParcelizer.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                includeProperty includeproperty = listAudioAttributesCompatParcelizer.get(i3);
                if (!setRemoteActionCompatParcelizer.contains(includeproperty)) {
                    this.onSkipToPrevious.IconCompatParcelizer(get7bitoutputescapes.write(includeproperty) + get7bitoutputescapes.getAudioAttributesCompatParcelizer(), includeproperty.getRemoteActionCompatParcelizer());
                    get7bitoutputescapes.IconCompatParcelizer(includeproperty.getRead(), 0);
                    this.onSkipToPrevious.AudioAttributesCompatParcelizer(includeproperty.getRead());
                    this.onSetShuffleMode.MediaBrowserCompatMediaItem(includeproperty.getRead());
                    r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
                    this.onSetShuffleMode.onPlayFromSearch();
                    set = setRemoteActionCompatParcelizer;
                    convertNumberToBigDecimal.IconCompatParcelizer((List<filterStartObject>) this.handleMediaPlayPauseIfPendingOnHandler, includeproperty.getRead(), includeproperty.getRead() + this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(includeproperty.getRead()));
                } else {
                    set = setRemoteActionCompatParcelizer;
                    if (!linkedHashSet.contains(includeproperty)) {
                        if (i4 < size) {
                            includeProperty includeproperty2 = listRemoteActionCompatParcelizer.get(i4);
                            if (includeproperty2 != includeproperty) {
                                int iWrite = get7bitoutputescapes.write(includeproperty2);
                                linkedHashSet.add(includeproperty2);
                                if (iWrite != i5) {
                                    int i6 = get7bitoutputescapes.read(includeproperty2);
                                    list = listRemoteActionCompatParcelizer;
                                    this.onSkipToPrevious.write(get7bitoutputescapes.getAudioAttributesCompatParcelizer() + iWrite, i5 + get7bitoutputescapes.getAudioAttributesCompatParcelizer(), i6);
                                    get7bitoutputescapes.AudioAttributesCompatParcelizer(iWrite, i5, i6);
                                } else {
                                    list = listRemoteActionCompatParcelizer;
                                }
                            } else {
                                list = listRemoteActionCompatParcelizer;
                                i3++;
                            }
                            i4++;
                            i5 += get7bitoutputescapes.read(includeproperty2);
                        } else {
                            list = listRemoteActionCompatParcelizer;
                        }
                    }
                    setRemoteActionCompatParcelizer = set;
                    listRemoteActionCompatParcelizer = list;
                }
                list = listRemoteActionCompatParcelizer;
                i3++;
                setRemoteActionCompatParcelizer = set;
                listRemoteActionCompatParcelizer = list;
            }
            this.onSkipToPrevious.write();
            if (listAudioAttributesCompatParcelizer.size() > 0) {
                this.onSkipToPrevious.AudioAttributesCompatParcelizer(this.onSetShuffleMode.getRemoteActionCompatParcelizer());
                this.onSetShuffleMode.onPrepareFromMediaId();
            }
        }
        boolean parcelableVolumeInfo = getParcelableVolumeInfo();
        if (!parcelableVolumeInfo && (iOnAddQueueItem = this.onSetShuffleMode.onAddQueueItem()) > 0) {
            this.onSkipToPrevious.write(iOnAddQueueItem);
        }
        int i7 = this.RatingCompat;
        while (!this.onSetShuffleMode.onPlay()) {
            int write2 = this.onSetShuffleMode.getWrite();
            r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
            this.onSkipToPrevious.IconCompatParcelizer(i7, this.onSetShuffleMode.onPlayFromSearch());
            convertNumberToBigDecimal.IconCompatParcelizer((List<filterStartObject>) this.handleMediaPlayPauseIfPendingOnHandler, write2, this.onSetShuffleMode.getWrite());
        }
        if (parcelableVolumeInfo) {
            if (p0) {
                this.onStop.write();
                i2 = 1;
            }
            this.onSetShuffleMode.AudioAttributesCompatParcelizer();
            int onCommand2 = this.onSetPlaybackSpeed.getOnCommand();
            this.onSetPlaybackSpeed.RemoteActionCompatParcelizer();
            if (!this.onSetShuffleMode.onCustomAction()) {
                int iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(onCommand2);
                this.onSetPlaybackSpeed.write();
                this.onSetPlaybackSpeed.read(true);
                write(this.onSkipToNext);
                this.ParcelableVolumeInfo = false;
                if (!this.read.MediaMetadataCompat()) {
                    write(iAudioAttributesImplApi21Parcelizer, 0);
                    AudioAttributesCompatParcelizer(iAudioAttributesImplApi21Parcelizer, i2);
                }
            }
        } else {
            if (p0) {
                this.onSkipToPrevious.MediaBrowserCompatItemReceiver();
            }
            this.onSkipToPrevious.RemoteActionCompatParcelizer();
            int mediaDescriptionCompat2 = this.onSetShuffleMode.getMediaDescriptionCompat();
            if (i2 != MediaMetadataCompat(mediaDescriptionCompat2)) {
                AudioAttributesCompatParcelizer(mediaDescriptionCompat2, i2);
            }
            if (p0) {
                i2 = 1;
            }
            this.onSetShuffleMode.write();
            this.onSkipToPrevious.write();
        }
        AudioAttributesCompatParcelizer(i2, parcelableVolumeInfo);
    }

    private final void _init_lambda2() {
        boolean z = this.onRemoveQueueItem;
        this.onRemoveQueueItem = true;
        int mediaDescriptionCompat = this.onSetShuffleMode.getMediaDescriptionCompat();
        int iMediaBrowserCompatCustomActionResultReceiver = this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(mediaDescriptionCompat) + mediaDescriptionCompat;
        int i = this.RatingCompat;
        long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        int i2 = this.MediaMetadataCompat;
        int i3 = this.MediaBrowserCompatMediaItem;
        filterStartObject filterstartobject = convertNumberToBigDecimal.read(this.handleMediaPlayPauseIfPendingOnHandler, this.onSetShuffleMode.getWrite(), iMediaBrowserCompatCustomActionResultReceiver);
        boolean z2 = false;
        int i4 = mediaDescriptionCompat;
        while (filterstartobject != null) {
            int read2 = filterstartobject.getRead();
            rawReference iconCompatParcelizer = filterstartobject.getIconCompatParcelizer();
            convertNumberToBigDecimal.IconCompatParcelizer((List<filterStartObject>) this.handleMediaPlayPauseIfPendingOnHandler, read2);
            if (filterstartobject.IconCompatParcelizer()) {
                this.onSetShuffleMode.MediaBrowserCompatMediaItem(read2);
                int write2 = this.onSetShuffleMode.getWrite();
                IconCompatParcelizer(i4, write2, mediaDescriptionCompat);
                this.RatingCompat = write(read2, write2, mediaDescriptionCompat, i);
                this.MediaBrowserCompatMediaItem = AudioAttributesImplBaseParcelizer(write2);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = write(this.onSetShuffleMode.RatingCompat(write2), mediaDescriptionCompat, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                this.onSetCaptioningEnabled = null;
                iconCompatParcelizer.IconCompatParcelizer((_handleUnrecognizedCharacterEscape) this);
                this.onSetCaptioningEnabled = null;
                this.onSetShuffleMode.MediaDescriptionCompat(mediaDescriptionCompat);
                z2 = true;
                i4 = write2;
            } else {
                parseLong.write(this.onRewind, iconCompatParcelizer);
                _matchNull _matchnullIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
                if (_matchnullIconCompatParcelizer != null) {
                    try {
                        _matchnullIconCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer);
                        iconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
                    } finally {
                        _matchnullIconCompatParcelizer.AudioAttributesCompatParcelizer(iconCompatParcelizer);
                    }
                } else {
                    iconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
                }
                parseLong.AudioAttributesImplBaseParcelizer(this.onRewind);
            }
            filterstartobject = convertNumberToBigDecimal.read(this.handleMediaPlayPauseIfPendingOnHandler, this.onSetShuffleMode.getWrite(), iMediaBrowserCompatCustomActionResultReceiver);
        }
        if (z2) {
            IconCompatParcelizer(i4, mediaDescriptionCompat, mediaDescriptionCompat);
            this.onSetShuffleMode.onPrepareFromMediaId();
            int iMediaMetadataCompat = MediaMetadataCompat(mediaDescriptionCompat);
            this.RatingCompat = i + iMediaMetadataCompat;
            this.MediaMetadataCompat = i2 + iMediaMetadataCompat;
            this.MediaBrowserCompatMediaItem = i3;
        } else {
            _init_lambda5();
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        this.onRemoveQueueItem = z;
    }

    private final void AudioAttributesCompatParcelizer(int p0, int p1) {
        int iMediaMetadataCompat = MediaMetadataCompat(p0);
        if (iMediaMetadataCompat != p1) {
            int iIconCompatParcelizer = parseLong.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) - 1;
            while (p0 != -1) {
                int iMediaMetadataCompat2 = MediaMetadataCompat(p0) + (p1 - iMediaMetadataCompat);
                write(p0, iMediaMetadataCompat2);
                int i = iIconCompatParcelizer;
                while (true) {
                    if (i >= 0) {
                        get7BitOutputEscapes get7bitoutputescapes = (get7BitOutputEscapes) parseLong.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, i);
                        if (get7bitoutputescapes != null && get7bitoutputescapes.IconCompatParcelizer(p0, iMediaMetadataCompat2)) {
                            iIconCompatParcelizer = i - 1;
                            break;
                        }
                        i--;
                    } else {
                        break;
                    }
                }
                if (p0 < 0) {
                    p0 = this.onSetShuffleMode.getMediaDescriptionCompat();
                } else if (this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(p0)) {
                    return;
                } else {
                    p0 = this.onSetShuffleMode.RatingCompat(p0);
                }
            }
        }
    }

    private final int write(int p0, int p1, int p2, int p3) {
        int iRatingCompat = this.onSetShuffleMode.RatingCompat(p1);
        while (iRatingCompat != p2 && !this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(iRatingCompat)) {
            iRatingCompat = this.onSetShuffleMode.RatingCompat(iRatingCompat);
        }
        if (this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(iRatingCompat)) {
            p3 = 0;
        }
        if (iRatingCompat == p1) {
            return p3;
        }
        int iMediaMetadataCompat = MediaMetadataCompat(iRatingCompat);
        int iMediaMetadataCompat2 = this.onSetShuffleMode.MediaMetadataCompat(p1);
        int iMediaMetadataCompat3 = p3;
        loop1: while (iMediaMetadataCompat3 < (iMediaMetadataCompat - iMediaMetadataCompat2) + p3 && iRatingCompat != p0) {
            iRatingCompat++;
            while (iRatingCompat < p0) {
                int iMediaBrowserCompatCustomActionResultReceiver = this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(iRatingCompat) + iRatingCompat;
                if (p0 >= iMediaBrowserCompatCustomActionResultReceiver) {
                    iMediaMetadataCompat3 += this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(iRatingCompat) ? 1 : MediaMetadataCompat(iRatingCompat);
                    iRatingCompat = iMediaBrowserCompatCustomActionResultReceiver;
                }
            }
        }
        return iMediaMetadataCompat3;
    }

    private final int AudioAttributesImplBaseParcelizer(int p0) {
        int iRatingCompat = this.onSetShuffleMode.RatingCompat(p0) + 1;
        int i = 0;
        while (iRatingCompat < p0) {
            if (!this.onSetShuffleMode.AudioAttributesImplApi26Parcelizer(iRatingCompat)) {
                i++;
            }
            iRatingCompat += this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(iRatingCompat);
        }
        return i;
    }

    private final int MediaMetadataCompat(int p0) {
        int i;
        if (p0 < 0) {
            setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = this.onCommand;
            if (setexpandactivityoverflowbuttoncontentdescription == null || !setexpandactivityoverflowbuttoncontentdescription.AudioAttributesCompatParcelizer(p0)) {
                return 0;
            }
            return setexpandactivityoverflowbuttoncontentdescription.read(p0);
        }
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        return (iArr == null || (i = iArr[p0]) < 0) ? this.onSetShuffleMode.MediaMetadataCompat(p0) : i;
    }

    private final void write(int p0, int p1) {
        if (MediaMetadataCompat(p0) != p1) {
            if (p0 < 0) {
                setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription = this.onCommand;
                if (setexpandactivityoverflowbuttoncontentdescription == null) {
                    setexpandactivityoverflowbuttoncontentdescription = new setExpandActivityOverflowButtonContentDescription(0, 1, null);
                    this.onCommand = setexpandactivityoverflowbuttoncontentdescription;
                }
                setexpandactivityoverflowbuttoncontentdescription.IconCompatParcelizer(p0, p1);
                return;
            }
            int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
            if (iArr == null) {
                iArr = new int[this.onSetShuffleMode.getAudioAttributesImplBaseParcelizer()];
                getOrderDetails.RemoteActionCompatParcelizer(iArr, -1, 0, iArr.length);
                this.MediaBrowserCompatSearchResultReceiver = iArr;
            }
            iArr[p0] = p1;
        }
    }

    private final void PlaybackStateCompat() {
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.onCommand = null;
    }

    private final void IconCompatParcelizer(int p0, int p1, int p2) {
        releaseBase64Buffer releasebase64buffer = this.onSetShuffleMode;
        int iWrite = convertNumberToBigDecimal.write(releasebase64buffer, p0, p1, p2);
        while (p0 > 0 && p0 != iWrite) {
            if (releasebase64buffer.AudioAttributesImplBaseParcelizer(p0)) {
                this.onSkipToPrevious.MediaBrowserCompatItemReceiver();
            }
            p0 = releasebase64buffer.RatingCompat(p0);
        }
        read(p1, iWrite);
    }

    private final void read(int p0, int p1) {
        if (p0 <= 0 || p0 == p1) {
            return;
        }
        read(this.onSetShuffleMode.RatingCompat(p0), p1);
        if (this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(p0)) {
            this.onSkipToPrevious.write(IconCompatParcelizer(this.onSetShuffleMode, p0));
        }
    }

    private final int write(releaseBase64Buffer releasebase64buffer, int i) {
        Object objWrite;
        if (releasebase64buffer.AudioAttributesImplApi26Parcelizer(i)) {
            Object objAudioAttributesImplApi21Parcelizer = releasebase64buffer.AudioAttributesImplApi21Parcelizer(i);
            if (objAudioAttributesImplApi21Parcelizer == null) {
                return 0;
            }
            if (objAudioAttributesImplApi21Parcelizer instanceof Enum) {
                return ((Enum) objAudioAttributesImplApi21Parcelizer).ordinal();
            }
            if (objAudioAttributesImplApi21Parcelizer instanceof createRootContext) {
                return 126665345;
            }
            return objAudioAttributesImplApi21Parcelizer.hashCode();
        }
        int i2 = releasebase64buffer.read(i);
        return (i2 != 207 || (objWrite = releasebase64buffer.write(i)) == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objWrite, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) ? i2 : objWrite.hashCode();
    }

    public final boolean IconCompatParcelizer(rawReference p0, Object p1) {
        _parseSlowFloat remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer == null) {
            return false;
        }
        int iWrite = remoteActionCompatParcelizer.write(this.onSetShuffleMode.getRatingCompat());
        if (!this.onRemoveQueueItem || iWrite < this.onSetShuffleMode.getWrite()) {
            return false;
        }
        convertNumberToBigDecimal.read(this.handleMediaPlayPauseIfPendingOnHandler, iWrite, p0, p1);
        return true;
    }

    public final void setSessionImpl() {
        long jRotateLeft;
        long j;
        if (this.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
            accessgetReportFullyDrawnExecutorp();
            return;
        }
        releaseBase64Buffer releasebase64buffer = this.onSetShuffleMode;
        int iMediaBrowserCompatMediaItem = releasebase64buffer.MediaBrowserCompatMediaItem();
        Object objMediaDescriptionCompat = releasebase64buffer.MediaDescriptionCompat();
        Object objMediaBrowserCompatCustomActionResultReceiver = releasebase64buffer.MediaBrowserCompatCustomActionResultReceiver();
        int i = this.MediaBrowserCompatMediaItem;
        if (objMediaDescriptionCompat == null) {
            jRotateLeft = Long.rotateLeft((objMediaBrowserCompatCustomActionResultReceiver == null || iMediaBrowserCompatMediaItem != 207 || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objMediaBrowserCompatCustomActionResultReceiver, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) ? Long.rotateLeft(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3) ^ ((long) iMediaBrowserCompatMediaItem) : Long.rotateLeft(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3) ^ ((long) objMediaBrowserCompatCustomActionResultReceiver.hashCode()), 3);
            j = i;
        } else {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3) ^ ((long) (objMediaDescriptionCompat instanceof Enum ? ((Enum) objMediaDescriptionCompat).ordinal() : objMediaDescriptionCompat.hashCode())), 3);
            j = 0;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = jRotateLeft ^ j;
        IconCompatParcelizer(releasebase64buffer.onPlayFromMediaId(), (Object) null);
        _init_lambda2();
        releasebase64buffer.write();
        if (objMediaDescriptionCompat != null) {
            if (objMediaDescriptionCompat instanceof Enum) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3) ^ ((long) ((Enum) objMediaDescriptionCompat).ordinal()), 3);
                return;
            } else {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(), 3) ^ ((long) objMediaDescriptionCompat.hashCode()), 3);
                return;
            }
        }
        if (objMediaBrowserCompatCustomActionResultReceiver == null || iMediaBrowserCompatMediaItem != 207 || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objMediaBrowserCompatCustomActionResultReceiver, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(((long) iMediaBrowserCompatMediaItem) ^ Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() ^ ((long) i), 3), 3);
        } else {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Long.rotateRight(Long.rotateRight(getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() ^ ((long) i), 3) ^ ((long) objMediaBrowserCompatCustomActionResultReceiver.hashCode()), 3);
        }
    }

    private final void _init_lambda5() {
        this.MediaMetadataCompat = this.onSetShuffleMode.handleMediaPlayPauseIfPendingOnHandler();
        this.onSetShuffleMode.onPrepareFromMediaId();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final boolean RemoteActionCompatParcelizer(boolean p0, int p1) {
        rawReference rawreferenceOnSetRating;
        if ((p1 & 1) != 0 || (!getParcelableVolumeInfo() && !this.onPrepare)) {
            return p0 || !onPlay();
        }
        isResourceManaged isresourcemanaged = this.onSkipToQueueItem;
        if (isresourcemanaged == null || (rawreferenceOnSetRating = onSetRating()) == null || !isresourcemanaged.AudioAttributesCompatParcelizer() || rawreferenceOnSetRating.MediaBrowserCompatCustomActionResultReceiver()) {
            return true;
        }
        rawreferenceOnSetRating.AudioAttributesImplApi21Parcelizer(true);
        rawreferenceOnSetRating.AudioAttributesImplApi26Parcelizer(this.onPrepare);
        rawreferenceOnSetRating.write(true);
        this.onSkipToPrevious.write(rawreferenceOnSetRating);
        this.IconCompatParcelizer.IconCompatParcelizer(rawreferenceOnSetRating);
        return false;
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void onPrepareFromSearch() {
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getParcelableVolumeInfo()) {
            return;
        }
        rawReference rawreferenceOnSetRating = onSetRating();
        if (rawreferenceOnSetRating != null) {
            rawreferenceOnSetRating.onCommand();
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler.isEmpty()) {
            _init_lambda5();
        } else {
            _init_lambda2();
        }
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void IconCompatParcelizer(boolean p0) {
        if (this.MediaMetadataCompat != 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (getParcelableVolumeInfo()) {
            return;
        }
        if (!p0) {
            _init_lambda5();
            return;
        }
        int write2 = this.onSetShuffleMode.getWrite();
        int iAudioAttributesImplApi26Parcelizer = this.onSetShuffleMode.AudioAttributesImplApi26Parcelizer();
        this.onSkipToPrevious.AudioAttributesCompatParcelizer();
        convertNumberToBigDecimal.IconCompatParcelizer((List<filterStartObject>) this.handleMediaPlayPauseIfPendingOnHandler, write2, iAudioAttributesImplApi26Parcelizer);
        this.onSetShuffleMode.onPrepareFromMediaId();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final _handleUnrecognizedCharacterEscape write(int p0) {
        IconCompatParcelizer(p0);
        MediaSessionCompatToken();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaSessionCompatToken() {
        /*
            r4 = this;
            boolean r0 = r4.getParcelableVolumeInfo()
            java.lang.String r1 = ""
            if (r0 == 0) goto L22
            o.getTokenLineNr r0 = r4.getAudioAttributesImplBaseParcelizer()
            kotlin.toMagicModuleMetaRepoModel.read(r0, r1)
            o.rawReference r1 = new o.rawReference
            o._append r0 = (kotlin._append) r0
            r1.<init>(r0)
            java.util.ArrayList<o.rawReference> r0 = r4.onRewind
            kotlin.parseLong.write(r0, r1)
            r4.AudioAttributesImplBaseParcelizer(r1)
            r4.IconCompatParcelizer(r1)
            return
        L22:
            java.util.List<o.filterStartObject> r0 = r4.handleMediaPlayPauseIfPendingOnHandler
            o.releaseBase64Buffer r2 = r4.onSetShuffleMode
            int r2 = r2.getMediaDescriptionCompat()
            o.filterStartObject r0 = kotlin.convertNumberToBigDecimal.RemoteActionCompatParcelizer(r0, r2)
            o.releaseBase64Buffer r2 = r4.onSetShuffleMode
            java.lang.Object r2 = r2.onPrepare()
            o._handleUnrecognizedCharacterEscape$write r3 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
            java.lang.Object r3 = r3.IconCompatParcelizer()
            boolean r3 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r3)
            if (r3 == 0) goto L52
            o.getTokenLineNr r2 = r4.getAudioAttributesImplBaseParcelizer()
            kotlin.toMagicModuleMetaRepoModel.read(r2, r1)
            o.rawReference r1 = new o.rawReference
            o._append r2 = (kotlin._append) r2
            r1.<init>(r2)
            r4.AudioAttributesImplBaseParcelizer(r1)
            goto L58
        L52:
            kotlin.toMagicModuleMetaRepoModel.read(r2, r1)
            r1 = r2
            o.rawReference r1 = (kotlin.rawReference) r1
        L58:
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L69
            boolean r0 = r1.AudioAttributesImplApi21Parcelizer()
            if (r0 == 0) goto L65
            r1.IconCompatParcelizer(r2)
        L65:
            if (r0 != 0) goto L69
            r0 = r2
            goto L6a
        L69:
            r0 = r3
        L6a:
            r1.read(r0)
            java.util.ArrayList<o.rawReference> r0 = r4.onRewind
            kotlin.parseLong.write(r0, r1)
            r4.IconCompatParcelizer(r1)
            boolean r0 = r1.MediaBrowserCompatItemReceiver()
            if (r0 == 0) goto L95
            r1.write(r2)
            r1.MediaBrowserCompatItemReceiver(r3)
            o.parseLong19 r0 = r4.onSkipToPrevious
            r0.read(r1)
            boolean r0 = r4.onPrepare
            if (r0 != 0) goto L95
            boolean r0 = r1.MediaMetadataCompat()
            if (r0 == 0) goto L95
            r4.onPrepare = r3
            r1.AudioAttributesImplBaseParcelizer(r3)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseIntValue.MediaSessionCompatToken():void");
    }

    private final void IconCompatParcelizer(rawReference p0) {
        p0.AudioAttributesCompatParcelizer(this.onPlayFromSearch);
        _matchNull _matchnullIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        if (_matchnullIconCompatParcelizer != null) {
            _matchnullIconCompatParcelizer.IconCompatParcelizer(p0);
        }
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final releaseNameCopyBuffer MediaBrowserCompatSearchResultReceiver() {
        _parseSlowFloat _parseslowfloatIconCompatParcelizer;
        rawReference rawreference = null;
        rawReference rawreference2 = parseLong.MediaBrowserCompatCustomActionResultReceiver(this.onRewind) ? (rawReference) parseLong.AudioAttributesImplBaseParcelizer(this.onRewind) : null;
        if (rawreference2 != null) {
            rawreference2.read(false);
            getAnswerMap<createChildArrayContext, getShowPopup> getanswermap = read(rawreference2);
            if (getanswermap != null) {
                this.onSkipToPrevious.AudioAttributesCompatParcelizer(getanswermap, getAudioAttributesImplBaseParcelizer());
            }
            if (rawreference2.MediaBrowserCompatCustomActionResultReceiver()) {
                rawreference2.MediaBrowserCompatItemReceiver(false);
                this.onSkipToPrevious.RemoteActionCompatParcelizer(rawreference2);
                rawreference2.AudioAttributesImplApi26Parcelizer(false);
                if (rawreference2.AudioAttributesImplApi26Parcelizer()) {
                    rawreference2.AudioAttributesImplBaseParcelizer(false);
                    this.onPrepare = false;
                }
            }
        }
        if (rawreference2 != null && !rawreference2.RatingCompat() && (rawreference2.MediaBrowserCompatMediaItem() || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            if (rawreference2.getRemoteActionCompatParcelizer() == null) {
                if (getParcelableVolumeInfo()) {
                    setEncoding setencoding = this.onSetPlaybackSpeed;
                    _parseslowfloatIconCompatParcelizer = setencoding.read(setencoding.getOnCommand());
                } else {
                    releaseBase64Buffer releasebase64buffer = this.onSetShuffleMode;
                    _parseslowfloatIconCompatParcelizer = releasebase64buffer.IconCompatParcelizer(releasebase64buffer.getMediaDescriptionCompat());
                }
                rawreference2.read(_parseslowfloatIconCompatParcelizer);
            }
            rawreference2.RemoteActionCompatParcelizer(false);
            rawreference = rawreference2;
        }
        RemoteActionCompatParcelizer(false);
        return rawreference;
    }

    private final getAnswerMap<createChildArrayContext, getShowPopup> read(rawReference p0) {
        _matchNull _matchnullIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        if (_matchnullIconCompatParcelizer != null) {
            _matchnullIconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        }
        return p0.write(this.onPlayFromSearch);
    }

    private final void IconCompatParcelizer(final createRootContext<Object> p0, hexToChar p1, final Object p2, boolean p3) {
        AudioAttributesCompatParcelizer(126665345, p0);
        AudioAttributesImplApi21Parcelizer(p2);
        long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        try {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 126665345L;
            boolean z = false;
            if (getParcelableVolumeInfo()) {
                setEncoding.write(this.onSetPlaybackSpeed, 0, 1, (Object) null);
            }
            if (!getParcelableVolumeInfo() && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(), p1)) {
                z = true;
            }
            if (z) {
                read(p1);
            }
            write(202, _validJsonValueList.read(), _verifyAllowedMatches.INSTANCE.write(), p1);
            this.onSetCaptioningEnabled = null;
            if (getParcelableVolumeInfo() && !p3 && (!_handleBase64MissingPadding.read || p0.getRead())) {
                this.onSetRating = true;
                setEncoding setencoding = this.onSetPlaybackSpeed;
                this.IconCompatParcelizer.IconCompatParcelizer(new getFilter(p0, p2, getAudioAttributesImplBaseParcelizer(), this.onSetRepeatMode, setencoding.read(setencoding.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setencoding.getOnCommand())), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), PlaybackStateCompatCustomAction(), null));
            } else {
                boolean z2 = this.onMediaButtonEvent;
                this.onMediaButtonEvent = z;
                p0.read(true);
                multiply.AudioAttributesCompatParcelizer(this, multiplyFft.IconCompatParcelizer(1436390959, true, new MagicModuleSubmissionRequestBody() { // from class: o._handleEOF
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return _parseIntValue.IconCompatParcelizer(p0, p2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }));
                this.onMediaButtonEvent = z2;
            }
        } catch (Throwable th) {
            try {
                throw _reportCantWriteValueExpectName.RemoteActionCompatParcelizer(th, (getCreatedOnDateMs<_verifyPrettyValueWrite>) new getCreatedOnDateMs() { // from class: o._parseNumericValue
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return _parseIntValue.MediaBrowserCompatCustomActionResultReceiver(this.read);
                    }
                });
            } finally {
                r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
                this.onSetCaptioningEnabled = null;
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                MediaBrowserCompatItemReceiver();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(createRootContext createrootcontext, Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1436390959, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (ComposerImpl.kt:2278)");
            }
            createrootcontext.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(obj, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        } else {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _verifyPrettyValueWrite MediaBrowserCompatCustomActionResultReceiver(_parseIntValue _parseintvalue) {
        return _parseintvalue.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    public final void RemoteActionCompatParcelizer(List<Pair<getFilter, getFilter>> p0) {
        try {
            IconCompatParcelizer(p0);
            MediaSessionCompatQueueItem();
        } catch (Throwable th) {
            MediaSessionCompatResultReceiverWrapper();
            throw th;
        }
    }

    private final void IconCompatParcelizer(List<Pair<getFilter, getFilter>> p0) throws Throwable {
        parseLong19 parselong19;
        _full3 _full3Var;
        parseLong19 parselong192;
        _full3 _full3Var2;
        releaseTokenBuffer remoteActionCompatParcelizer;
        _parseSlowFloat write2;
        releaseBase64Buffer releasebase64buffer;
        setProvider<hexToChar> setprovider;
        int[] iArr;
        _full3 _full3Var3;
        parseLong19 parselong193;
        int i;
        parseLong19 parselong194;
        boolean zMediaBrowserCompatCustomActionResultReceiver;
        int i2;
        releaseTokenBuffer iconCompatParcelizer;
        releaseBase64Buffer releasebase64buffer2;
        List<Pair<getFilter, getFilter>> list = p0;
        parseLong19 parselong195 = this.onSkipToPrevious;
        _full3 _full3Var4 = this.AudioAttributesImplApi26Parcelizer;
        _full3 _full3VarAudioAttributesImplApi26Parcelizer = parselong195.getAudioAttributesCompatParcelizer();
        try {
            parselong195.RemoteActionCompatParcelizer(_full3Var4);
            this.onSkipToPrevious.RatingCompat();
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                try {
                    Pair<getFilter, getFilter> pair = list.get(i4);
                    final getFilter getfilterRemoteActionCompatParcelizer = pair.RemoteActionCompatParcelizer();
                    getFilter getfilter = pair.read();
                    _parseSlowFloat write3 = getfilterRemoteActionCompatParcelizer.getWrite();
                    int iIconCompatParcelizer = getfilterRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer().IconCompatParcelizer(write3);
                    ifftMixedRadix ifftmixedradix = new ifftMixedRadix(i3, 1, null);
                    this.onSkipToPrevious.read(ifftmixedradix, write3);
                    if (getfilter == null) {
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfilterRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer(), this.onSetRepeatMode)) {
                            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
                        }
                        final releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = getfilterRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer().MediaBrowserCompatMediaItem();
                        try {
                            releasebase64bufferMediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem(iIconCompatParcelizer);
                            this.onSkipToPrevious.read(iIconCompatParcelizer);
                            final _full3 _full3Var5 = new _full3();
                            releasebase64buffer2 = releasebase64bufferMediaBrowserCompatMediaItem;
                            try {
                                RemoteActionCompatParcelizer$default(this, null, null, null, null, new getCreatedOnDateMs() { // from class: o._releaseBuffers
                                    @Override // kotlin.getCreatedOnDateMs
                                    public final Object invoke() {
                                        return _parseIntValue.read(this.AudioAttributesCompatParcelizer, _full3Var5, releasebase64bufferMediaBrowserCompatMediaItem, getfilterRemoteActionCompatParcelizer);
                                    }
                                }, 15, null);
                                this.onSkipToPrevious.write(_full3Var5, ifftmixedradix);
                                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                                releasebase64buffer2.IconCompatParcelizer();
                                parselong192 = parselong195;
                                _full3Var2 = _full3VarAudioAttributesImplApi26Parcelizer;
                                i = size;
                                i2 = i4;
                            } catch (Throwable th) {
                                th = th;
                                releasebase64buffer2.IconCompatParcelizer();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            releasebase64buffer2 = releasebase64bufferMediaBrowserCompatMediaItem;
                        }
                    } else {
                        checkValue checkvalue = this.IconCompatParcelizer.read(getfilter);
                        if (checkvalue == null || (remoteActionCompatParcelizer = checkvalue.getIconCompatParcelizer()) == null) {
                            remoteActionCompatParcelizer = getfilter.getRemoteActionCompatParcelizer();
                        }
                        if (checkvalue == null || (iconCompatParcelizer = checkvalue.getIconCompatParcelizer()) == null || (write2 = iconCompatParcelizer.AudioAttributesCompatParcelizer(0)) == null) {
                            write2 = getfilter.getWrite();
                        }
                        List<? extends Object> listRemoteActionCompatParcelizer = convertNumberToBigDecimal.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, write2);
                        if (!listRemoteActionCompatParcelizer.isEmpty()) {
                            this.onSkipToPrevious.IconCompatParcelizer(listRemoteActionCompatParcelizer, ifftmixedradix);
                            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getfilterRemoteActionCompatParcelizer.getRemoteActionCompatParcelizer(), this.read)) {
                                int iIconCompatParcelizer2 = this.read.IconCompatParcelizer(write3);
                                write(iIconCompatParcelizer2, MediaMetadataCompat(iIconCompatParcelizer2) + listRemoteActionCompatParcelizer.size());
                            }
                        }
                        this.onSkipToPrevious.RemoteActionCompatParcelizer(checkvalue, this.IconCompatParcelizer, getfilter, getfilterRemoteActionCompatParcelizer);
                        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem2 = remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                        try {
                            releaseBase64Buffer releasebase64buffer3 = this.onSetShuffleMode;
                            int[] iArr2 = this.MediaBrowserCompatSearchResultReceiver;
                            setProvider<hexToChar> setprovider2 = this.onPlayFromMediaId;
                            this.MediaBrowserCompatSearchResultReceiver = null;
                            this.onPlayFromMediaId = null;
                            try {
                                this.onSetShuffleMode = releasebase64bufferMediaBrowserCompatMediaItem2;
                                int iIconCompatParcelizer3 = remoteActionCompatParcelizer.IconCompatParcelizer(write2);
                                releasebase64bufferMediaBrowserCompatMediaItem2.MediaBrowserCompatMediaItem(iIconCompatParcelizer3);
                                this.onSkipToPrevious.read(iIconCompatParcelizer3);
                                _full3 _full3Var6 = new _full3();
                                parseLong19 parselong196 = this.onSkipToPrevious;
                                _full3 _full3VarAudioAttributesImplApi26Parcelizer2 = parselong196.getAudioAttributesCompatParcelizer();
                                try {
                                    parselong196.RemoteActionCompatParcelizer(_full3Var6);
                                    i = size;
                                    parselong194 = this.onSkipToPrevious;
                                    parselong192 = parselong195;
                                    try {
                                        zMediaBrowserCompatCustomActionResultReceiver = parselong194.getAudioAttributesImplApi21Parcelizer();
                                        try {
                                            parselong194.IconCompatParcelizer(false);
                                            _reportMissingRootWS read2 = getfilter.getRead();
                                            _reportMissingRootWS read3 = getfilterRemoteActionCompatParcelizer.getRead();
                                            int write4 = releasebase64bufferMediaBrowserCompatMediaItem2.getWrite();
                                            _full3Var2 = _full3VarAudioAttributesImplApi26Parcelizer;
                                            _full3Var3 = _full3VarAudioAttributesImplApi26Parcelizer2;
                                            i2 = i4;
                                            releasebase64buffer = releasebase64bufferMediaBrowserCompatMediaItem2;
                                            parselong193 = parselong196;
                                            iArr = iArr2;
                                            try {
                                                RemoteActionCompatParcelizer(read2, read3, Integer.valueOf(write4), getfilter.write(), new getCreatedOnDateMs() { // from class: o._throwUnquotedSpace
                                                    @Override // kotlin.getCreatedOnDateMs
                                                    public final Object invoke() {
                                                        return _parseIntValue.IconCompatParcelizer(this.write, getfilterRemoteActionCompatParcelizer);
                                                    }
                                                });
                                            } catch (Throwable th3) {
                                                th = th3;
                                                setprovider = setprovider2;
                                                try {
                                                    parselong194.IconCompatParcelizer(zMediaBrowserCompatCustomActionResultReceiver);
                                                    throw th;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    try {
                                                        parselong193.RemoteActionCompatParcelizer(_full3Var3);
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        this.onSetShuffleMode = releasebase64buffer3;
                                                        this.MediaBrowserCompatSearchResultReceiver = iArr;
                                                        this.onPlayFromMediaId = setprovider;
                                                        throw th;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            setprovider = setprovider2;
                                            iArr = iArr2;
                                            releasebase64buffer = releasebase64bufferMediaBrowserCompatMediaItem2;
                                            _full3Var3 = _full3VarAudioAttributesImplApi26Parcelizer2;
                                            parselong193 = parselong196;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        setprovider = setprovider2;
                                        iArr = iArr2;
                                        releasebase64buffer = releasebase64bufferMediaBrowserCompatMediaItem2;
                                        _full3Var3 = _full3VarAudioAttributesImplApi26Parcelizer2;
                                        parselong193 = parselong196;
                                        parselong193.RemoteActionCompatParcelizer(_full3Var3);
                                        throw th;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    setprovider = setprovider2;
                                    iArr = iArr2;
                                    releasebase64buffer = releasebase64bufferMediaBrowserCompatMediaItem2;
                                }
                                try {
                                    parselong194.IconCompatParcelizer(zMediaBrowserCompatCustomActionResultReceiver);
                                    try {
                                        parselong193.RemoteActionCompatParcelizer(_full3Var3);
                                        this.onSkipToPrevious.write(_full3Var6, ifftmixedradix);
                                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                                        try {
                                            this.onSetShuffleMode = releasebase64buffer3;
                                            this.MediaBrowserCompatSearchResultReceiver = iArr;
                                            this.onPlayFromMediaId = setprovider2;
                                            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                                            try {
                                                releasebase64buffer.IconCompatParcelizer();
                                            } catch (Throwable th9) {
                                                th = th9;
                                                parselong19 = parselong192;
                                                _full3Var = _full3Var2;
                                                parselong19.RemoteActionCompatParcelizer(_full3Var);
                                                throw th;
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            releasebase64buffer.IconCompatParcelizer();
                                            throw th;
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        setprovider = setprovider2;
                                        this.onSetShuffleMode = releasebase64buffer3;
                                        this.MediaBrowserCompatSearchResultReceiver = iArr;
                                        this.onPlayFromMediaId = setprovider;
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    setprovider = setprovider2;
                                    parselong193.RemoteActionCompatParcelizer(_full3Var3);
                                    throw th;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                setprovider = setprovider2;
                                iArr = iArr2;
                                releasebase64buffer = releasebase64bufferMediaBrowserCompatMediaItem2;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            releasebase64buffer = releasebase64bufferMediaBrowserCompatMediaItem2;
                        }
                    }
                    this.onSkipToPrevious.handleMediaPlayPauseIfPendingOnHandler();
                    i4 = i2 + 1;
                    list = p0;
                    size = i;
                    parselong195 = parselong192;
                    _full3VarAudioAttributesImplApi26Parcelizer = _full3Var2;
                    i3 = 0;
                } catch (Throwable th15) {
                    th = th15;
                    parselong192 = parselong195;
                    _full3Var2 = _full3VarAudioAttributesImplApi26Parcelizer;
                }
            }
            parseLong19 parselong197 = parselong195;
            _full3 _full3Var7 = _full3VarAudioAttributesImplApi26Parcelizer;
            this.onSkipToPrevious.IconCompatParcelizer();
            this.onSkipToPrevious.read(0);
            parselong197.RemoteActionCompatParcelizer(_full3Var7);
        } catch (Throwable th16) {
            th = th16;
            parselong19 = parselong195;
            _full3Var = _full3VarAudioAttributesImplApi26Parcelizer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parseIntValue _parseintvalue, _full3 _full3Var, releaseBase64Buffer releasebase64buffer, getFilter getfilter) {
        parseLong19 parselong19 = _parseintvalue.onSkipToPrevious;
        _full3 _full3VarAudioAttributesImplApi26Parcelizer = parselong19.getAudioAttributesCompatParcelizer();
        try {
            parselong19.RemoteActionCompatParcelizer(_full3Var);
            releaseBase64Buffer releasebase64buffer2 = _parseintvalue.onSetShuffleMode;
            int[] iArr = _parseintvalue.MediaBrowserCompatSearchResultReceiver;
            setProvider<hexToChar> setprovider = _parseintvalue.onPlayFromMediaId;
            _parseintvalue.MediaBrowserCompatSearchResultReceiver = null;
            _parseintvalue.onPlayFromMediaId = null;
            try {
                _parseintvalue.onSetShuffleMode = releasebase64buffer;
                parseLong19 parselong192 = _parseintvalue.onSkipToPrevious;
                boolean zMediaBrowserCompatCustomActionResultReceiver = parselong192.getAudioAttributesImplApi21Parcelizer();
                try {
                    parselong192.IconCompatParcelizer(false);
                    _parseintvalue.IconCompatParcelizer(getfilter.RemoteActionCompatParcelizer(), getfilter.getAudioAttributesImplApi21Parcelizer(), getfilter.getIconCompatParcelizer(), true);
                    parselong192.IconCompatParcelizer(zMediaBrowserCompatCustomActionResultReceiver);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    parselong19.RemoteActionCompatParcelizer(_full3VarAudioAttributesImplApi26Parcelizer);
                    return getShowPopup.INSTANCE;
                } catch (Throwable th) {
                    parselong192.IconCompatParcelizer(zMediaBrowserCompatCustomActionResultReceiver);
                    throw th;
                }
            } finally {
                _parseintvalue.onSetShuffleMode = releasebase64buffer2;
                _parseintvalue.MediaBrowserCompatSearchResultReceiver = iArr;
                _parseintvalue.onPlayFromMediaId = setprovider;
            }
        } catch (Throwable th2) {
            parselong19.RemoteActionCompatParcelizer(_full3VarAudioAttributesImplApi26Parcelizer);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_parseIntValue _parseintvalue, getFilter getfilter) {
        _parseintvalue.IconCompatParcelizer(getfilter.RemoteActionCompatParcelizer(), getfilter.getAudioAttributesImplApi21Parcelizer(), getfilter.getIconCompatParcelizer(), true);
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object RemoteActionCompatParcelizer$default(_parseIntValue _parseintvalue, _reportMissingRootWS _reportmissingrootws, _reportMissingRootWS _reportmissingrootws2, Integer num, List list, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        _reportMissingRootWS _reportmissingrootws3 = (i & 1) != 0 ? null : _reportmissingrootws;
        _reportMissingRootWS _reportmissingrootws4 = (i & 2) != 0 ? null : _reportmissingrootws2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return _parseintvalue.RemoteActionCompatParcelizer(_reportmissingrootws3, _reportmissingrootws4, num2, list, getcreatedondatems);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0025, B:9:0x002d, B:8:0x0029, B:12:0x0034, B:14:0x003a, B:16:0x0040), top: B:22:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <R> R RemoteActionCompatParcelizer(kotlin._reportMissingRootWS r7, kotlin._reportMissingRootWS r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<kotlin.rawReference, ? extends java.lang.Object>> r10, kotlin.getCreatedOnDateMs<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.onRemoveQueueItem
            int r1 = r6.RatingCompat
            r2 = 1
            r6.onRemoveQueueItem = r2     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r6.RatingCompat = r2     // Catch: java.lang.Throwable -> L49
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L49
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L49
        L11:
            if (r2 >= r3) goto L30
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L49
            o.getSubscriptionExpiresOn r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r4.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> L49
            o.rawReference r5 = (kotlin.rawReference) r5     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r4.read()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L29
            r6.IconCompatParcelizer(r5, r4)     // Catch: java.lang.Throwable -> L49
            goto L2d
        L29:
            r4 = 0
            r6.IconCompatParcelizer(r5, r4)     // Catch: java.lang.Throwable -> L49
        L2d:
            int r2 = r2 + 1
            goto L11
        L30:
            if (r7 == 0) goto L40
            if (r9 == 0) goto L39
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L49
            goto L3a
        L39:
            r9 = -1
        L3a:
            java.lang.Object r7 = r7.IconCompatParcelizer(r8, r9, r11)     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L44
        L40:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L49
        L44:
            r6.onRemoveQueueItem = r0
            r6.RatingCompat = r1
            return r7
        L49:
            r7 = move-exception
            r6.onRemoveQueueItem = r0
            r6.RatingCompat = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseIntValue.RemoteActionCompatParcelizer(o._reportMissingRootWS, o._reportMissingRootWS, java.lang.Integer, java.util.List, o.getCreatedOnDateMs):java.lang.Object");
    }

    public final _verifyPrettyValueWrite read(final Object p0) {
        List listRemoteActionCompatParcelizer;
        _matchToken2 _matchtoken2AudioAttributesCompatParcelizer = isDup.AudioAttributesCompatParcelizer(this.read, new getAnswerMap() { // from class: o._reportMismatchedEndMarker
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(_parseIntValue.write(p0, obj));
            }
        });
        if (_matchtoken2AudioAttributesCompatParcelizer != null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) read(_matchtoken2AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), _matchtoken2AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()), (Iterable) onSkipToQueueItem());
        } else {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new _verifyPrettyValueWrite(listRemoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        constructReadConstrainedTextBuffer constructreadconstrainedtextbuffer = obj2 instanceof constructReadConstrainedTextBuffer ? (constructReadConstrainedTextBuffer) obj2 : null;
        return (constructreadconstrainedtextbuffer != null ? constructreadconstrainedtextbuffer.getWrite() : null) == obj;
    }

    private final _verifyPrettyValueWrite r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        if (!this.IconCompatParcelizer.MediaDescriptionCompat()) {
            return null;
        }
        List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
        listIconCompatParcelizer.addAll(isDup.write$default(this.onSetPlaybackSpeed, null, 0, null, 7, null));
        listIconCompatParcelizer.addAll(isDup.RemoteActionCompatParcelizer(this.onSetShuffleMode));
        listIconCompatParcelizer.addAll(onSkipToQueueItem());
        return new _verifyPrettyValueWrite(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer));
    }

    private final List<JsonGeneratorImpl> read(int p0, Integer p1) {
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = this.read.MediaBrowserCompatMediaItem();
        try {
            return isDup.read(releasebase64bufferMediaBrowserCompatMediaItem, p0, p1);
        } finally {
            releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
        }
    }

    public final List<JsonGeneratorImpl> onSkipToQueueItem() {
        createChildArrayContext createchildarraycontextAudioAttributesImplApi21Parcelizer = this.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        getTokenLineNr gettokenlinenr = createchildarraycontextAudioAttributesImplApi21Parcelizer instanceof getTokenLineNr ? (getTokenLineNr) createchildarraycontextAudioAttributesImplApi21Parcelizer : null;
        if (gettokenlinenr == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Integer numWrite = isDup.write(gettokenlinenr.getAudioAttributesImplBaseParcelizer(), this.IconCompatParcelizer);
        if (numWrite == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = gettokenlinenr.getAudioAttributesImplBaseParcelizer().MediaBrowserCompatMediaItem();
        try {
            List<JsonGeneratorImpl> list = isDup.read(releasebase64bufferMediaBrowserCompatMediaItem, numWrite.intValue(), 0);
            releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) list, (Iterable) gettokenlinenr.getOnMediaButtonEvent().onSkipToQueueItem());
        } catch (Throwable th) {
            releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
            throw th;
        }
    }

    public final void write(setKeyListener<Object, Object> p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1, isResourceManaged p2) {
        if (!this.AudioAttributesCompatParcelizer.write()) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Expected applyChanges() to have been called");
        }
        this.onSkipToQueueItem = p2;
        try {
            read(p0, p1);
        } finally {
            this.onSkipToQueueItem = null;
        }
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        if (this.onRemoveQueueItem) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Preparing a composition while composing is not supported");
        }
        this.onRemoveQueueItem = true;
        try {
            p0.invoke();
        } finally {
            this.onRemoveQueueItem = false;
        }
    }

    public final boolean RemoteActionCompatParcelizer(setKeyListener<Object, Object> p0, isResourceManaged p1) {
        if (!this.AudioAttributesCompatParcelizer.write()) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Expected applyChanges() to have been called");
        }
        if (getAndClear.RemoteActionCompatParcelizer(p0) <= 0 && this.handleMediaPlayPauseIfPendingOnHandler.isEmpty() && !this.onCustomAction) {
            return false;
        }
        this.onSkipToQueueItem = p1;
        try {
            read(p0, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) null);
            this.onSkipToQueueItem = null;
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        } catch (Throwable th) {
            this.onSkipToQueueItem = null;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(kotlin.setKeyListener<java.lang.Object, java.lang.Object> r17) {
        /*
            r16 = this;
            r0 = r16
            java.util.List<o.filterStartObject> r1 = r0.handleMediaPlayPauseIfPendingOnHandler
            int r1 = kotlin.IntermediateLoginResponseBody.write(r1)
        L8:
            if (r1 < 0) goto L3c
            java.util.List<o.filterStartObject> r2 = r0.handleMediaPlayPauseIfPendingOnHandler
            java.lang.Object r2 = r2.get(r1)
            o.filterStartObject r2 = (kotlin.filterStartObject) r2
            o.rawReference r3 = r2.getIconCompatParcelizer()
            o._parseSlowFloat r3 = r3.getRemoteActionCompatParcelizer()
            if (r3 == 0) goto L34
            boolean r4 = r3.write()
            if (r4 == 0) goto L34
            int r4 = r2.getRead()
            int r5 = r3.getIconCompatParcelizer()
            if (r4 == r5) goto L39
            int r3 = r3.getIconCompatParcelizer()
            r2.AudioAttributesCompatParcelizer(r3)
            goto L39
        L34:
            java.util.List<o.filterStartObject> r2 = r0.handleMediaPlayPauseIfPendingOnHandler
            r2.remove(r1)
        L39:
            int r1 = r1 + (-1)
            goto L8
        L3c:
            r1 = r17
            o.AppCompatButton r1 = (kotlin.AppCompatButton) r1
            java.lang.Object[] r2 = r1.IconCompatParcelizer
            java.lang.Object[] r3 = r1.MediaBrowserCompatItemReceiver
            long[] r1 = r1.RemoteActionCompatParcelizer
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La3
            r6 = 0
        L4c:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9e
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L66:
            if (r11 >= r9) goto L9c
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L98
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            java.lang.String r14 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r13, r14)
            o.rawReference r13 = (kotlin.rawReference) r13
            o._parseSlowFloat r14 = r13.getRemoteActionCompatParcelizer()
            if (r14 == 0) goto L98
            int r14 = r14.getIconCompatParcelizer()
            java.util.List<o.filterStartObject> r15 = r0.handleMediaPlayPauseIfPendingOnHandler
            o.getEncoding r5 = kotlin.getEncoding.INSTANCE
            if (r12 != r5) goto L90
            r12 = 0
        L90:
            o.filterStartObject r5 = new o.filterStartObject
            r5.<init>(r13, r14, r12)
            r15.add(r5)
        L98:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L66
        L9c:
            if (r9 != r10) goto La3
        L9e:
            if (r6 == r4) goto La3
            int r6 = r6 + 1
            goto L4c
        La3:
            java.util.List<o.filterStartObject> r0 = r0.handleMediaPlayPauseIfPendingOnHandler
            java.util.Comparator r1 = kotlin.convertNumberToBigDecimal.IconCompatParcelizer()
            kotlin.IntermediateLoginResponseBody.IconCompatParcelizer(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._parseIntValue.AudioAttributesCompatParcelizer(o.setKeyListener):void");
    }

    private final void read(setKeyListener<Object, Object> p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        if (this.onRemoveQueueItem) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Reentrant composition is not supported");
        }
        _matchNull _matchnullIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:recompose");
        try {
            this.onPlayFromSearch = Long.hashCode(toChars3.MediaBrowserCompatSearchResultReceiver().getIconCompatParcelizer());
            this.onPlayFromMediaId = null;
            AudioAttributesCompatParcelizer(p0);
            this.RatingCompat = 0;
            this.onRemoveQueueItem = true;
            if (_matchnullIconCompatParcelizer != null) {
                _matchnullIconCompatParcelizer.AudioAttributesCompatParcelizer(getAudioAttributesImplBaseParcelizer());
            }
            try {
                accessaddObserverForBackInvoker();
                Object objOnStop = onStop();
                if (objOnStop != p1 && p1 != null) {
                    AudioAttributesImplBaseParcelizer(p1);
                }
                write writeVar = this.onPrepareFromUri;
                UTF32Reader<reportOverflowInt> uTF32ReaderIconCompatParcelizer = _qbuf.IconCompatParcelizer();
                try {
                    uTF32ReaderIconCompatParcelizer.read(writeVar);
                    if (p1 != null) {
                        RemoteActionCompatParcelizer(200, _validJsonValueList.RemoteActionCompatParcelizer());
                        multiply.AudioAttributesCompatParcelizer(this, p1);
                        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
                    } else if ((this.onCustomAction || this.onMediaButtonEvent) && objOnStop != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objOnStop, _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer())) {
                        RemoteActionCompatParcelizer(200, _validJsonValueList.RemoteActionCompatParcelizer());
                        multiply.AudioAttributesCompatParcelizer(this, (MagicModuleSubmissionRequestBody) toMagicModuleStatsLSModel.RemoteActionCompatParcelizer(objOnStop, 2));
                        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
                    } else {
                        setSessionImpl();
                    }
                    uTF32ReaderIconCompatParcelizer.RemoteActionCompatParcelizer(uTF32ReaderIconCompatParcelizer.getAudioAttributesCompatParcelizer() - 1);
                    ResultReceiver();
                    if (_matchnullIconCompatParcelizer != null) {
                        _matchnullIconCompatParcelizer.RemoteActionCompatParcelizer(getAudioAttributesImplBaseParcelizer());
                    }
                    this.onRemoveQueueItem = false;
                    this.handleMediaPlayPauseIfPendingOnHandler.clear();
                    r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } catch (Throwable th) {
                    uTF32ReaderIconCompatParcelizer.RemoteActionCompatParcelizer(uTF32ReaderIconCompatParcelizer.getAudioAttributesCompatParcelizer() - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _verifyPrettyValueWrite AudioAttributesCompatParcelizer(_parseIntValue _parseintvalue) {
        return _parseintvalue.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    private final Object AudioAttributesCompatParcelizer(releaseBase64Buffer releasebase64buffer) {
        return releasebase64buffer.MediaBrowserCompatSearchResultReceiver(releasebase64buffer.getMediaDescriptionCompat());
    }

    private final Object IconCompatParcelizer(releaseBase64Buffer releasebase64buffer, int i) {
        return releasebase64buffer.MediaBrowserCompatSearchResultReceiver(i);
    }

    private final void accessonBackPresseds1027565324() {
        if (!this.onAddQueueItem) {
            _validJsonValueList.AudioAttributesCompatParcelizer("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.onAddQueueItem = false;
    }

    private final void ensureViewModelStore() {
        if (this.onAddQueueItem) {
            _validJsonValueList.AudioAttributesCompatParcelizer("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void write(_parseSlowFloat p0) {
        if (this.onStop.AudioAttributesCompatParcelizer()) {
            this.onSkipToPrevious.IconCompatParcelizer(p0, this.onSetRepeatMode);
        } else {
            this.onSkipToPrevious.AudioAttributesCompatParcelizer(p0, this.onSetRepeatMode, this.onStop);
            this.onStop = new _outputUptoBillion();
        }
    }

    private final void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        AudioAttributesImplApi26Parcelizer(this.onSetShuffleMode.getWrite());
        this.onSkipToPrevious.MediaBrowserCompatMediaItem();
    }

    private static final getFilter write(_parseIntValue _parseintvalue, int i, List<getFilter> list) {
        Object objAudioAttributesImplApi21Parcelizer = _parseintvalue.onSetShuffleMode.AudioAttributesImplApi21Parcelizer(i);
        toMagicModuleMetaRepoModel.read(objAudioAttributesImplApi21Parcelizer, "");
        createRootContext createrootcontext = (createRootContext) objAudioAttributesImplApi21Parcelizer;
        Object objIconCompatParcelizer = _parseintvalue.onSetShuffleMode.IconCompatParcelizer(i, 0);
        _parseSlowFloat _parseslowfloatIconCompatParcelizer = _parseintvalue.onSetShuffleMode.IconCompatParcelizer(i);
        int iMediaBrowserCompatCustomActionResultReceiver = _parseintvalue.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(i);
        ArrayList arrayList = new ArrayList();
        List<filterStartObject> list2 = _parseintvalue.handleMediaPlayPauseIfPendingOnHandler;
        for (int i2 = convertNumberToBigDecimal.read(list2, i); i2 < list2.size(); i2++) {
            filterStartObject filterstartobject = list2.get(i2);
            if (filterstartobject.getRead() >= iMediaBrowserCompatCustomActionResultReceiver + i) {
                break;
            }
            arrayList.add(setAction.write(filterstartobject.getIconCompatParcelizer(), filterstartobject.getRemoteActionCompatParcelizer()));
        }
        return new getFilter(createrootcontext, objIconCompatParcelizer, _parseintvalue.getAudioAttributesImplBaseParcelizer(), _parseintvalue.read, _parseslowfloatIconCompatParcelizer, arrayList, _parseintvalue.MediaBrowserCompatCustomActionResultReceiver(i), list);
    }

    private static final getFilter read(_parseIntValue _parseintvalue, int i) {
        int i2 = _parseintvalue.onSetShuffleMode.read(i);
        Object objAudioAttributesImplApi21Parcelizer = _parseintvalue.onSetShuffleMode.AudioAttributesImplApi21Parcelizer(i);
        ArrayList arrayList = null;
        if (i2 != 126665345 || !(objAudioAttributesImplApi21Parcelizer instanceof createRootContext)) {
            return null;
        }
        if (_parseintvalue.onSetShuffleMode.AudioAttributesCompatParcelizer(i)) {
            ArrayList arrayList2 = new ArrayList();
            IconCompatParcelizer(_parseintvalue, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return write(_parseintvalue, i, arrayList);
    }

    private static final void IconCompatParcelizer(_parseIntValue _parseintvalue, List<getFilter> list, int i) {
        int iMediaBrowserCompatCustomActionResultReceiver = _parseintvalue.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(i);
        int iMediaBrowserCompatCustomActionResultReceiver2 = i + 1;
        while (iMediaBrowserCompatCustomActionResultReceiver2 < iMediaBrowserCompatCustomActionResultReceiver + i) {
            if (_parseintvalue.onSetShuffleMode.MediaBrowserCompatItemReceiver(iMediaBrowserCompatCustomActionResultReceiver2)) {
                getFilter getfilter = read(_parseintvalue, iMediaBrowserCompatCustomActionResultReceiver2);
                if (getfilter != null) {
                    list.add(getfilter);
                }
            } else if (_parseintvalue.onSetShuffleMode.AudioAttributesCompatParcelizer(iMediaBrowserCompatCustomActionResultReceiver2)) {
                IconCompatParcelizer(_parseintvalue, list, iMediaBrowserCompatCustomActionResultReceiver2);
            }
            iMediaBrowserCompatCustomActionResultReceiver2 += _parseintvalue.onSetShuffleMode.MediaBrowserCompatCustomActionResultReceiver(iMediaBrowserCompatCustomActionResultReceiver2);
        }
    }

    private static final int IconCompatParcelizer(_parseIntValue _parseintvalue, int i, int i2, boolean z, int i3) {
        releaseBase64Buffer releasebase64buffer = _parseintvalue.onSetShuffleMode;
        if (releasebase64buffer.MediaBrowserCompatItemReceiver(i2)) {
            int i4 = releasebase64buffer.read(i2);
            Object objAudioAttributesImplApi21Parcelizer = releasebase64buffer.AudioAttributesImplApi21Parcelizer(i2);
            if (i4 == 126665345 && (objAudioAttributesImplApi21Parcelizer instanceof createRootContext)) {
                getFilter getfilter = read(_parseintvalue, i2);
                if (getfilter != null) {
                    _parseintvalue.IconCompatParcelizer.write(getfilter);
                    _parseintvalue.onSkipToPrevious.MediaMetadataCompat();
                    _parseintvalue.onSkipToPrevious.RemoteActionCompatParcelizer(_parseintvalue.getAudioAttributesImplBaseParcelizer(), _parseintvalue.IconCompatParcelizer, getfilter);
                }
                if (z && i2 != i) {
                    _parseintvalue.onSkipToPrevious.read(i3, i2);
                    return 0;
                }
                return releasebase64buffer.MediaMetadataCompat(i2);
            }
            if (i4 == 206 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(objAudioAttributesImplApi21Parcelizer, _validJsonValueList.MediaBrowserCompatItemReceiver())) {
                Object objIconCompatParcelizer = releasebase64buffer.IconCompatParcelizer(i2, 0);
                constructReadConstrainedTextBuffer constructreadconstrainedtextbuffer = objIconCompatParcelizer instanceof constructReadConstrainedTextBuffer ? (constructReadConstrainedTextBuffer) objIconCompatParcelizer : null;
                allocReadIOBuffer write2 = constructreadconstrainedtextbuffer != null ? constructreadconstrainedtextbuffer.getWrite() : null;
                read readVar = write2 instanceof read ? (read) write2 : null;
                if (readVar != null) {
                    for (_parseIntValue _parseintvalue2 : readVar.getAudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer()) {
                        _parseintvalue2._init_lambda4();
                        _parseintvalue.IconCompatParcelizer.read(_parseintvalue2.getAudioAttributesImplBaseParcelizer());
                    }
                }
                return releasebase64buffer.MediaMetadataCompat(i2);
            }
            if (releasebase64buffer.AudioAttributesImplBaseParcelizer(i2)) {
                return 1;
            }
            return releasebase64buffer.MediaMetadataCompat(i2);
        }
        if (releasebase64buffer.AudioAttributesCompatParcelizer(i2)) {
            int iMediaBrowserCompatCustomActionResultReceiver = releasebase64buffer.MediaBrowserCompatCustomActionResultReceiver(i2);
            int iIconCompatParcelizer = 0;
            for (int iMediaBrowserCompatCustomActionResultReceiver2 = i2 + 1; iMediaBrowserCompatCustomActionResultReceiver2 < iMediaBrowserCompatCustomActionResultReceiver + i2; iMediaBrowserCompatCustomActionResultReceiver2 += releasebase64buffer.MediaBrowserCompatCustomActionResultReceiver(iMediaBrowserCompatCustomActionResultReceiver2)) {
                boolean zAudioAttributesImplBaseParcelizer = releasebase64buffer.AudioAttributesImplBaseParcelizer(iMediaBrowserCompatCustomActionResultReceiver2);
                if (zAudioAttributesImplBaseParcelizer) {
                    _parseintvalue.onSkipToPrevious.write();
                    _parseintvalue.onSkipToPrevious.write(releasebase64buffer.MediaBrowserCompatSearchResultReceiver(iMediaBrowserCompatCustomActionResultReceiver2));
                }
                iIconCompatParcelizer += IconCompatParcelizer(_parseintvalue, i, iMediaBrowserCompatCustomActionResultReceiver2, zAudioAttributesImplBaseParcelizer || z, zAudioAttributesImplBaseParcelizer ? 0 : i3 + iIconCompatParcelizer);
                if (zAudioAttributesImplBaseParcelizer) {
                    _parseintvalue.onSkipToPrevious.write();
                    _parseintvalue.onSkipToPrevious.MediaBrowserCompatItemReceiver();
                }
            }
            if (releasebase64buffer.AudioAttributesImplBaseParcelizer(i2)) {
                return 1;
            }
            return iIconCompatParcelizer;
        }
        if (releasebase64buffer.AudioAttributesImplBaseParcelizer(i2)) {
            return 1;
        }
        return releasebase64buffer.MediaMetadataCompat(i2);
    }

    private final void AudioAttributesImplApi26Parcelizer(int p0) {
        boolean zAudioAttributesImplBaseParcelizer = this.onSetShuffleMode.AudioAttributesImplBaseParcelizer(p0);
        if (zAudioAttributesImplBaseParcelizer) {
            this.onSkipToPrevious.write();
            this.onSkipToPrevious.write(this.onSetShuffleMode.MediaBrowserCompatSearchResultReceiver(p0));
        }
        IconCompatParcelizer(this, p0, p0, zAudioAttributesImplBaseParcelizer, 0);
        this.onSkipToPrevious.write();
        if (zAudioAttributesImplBaseParcelizer) {
            this.onSkipToPrevious.MediaBrowserCompatItemReceiver();
        }
    }

    private final void _init_lambda4() {
        if (this.read.AudioAttributesCompatParcelizer()) {
            getAudioAttributesImplBaseParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            _full3 _full3Var = new _full3();
            this.setSessionImpl = _full3Var;
            releaseBase64Buffer releasebase64bufferMediaBrowserCompatMediaItem = this.read.MediaBrowserCompatMediaItem();
            try {
                this.onSetShuffleMode = releasebase64bufferMediaBrowserCompatMediaItem;
                parseLong19 parselong19 = this.onSkipToPrevious;
                _full3 _full3VarAudioAttributesImplApi26Parcelizer = parselong19.getAudioAttributesCompatParcelizer();
                try {
                    parselong19.RemoteActionCompatParcelizer(_full3Var);
                    AudioAttributesImplApi26Parcelizer(0);
                    this.onSkipToPrevious.MediaDescriptionCompat();
                    parselong19.RemoteActionCompatParcelizer(_full3VarAudioAttributesImplApi26Parcelizer);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } catch (Throwable th) {
                    parselong19.RemoteActionCompatParcelizer(_full3VarAudioAttributesImplApi26Parcelizer);
                    throw th;
                }
            } finally {
                releasebase64bufferMediaBrowserCompatMediaItem.IconCompatParcelizer();
            }
        }
    }

    private final void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        this.onSkipToPrevious.AudioAttributesImplApi21Parcelizer();
        if (!parseLong.write(this.MediaBrowserCompatCustomActionResultReceiver)) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Start/end imbalance");
        }
        MediaSessionCompatQueueItem();
    }

    private final void MediaSessionCompatQueueItem() {
        this.MediaBrowserCompatItemReceiver = null;
        this.RatingCompat = 0;
        this.MediaMetadataCompat = 0;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 0L;
        this.onAddQueueItem = false;
        this.onSkipToPrevious.MediaBrowserCompatSearchResultReceiver();
        parseLong.read(this.onRewind);
        PlaybackStateCompat();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\n\u001a\u00060\u0002R\u00020\u00038\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/_parseIntValue$read;", "Lo/allocReadIOBuffer;", "Lo/_parseIntValue$AudioAttributesCompatParcelizer;", "Lo/_parseIntValue;", "p0", "<init>", "(Lo/_parseIntValue$AudioAttributesCompatParcelizer;)V", "", "o_", "()V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "read", "Lo/_parseIntValue$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/_parseIntValue$AudioAttributesCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements allocReadIOBuffer {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        @Override // kotlin.allocReadIOBuffer
        public final void o_() {
        }

        public read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final AudioAttributesCompatParcelizer getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.allocReadIOBuffer
        public final void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.allocReadIOBuffer
        public final void IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    @Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\r\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0014H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0010¢\u0006\u0004\b\u0015\u0010\u0018J3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a2\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00192\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0010¢\u0006\u0004\b\u001b\u0010\u001dJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0011\u0010\u0013J\u000f\u0010\u001f\u001a\u00020\u001eH\u0010¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u001e¢\u0006\u0004\b\u0015\u0010!J\u001d\u0010\u0015\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0010¢\u0006\u0004\b\u0015\u0010$J\u000f\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\fH\u0010¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020'H\u0010¢\u0006\u0004\b\u0015\u0010(J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020'H\u0010¢\u0006\u0004\b\u001b\u0010(J\u0019\u0010&\u001a\u0004\u0018\u00010)2\u0006\u0010\u0004\u001a\u00020'H\u0010¢\u0006\u0004\b&\u0010*J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020)2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030+H\u0010¢\u0006\u0004\b\r\u0010,J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0012H\u0010¢\u0006\u0004\b&\u0010\u0013J\u001d\u0010\u001b\u001a\u00020-2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\b\u001b\u0010.R\u001e\u0010\r\u001a\u00060\u0002j\u0002`\u00038\u0011X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u001b\u001a\u00020\u00058\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u001b\u00103\u001a\u0004\b\u0011\u00104R\u001a\u0010\u0011\u001a\u00020\u00058\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b\u0015\u00104R\u001c\u0010&\u001a\u0004\u0018\u00010\b8\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b6\u00107R$\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\"8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u00108R \u0010/\u001a\b\u0012\u0004\u0012\u0002090\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u00108\u001a\u0004\b/\u0010:R\u0014\u0010;\u001a\u00020\u00058QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u00104R\u0014\u0010=\u001a\u00020\u00058QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b<\u00104R\u0014\u00101\u001a\u00020>8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010?R+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u001e8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010@\u001a\u0004\bA\u0010 \"\u0004\b\u001b\u0010!R\u0014\u0010D\u001a\u00020B8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b=\u0010C"}, d2 = {"Lo/_parseIntValue$AudioAttributesCompatParcelizer;", "Lo/convertNumberToLong;", "", "Lo/CompositeKeyHashCode;", "p0", "", "p1", "p2", "Lo/resetFloat;", "p3", "<init>", "(Lo/_parseIntValue;JZZLo/resetFloat;)V", "", "RemoteActionCompatParcelizer", "()V", "Lo/_handleUnrecognizedCharacterEscape;", "(Lo/_handleUnrecognizedCharacterEscape;)V", "AudioAttributesCompatParcelizer", "Lo/_reportMissingRootWS;", "(Lo/_reportMissingRootWS;)V", "Lo/rawReference;", "IconCompatParcelizer", "(Lo/rawReference;)V", "Lkotlin/Function0;", "(Lo/_reportMissingRootWS;Lo/MagicModuleSubmissionRequestBody;)V", "Lo/isResourceManaged;", "Lo/setButtonDrawable;", "write", "(Lo/_reportMissingRootWS;Lo/isResourceManaged;Lo/MagicModuleSubmissionRequestBody;)Lo/setButtonDrawable;", "(Lo/_reportMissingRootWS;Lo/isResourceManaged;Lo/setButtonDrawable;)Lo/setButtonDrawable;", "Lo/hexToChar;", "MediaBrowserCompatCustomActionResultReceiver", "()Lo/hexToChar;", "(Lo/hexToChar;)V", "", "Lo/JsonReadContext;", "(Ljava/util/Set;)V", "MediaBrowserCompatSearchResultReceiver", "read", "Lo/getFilter;", "(Lo/getFilter;)V", "Lo/checkValue;", "(Lo/getFilter;)Lo/checkValue;", "Lo/_closeInput;", "(Lo/getFilter;Lo/checkValue;Lo/_closeInput;)V", "Lo/_contentReference;", "(Lo/getCreatedOnDateMs;)Lo/_contentReference;", "AudioAttributesImplApi26Parcelizer", "J", "AudioAttributesImplBaseParcelizer", "()J", "Z", "()Z", "Lo/resetFloat;", "MediaMetadataCompat", "()Lo/resetFloat;", "Ljava/util/Set;", "Lo/_parseIntValue;", "()Ljava/util/Set;", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "AudioAttributesImplApi21Parcelizer", "Lo/CurrentQuery;", "()Lo/CurrentQuery;", "Lo/InputAccessor;", "MediaBrowserCompatMediaItem", "Lo/createChildArrayContext;", "()Lo/createChildArrayContext;", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AudioAttributesCompatParcelizer extends convertNumberToLong {

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private final long RemoteActionCompatParcelizer;
        public Set<Set<JsonReadContext>> IconCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private final resetFloat read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final boolean AudioAttributesCompatParcelizer;
        private final boolean write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final Set<_parseIntValue> AudioAttributesImplApi26Parcelizer = new LinkedHashSet();

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private final InputAccessor MediaBrowserCompatCustomActionResultReceiver = _qbuf.RemoteActionCompatParcelizer(imagIdx.write(), _qbuf.read());

        public AudioAttributesCompatParcelizer(long j, boolean z, boolean z2, resetFloat resetfloat) {
            this.RemoteActionCompatParcelizer = j;
            this.write = z;
            this.AudioAttributesCompatParcelizer = z2;
            this.read = resetfloat;
        }

        @Override // kotlin.convertNumberToLong
        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final long getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.convertNumberToLong
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        @Override // kotlin.convertNumberToLong
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.convertNumberToLong
        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
        public final resetFloat getRead() {
            return this.read;
        }

        public final Set<_parseIntValue> AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // kotlin.convertNumberToLong
        public final boolean write() {
            return _parseIntValue.this.IconCompatParcelizer.write();
        }

        @Override // kotlin.convertNumberToLong
        public final boolean MediaDescriptionCompat() {
            return _parseIntValue.this.IconCompatParcelizer.MediaDescriptionCompat();
        }

        public final void RemoteActionCompatParcelizer() {
            if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                return;
            }
            Set<Set<JsonReadContext>> set = this.IconCompatParcelizer;
            if (set != null) {
                for (_parseIntValue _parseintvalue : this.AudioAttributesImplApi26Parcelizer) {
                    Iterator<Set<JsonReadContext>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(_parseintvalue.onAddQueueItem());
                    }
                }
            }
            this.AudioAttributesImplApi26Parcelizer.clear();
        }

        @Override // kotlin.convertNumberToLong
        public final void RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape p0) {
            toMagicModuleMetaRepoModel.read(p0, "");
            super.RemoteActionCompatParcelizer((_parseIntValue) p0);
            this.AudioAttributesImplApi26Parcelizer.add(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final void AudioAttributesCompatParcelizer(_handleUnrecognizedCharacterEscape p0) {
            Set<Set<JsonReadContext>> set = this.IconCompatParcelizer;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    toMagicModuleMetaRepoModel.read(p0, "");
                    set2.remove(((_parseIntValue) p0).onAddQueueItem());
                }
            }
            toMagicModuleStatsLSModel.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer).remove(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final void RemoteActionCompatParcelizer(_reportMissingRootWS p0) {
            _parseIntValue.this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final void IconCompatParcelizer(rawReference p0) {
            _parseIntValue.this.IconCompatParcelizer.IconCompatParcelizer(p0);
        }

        @Override // kotlin.convertNumberToLong
        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver */
        public final CurrentQuery getOnPlayFromSearch() {
            return _parseIntValue.this.IconCompatParcelizer.getOnPlayFromSearch();
        }

        @Override // kotlin.convertNumberToLong
        public final void IconCompatParcelizer(_reportMissingRootWS p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
            _parseIntValue.this.IconCompatParcelizer.IconCompatParcelizer(p0, p1);
        }

        @Override // kotlin.convertNumberToLong
        public final setButtonDrawable<rawReference> write(_reportMissingRootWS p0, isResourceManaged p1, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p2) {
            return _parseIntValue.this.IconCompatParcelizer.write(p0, p1, p2);
        }

        @Override // kotlin.convertNumberToLong
        public final setButtonDrawable<rawReference> write(_reportMissingRootWS p0, isResourceManaged p1, setButtonDrawable<rawReference> p2) {
            return _parseIntValue.this.IconCompatParcelizer.write(p0, p1, p2);
        }

        @Override // kotlin.convertNumberToLong
        public final void AudioAttributesCompatParcelizer(_reportMissingRootWS p0) {
            _parseIntValue.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(_parseIntValue.this.getAudioAttributesImplBaseParcelizer());
            _parseIntValue.this.IconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        }

        private final hexToChar MediaBrowserCompatMediaItem() {
            return (hexToChar) this.MediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer();
        }

        private final void write(hexToChar hextochar) {
            this.MediaBrowserCompatCustomActionResultReceiver.write(hextochar);
        }

        @Override // kotlin.convertNumberToLong
        public final hexToChar MediaBrowserCompatCustomActionResultReceiver() {
            return MediaBrowserCompatMediaItem();
        }

        public final void IconCompatParcelizer(hexToChar p0) {
            write(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final void IconCompatParcelizer(Set<JsonReadContext> p0) {
            HashSet hashSet = this.IconCompatParcelizer;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.IconCompatParcelizer = hashSet;
            }
            hashSet.add(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final void MediaBrowserCompatSearchResultReceiver() {
            _parseIntValue.this.onPrepareFromMediaId++;
        }

        @Override // kotlin.convertNumberToLong
        public final void read() {
            _parseIntValue.this.onPrepareFromMediaId--;
        }

        @Override // kotlin.convertNumberToLong
        public final void IconCompatParcelizer(getFilter p0) {
            _parseIntValue.this.IconCompatParcelizer.IconCompatParcelizer(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final void write(getFilter p0) {
            _parseIntValue.this.IconCompatParcelizer.write(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final checkValue read(getFilter p0) {
            return _parseIntValue.this.IconCompatParcelizer.read(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final void RemoteActionCompatParcelizer(getFilter p0, checkValue p1, _closeInput<?> p2) {
            _parseIntValue.this.IconCompatParcelizer.RemoteActionCompatParcelizer(p0, p1, p2);
        }

        @Override // kotlin.convertNumberToLong
        public final void read(_reportMissingRootWS p0) {
            _parseIntValue.this.IconCompatParcelizer.read(p0);
        }

        @Override // kotlin.convertNumberToLong
        public final createChildArrayContext AudioAttributesImplApi21Parcelizer() {
            return _parseIntValue.this.getAudioAttributesImplBaseParcelizer();
        }

        @Override // kotlin.convertNumberToLong
        public final _contentReference write(getCreatedOnDateMs<getShowPopup> p0) {
            return _parseIntValue.this.IconCompatParcelizer.write(p0);
        }
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final escapesFor onMediaButtonEvent() {
        return onSetRating();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final Object onPause() {
        return onSkipToPrevious();
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void RemoteActionCompatParcelizer(Object p0) {
        write(p0);
    }

    @Override // kotlin._handleUnrecognizedCharacterEscape
    public final void write(escapesFor p0) {
        rawReference rawreference = p0 instanceof rawReference ? (rawReference) p0 : null;
        if (rawreference != null) {
            rawreference.AudioAttributesImplApi21Parcelizer(true);
        }
    }

    public final void onSeekTo() {
        Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("Compose:Composer.dispose");
        try {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this);
            onRewind();
            MediaMetadataCompat().AudioAttributesCompatParcelizer();
            this.onSeekTo = true;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } finally {
            multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
        }
    }

    private final hexToChar read(hexToChar p0, hexToChar p1) {
        hexToChar.write writeVarIconCompatParcelizer = p0.IconCompatParcelizer();
        writeVarIconCompatParcelizer.putAll(p1);
        hexToChar hextocharRemoteActionCompatParcelizer = writeVarIconCompatParcelizer.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(204, _validJsonValueList.IconCompatParcelizer());
        AudioAttributesImplApi21Parcelizer(hextocharRemoteActionCompatParcelizer);
        AudioAttributesImplApi21Parcelizer(p1);
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        return hextocharRemoteActionCompatParcelizer;
    }

    private final long write(int p0, int p1, long p2) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i = 3;
        int i2 = 0;
        while (p0 >= 0) {
            if (p0 != p1) {
                int iWrite = write(this.onSetShuffleMode, p0);
                if (iWrite != 126665345) {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iWrite, i)) ^ Long.rotateLeft(this.onSetShuffleMode.AudioAttributesImplApi26Parcelizer(p0) ? 0 : AudioAttributesImplBaseParcelizer(p0), i2);
                    i = (i + 6) % 64;
                    i2 = (i2 + 6) % 64;
                    p0 = this.onSetShuffleMode.RatingCompat(p0);
                } else {
                    jRotateLeft = Long.rotateLeft(iWrite, i2);
                }
            } else {
                jRotateLeft = Long.rotateLeft(p2, i2);
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }
}
