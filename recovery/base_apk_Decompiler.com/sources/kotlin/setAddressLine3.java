package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin.getNameArray;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004ï\u0001ð\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010#J4\u0010%\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010)J\"\u0010*\u001a\u00020\b*\u00020+2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u0004H\u0002J#\u0010,\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.H\u0002¢\u0006\u0002\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\b012\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b5\u0010#Jê\u0001\u00106\u001a\u0002H7\"\u0004\b\u0001\u001072\u0006\u0010\"\u001a\u00028\u00002\b\u00108\u001a\u0004\u0018\u0001092\f\u0010:\u001a\b\u0012\u0004\u0012\u0002H70;2<\u0010<\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0004\u0012\u0002H70=2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H70;2h\b\u0002\u0010C\u001ab\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b((\u0012\u0004\u0012\u0002H70DH\u0082\b¢\u0006\u0002\u0010EJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\b012\u0006\u0010\"\u001a\u00028\u0000H\u0004¢\u0006\u0004\bG\u00103JX\u0010H\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u00112\u0006\u00108\u001a\u00020+2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0;2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0;H\u0082\b¢\u0006\u0002\u0010IJE\u0010J\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010K\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010LJE\u0010M\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u0001092\u0006\u0010K\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010LJ\u0010\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u0011H\u0003J\u0010\u0010P\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020\u0011H\u0002J\r\u0010N\u001a\u00020\u001aH\u0010¢\u0006\u0002\bRJ\u0019\u0010S\u001a\u00020\u001a*\u0002092\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\bH\u0014J\b\u0010V\u001a\u00020\bH\u0014J\u000e\u0010W\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010XJ;\u0010Y\u001a\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010[J\"\u0010\\\u001a\u00020\b*\u00020+2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u0004H\u0002J\u0016\u0010]\u001a\u00020\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0002J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@¢\u0006\u0004\b_\u0010XJ4\u0010`\u001a\b\u0012\u0004\u0012\u00028\u0000012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u0011H\u0082@¢\u0006\u0004\ba\u0010[J\u001c\u0010b\u001a\u00020\b2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000010.H\u0002J\u0015\u0010c\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0016¢\u0006\u0004\bd\u0010eJ\u0010\u0010f\u001a\u00020\b2\u0006\u0010g\u001a\u00020\u0011H\u0004J÷\u0001\u0010h\u001a\u0002H7\"\u0004\b\u0001\u001072\b\u00108\u001a\u0004\u0018\u0001092!\u0010i\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H70\u00072Q\u0010<\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(Z\u0012\u0004\u0012\u0002H70j2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002H70;2S\b\u0002\u0010C\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(Z\u0012\u0004\u0012\u0002H70jH\u0082\b¢\u0006\u0002\u0010kJ`\u0010l\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00112\u0006\u00108\u001a\u00020+2!\u0010i\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b>\u0012\b\b?\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\b0\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0;H\u0082\bJ2\u0010m\u001a\u0004\u0018\u0001092\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u000109H\u0002J2\u0010n\u001a\u0004\u0018\u0001092\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u000109H\u0002J\"\u0010o\u001a\u00020\u001a*\u0002092\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u0004H\u0002J\b\u0010p\u001a\u00020\bH\u0002J&\u0010q\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0011H\u0002J&\u0010s\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010r\u001a\u00020\u0011H\u0002J\u0012\u0010t\u001a\u00020\b2\b\b\u0002\u0010u\u001a\u00020\u0011H\u0002J\u0015\u0010v\u001a\u00020\b2\u0006\u0010w\u001a\u00020\u0011H\u0000¢\u0006\u0002\bxJ \u0010\u007f\u001a\u00020\b2\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u00012\b\u0010\"\u001a\u0004\u0018\u000109H\u0014J%\u0010\u0082\u0001\u001a\u00020\b2\u0006\u0010\"\u001a\u00028\u00002\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u0001H\u0002¢\u0006\u0003\u0010\u0083\u0001J!\u0010\u0084\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J\"\u0010\u0092\u0001\u001a\u00020\b2\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u00012\t\u0010\u0085\u0001\u001a\u0004\u0018\u000109H\u0002J\u0017\u0010\u0093\u0001\u001a\u00020\b2\f\u0010\u0080\u0001\u001a\u0007\u0012\u0002\b\u00030\u0081\u0001H\u0002J!\u0010\u0094\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J!\u0010\u0095\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J!\u0010\u0096\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001092\t\u0010\u0086\u0001\u001a\u0004\u0018\u000109H\u0002J\u0011\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000 \u0001H\u0096\u0002J\t\u0010ª\u0001\u001a\u00020\bH\u0014J\u0015\u0010«\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016J\u0013\u0010\u00ad\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u0001J\u0007\u0010\u00ad\u0001\u001a\u00020\bJ \u0010\u00ad\u0001\u001a\u00020\b2\u0011\u0010¬\u0001\u001a\f\u0018\u00010¯\u0001j\u0005\u0018\u0001`®\u0001¢\u0006\u0003\u0010°\u0001J\u001b\u0010±\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0010¢\u0006\u0003\b²\u0001J\u001e\u0010³\u0001\u001a\u00020\u001a2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u009b\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\u001aH\u0014J\t\u0010´\u0001\u001a\u00020\bH\u0002J1\u0010µ\u0001\u001a\u00020\b2&\u0010¶\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010\u009b\u0001¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(¬\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\t\u0010·\u0001\u001a\u00020\bH\u0002J\t\u0010¸\u0001\u001a\u00020\bH\u0002J\t\u0010¹\u0001\u001a\u00020\bH\u0002J\t\u0010º\u0001\u001a\u00020\bH\u0002J\u0018\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0007\u0010½\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010¾\u0001\u001a\u00020\b2\u0007\u0010½\u0001\u001a\u00020\u0011H\u0002J\u000f\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J\u0018\u0010À\u0001\u001a\u00020\u00112\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J\u0018\u0010Â\u0001\u001a\u00020\b2\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J \u0010Ã\u0001\u001a\u00020\b2\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010Ä\u0001\u001a\u00020\b*\u00020+H\u0002J\r\u0010Å\u0001\u001a\u00020\b*\u00020+H\u0002J\u0016\u0010Æ\u0001\u001a\u00020\b*\u00020+2\u0007\u0010Ç\u0001\u001a\u00020\u001aH\u0002J\u001b\u0010Ï\u0001\u001a\u00020\u001a2\u0007\u0010Ð\u0001\u001a\u00020\u00112\u0007\u0010Ì\u0001\u001a\u00020\u001aH\u0002J\u000f\u0010Ó\u0001\u001a\u00020\u001aH\u0000¢\u0006\u0003\bÔ\u0001J'\u0010Õ\u0001\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010w\u001a\u00020\u0011H\u0002J)\u0010Ö\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J)\u0010Ù\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J2\u0010Ú\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0007\u0010Û\u0001\u001a\u00020\u0011H\u0002J!\u0010Ü\u0001\u001a\u00020\b2\u0007\u0010×\u0001\u001a\u00020\u00112\r\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002J\u0012\u0010Ý\u0001\u001a\u00020\b2\u0007\u0010Þ\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010ß\u0001\u001a\u00020\b2\u0007\u0010Þ\u0001\u001a\u00020\u0011H\u0002J\n\u0010à\u0001\u001a\u00030á\u0001H\u0016J\u0010\u0010â\u0001\u001a\u00030á\u0001H\u0000¢\u0006\u0003\bã\u0001J\u0007\u0010ä\u0001\u001a\u00020\bJJ\u0010å\u0001\u001a#\u0012\u0005\u0012\u00030\u009b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0æ\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u0006H\u0002¢\u0006\u0003\u0010ç\u0001J4\u0010è\u0001\u001a\u00020\b2\b\u0010¬\u0001\u001a\u00030\u009b\u00012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u0000012\b\u0010é\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001JM\u0010ì\u0001\u001a\u001e\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0j*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u00062\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010í\u0001JD\u0010ì\u0001\u001a\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0æ\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u0006H\u0002¢\u0006\u0003\u0010ç\u0001J+\u0010î\u0001\u001a\u00020\b2\b\u0010¬\u0001\u001a\u00030\u009b\u00012\u0006\u0010\"\u001a\u00028\u00002\b\u0010é\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0003\u0010ë\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00068\u0000X\u0081\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\t\u0010\f\u001a\u00020\rX\u0082\u0004R\t\u0010\u000e\u001a\u00020\rX\u0082\u0004R\t\u0010\u000f\u001a\u00020\rX\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\t\u0010\u0018\u001a\u00020\rX\u0082\u0004R\u0014\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001dX\u0082\u0004R\u0015\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001dX\u0082\u0004R\u0015\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001dX\u0082\u0004R,\u0010y\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000z8VX\u0096\u0004¢\u0006\f\u0012\u0004\b{\u0010|\u001a\u0004\b}\u0010~R%\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u0089\u0001\u0010|\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R+\u0010\u008c\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000010\u0088\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u008d\u0001\u0010|\u001a\u0006\b\u008e\u0001\u0010\u008b\u0001R'\u0010\u008f\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0088\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\b\u0090\u0001\u0010|\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001R\u008f\u0001\u0010\u0097\u0001\u001ax\u0012\u0019\u0012\u0017\u0012\u0002\b\u00030\u0081\u0001¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(\u0080\u0001\u0012\u0016\u0012\u0014\u0018\u000109¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(\u0099\u0001\u0012\u0016\u0012\u0014\u0018\u000109¢\u0006\r\b>\u0012\t\b?\u0012\u0005\b\b(\u009a\u0001\u0012 \u0012\u001e\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\b0j\u0018\u00010jj\u0005\u0018\u0001`\u0098\u0001X\u0082\u0004¢\u0006\f\n\u0003\u0010\u009e\u0001\u0012\u0005\b\u009d\u0001\u0010|R\u0012\u0010¡\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u001dX\u0082\u0004R\u001a\u0010¢\u0001\u001a\u0005\u0018\u00010\u009b\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¥\u0001\u001a\u00030\u009b\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00030\u009b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010¤\u0001R\u0012\u0010©\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u001dX\u0082\u0004R\u0016\u0010»\u0001\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010\u001bR\u001d\u0010È\u0001\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÉ\u0001\u0010|\u001a\u0005\bÈ\u0001\u0010\u001bR\u001b\u0010Ê\u0001\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u001d\u0010Ì\u0001\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÍ\u0001\u0010|\u001a\u0005\bÌ\u0001\u0010\u001bR\u001b\u0010Î\u0001\u001a\u00020\u001a*\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ë\u0001R\u001d\u0010Ñ\u0001\u001a\u00020\u001a8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\bÒ\u0001\u0010|\u001a\u0005\bÑ\u0001\u0010\u001b¨\u0006ñ\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "Lkotlin/Function1;", "", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "sendersAndCloseStatus", "Lkotlinx/atomicfu/AtomicLong;", "receivers", "bufferEnd", "sendersCounter", "", "getSendersCounter$kotlinx_coroutines_core", "()J", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "bufferEndCounter", "getBufferEndCounter", "completedExpandBuffersAndPauseFlag", "isRendezvousOrUnlimited", "", "()Z", "sendSegment", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/channels/ChannelSegment;", "receiveSegment", "bufferEndSegment", "send", "element", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSend", "sendOnNoWaiterSuspend", "segment", "index", CmcdHeadersFactory.STREAMING_FORMAT_SS, "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareSenderForSuspension", "Lkotlinx/coroutines/Waiter;", "onClosedSendOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "R", "waiter", "", "onRendezvousOrBuffered", "Lkotlin/Function0;", "onSuspend", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "segm", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "onClosed", "onNoWaiterSuspend", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "shouldSendSuspend", "curSendersAndCloseStatus", "bufferOrRendezvousSend", "curSenders", "shouldSendSuspend$kotlinx_coroutines_core", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "onReceiveEnqueued", "onReceiveDequeued", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOnNoWaiterSuspend", "r", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareReceiverForSuspension", "onClosedReceiveOnNoWaiterSuspend", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "onClosedReceiveCatchingOnNoWaiterSuspend", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "receiveImpl", "onElementRetrieved", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "updateCellReceive", "updateCellReceiveSlow", "tryResumeSender", "expandBuffer", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "incCompletedExpandBufferAttempts", "nAttempts", "waitExpandBufferCompletion", "globalIndex", "waitExpandBufferCompletion$kotlinx_coroutines_core", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "()V", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "registerSelectForSend", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "onClosedSelectOnSend", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "processResultSelectSend", "ignoredParam", "selectResult", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "registerSelectForReceive", "onClosedSelectOnReceive", "processResultSelectReceive", "processResultSelectReceiveOrNull", "processResultSelectReceiveCatching", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "param", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "Lkotlin/jvm/functions/Function3;", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "_closeCause", "closeCause", "getCloseCause", "()Ljava/lang/Throwable;", "sendException", "getSendException", "receiveException", "getReceiveException", "closeHandler", "onClosedIdempotent", "close", "cause", "cancel", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "closeOrCancelImpl", "invokeCloseHandler", "invokeOnClose", "handler", "markClosed", "markCancelled", "markCancellationStarted", "completeCloseOrCancel", "isConflatedDropOldest", "completeClose", "sendersCur", "completeCancel", "closeLinkedList", "markAllEmptyCellsAsClosed", "lastSegment", "removeUnprocessedElements", "cancelSuspendedReceiveRequests", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "isClosedForSend", "isClosedForSend$annotations", "isClosedForSend0", "(J)Z", "isClosedForReceive", "isClosedForReceive$annotations", "isClosedForReceive0", "isClosed", "sendersAndCloseStatusCur", "isEmpty", "isEmpty$annotations", "hasElements", "hasElements$kotlinx_coroutines_core", "isCellNonEmpty", "findSegmentSend", "id", "startFrom", "findSegmentReceive", "findSegmentBufferEnd", "currentBufferEndCounter", "moveSegmentBufferEndToSpecifiedOrLast", "updateSendersCounterIfLower", AppMeasurementSdk.ConditionalUserProperty.VALUE, "updateReceiversCounterIfLower", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "checkSegmentStructureInvariants", "bindCancellationFunResult", "Lkotlin/reflect/KFunction3;", "(Lkotlin/jvm/functions/Function1;)Lkotlin/reflect/KFunction;", "onCancellationChannelResultImplDoNotCall", LogCategory.CONTEXT, "onCancellationChannelResultImplDoNotCall-5_sEAP8", "(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "bindCancellationFun", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/jvm/functions/Function3;", "onCancellationImplDoNotCall", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class setAddressLine3<E> implements fromCursor<E> {
    public final getAnswerMap<E, getShowPopup> IconCompatParcelizer;
    private final int MediaDescriptionCompat;
    private final getModuleData<getDownloadVersion<?>, Object, Object, getModuleData<Throwable, Object, CurrentQuery, getShowPopup>> MediaMetadataCompat;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater MediaBrowserCompatMediaItem = AtomicLongFieldUpdater.newUpdater(setAddressLine3.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater MediaBrowserCompatItemReceiver = AtomicLongFieldUpdater.newUpdater(setAddressLine3.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater write = AtomicLongFieldUpdater.newUpdater(setAddressLine3.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater AudioAttributesImplBaseParcelizer = AtomicLongFieldUpdater.newUpdater(setAddressLine3.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesImplApi26Parcelizer = AtomicReferenceFieldUpdater.newUpdater(setAddressLine3.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesImplApi21Parcelizer = AtomicReferenceFieldUpdater.newUpdater(setAddressLine3.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setAddressLine3.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setAddressLine3.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater MediaBrowserCompatCustomActionResultReceiver = AtomicReferenceFieldUpdater.newUpdater(setAddressLine3.class, Object.class, "closeHandler$volatile");

    static final class IconCompatParcelizer<E> extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        private /* synthetic */ setAddressLine3<E> read;
        int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(setAddressLine3<E> setaddressline3, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
            this.read = setaddressline3;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            Object objWrite = setAddressLine3.write(this.read, this);
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getNameArray.RemoteActionCompatParcelizer(objWrite);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        private /* synthetic */ setAddressLine3<E> AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object RemoteActionCompatParcelizer;
        long read;
        int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(setAddressLine3<E> setaddressline3, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(sampleVideos);
            this.AudioAttributesImplBaseParcelizer = setaddressline3;
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.write |= Integer.MIN_VALUE;
            Object obj2 = setAddressLine3.read(this.AudioAttributesImplBaseParcelizer, this);
            return obj2 == getYear.IconCompatParcelizer() ? obj2 : getNameArray.RemoteActionCompatParcelizer(obj2);
        }
    }

    protected boolean AudioAttributesImplApi26Parcelizer() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setAddressLine3(int i, getAnswerMap<? super E, getShowPopup> getanswermap) {
        this.MediaDescriptionCompat = i;
        this.IconCompatParcelizer = getanswermap;
        if (i >= 0) {
            this.bufferEnd$volatile = User.write(i);
            this.completedExpandBuffersAndPauseFlag$volatile = onCustomAction();
            getUserNameInitials getusernameinitials = new getUserNameInitials(0L, null, this, 3);
            this.sendSegment$volatile = getusernameinitials;
            this.receiveSegment$volatile = getusernameinitials;
            if (onPrepareFromSearch()) {
                getusernameinitials = User.MediaBrowserCompatMediaItem;
                toMagicModuleMetaRepoModel.read(getusernameinitials, "");
            }
            this.bufferEndSegment$volatile = getusernameinitials;
            this.MediaMetadataCompat = getanswermap != 0 ? new getModuleData() { // from class: o.setPincode
                @Override // kotlin.getModuleData
                public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                    return setAddressLine3.write(this.write, (getDownloadVersion) obj, obj3);
                }
            } : null;
            this._closeCause$volatile = User.MediaMetadataCompat;
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid channel capacity: ");
        sb.append(i);
        sb.append(", should be >=0");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final /* synthetic */ Object read(setAddressLine3 setaddressline3, SampleVideos sampleVideos) {
        return setaddressline3.read(null, 0, 0L, sampleVideos);
    }

    public final long MediaBrowserCompatItemReceiver() {
        return MediaBrowserCompatMediaItem.get(this) & 1152921504606846975L;
    }

    private long onRemoveQueueItem() {
        return MediaBrowserCompatItemReceiver.get(this);
    }

    private final long onCustomAction() {
        return write.get(this);
    }

    private final boolean onPrepareFromSearch() {
        long jOnCustomAction = onCustomAction();
        return jOnCustomAction == 0 || jOnCustomAction == Long.MAX_VALUE;
    }

    private static /* synthetic */ <E> Object AudioAttributesCompatParcelizer(setAddressLine3<E> setaddressline3, E e, SampleVideos<? super getShowPopup> sampleVideos) {
        getUserNameInitials<E> getusernameinitials = (getUserNameInitials) onPlayFromSearch().get(setaddressline3);
        while (true) {
            long andIncrement = onPlayFromUri().getAndIncrement(setaddressline3);
            long j = 1152921504606846975L & andIncrement;
            boolean zAudioAttributesImplBaseParcelizer = setaddressline3.AudioAttributesImplBaseParcelizer(andIncrement);
            long j2 = j / ((long) User.RemoteActionCompatParcelizer);
            int i = (int) (j % ((long) User.RemoteActionCompatParcelizer));
            if (getusernameinitials.AudioAttributesCompatParcelizer != j2) {
                getUserNameInitials<E> getusernameinitialsIconCompatParcelizer = setaddressline3.IconCompatParcelizer(j2, getusernameinitials);
                if (getusernameinitialsIconCompatParcelizer != null) {
                    getusernameinitials = getusernameinitialsIconCompatParcelizer;
                } else if (zAudioAttributesImplBaseParcelizer) {
                    Object objAudioAttributesCompatParcelizer = setaddressline3.AudioAttributesCompatParcelizer(e, sampleVideos);
                    if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                        return objAudioAttributesCompatParcelizer;
                    }
                }
            }
            int iIconCompatParcelizer = setaddressline3.IconCompatParcelizer(getusernameinitials, i, e, j, null, zAudioAttributesImplBaseParcelizer);
            if (iIconCompatParcelizer == 0) {
                getusernameinitials.AudioAttributesCompatParcelizer();
                break;
            }
            if (iIconCompatParcelizer == 1) {
                break;
            }
            if (iIconCompatParcelizer != 2) {
                if (iIconCompatParcelizer == 3) {
                    Object objRemoteActionCompatParcelizer = setaddressline3.RemoteActionCompatParcelizer(getusernameinitials, i, e, j, sampleVideos);
                    if (objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer()) {
                        return objRemoteActionCompatParcelizer;
                    }
                } else if (iIconCompatParcelizer == 4) {
                    if (j < setaddressline3.onRemoveQueueItem()) {
                        getusernameinitials.AudioAttributesCompatParcelizer();
                    }
                    Object objAudioAttributesCompatParcelizer2 = setaddressline3.AudioAttributesCompatParcelizer(e, sampleVideos);
                    if (objAudioAttributesCompatParcelizer2 == getYear.IconCompatParcelizer()) {
                        return objAudioAttributesCompatParcelizer2;
                    }
                } else if (iIconCompatParcelizer == 5) {
                    getusernameinitials.AudioAttributesCompatParcelizer();
                }
            } else if (!zAudioAttributesImplBaseParcelizer) {
                getCollegeId.write();
            } else {
                getusernameinitials.MediaBrowserCompatSearchResultReceiver();
                Object objAudioAttributesCompatParcelizer3 = setaddressline3.AudioAttributesCompatParcelizer(e, sampleVideos);
                if (objAudioAttributesCompatParcelizer3 == getYear.IconCompatParcelizer()) {
                    return objAudioAttributesCompatParcelizer3;
                }
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(setVerified setverified, getUserNameInitials<E> getusernameinitials, int i) {
        setverified.write(getusernameinitials, i + User.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(E e, setStateRank<? super getShowPopup> setstaterank) {
        getAnswerMap<E, getShowPopup> getanswermap = this.IconCompatParcelizer;
        if (getanswermap != null) {
            setSelectedUrlIndex.AudioAttributesCompatParcelizer(getanswermap, e, setstaterank.getWrite());
        }
        setStateRank<? super getShowPopup> setstaterank2 = setstaterank;
        Throwable thIconCompatParcelizer = IconCompatParcelizer();
        if (getCollegeId.RemoteActionCompatParcelizer() && (setstaterank2 instanceof getNextQuery)) {
            thIconCompatParcelizer = accessgetVideoConfigurationC0cp.read(thIconCompatParcelizer, (getNextQuery) setstaterank2);
        }
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
        setstaterank2.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(thIconCompatParcelizer)));
    }

    @Override // kotlin.UserConfigSerializer
    public Object read(E e) {
        getUserNameInitials getusernameinitials;
        if (AudioAttributesImplApi26Parcelizer(MediaBrowserCompatMediaItem.get(this))) {
            getNameArray.Companion companion = getNameArray.INSTANCE;
            return getNameArray.Companion.read();
        }
        accessgetVideoConfigurationC2cp accessgetvideoconfigurationc2cp = User.AudioAttributesImplApi21Parcelizer;
        getUserNameInitials getusernameinitials2 = (getUserNameInitials) onPlayFromSearch().get(this);
        while (true) {
            long andIncrement = onPlayFromUri().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(andIncrement);
            long j2 = j / ((long) User.RemoteActionCompatParcelizer);
            int i = (int) (j % ((long) User.RemoteActionCompatParcelizer));
            if (getusernameinitials2.AudioAttributesCompatParcelizer != j2) {
                getUserNameInitials getusernameinitialsIconCompatParcelizer = IconCompatParcelizer(j2, getusernameinitials2);
                if (getusernameinitialsIconCompatParcelizer != null) {
                    getusernameinitials = getusernameinitialsIconCompatParcelizer;
                } else if (zAudioAttributesImplBaseParcelizer) {
                    getNameArray.Companion companion2 = getNameArray.INSTANCE;
                    return getNameArray.Companion.AudioAttributesCompatParcelizer(IconCompatParcelizer());
                }
            } else {
                getusernameinitials = getusernameinitials2;
            }
            int iIconCompatParcelizer = IconCompatParcelizer(getusernameinitials, i, e, j, accessgetvideoconfigurationc2cp, zAudioAttributesImplBaseParcelizer);
            if (iIconCompatParcelizer == 0) {
                getusernameinitials.AudioAttributesCompatParcelizer();
                getNameArray.Companion companion3 = getNameArray.INSTANCE;
                return getNameArray.Companion.read(getShowPopup.INSTANCE);
            }
            if (iIconCompatParcelizer == 1) {
                getNameArray.Companion companion4 = getNameArray.INSTANCE;
                return getNameArray.Companion.read(getShowPopup.INSTANCE);
            }
            if (iIconCompatParcelizer == 2) {
                if (!zAudioAttributesImplBaseParcelizer) {
                    getusernameinitials.MediaBrowserCompatSearchResultReceiver();
                    getNameArray.Companion companion5 = getNameArray.INSTANCE;
                    return getNameArray.Companion.read();
                }
                getusernameinitials.MediaBrowserCompatSearchResultReceiver();
                getNameArray.Companion companion6 = getNameArray.INSTANCE;
                return getNameArray.Companion.AudioAttributesCompatParcelizer(IconCompatParcelizer());
            }
            if (iIconCompatParcelizer == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iIconCompatParcelizer == 4) {
                if (j < onRemoveQueueItem()) {
                    getusernameinitials.AudioAttributesCompatParcelizer();
                }
                getNameArray.Companion companion7 = getNameArray.INSTANCE;
                return getNameArray.Companion.AudioAttributesCompatParcelizer(IconCompatParcelizer());
            }
            if (iIconCompatParcelizer == 5) {
                getusernameinitials.AudioAttributesCompatParcelizer();
            }
            getusernameinitials2 = getusernameinitials;
        }
    }

    static final class write implements setVerified {
        private final /* synthetic */ setStateSolvedCount<Boolean> AudioAttributesCompatParcelizer;
        private final setStateRank<Boolean> read;

        public final setStateRank<Boolean> IconCompatParcelizer() {
            return this.read;
        }

        @Override // kotlin.setVerified
        public final void write(setTotalFramesDropped<?> settotalframesdropped, int i) {
            throw null;
        }
    }

    protected final Object write(E e) {
        getUserNameInitials getusernameinitials;
        accessgetVideoConfigurationC2cp accessgetvideoconfigurationc2cp = User.write;
        getUserNameInitials getusernameinitials2 = (getUserNameInitials) onPlayFromSearch().get(this);
        while (true) {
            long andIncrement = onPlayFromUri().getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(andIncrement);
            long j2 = j / ((long) User.RemoteActionCompatParcelizer);
            int i = (int) (j % ((long) User.RemoteActionCompatParcelizer));
            if (getusernameinitials2.AudioAttributesCompatParcelizer != j2) {
                getUserNameInitials getusernameinitialsIconCompatParcelizer = IconCompatParcelizer(j2, getusernameinitials2);
                if (getusernameinitialsIconCompatParcelizer != null) {
                    getusernameinitials = getusernameinitialsIconCompatParcelizer;
                } else if (zAudioAttributesImplBaseParcelizer) {
                    getNameArray.Companion companion = getNameArray.INSTANCE;
                    return getNameArray.Companion.AudioAttributesCompatParcelizer(IconCompatParcelizer());
                }
            } else {
                getusernameinitials = getusernameinitials2;
            }
            int iIconCompatParcelizer = IconCompatParcelizer(getusernameinitials, i, e, j, accessgetvideoconfigurationc2cp, zAudioAttributesImplBaseParcelizer);
            if (iIconCompatParcelizer == 0) {
                getusernameinitials.AudioAttributesCompatParcelizer();
                getNameArray.Companion companion2 = getNameArray.INSTANCE;
                return getNameArray.Companion.read(getShowPopup.INSTANCE);
            }
            if (iIconCompatParcelizer == 1) {
                getNameArray.Companion companion3 = getNameArray.INSTANCE;
                return getNameArray.Companion.read(getShowPopup.INSTANCE);
            }
            if (iIconCompatParcelizer == 2) {
                if (!zAudioAttributesImplBaseParcelizer) {
                    MediaBrowserCompatMediaItem((getusernameinitials.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer)) + ((long) i));
                    getNameArray.Companion companion4 = getNameArray.INSTANCE;
                    return getNameArray.Companion.read(getShowPopup.INSTANCE);
                }
                getusernameinitials.MediaBrowserCompatSearchResultReceiver();
                getNameArray.Companion companion5 = getNameArray.INSTANCE;
                return getNameArray.Companion.AudioAttributesCompatParcelizer(IconCompatParcelizer());
            }
            if (iIconCompatParcelizer == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iIconCompatParcelizer == 4) {
                if (j < onRemoveQueueItem()) {
                    getusernameinitials.AudioAttributesCompatParcelizer();
                }
                getNameArray.Companion companion6 = getNameArray.INSTANCE;
                return getNameArray.Companion.AudioAttributesCompatParcelizer(IconCompatParcelizer());
            }
            if (iIconCompatParcelizer == 5) {
                getusernameinitials.AudioAttributesCompatParcelizer();
            }
            getusernameinitials2 = getusernameinitials;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int IconCompatParcelizer(getUserNameInitials<E> getusernameinitials, int i, E e, long j, Object obj, boolean z) {
        getusernameinitials.AudioAttributesCompatParcelizer(i, e);
        if (z) {
            return AudioAttributesCompatParcelizer(getusernameinitials, i, e, j, obj, z);
        }
        Object objWrite = getusernameinitials.write(i);
        if (objWrite == null) {
            if (write(j)) {
                if (getusernameinitials.RemoteActionCompatParcelizer(i, null, User.write)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (getusernameinitials.RemoteActionCompatParcelizer(i, null, obj)) {
                    return 2;
                }
            }
        } else if (objWrite instanceof setVerified) {
            getusernameinitials.RemoteActionCompatParcelizer(i);
            if (RemoteActionCompatParcelizer(objWrite, e)) {
                getusernameinitials.write(i, User.AudioAttributesImplBaseParcelizer);
                return 0;
            }
            if (getusernameinitials.RemoteActionCompatParcelizer(i, User.AudioAttributesImplApi26Parcelizer) == User.AudioAttributesImplApi26Parcelizer) {
                return 5;
            }
            getusernameinitials.IconCompatParcelizer(i, true);
            return 5;
        }
        return AudioAttributesCompatParcelizer(getusernameinitials, i, e, j, obj, z);
    }

    private final int AudioAttributesCompatParcelizer(getUserNameInitials<E> getusernameinitials, int i, E e, long j, Object obj, boolean z) {
        while (true) {
            Object objWrite = getusernameinitials.write(i);
            if (objWrite != null) {
                if (objWrite != User.MediaDescriptionCompat) {
                    if (objWrite != User.AudioAttributesImplApi26Parcelizer) {
                        if (objWrite == User.MediaBrowserCompatSearchResultReceiver) {
                            getusernameinitials.RemoteActionCompatParcelizer(i);
                            return 5;
                        }
                        if (objWrite == User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                            getusernameinitials.RemoteActionCompatParcelizer(i);
                            onAddQueueItem();
                            return 4;
                        }
                        getCollegeId.write();
                        getusernameinitials.RemoteActionCompatParcelizer(i);
                        if (objWrite instanceof hasProPlan) {
                            objWrite = ((hasProPlan) objWrite).AudioAttributesCompatParcelizer;
                        }
                        if (RemoteActionCompatParcelizer(objWrite, e)) {
                            getusernameinitials.write(i, User.AudioAttributesImplBaseParcelizer);
                            return 0;
                        }
                        if (getusernameinitials.RemoteActionCompatParcelizer(i, User.AudioAttributesImplApi26Parcelizer) != User.AudioAttributesImplApi26Parcelizer) {
                            getusernameinitials.IconCompatParcelizer(i, true);
                        }
                        return 5;
                    }
                    getusernameinitials.RemoteActionCompatParcelizer(i);
                    return 5;
                }
                if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.write)) {
                    return 1;
                }
            } else if (!write(j) || z) {
                if (z) {
                    if (getusernameinitials.RemoteActionCompatParcelizer(i, null, User.AudioAttributesImplApi21Parcelizer)) {
                        getusernameinitials.IconCompatParcelizer(i, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (getusernameinitials.RemoteActionCompatParcelizer(i, null, obj)) {
                        return 2;
                    }
                }
            } else if (getusernameinitials.RemoteActionCompatParcelizer(i, null, User.write)) {
                return 1;
            }
        }
    }

    private final boolean AudioAttributesImplApi26Parcelizer(long j) {
        if (AudioAttributesImplBaseParcelizer(j)) {
            return false;
        }
        return !write(j & 1152921504606846975L);
    }

    private final boolean write(long j) {
        return j < onCustomAction() || j < onRemoveQueueItem() + ((long) this.MediaDescriptionCompat);
    }

    private final boolean RemoteActionCompatParcelizer(Object obj, E e) {
        if (obj instanceof getDownloadVersion) {
            return ((getDownloadVersion) obj).IconCompatParcelizer(this, e);
        }
        if (obj instanceof setKycStatus) {
            toMagicModuleMetaRepoModel.read(obj, "");
            setStateSolvedCount<getNameArray<? extends E>> setstatesolvedcount = ((setKycStatus) obj).AudioAttributesCompatParcelizer;
            getNameArray.Companion companion = getNameArray.INSTANCE;
            return User.RemoteActionCompatParcelizer(setstatesolvedcount, getNameArray.RemoteActionCompatParcelizer(getNameArray.Companion.read(e)), (getModuleData) (this.IconCompatParcelizer != null ? MediaBrowserCompatSearchResultReceiver() : null));
        }
        if (obj instanceof AudioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.read(obj, "");
            return ((AudioAttributesCompatParcelizer) obj).read(e);
        }
        if (obj instanceof setStateRank) {
            toMagicModuleMetaRepoModel.read(obj, "");
            return User.RemoteActionCompatParcelizer((setStateRank) obj, e, (getModuleData) (this.IconCompatParcelizer != null ? MediaMetadataCompat() : null));
        }
        throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)).toString());
    }

    private static /* synthetic */ <E> Object IconCompatParcelizer(setAddressLine3<E> setaddressline3, SampleVideos<? super E> sampleVideos) throws Throwable {
        getUserNameInitials<E> getusernameinitials = (getUserNameInitials) onFastForward().get(setaddressline3);
        while (!setaddressline3.MediaBrowserCompatCustomActionResultReceiver()) {
            long andIncrement = onPlay().getAndIncrement(setaddressline3);
            long j = andIncrement / ((long) User.RemoteActionCompatParcelizer);
            int i = (int) (andIncrement % ((long) User.RemoteActionCompatParcelizer));
            if (getusernameinitials.AudioAttributesCompatParcelizer != j) {
                getUserNameInitials<E> getusernameinitials2 = setaddressline3.read(j, getusernameinitials);
                if (getusernameinitials2 != null) {
                    getusernameinitials = getusernameinitials2;
                } else {
                    continue;
                }
            }
            Object objIconCompatParcelizer = setaddressline3.IconCompatParcelizer(getusernameinitials, i, andIncrement, null);
            if (objIconCompatParcelizer != User.onCommand) {
                if (objIconCompatParcelizer != User.MediaBrowserCompatItemReceiver) {
                    if (objIconCompatParcelizer == User.handleMediaPlayPauseIfPendingOnHandler) {
                        return setaddressline3.RemoteActionCompatParcelizer(getusernameinitials, i, andIncrement, sampleVideos);
                    }
                    getusernameinitials.AudioAttributesCompatParcelizer();
                    return objIconCompatParcelizer;
                }
                if (andIncrement < setaddressline3.MediaBrowserCompatItemReceiver()) {
                    getusernameinitials.AudioAttributesCompatParcelizer();
                }
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        throw accessgetVideoConfigurationC0cp.AudioAttributesCompatParcelizer(setaddressline3.onPause());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void write(setVerified setverified, getUserNameInitials<E> getusernameinitials, int i) {
        setverified.write(getusernameinitials, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(setStateRank<? super E> setstaterank) {
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
        setstaterank.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(onPause())));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ <E> java.lang.Object write(kotlin.setAddressLine3<E> r13, kotlin.SampleVideos<? super kotlin.getNameArray<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof o.setAddressLine3.IconCompatParcelizer
            if (r0 == 0) goto L14
            r0 = r14
            o.setAddressLine3$IconCompatParcelizer r0 = (o.setAddressLine3.IconCompatParcelizer) r0
            int r1 = r0.write
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.write
            int r14 = r14 + r2
            r0.write = r14
            goto L19
        L14:
            o.setAddressLine3$IconCompatParcelizer r0 = new o.setAddressLine3$IconCompatParcelizer
            r0.<init>(r13, r14)
        L19:
            r6 = r0
            java.lang.Object r14 = r6.RemoteActionCompatParcelizer
            java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
            int r1 = r6.write
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            o.getNameArray r14 = (kotlin.getNameArray) r14
            java.lang.Object r13 = r14.getWrite()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.SdkPayloadData.IconCompatParcelizer(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = read()
            java.lang.Object r14 = r14.get(r13)
            o.getUserNameInitials r14 = (kotlin.getUserNameInitials) r14
        L46:
            boolean r1 = r13.MediaBrowserCompatCustomActionResultReceiver()
            if (r1 == 0) goto L57
            o.getNameArray$read r14 = kotlin.getNameArray.INSTANCE
            java.lang.Throwable r13 = r13.write()
            java.lang.Object r13 = kotlin.getNameArray.Companion.AudioAttributesCompatParcelizer(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = RemoteActionCompatParcelizer()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlin.User.RemoteActionCompatParcelizer
            long r7 = (long) r1
            long r7 = r4 / r7
            int r1 = kotlin.User.RemoteActionCompatParcelizer
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.AudioAttributesCompatParcelizer
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            o.getUserNameInitials r1 = IconCompatParcelizer(r13, r7, r14)
            if (r1 == 0) goto L46
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = IconCompatParcelizer(r7, r8, r9, r10, r12)
            o.accessgetVideoConfigurationC2cp r7 = kotlin.User.MediaMetadataCompat()
            if (r1 == r7) goto Lb4
            o.accessgetVideoConfigurationC2cp r7 = kotlin.User.AudioAttributesCompatParcelizer()
            if (r1 != r7) goto L98
            long r7 = r13.MediaBrowserCompatItemReceiver()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L46
            r14.AudioAttributesCompatParcelizer()
            goto L46
        L98:
            o.accessgetVideoConfigurationC2cp r7 = kotlin.User.onCustomAction()
            if (r1 != r7) goto Laa
            r6.write = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.read(r2, r3, r4, r6)
            if (r13 != r0) goto La9
            return r0
        La9:
            return r13
        Laa:
            r14.AudioAttributesCompatParcelizer()
            o.getNameArray$read r13 = kotlin.getNameArray.INSTANCE
            java.lang.Object r13 = kotlin.getNameArray.Companion.read(r1)
            return r13
        Lb4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAddressLine3.write(o.setAddressLine3, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object read(kotlin.getUserNameInitials<E> r17, int r18, long r19, kotlin.SampleVideos<? super kotlin.getNameArray<? extends E>> r21) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAddressLine3.read(o.getUserNameInitials, int, long, o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(setStateRank<? super getNameArray<? extends E>> setstaterank) {
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
        getNameArray.Companion companion = getNameArray.INSTANCE;
        setstaterank.resumeWith(C0177getRfBanners.read(getNameArray.RemoteActionCompatParcelizer(getNameArray.Companion.AudioAttributesCompatParcelizer(write()))));
    }

    @Override // kotlin.setLastName
    public final Object AudioAttributesImplBaseParcelizer() {
        getUserNameInitials getusernameinitials;
        long j = MediaBrowserCompatItemReceiver.get(this);
        long j2 = MediaBrowserCompatMediaItem.get(this);
        if (MediaBrowserCompatCustomActionResultReceiver(j2)) {
            getNameArray.Companion companion = getNameArray.INSTANCE;
            return getNameArray.Companion.AudioAttributesCompatParcelizer(write());
        }
        if (j < (j2 & 1152921504606846975L)) {
            accessgetVideoConfigurationC2cp accessgetvideoconfigurationc2cp = User.AudioAttributesImplApi26Parcelizer;
            getUserNameInitials getusernameinitials2 = (getUserNameInitials) onFastForward().get(this);
            while (!MediaBrowserCompatCustomActionResultReceiver()) {
                long andIncrement = onPlay().getAndIncrement(this);
                long j3 = andIncrement / ((long) User.RemoteActionCompatParcelizer);
                int i = (int) (andIncrement % ((long) User.RemoteActionCompatParcelizer));
                if (getusernameinitials2.AudioAttributesCompatParcelizer != j3) {
                    getUserNameInitials getusernameinitials3 = read(j3, getusernameinitials2);
                    if (getusernameinitials3 != null) {
                        getusernameinitials = getusernameinitials3;
                    } else {
                        continue;
                    }
                } else {
                    getusernameinitials = getusernameinitials2;
                }
                Object objIconCompatParcelizer = IconCompatParcelizer(getusernameinitials, i, andIncrement, accessgetvideoconfigurationc2cp);
                if (objIconCompatParcelizer != User.onCommand) {
                    if (objIconCompatParcelizer != User.MediaBrowserCompatItemReceiver) {
                        if (objIconCompatParcelizer == User.handleMediaPlayPauseIfPendingOnHandler) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        getusernameinitials.AudioAttributesCompatParcelizer();
                        getNameArray.Companion companion2 = getNameArray.INSTANCE;
                        return getNameArray.Companion.read(objIconCompatParcelizer);
                    }
                    if (andIncrement < MediaBrowserCompatItemReceiver()) {
                        getusernameinitials.AudioAttributesCompatParcelizer();
                    }
                    getusernameinitials2 = getusernameinitials;
                } else {
                    IconCompatParcelizer(andIncrement);
                    getusernameinitials.MediaBrowserCompatSearchResultReceiver();
                    getNameArray.Companion companion3 = getNameArray.INSTANCE;
                    return getNameArray.Companion.read();
                }
            }
            getNameArray.Companion companion4 = getNameArray.INSTANCE;
            return getNameArray.Companion.AudioAttributesCompatParcelizer(write());
        }
        getNameArray.Companion companion5 = getNameArray.INSTANCE;
        return getNameArray.Companion.read();
    }

    private void MediaBrowserCompatMediaItem(long j) {
        VideoSubtitle videoSubtitleAudioAttributesCompatParcelizer;
        getCollegeId.write();
        getUserNameInitials<E> getusernameinitials = (getUserNameInitials) AudioAttributesImplApi21Parcelizer.get(this);
        while (true) {
            long j2 = MediaBrowserCompatItemReceiver.get(this);
            if (j < Math.max(((long) this.MediaDescriptionCompat) + j2, onCustomAction())) {
                return;
            }
            if (MediaBrowserCompatItemReceiver.compareAndSet(this, j2, j2 + 1)) {
                long j3 = j2 / ((long) User.RemoteActionCompatParcelizer);
                int i = (int) (j2 % ((long) User.RemoteActionCompatParcelizer));
                if (getusernameinitials.AudioAttributesCompatParcelizer != j3) {
                    getUserNameInitials<E> getusernameinitials2 = read(j3, getusernameinitials);
                    if (getusernameinitials2 != null) {
                        getusernameinitials = getusernameinitials2;
                    } else {
                        continue;
                    }
                }
                Object objIconCompatParcelizer = IconCompatParcelizer(getusernameinitials, i, j2, null);
                if (objIconCompatParcelizer != User.MediaBrowserCompatItemReceiver) {
                    getusernameinitials.AudioAttributesCompatParcelizer();
                    getAnswerMap<E, getShowPopup> getanswermap = this.IconCompatParcelizer;
                    if (getanswermap != null && (videoSubtitleAudioAttributesCompatParcelizer = setSelectedUrlIndex.AudioAttributesCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) getanswermap, objIconCompatParcelizer, (VideoSubtitle) null)) != null) {
                        throw videoSubtitleAudioAttributesCompatParcelizer;
                    }
                } else if (j2 < MediaBrowserCompatItemReceiver()) {
                    getusernameinitials.AudioAttributesCompatParcelizer();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object IconCompatParcelizer(getUserNameInitials<E> getusernameinitials, int i, long j, Object obj) {
        Object objWrite = getusernameinitials.write(i);
        if (objWrite == null) {
            if (j >= (MediaBrowserCompatMediaItem.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return User.handleMediaPlayPauseIfPendingOnHandler;
                }
                if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, obj)) {
                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    return User.onCommand;
                }
            }
        } else if (objWrite == User.write && getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.AudioAttributesImplBaseParcelizer)) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return getusernameinitials.AudioAttributesCompatParcelizer(i);
        }
        return write(getusernameinitials, i, j, obj);
    }

    private final Object write(getUserNameInitials<E> getusernameinitials, int i, long j, Object obj) {
        while (true) {
            Object objWrite = getusernameinitials.write(i);
            if (objWrite == null || objWrite == User.MediaDescriptionCompat) {
                if (j < (MediaBrowserCompatMediaItem.get(this) & 1152921504606846975L)) {
                    if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaBrowserCompatSearchResultReceiver)) {
                        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        return User.MediaBrowserCompatItemReceiver;
                    }
                } else {
                    if (obj == null) {
                        return User.handleMediaPlayPauseIfPendingOnHandler;
                    }
                    if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, obj)) {
                        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        return User.onCommand;
                    }
                }
            } else if (objWrite == User.write) {
                if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.AudioAttributesImplBaseParcelizer)) {
                    MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                    return getusernameinitials.AudioAttributesCompatParcelizer(i);
                }
            } else {
                if (objWrite != User.AudioAttributesImplApi21Parcelizer && objWrite != User.MediaBrowserCompatSearchResultReceiver) {
                    if (objWrite != User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                        if (objWrite != User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.onCustomAction)) {
                            boolean z = objWrite instanceof hasProPlan;
                            if (z) {
                                objWrite = ((hasProPlan) objWrite).AudioAttributesCompatParcelizer;
                            }
                            if (IconCompatParcelizer(objWrite, getusernameinitials, i)) {
                                getusernameinitials.write(i, User.AudioAttributesImplBaseParcelizer);
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                                return getusernameinitials.AudioAttributesCompatParcelizer(i);
                            }
                            getusernameinitials.write(i, User.AudioAttributesImplApi21Parcelizer);
                            getusernameinitials.IconCompatParcelizer(i, false);
                            if (z) {
                                MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                            }
                            return User.MediaBrowserCompatItemReceiver;
                        }
                    } else {
                        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                        return User.MediaBrowserCompatItemReceiver;
                    }
                }
                return User.MediaBrowserCompatItemReceiver;
            }
        }
    }

    private final boolean IconCompatParcelizer(Object obj, getUserNameInitials<E> getusernameinitials, int i) {
        if (obj instanceof setStateRank) {
            toMagicModuleMetaRepoModel.read(obj, "");
            return User.RemoteActionCompatParcelizer((setStateRank) obj, getShowPopup.INSTANCE, null);
        }
        if (obj instanceof getDownloadVersion) {
            toMagicModuleMetaRepoModel.read(obj, "");
            getLastUpdatedMs getlastupdatedmsRemoteActionCompatParcelizer = ((getDownloadedThemeState) obj).RemoteActionCompatParcelizer(this, getShowPopup.INSTANCE);
            if (getlastupdatedmsRemoteActionCompatParcelizer == getLastUpdatedMs.read) {
                getusernameinitials.RemoteActionCompatParcelizer(i);
            }
            return getlastupdatedmsRemoteActionCompatParcelizer == getLastUpdatedMs.IconCompatParcelizer;
        }
        if (!(obj instanceof write)) {
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)).toString());
        }
        return User.RemoteActionCompatParcelizer(((write) obj).IconCompatParcelizer(), Boolean.TRUE, null);
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (onPrepareFromSearch()) {
            return;
        }
        getUserNameInitials<E> getusernameinitials = (getUserNameInitials) RemoteActionCompatParcelizer.get(this);
        while (true) {
            long andIncrement = write.getAndIncrement(this);
            long j = andIncrement / ((long) User.RemoteActionCompatParcelizer);
            if (MediaBrowserCompatItemReceiver() > andIncrement) {
                if (getusernameinitials.AudioAttributesCompatParcelizer != j) {
                    getUserNameInitials<E> getusernameinitialsWrite = write(j, getusernameinitials, andIncrement);
                    if (getusernameinitialsWrite != null) {
                        getusernameinitials = getusernameinitialsWrite;
                    } else {
                        continue;
                    }
                }
                if (write(getusernameinitials, (int) (andIncrement % ((long) User.RemoteActionCompatParcelizer)), andIncrement)) {
                    read(1L);
                    return;
                }
                read(1L);
            } else {
                if (getusernameinitials.AudioAttributesCompatParcelizer < j && getusernameinitials.RemoteActionCompatParcelizer() != 0) {
                    write(j, getusernameinitials);
                }
                read(1L);
                return;
            }
        }
    }

    private final boolean write(getUserNameInitials<E> getusernameinitials, int i, long j) {
        Object objWrite = getusernameinitials.write(i);
        if ((objWrite instanceof setVerified) && j >= MediaBrowserCompatItemReceiver.get(this) && getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            if (!IconCompatParcelizer(objWrite, getusernameinitials, i)) {
                getusernameinitials.write(i, User.AudioAttributesImplApi21Parcelizer);
                getusernameinitials.IconCompatParcelizer(i, false);
                return false;
            }
            getusernameinitials.write(i, User.write);
            return true;
        }
        return read(getusernameinitials, i, j);
    }

    private final boolean read(getUserNameInitials<E> getusernameinitials, int i, long j) {
        while (true) {
            Object objWrite = getusernameinitials.write(i);
            if (objWrite instanceof setVerified) {
                if (j >= MediaBrowserCompatItemReceiver.get(this)) {
                    if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                        if (!IconCompatParcelizer(objWrite, getusernameinitials, i)) {
                            getusernameinitials.write(i, User.AudioAttributesImplApi21Parcelizer);
                            getusernameinitials.IconCompatParcelizer(i, false);
                            return false;
                        }
                        getusernameinitials.write(i, User.write);
                        return true;
                    }
                } else if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, new hasProPlan((setVerified) objWrite))) {
                    return true;
                }
            } else {
                if (objWrite == User.AudioAttributesImplApi21Parcelizer) {
                    return false;
                }
                if (objWrite == null) {
                    if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaDescriptionCompat)) {
                        return true;
                    }
                } else {
                    if (objWrite == User.write || objWrite == User.MediaBrowserCompatSearchResultReceiver || objWrite == User.AudioAttributesImplBaseParcelizer || objWrite == User.AudioAttributesImplApi26Parcelizer || objWrite == User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                        return true;
                    }
                    if (objWrite != User.onCustomAction) {
                        throw new IllegalStateException("Unexpected cell state: ".concat(String.valueOf(objWrite)).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(long j) {
        if ((AudioAttributesImplBaseParcelizer.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((AudioAttributesImplBaseParcelizer.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void IconCompatParcelizer(long j) {
        long j2;
        long j3;
        if (onPrepareFromSearch()) {
            return;
        }
        while (onCustomAction() <= j) {
        }
        int i = User.MediaBrowserCompatCustomActionResultReceiver;
        for (int i2 = 0; i2 < i; i2++) {
            long jOnCustomAction = onCustomAction();
            if (jOnCustomAction == (AudioAttributesImplBaseParcelizer.get(this) & 4611686018427387903L) && jOnCustomAction == onCustomAction()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = AudioAttributesImplBaseParcelizer;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, User.IconCompatParcelizer(j2 & 4611686018427387903L, true)));
        while (true) {
            long jOnCustomAction2 = onCustomAction();
            long j4 = AudioAttributesImplBaseParcelizer.get(this);
            long j5 = j4 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j4) != 0;
            if (jOnCustomAction2 == j5 && jOnCustomAction2 == onCustomAction()) {
                break;
            } else if (!z) {
                AudioAttributesImplBaseParcelizer.compareAndSet(this, j4, User.IconCompatParcelizer(j5, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = AudioAttributesImplBaseParcelizer;
        do {
            j3 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, User.IconCompatParcelizer(j3 & 4611686018427387903L, false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getModuleData write(final setAddressLine3 setaddressline3, final getDownloadVersion getdownloadversion, final Object obj) {
        return new getModuleData() { // from class: o.State
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj2, Object obj3, Object obj4) {
                return setAddressLine3.RemoteActionCompatParcelizer(obj, setaddressline3, getdownloadversion);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Object obj, setAddressLine3 setaddressline3, getDownloadVersion getdownloadversion) {
        if (obj != User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            setSelectedUrlIndex.AudioAttributesCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) setaddressline3.IconCompatParcelizer, obj, getdownloadversion.getWrite());
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setLastName
    public final getFirstName<E> AudioAttributesImplApi21Parcelizer() {
        return new AudioAttributesCompatParcelizer();
    }

    final class AudioAttributesCompatParcelizer implements getFirstName<E>, setVerified {
        private Object RemoteActionCompatParcelizer = User.RatingCompat;
        private setStateSolvedCount<? super Boolean> read;

        public AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getFirstName
        public final Object AudioAttributesCompatParcelizer(SampleVideos<? super Boolean> sampleVideos) throws Throwable {
            boolean z;
            if (this.RemoteActionCompatParcelizer == User.RatingCompat || this.RemoteActionCompatParcelizer == User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                setAddressLine3<E> setaddressline3 = setAddressLine3.this;
                getUserNameInitials<E> getusernameinitials = (getUserNameInitials) setAddressLine3.onFastForward().get(setaddressline3);
                while (!setaddressline3.MediaBrowserCompatCustomActionResultReceiver()) {
                    long andIncrement = setAddressLine3.onPlay().getAndIncrement(setaddressline3);
                    long j = andIncrement / ((long) User.RemoteActionCompatParcelizer);
                    int i = (int) (andIncrement % ((long) User.RemoteActionCompatParcelizer));
                    if (getusernameinitials.AudioAttributesCompatParcelizer != j) {
                        getUserNameInitials<E> getusernameinitials2 = setaddressline3.read(j, getusernameinitials);
                        if (getusernameinitials2 == null) {
                            continue;
                        } else {
                            getusernameinitials = getusernameinitials2;
                        }
                    }
                    Object objIconCompatParcelizer = setaddressline3.IconCompatParcelizer(getusernameinitials, i, andIncrement, null);
                    if (objIconCompatParcelizer != User.onCommand) {
                        if (objIconCompatParcelizer == User.MediaBrowserCompatItemReceiver) {
                            if (andIncrement < setaddressline3.MediaBrowserCompatItemReceiver()) {
                                getusernameinitials.AudioAttributesCompatParcelizer();
                            }
                        } else {
                            if (objIconCompatParcelizer == User.handleMediaPlayPauseIfPendingOnHandler) {
                                return read(getusernameinitials, i, andIncrement, sampleVideos);
                            }
                            getusernameinitials.AudioAttributesCompatParcelizer();
                            this.RemoteActionCompatParcelizer = objIconCompatParcelizer;
                            z = true;
                        }
                    } else {
                        throw new IllegalStateException("unreachable".toString());
                    }
                }
                z = read();
            } else {
                z = true;
            }
            return QBankStatsResponse.AudioAttributesCompatParcelizer(z);
        }

        private final boolean read() throws Throwable {
            this.RemoteActionCompatParcelizer = User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            Throwable thWrite = setAddressLine3.this.write();
            if (thWrite == null) {
                return false;
            }
            throw accessgetVideoConfigurationC0cp.AudioAttributesCompatParcelizer(thWrite);
        }

        private final Object read(getUserNameInitials<E> getusernameinitials, int i, long j, SampleVideos<? super Boolean> sampleVideos) {
            Boolean boolAudioAttributesCompatParcelizer;
            getAnswerMap<E, getShowPopup> getanswermap;
            setAddressLine3<E> setaddressline3 = setAddressLine3.this;
            setStateSolvedCount setstatesolvedcountIconCompatParcelizer = setStatePercentile.IconCompatParcelizer(getYear.IconCompatParcelizer(sampleVideos));
            try {
                this.read = setstatesolvedcountIconCompatParcelizer;
                Object objIconCompatParcelizer = setaddressline3.IconCompatParcelizer(getusernameinitials, i, j, this);
                if (objIconCompatParcelizer != User.onCommand) {
                    getModuleData getmoduledataIconCompatParcelizer = null;
                    if (objIconCompatParcelizer == User.MediaBrowserCompatItemReceiver) {
                        if (j < setaddressline3.MediaBrowserCompatItemReceiver()) {
                            getusernameinitials.AudioAttributesCompatParcelizer();
                        }
                        getUserNameInitials getusernameinitials2 = (getUserNameInitials) setAddressLine3.onFastForward().get(setaddressline3);
                        while (true) {
                            if (setaddressline3.MediaBrowserCompatCustomActionResultReceiver()) {
                                IconCompatParcelizer();
                                break;
                            }
                            long andIncrement = setAddressLine3.onPlay().getAndIncrement(setaddressline3);
                            long j2 = andIncrement / ((long) User.RemoteActionCompatParcelizer);
                            int i2 = (int) (andIncrement % ((long) User.RemoteActionCompatParcelizer));
                            if (getusernameinitials2.AudioAttributesCompatParcelizer != j2) {
                                getUserNameInitials getusernameinitials3 = setaddressline3.read(j2, getusernameinitials2);
                                if (getusernameinitials3 != null) {
                                    getusernameinitials2 = getusernameinitials3;
                                }
                            }
                            objIconCompatParcelizer = setaddressline3.IconCompatParcelizer(getusernameinitials2, i2, andIncrement, this);
                            if (objIconCompatParcelizer != User.onCommand) {
                                if (objIconCompatParcelizer == User.MediaBrowserCompatItemReceiver) {
                                    if (andIncrement < setaddressline3.MediaBrowserCompatItemReceiver()) {
                                        getusernameinitials2.AudioAttributesCompatParcelizer();
                                    }
                                } else {
                                    if (objIconCompatParcelizer == User.handleMediaPlayPauseIfPendingOnHandler) {
                                        throw new IllegalStateException("unexpected".toString());
                                    }
                                    getusernameinitials2.AudioAttributesCompatParcelizer();
                                    this.RemoteActionCompatParcelizer = objIconCompatParcelizer;
                                    this.read = null;
                                    boolAudioAttributesCompatParcelizer = QBankStatsResponse.AudioAttributesCompatParcelizer(true);
                                    getanswermap = setaddressline3.IconCompatParcelizer;
                                    if (getanswermap != null) {
                                    }
                                }
                            } else {
                                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this;
                                setAddressLine3.write(this, getusernameinitials2, i2);
                                break;
                            }
                        }
                        setstatesolvedcountIconCompatParcelizer.read(boolAudioAttributesCompatParcelizer, getmoduledataIconCompatParcelizer);
                    } else {
                        getusernameinitials.AudioAttributesCompatParcelizer();
                        this.RemoteActionCompatParcelizer = objIconCompatParcelizer;
                        this.read = null;
                        boolAudioAttributesCompatParcelizer = QBankStatsResponse.AudioAttributesCompatParcelizer(true);
                        getanswermap = setaddressline3.IconCompatParcelizer;
                        if (getanswermap != null) {
                            getmoduledataIconCompatParcelizer = setAddressLine3.IconCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) getanswermap, objIconCompatParcelizer);
                        }
                        setstatesolvedcountIconCompatParcelizer.read(boolAudioAttributesCompatParcelizer, getmoduledataIconCompatParcelizer);
                    }
                } else {
                    setAddressLine3.write(this, getusernameinitials, i);
                }
                Object objAudioAttributesCompatParcelizer = setstatesolvedcountIconCompatParcelizer.AudioAttributesCompatParcelizer();
                if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                    getAnsweredMcqCount.write(sampleVideos);
                }
                return objAudioAttributesCompatParcelizer;
            } catch (Throwable th) {
                setstatesolvedcountIconCompatParcelizer.AudioAttributesImplBaseParcelizer();
                throw th;
            }
        }

        @Override // kotlin.setVerified
        public final void write(setTotalFramesDropped<?> settotalframesdropped, int i) {
            setStateSolvedCount<? super Boolean> setstatesolvedcount = this.read;
            if (setstatesolvedcount != null) {
                setstatesolvedcount.write(settotalframesdropped, i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void IconCompatParcelizer() {
            setStateSolvedCount<? super Boolean> setstatesolvedcount = this.read;
            toMagicModuleMetaRepoModel.write(setstatesolvedcount);
            this.read = null;
            this.RemoteActionCompatParcelizer = User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            Throwable thWrite = setAddressLine3.this.write();
            if (thWrite == null) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                setstatesolvedcount.resumeWith(C0177getRfBanners.read(Boolean.FALSE));
                return;
            }
            setStateSolvedCount<? super Boolean> setstatesolvedcount2 = setstatesolvedcount;
            if (getCollegeId.RemoteActionCompatParcelizer() && (setstatesolvedcount2 instanceof getNextQuery)) {
                thWrite = accessgetVideoConfigurationC0cp.read(thWrite, setstatesolvedcount2);
            }
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            setstatesolvedcount2.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(thWrite)));
        }

        @Override // kotlin.getFirstName
        public final E AudioAttributesCompatParcelizer() throws Throwable {
            E e = (E) this.RemoteActionCompatParcelizer;
            if (e != User.RatingCompat) {
                this.RemoteActionCompatParcelizer = User.RatingCompat;
                if (e != User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                    return e;
                }
                throw accessgetVideoConfigurationC0cp.AudioAttributesCompatParcelizer(setAddressLine3.this.onPause());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }

        public final boolean read(E e) {
            setStateSolvedCount<? super Boolean> setstatesolvedcount = this.read;
            toMagicModuleMetaRepoModel.write(setstatesolvedcount);
            this.read = null;
            this.RemoteActionCompatParcelizer = e;
            setStateSolvedCount<? super Boolean> setstatesolvedcount2 = setstatesolvedcount;
            getAnswerMap<E, getShowPopup> getanswermap = setAddressLine3.this.IconCompatParcelizer;
            return User.RemoteActionCompatParcelizer(setstatesolvedcount2, Boolean.TRUE, getanswermap != null ? setAddressLine3.IconCompatParcelizer(getanswermap, e) : null);
        }

        public final void write() {
            setStateSolvedCount<? super Boolean> setstatesolvedcount = this.read;
            toMagicModuleMetaRepoModel.write(setstatesolvedcount);
            this.read = null;
            this.RemoteActionCompatParcelizer = User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            Throwable thWrite = setAddressLine3.this.write();
            if (thWrite == null) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                setstatesolvedcount.resumeWith(C0177getRfBanners.read(Boolean.FALSE));
                return;
            }
            setStateSolvedCount<? super Boolean> setstatesolvedcount2 = setstatesolvedcount;
            if (getCollegeId.RemoteActionCompatParcelizer() && (setstatesolvedcount2 instanceof getNextQuery)) {
                thWrite = accessgetVideoConfigurationC0cp.read(thWrite, setstatesolvedcount2);
            }
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            setstatesolvedcount2.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(thWrite)));
        }
    }

    protected final Throwable write() {
        return (Throwable) AudioAttributesCompatParcelizer.get(this);
    }

    protected final Throwable IconCompatParcelizer() {
        Throwable thWrite = write();
        return thWrite == null ? new isPhoneNumberNull("Channel was closed") : thWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable onPause() {
        Throwable thWrite = write();
        return thWrite == null ? new isShowLegalPopup("Channel was closed") : thWrite;
    }

    @Override // kotlin.UserConfigSerializer
    public final boolean write(Throwable th) {
        return AudioAttributesCompatParcelizer(th, false);
    }

    @Override // kotlin.setLastName
    public final void RemoteActionCompatParcelizer(CancellationException cancellationException) {
        AudioAttributesCompatParcelizer(cancellationException);
    }

    private boolean AudioAttributesCompatParcelizer(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return AudioAttributesCompatParcelizer(th, true);
    }

    private boolean AudioAttributesCompatParcelizer(Throwable th, boolean z) {
        if (z) {
            onSeekTo();
        }
        boolean zIconCompatParcelizer = DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesCompatParcelizer, this, User.MediaMetadataCompat, th);
        if (z) {
            onRemoveQueueItemAt();
        } else {
            onRewind();
        }
        onAddQueueItem();
        if (zIconCompatParcelizer) {
            onPrepareFromMediaId();
        }
        return zIconCompatParcelizer;
    }

    private final void onPrepareFromMediaId() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaBrowserCompatCustomActionResultReceiver;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, obj, obj == null ? User.AudioAttributesCompatParcelizer : User.read));
        if (obj == null) {
            return;
        }
        ((getAnswerMap) obj).invoke(write());
    }

    @Override // kotlin.UserConfigSerializer
    public final void write(getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
        if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver, this, null, getanswermap)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MediaBrowserCompatCustomActionResultReceiver;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != User.AudioAttributesCompatParcelizer) {
                if (obj != User.read) {
                    throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)).toString());
                }
                throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver, this, User.AudioAttributesCompatParcelizer, User.read));
        getanswermap.invoke(write());
    }

    private final void onRewind() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = MediaBrowserCompatMediaItem;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                j2 = User.read(j & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                j2 = User.read(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
    }

    private final void onRemoveQueueItemAt() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = MediaBrowserCompatMediaItem;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, User.read(1152921504606846975L & j, 3)));
    }

    private final void onSeekTo() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = MediaBrowserCompatMediaItem;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, User.read(1152921504606846975L & j, 1)));
    }

    private final void onAddQueueItem() {
        AudioAttributesCompatParcelizer();
    }

    private final getUserNameInitials<E> RemoteActionCompatParcelizer(long j) {
        getUserNameInitials<E> getusernameinitialsMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (AudioAttributesImplApi26Parcelizer()) {
            long jWrite = write((getUserNameInitials) getusernameinitialsMediaBrowserCompatMediaItem);
            if (jWrite != -1) {
                MediaBrowserCompatMediaItem(jWrite);
            }
        }
        RemoteActionCompatParcelizer(getusernameinitialsMediaBrowserCompatMediaItem, j);
        return getusernameinitialsMediaBrowserCompatMediaItem;
    }

    private final void AudioAttributesCompatParcelizer(long j) {
        RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(j));
    }

    private final getUserNameInitials<E> MediaBrowserCompatMediaItem() {
        Object obj = RemoteActionCompatParcelizer.get(this);
        getUserNameInitials getusernameinitials = (getUserNameInitials) AudioAttributesImplApi26Parcelizer.get(this);
        if (getusernameinitials.AudioAttributesCompatParcelizer > ((getUserNameInitials) obj).AudioAttributesCompatParcelizer) {
            obj = getusernameinitials;
        }
        getUserNameInitials getusernameinitials2 = (getUserNameInitials) AudioAttributesImplApi21Parcelizer.get(this);
        if (getusernameinitials2.AudioAttributesCompatParcelizer > ((getUserNameInitials) obj).AudioAttributesCompatParcelizer) {
            obj = getusernameinitials2;
        }
        return (getUserNameInitials) VideoAnalyticInterimSession.RemoteActionCompatParcelizer((getLicensingResponseTimestampMs) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r8 = (kotlin.getUserNameInitials) r8.IconCompatParcelizer();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long write(kotlin.getUserNameInitials<E> r8) {
        /*
            r7 = this;
        L0:
            int r0 = kotlin.User.RemoteActionCompatParcelizer
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            if (r0 < 0) goto L3a
            long r3 = r8.AudioAttributesCompatParcelizer
            int r5 = kotlin.User.RemoteActionCompatParcelizer
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.onRemoveQueueItem()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L19
            return r1
        L19:
            java.lang.Object r1 = r8.write(r0)
            if (r1 == 0) goto L2a
            o.accessgetVideoConfigurationC2cp r2 = kotlin.User.MediaBrowserCompatCustomActionResultReceiver()
            if (r1 == r2) goto L2a
            o.accessgetVideoConfigurationC2cp r2 = kotlin.User.write
            if (r1 != r2) goto L37
            return r3
        L2a:
            o.accessgetVideoConfigurationC2cp r2 = kotlin.User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            boolean r1 = r8.RemoteActionCompatParcelizer(r0, r1, r2)
            if (r1 == 0) goto L19
            r8.MediaBrowserCompatSearchResultReceiver()
        L37:
            int r0 = r0 + (-1)
            goto L4
        L3a:
            o.getLicensingResponseTimestampMs r8 = r8.IconCompatParcelizer()
            o.getUserNameInitials r8 = (kotlin.getUserNameInitials) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAddressLine3.write(o.getUserNameInitials):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        r10 = (kotlin.getUserNameInitials) r10.IconCompatParcelizer();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(kotlin.getUserNameInitials<E> r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAddressLine3.RemoteActionCompatParcelizer(o.getUserNameInitials):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void RemoteActionCompatParcelizer(getUserNameInitials<E> getusernameinitials, long j) {
        Object objRemoteActionCompatParcelizer = setPbConfig.RemoteActionCompatParcelizer(null);
        loop0: while (getusernameinitials != null) {
            for (int i = User.RemoteActionCompatParcelizer - 1; i >= 0; i--) {
                if ((getusernameinitials.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer)) + ((long) i) < j) {
                    break loop0;
                }
                while (true) {
                    Object objWrite = getusernameinitials.write(i);
                    if (objWrite == null || objWrite == User.MediaDescriptionCompat) {
                        if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
                            getusernameinitials.MediaBrowserCompatSearchResultReceiver();
                            break;
                        }
                    } else if (objWrite instanceof hasProPlan) {
                        if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
                            objRemoteActionCompatParcelizer = setPbConfig.read(objRemoteActionCompatParcelizer, ((hasProPlan) objWrite).AudioAttributesCompatParcelizer);
                            getusernameinitials.IconCompatParcelizer(i, true);
                            break;
                        }
                    } else {
                        if (!(objWrite instanceof setVerified)) {
                            break;
                        }
                        if (getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
                            objRemoteActionCompatParcelizer = setPbConfig.read(objRemoteActionCompatParcelizer, objWrite);
                            getusernameinitials.IconCompatParcelizer(i, true);
                            break;
                        }
                    }
                }
            }
            getusernameinitials = (getUserNameInitials) getusernameinitials.IconCompatParcelizer();
        }
        if (objRemoteActionCompatParcelizer != null) {
            if (!(objRemoteActionCompatParcelizer instanceof ArrayList)) {
                read((setVerified) objRemoteActionCompatParcelizer);
                return;
            }
            toMagicModuleMetaRepoModel.read(objRemoteActionCompatParcelizer, "");
            ArrayList arrayList = (ArrayList) objRemoteActionCompatParcelizer;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                read((setVerified) arrayList.get(size));
            }
        }
    }

    private final void read(setVerified setverified) {
        AudioAttributesCompatParcelizer(setverified, true);
    }

    private final void AudioAttributesCompatParcelizer(setVerified setverified) {
        AudioAttributesCompatParcelizer(setverified, false);
    }

    private final void AudioAttributesCompatParcelizer(setVerified setverified, boolean z) {
        if (setverified instanceof write) {
            setStateRank<Boolean> setstaterankIconCompatParcelizer = ((write) setverified).IconCompatParcelizer();
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterankIconCompatParcelizer.resumeWith(C0177getRfBanners.read(Boolean.FALSE));
            return;
        }
        if (setverified instanceof setStateRank) {
            SampleVideos sampleVideos = (SampleVideos) setverified;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            sampleVideos.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(z ? onPause() : IconCompatParcelizer())));
        } else {
            if (setverified instanceof setKycStatus) {
                setStateSolvedCount<getNameArray<? extends E>> setstatesolvedcount = ((setKycStatus) setverified).AudioAttributesCompatParcelizer;
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
                getNameArray.Companion companion = getNameArray.INSTANCE;
                setstatesolvedcount.resumeWith(C0177getRfBanners.read(getNameArray.RemoteActionCompatParcelizer(getNameArray.Companion.AudioAttributesCompatParcelizer(write()))));
                return;
            }
            if (setverified instanceof AudioAttributesCompatParcelizer) {
                ((AudioAttributesCompatParcelizer) setverified).write();
            } else {
                if (!(setverified instanceof getDownloadVersion)) {
                    throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(setverified)).toString());
                }
                ((getDownloadVersion) setverified).IconCompatParcelizer(this, User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            }
        }
    }

    @Override // kotlin.UserConfigSerializer
    public final boolean AudioAttributesCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer(MediaBrowserCompatMediaItem.get(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AudioAttributesImplBaseParcelizer(long j) {
        return RemoteActionCompatParcelizer(j, false);
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return MediaBrowserCompatCustomActionResultReceiver(MediaBrowserCompatMediaItem.get(this));
    }

    private final boolean MediaBrowserCompatCustomActionResultReceiver(long j) {
        return RemoteActionCompatParcelizer(j, true);
    }

    private final boolean RemoteActionCompatParcelizer(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            RemoteActionCompatParcelizer(j & 1152921504606846975L);
            return (z && onPrepareFromUri()) ? false : true;
        }
        if (i == 3) {
            AudioAttributesCompatParcelizer(j & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException("unexpected close status: ".concat(String.valueOf(i)).toString());
    }

    private boolean onPrepareFromUri() {
        while (true) {
            getUserNameInitials<E> getusernameinitials = (getUserNameInitials) AudioAttributesImplApi21Parcelizer.get(this);
            long jOnRemoveQueueItem = onRemoveQueueItem();
            if (MediaBrowserCompatItemReceiver() <= jOnRemoveQueueItem) {
                return false;
            }
            long j = jOnRemoveQueueItem / ((long) User.RemoteActionCompatParcelizer);
            if (getusernameinitials.AudioAttributesCompatParcelizer == j || (getusernameinitials = read(j, getusernameinitials)) != null) {
                getusernameinitials.AudioAttributesCompatParcelizer();
                if (AudioAttributesCompatParcelizer(getusernameinitials, (int) (jOnRemoveQueueItem % ((long) User.RemoteActionCompatParcelizer)), jOnRemoveQueueItem)) {
                    return true;
                }
                MediaBrowserCompatItemReceiver.compareAndSet(this, jOnRemoveQueueItem, 1 + jOnRemoveQueueItem);
            } else if (((getUserNameInitials) AudioAttributesImplApi21Parcelizer.get(this)).AudioAttributesCompatParcelizer < j) {
                return false;
            }
        }
    }

    private final boolean AudioAttributesCompatParcelizer(getUserNameInitials<E> getusernameinitials, int i, long j) {
        Object objWrite;
        do {
            objWrite = getusernameinitials.write(i);
            if (objWrite != null && objWrite != User.MediaDescriptionCompat) {
                if (objWrite == User.write) {
                    return true;
                }
                if (objWrite == User.AudioAttributesImplApi21Parcelizer || objWrite == User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || objWrite == User.AudioAttributesImplBaseParcelizer || objWrite == User.MediaBrowserCompatSearchResultReceiver) {
                    return false;
                }
                if (objWrite == User.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    return true;
                }
                return objWrite != User.onCustomAction && j == onRemoveQueueItem();
            }
        } while (!getusernameinitials.RemoteActionCompatParcelizer(i, objWrite, User.MediaBrowserCompatSearchResultReceiver));
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getUserNameInitials<E> IconCompatParcelizer(long j, getUserNameInitials<E> getusernameinitials) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AudioAttributesImplApi26Parcelizer;
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) User.handleMediaPlayPauseIfPendingOnHandler();
        loop0: while (true) {
            obj = VideoAnalyticInterimSession.read(getusernameinitials, j, magicModuleSubmissionRequestBody);
            if (setWidevineMode.IconCompatParcelizer(obj)) {
                break;
            }
            setTotalFramesDropped settotalframesdroppedRemoteActionCompatParcelizer = setWidevineMode.RemoteActionCompatParcelizer(obj);
            while (true) {
                setTotalFramesDropped settotalframesdropped = (setTotalFramesDropped) atomicReferenceFieldUpdater.get(this);
                if (settotalframesdropped.AudioAttributesCompatParcelizer >= settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                    break loop0;
                }
                if (settotalframesdroppedRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, settotalframesdropped, settotalframesdroppedRemoteActionCompatParcelizer)) {
                        if (settotalframesdropped.AudioAttributesImplApi21Parcelizer()) {
                            settotalframesdropped.AudioAttributesImplBaseParcelizer();
                        }
                    } else if (settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                        settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        if (setWidevineMode.IconCompatParcelizer(obj)) {
            onAddQueueItem();
            if (getusernameinitials.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer) < onRemoveQueueItem()) {
                getusernameinitials.AudioAttributesCompatParcelizer();
            }
            return null;
        }
        getUserNameInitials<E> getusernameinitials2 = (getUserNameInitials) setWidevineMode.RemoteActionCompatParcelizer(obj);
        if (getusernameinitials2.AudioAttributesCompatParcelizer > j) {
            MediaBrowserCompatItemReceiver(getusernameinitials2.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer));
            if (getusernameinitials2.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer) < onRemoveQueueItem()) {
                getusernameinitials2.AudioAttributesCompatParcelizer();
            }
            return null;
        }
        getCollegeId.write();
        return getusernameinitials2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getUserNameInitials<E> read(long j, getUserNameInitials<E> getusernameinitials) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AudioAttributesImplApi21Parcelizer;
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) User.handleMediaPlayPauseIfPendingOnHandler();
        loop0: while (true) {
            obj = VideoAnalyticInterimSession.read(getusernameinitials, j, magicModuleSubmissionRequestBody);
            if (setWidevineMode.IconCompatParcelizer(obj)) {
                break;
            }
            setTotalFramesDropped settotalframesdroppedRemoteActionCompatParcelizer = setWidevineMode.RemoteActionCompatParcelizer(obj);
            while (true) {
                setTotalFramesDropped settotalframesdropped = (setTotalFramesDropped) atomicReferenceFieldUpdater.get(this);
                if (settotalframesdropped.AudioAttributesCompatParcelizer >= settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                    break loop0;
                }
                if (settotalframesdroppedRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, settotalframesdropped, settotalframesdroppedRemoteActionCompatParcelizer)) {
                        if (settotalframesdropped.AudioAttributesImplApi21Parcelizer()) {
                            settotalframesdropped.AudioAttributesImplBaseParcelizer();
                        }
                    } else if (settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                        settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        if (setWidevineMode.IconCompatParcelizer(obj)) {
            onAddQueueItem();
            if (getusernameinitials.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer) < MediaBrowserCompatItemReceiver()) {
                getusernameinitials.AudioAttributesCompatParcelizer();
            }
            return null;
        }
        getUserNameInitials<E> getusernameinitials2 = (getUserNameInitials) setWidevineMode.RemoteActionCompatParcelizer(obj);
        if (!onPrepareFromSearch() && j <= onCustomAction() / ((long) User.RemoteActionCompatParcelizer)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = RemoteActionCompatParcelizer;
            while (true) {
                setTotalFramesDropped settotalframesdropped2 = (setTotalFramesDropped) atomicReferenceFieldUpdater2.get(this);
                getUserNameInitials<E> getusernameinitials3 = getusernameinitials2;
                if (settotalframesdropped2.AudioAttributesCompatParcelizer >= getusernameinitials3.AudioAttributesCompatParcelizer || !getusernameinitials3.MediaBrowserCompatMediaItem()) {
                    break;
                }
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater2, this, settotalframesdropped2, getusernameinitials3)) {
                    if (settotalframesdropped2.AudioAttributesImplApi21Parcelizer()) {
                        settotalframesdropped2.AudioAttributesImplBaseParcelizer();
                    }
                } else if (getusernameinitials3.AudioAttributesImplApi21Parcelizer()) {
                    getusernameinitials3.AudioAttributesImplBaseParcelizer();
                }
            }
        }
        if (getusernameinitials2.AudioAttributesCompatParcelizer > j) {
            AudioAttributesImplApi21Parcelizer(getusernameinitials2.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer));
            if (getusernameinitials2.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer) < MediaBrowserCompatItemReceiver()) {
                getusernameinitials2.AudioAttributesCompatParcelizer();
            }
            return null;
        }
        getCollegeId.write();
        return getusernameinitials2;
    }

    private final getUserNameInitials<E> write(long j, getUserNameInitials<E> getusernameinitials, long j2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RemoteActionCompatParcelizer;
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) User.handleMediaPlayPauseIfPendingOnHandler();
        loop0: while (true) {
            obj = VideoAnalyticInterimSession.read(getusernameinitials, j, magicModuleSubmissionRequestBody);
            if (setWidevineMode.IconCompatParcelizer(obj)) {
                break;
            }
            setTotalFramesDropped settotalframesdroppedRemoteActionCompatParcelizer = setWidevineMode.RemoteActionCompatParcelizer(obj);
            while (true) {
                setTotalFramesDropped settotalframesdropped = (setTotalFramesDropped) atomicReferenceFieldUpdater.get(this);
                if (settotalframesdropped.AudioAttributesCompatParcelizer >= settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                    break loop0;
                }
                if (settotalframesdroppedRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, settotalframesdropped, settotalframesdroppedRemoteActionCompatParcelizer)) {
                        if (settotalframesdropped.AudioAttributesImplApi21Parcelizer()) {
                            settotalframesdropped.AudioAttributesImplBaseParcelizer();
                        }
                    } else if (settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                        settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        if (setWidevineMode.IconCompatParcelizer(obj)) {
            onAddQueueItem();
            write(j, getusernameinitials);
            read(1L);
            return null;
        }
        getUserNameInitials<E> getusernameinitials2 = (getUserNameInitials) setWidevineMode.RemoteActionCompatParcelizer(obj);
        if (getusernameinitials2.AudioAttributesCompatParcelizer <= j) {
            getCollegeId.write();
            return getusernameinitials2;
        }
        if (!write.compareAndSet(this, j2 + 1, ((long) User.RemoteActionCompatParcelizer) * getusernameinitials2.AudioAttributesCompatParcelizer)) {
            read(1L);
        } else {
            read((getusernameinitials2.AudioAttributesCompatParcelizer * ((long) User.RemoteActionCompatParcelizer)) - j2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void write(long r6, kotlin.getUserNameInitials<E> r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.AudioAttributesCompatParcelizer
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L11
            o.getLicensingResponseTimestampMs r0 = r8.RemoteActionCompatParcelizer()
            o.getUserNameInitials r0 = (kotlin.getUserNameInitials) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.MediaBrowserCompatItemReceiver()
            if (r6 == 0) goto L21
            o.getLicensingResponseTimestampMs r6 = r8.RemoteActionCompatParcelizer()
            o.getUserNameInitials r6 = (kotlin.getUserNameInitials) r6
            if (r6 == 0) goto L21
            r8 = r6
            goto L11
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = onCommand()
        L25:
            java.lang.Object r7 = r6.get(r5)
            o.setTotalFramesDropped r7 = (kotlin.setTotalFramesDropped) r7
            long r0 = r7.AudioAttributesCompatParcelizer
            r2 = r8
            o.setTotalFramesDropped r2 = (kotlin.setTotalFramesDropped) r2
            long r3 = r2.AudioAttributesCompatParcelizer
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L37
            return
        L37:
            boolean r0 = r2.MediaBrowserCompatMediaItem()
            if (r0 == 0) goto L11
            boolean r0 = kotlin.DateDeserializersDateBasedDeserializer.IconCompatParcelizer(r6, r5, r7, r2)
            if (r0 == 0) goto L4d
            boolean r5 = r7.AudioAttributesImplApi21Parcelizer()
            if (r5 == 0) goto L4c
            r7.AudioAttributesImplBaseParcelizer()
        L4c:
            return
        L4d:
            boolean r7 = r2.AudioAttributesImplApi21Parcelizer()
            if (r7 == 0) goto L25
            r2.AudioAttributesImplBaseParcelizer()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAddressLine3.write(long, o.getUserNameInitials):void");
    }

    private final void MediaBrowserCompatItemReceiver(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = MediaBrowserCompatMediaItem;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
        } while (!MediaBrowserCompatMediaItem.compareAndSet(this, j2, User.read(j3, (int) (j2 >> 60))));
    }

    private final void AudioAttributesImplApi21Parcelizer(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = MediaBrowserCompatItemReceiver;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!MediaBrowserCompatItemReceiver.compareAndSet(this, j2, j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d0, code lost:
    
        r3 = (kotlin.getUserNameInitials) r3.RemoteActionCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d7, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAddressLine3.toString():java.lang.String");
    }

    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getModuleData<Throwable, getNameArray<? extends E>, CurrentQuery, getShowPopup> {
        private void IconCompatParcelizer(Throwable th, Object obj, CurrentQuery currentQuery) {
            ((setAddressLine3) this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer(obj, currentQuery);
        }

        @Override // kotlin.getModuleData
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(Throwable th, Object obj, CurrentQuery currentQuery) {
            IconCompatParcelizer(th, ((getNameArray) obj).getWrite(), currentQuery);
            return getShowPopup.INSTANCE;
        }

        RemoteActionCompatParcelizer(Object obj) {
            super(3, obj, setAddressLine3.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getErrorMessageId<getShowPopup> MediaBrowserCompatSearchResultReceiver() {
        return new RemoteActionCompatParcelizer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(Object obj, CurrentQuery currentQuery) {
        getAnswerMap<E, getShowPopup> getanswermap = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getanswermap);
        Object objAudioAttributesCompatParcelizer = getNameArray.AudioAttributesCompatParcelizer(obj);
        toMagicModuleMetaRepoModel.write(objAudioAttributesCompatParcelizer);
        setSelectedUrlIndex.AudioAttributesCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) getanswermap, objAudioAttributesCompatParcelizer, currentQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getModuleData<Throwable, Object, CurrentQuery, getShowPopup> IconCompatParcelizer(final getAnswerMap<? super E, getShowPopup> getanswermap, final E e) {
        return new getModuleData() { // from class: o.getIdInt
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return setAddressLine3.read(getanswermap, e, (CurrentQuery) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getAnswerMap getanswermap, Object obj, CurrentQuery currentQuery) {
        setSelectedUrlIndex.AudioAttributesCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) getanswermap, obj, currentQuery);
        return getShowPopup.INSTANCE;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class read extends MagicModuleRepositoryImpl_Factory implements getModuleData<Throwable, E, CurrentQuery, getShowPopup> {
        @Override // kotlin.getModuleData
        public final /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(Throwable th, Object obj, CurrentQuery currentQuery) {
            RemoteActionCompatParcelizer(th, obj, currentQuery);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(Throwable th, E e, CurrentQuery currentQuery) {
            ((setAddressLine3) this.AudioAttributesImplApi26Parcelizer).write(e, currentQuery);
        }

        read(Object obj) {
            super(3, obj, setAddressLine3.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getErrorMessageId<getShowPopup> MediaMetadataCompat() {
        return new read(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(E e, CurrentQuery currentQuery) {
        getAnswerMap<E, getShowPopup> getanswermap = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getanswermap);
        setSelectedUrlIndex.AudioAttributesCompatParcelizer(getanswermap, e, currentQuery);
    }

    private final Object AudioAttributesCompatParcelizer(E e, SampleVideos<? super getShowPopup> sampleVideos) {
        VideoSubtitle videoSubtitleAudioAttributesCompatParcelizer;
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        getAnswerMap<E, getShowPopup> getanswermap = this.IconCompatParcelizer;
        if (getanswermap != null && (videoSubtitleAudioAttributesCompatParcelizer = setSelectedUrlIndex.AudioAttributesCompatParcelizer((getAnswerMap<? super Object, getShowPopup>) getanswermap, e, (VideoSubtitle) null)) != null) {
            VideoSubtitle videoSubtitle = videoSubtitleAudioAttributesCompatParcelizer;
            getPlanName.IconCompatParcelizer(videoSubtitle, IconCompatParcelizer());
            setStateSolvedCount setstatesolvedcount3 = setstatesolvedcount2;
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            if (getCollegeId.RemoteActionCompatParcelizer()) {
                videoSubtitle = accessgetVideoConfigurationC0cp.read(videoSubtitle, setstatesolvedcount3);
            }
            setstatesolvedcount3.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(videoSubtitle)));
        } else {
            setStateSolvedCount setstatesolvedcount4 = setstatesolvedcount2;
            Throwable thIconCompatParcelizer = IconCompatParcelizer();
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            if (getCollegeId.RemoteActionCompatParcelizer()) {
                thIconCompatParcelizer = accessgetVideoConfigurationC0cp.read(thIconCompatParcelizer, setstatesolvedcount4);
            }
            setstatesolvedcount4.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(thIconCompatParcelizer)));
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object RemoteActionCompatParcelizer(kotlin.getUserNameInitials<E> r21, int r22, E r23, long r24, kotlin.SampleVideos<? super kotlin.getShowPopup> r26) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAddressLine3.RemoteActionCompatParcelizer(o.getUserNameInitials, int, java.lang.Object, long, o.SampleVideos):java.lang.Object");
    }

    private final Object RemoteActionCompatParcelizer(getUserNameInitials<E> getusernameinitials, int i, long j, SampleVideos<? super E> sampleVideos) {
        setStateSolvedCount setstatesolvedcountIconCompatParcelizer = setStatePercentile.IconCompatParcelizer(getYear.IconCompatParcelizer(sampleVideos));
        try {
            Object objIconCompatParcelizer = IconCompatParcelizer(getusernameinitials, i, j, setstatesolvedcountIconCompatParcelizer);
            if (objIconCompatParcelizer != User.onCommand) {
                getErrorMessageId geterrormessageidMediaMetadataCompat = null;
                geterrormessageidMediaMetadataCompat = null;
                if (objIconCompatParcelizer == User.MediaBrowserCompatItemReceiver) {
                    if (j < MediaBrowserCompatItemReceiver()) {
                        getusernameinitials.AudioAttributesCompatParcelizer();
                    }
                    getUserNameInitials getusernameinitials2 = (getUserNameInitials) onFastForward().get(this);
                    while (true) {
                        if (MediaBrowserCompatCustomActionResultReceiver()) {
                            RemoteActionCompatParcelizer(setstatesolvedcountIconCompatParcelizer);
                            break;
                        }
                        long andIncrement = onPlay().getAndIncrement(this);
                        long j2 = andIncrement / ((long) User.RemoteActionCompatParcelizer);
                        int i2 = (int) (andIncrement % ((long) User.RemoteActionCompatParcelizer));
                        if (getusernameinitials2.AudioAttributesCompatParcelizer != j2) {
                            getUserNameInitials getusernameinitials3 = read(j2, getusernameinitials2);
                            if (getusernameinitials3 != null) {
                                getusernameinitials2 = getusernameinitials3;
                            } else {
                                continue;
                            }
                        }
                        objIconCompatParcelizer = IconCompatParcelizer(getusernameinitials2, i2, andIncrement, setstatesolvedcountIconCompatParcelizer);
                        if (objIconCompatParcelizer != User.onCommand) {
                            if (objIconCompatParcelizer == User.MediaBrowserCompatItemReceiver) {
                                if (andIncrement < MediaBrowserCompatItemReceiver()) {
                                    getusernameinitials2.AudioAttributesCompatParcelizer();
                                }
                            } else {
                                if (objIconCompatParcelizer == User.handleMediaPlayPauseIfPendingOnHandler) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                getusernameinitials2.AudioAttributesCompatParcelizer();
                                if (this.IconCompatParcelizer != null) {
                                    geterrormessageidMediaMetadataCompat = MediaMetadataCompat();
                                }
                            }
                        } else {
                            setStateSolvedCount setstatesolvedcount = setstatesolvedcountIconCompatParcelizer instanceof setVerified ? setstatesolvedcountIconCompatParcelizer : null;
                            if (setstatesolvedcount != null) {
                                write(setstatesolvedcount, getusernameinitials2, i2);
                            }
                        }
                    }
                } else {
                    getusernameinitials.AudioAttributesCompatParcelizer();
                    if (this.IconCompatParcelizer != null) {
                        geterrormessageidMediaMetadataCompat = MediaMetadataCompat();
                    }
                }
                setstatesolvedcountIconCompatParcelizer.read(objIconCompatParcelizer, (getModuleData) geterrormessageidMediaMetadataCompat);
            } else {
                write(setstatesolvedcountIconCompatParcelizer, getusernameinitials, i);
            }
            Object objAudioAttributesCompatParcelizer = setstatesolvedcountIconCompatParcelizer.AudioAttributesCompatParcelizer();
            if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objAudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            setstatesolvedcountIconCompatParcelizer.AudioAttributesImplBaseParcelizer();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater onFastForward() {
        return AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater onPlay() {
        return MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater onPlayFromSearch() {
        return AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater onPlayFromUri() {
        return MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.setLastName
    public final Object IconCompatParcelizer(SampleVideos<? super E> sampleVideos) {
        return IconCompatParcelizer(this, sampleVideos);
    }

    @Override // kotlin.setLastName
    public final Object write(SampleVideos<? super getNameArray<? extends E>> sampleVideos) {
        return write(this, sampleVideos);
    }

    @Override // kotlin.UserConfigSerializer
    public Object RemoteActionCompatParcelizer(E e, SampleVideos<? super getShowPopup> sampleVideos) {
        return AudioAttributesCompatParcelizer(this, e, sampleVideos);
    }
}
