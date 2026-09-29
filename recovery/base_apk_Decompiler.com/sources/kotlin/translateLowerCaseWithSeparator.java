package kotlin;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin._handleApos;
import kotlin.anyIgnorals;
import kotlin.hasSuperClassStartingWith;
import kotlin.resetWithString;
import kotlin.withSimpleName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005+\u001802'B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u0018\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0018\u001a\u0004\u0018\u00010 2\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0018\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0018\u0010%J/\u0010'\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020)H\u0002¢\u0006\u0004\b\u0018\u0010*J\u001f\u0010+\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020 H\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0018\u001a\u0004\u0018\u00010.*\u00020-H\u0002¢\u0006\u0004\b\u0018\u0010/J\u001f\u0010'\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010,J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u00101J=\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0002¢\u0006\u0004\b'\u00105J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000206H\u0002¢\u0006\u0004\b2\u00107J\u001f\u0010+\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u00108J?\u0010\u0018\u001a\u0002062\u0006\u0010\u0006\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b\u0018\u0010;J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u00101J)\u00100\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b0\u0010=J1\u00100\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020 2\u0006\u0010\u0017\u001a\u0002042\b\u0010\u001c\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b0\u0010>J'\u00100\u001a\u00020@2\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020$2\u0006\u0010\u0017\u001a\u00020?H\u0002¢\u0006\u0004\b0\u0010AJ\u001b\u00102\u001a\u00020@*\u00020$2\u0006\u0010\u0006\u001a\u00020$H\u0002¢\u0006\u0004\b2\u0010BJ#\u0010'\u001a\u0004\u0018\u00010C2\b\u0010\u0006\u001a\u0004\u0018\u00010)2\u0006\u0010\u0015\u001a\u00020@H\u0002¢\u0006\u0004\b'\u0010DJ#\u00102\u001a\u00020G*\u00020?2\u0006\u0010\u0006\u001a\u00020E2\u0006\u0010\u0015\u001a\u00020FH\u0002¢\u0006\u0004\b2\u0010HJ%\u0010\u0018\u001a\u0004\u0018\u00010$*\u00020G2\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020&H\u0002¢\u0006\u0004\b\u0018\u0010IJ\u0015\u0010'\u001a\u0004\u0018\u00010J*\u00020GH\u0002¢\u0006\u0004\b'\u0010KJ%\u0010+\u001a\u0004\u0018\u00010L*\u00020G2\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010MJ'\u00102\u001a\u00020$*\u00020@2\b\b\u0002\u0010\u0006\u001a\u00020&2\b\b\u0002\u0010\u0015\u001a\u00020&H\u0002¢\u0006\u0004\b2\u0010NJ\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020OH\u0000¢\u0006\u0004\b'\u0010PJ\u001f\u00100\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020&H\u0000¢\u0006\u0004\b0\u0010QJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010RJ\u0017\u0010T\u001a\u00020S2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\bT\u0010UJ-\u00100\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010V*\u0002092\b\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010WJ\u000f\u0010X\u001a\u00020\tH\u0000¢\u0006\u0004\bX\u0010\u000bJ\u0010\u00100\u001a\u00020\tH\u0080@¢\u0006\u0004\b0\u0010YJ\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020ZH\u0000¢\u0006\u0004\b'\u0010[J\u0017\u00102\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020ZH\u0002¢\u0006\u0004\b2\u0010[J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020ZH\u0002¢\u0006\u0004\b\u0018\u0010[J\u001f\u0010+\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020Z2\u0006\u0010\u0015\u001a\u00020\\H\u0002¢\u0006\u0004\b+\u0010]J\u000f\u0010^\u001a\u00020\tH\u0002¢\u0006\u0004\b^\u0010\u000bJ\u000f\u0010_\u001a\u00020\tH\u0002¢\u0006\u0004\b_\u0010\u000bJ\u001d\u00100\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b0\u0010`J%\u00100\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020a03H\u0002¢\u0006\u0004\b0\u0010bJ\u0017\u0010+\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020aH\u0002¢\u0006\u0004\b+\u0010cJ)\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b\u0018\u0010dJ\u001f\u00102\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020eH\u0002¢\u0006\u0004\b2\u0010fJ\u0017\u0010+\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010gJ/\u0010'\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010hJ\u0017\u0010^\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0014H\u0002¢\u0006\u0004\b^\u0010RJ/\u00102\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010iJ\u0017\u00100\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b0\u0010jJ\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b'\u0010jJ\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b\u0018\u0010kJ#\u0010+\u001a\u0004\u0018\u00010l2\b\u0010\u0006\u001a\u0004\u0018\u00010)2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010mJ\u001b\u0010+\u001a\u0004\u0018\u0001042\b\u0010\u0006\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010nJ\u0015\u00100\u001a\u0004\u0018\u00010-*\u00020oH\u0002¢\u0006\u0004\b0\u0010pR\u0017\u0010+\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\b0\u0010sR\u0016\u00102\u001a\u00020\u00148\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b2\u0010tR\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00100u8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b0\u0010vR\u0014\u00100\u001a\u00020w8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010xR\u0016\u0010'\u001a\u00020\u00108\u0000@@X\u0081\f¢\u0006\u0006\n\u0004\b\u0018\u0010yR\u001c\u0010\"\u001a\u00020z8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b^\u0010{\"\u0004\b'\u0010|R\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020}\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020}038CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b~\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u00020\u00108AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u001fR\u0015\u0010^\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0081\f¢\u0006\u0007\n\u0005\b\"\u0010\u0084\u0001R\u0017\u0010~\u001a\u00030\u0085\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0083\u0001\u001a\u00070\u0088\u0001R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010_\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010tR\u0017\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010tR\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008d\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010yR\u001f\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001f\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0095\u0001R&\u0010\u009b\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090\u0099\u00010\u0099\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u009a\u0001R'\u0010\u008b\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090\u009c\u00010\u0099\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009a\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010tR\u001b\u0010 \u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001e\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020Z0¡\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¤\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010¥\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010yR\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R'\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8C@\u0002X\u0083\u000e¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010ª\u0001\u001a\u0006\b\u0081\u0001\u0010«\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\\8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R!\u0010±\u0001\u001a\u00030®\u00018\u0001@\u0000X\u0081\f¢\u0006\u000f\n\u0006\b¦\u0001\u0010¯\u0001\u001a\u0005\b2\u0010°\u0001R!\u0010²\u0001\u001a\u00030®\u00018\u0001@\u0000X\u0081\f¢\u0006\u000f\n\u0006\b \u0001\u0010¯\u0001\u001a\u0005\b\u0018\u0010°\u0001R\u001e\u0010¨\u0001\u001a\u0002048\u0001X\u0081D¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010³\u0001\u001a\u0005\b+\u0010´\u0001R\u001e\u0010\u0097\u0001\u001a\u0002048\u0001X\u0081D¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010³\u0001\u001a\u0005\b'\u0010´\u0001R\u0018\u0010\u009e\u0001\u001a\u00030µ\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R \u0010¸\u0001\u001a\t\u0012\u0004\u0012\u00020e0\u0092\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u0095\u0001R\u0019\u0010¢\u0001\u001a\u00020e8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b²\u0001\u0010¹\u0001R\u0018\u0010º\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010yR\u0018\u0010»\u0001\u001a\u00030®\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010¯\u0001R\u001a\u0010\u0090\u0001\u001a\u00020$*\u00020 8CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b'\u0010¼\u0001R\u0017\u0010q\u001a\u00030½\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¾\u0001R\u001d\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020a0¿\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b¸\u0001\u0010\u007fR\"\u0010¶\u0001\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\t0u8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b»\u0001\u0010v"}, d2 = {"Lo/translateLowerCaseWithSeparator;", "Lo/deserializeUsingCustom;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "MediaBrowserCompatMediaItem", "()V", "Landroid/view/View;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "", "onAccessibilityStateChanged", "(Z)V", "onTouchExplorationStateChanged", "", "p1", "Lo/getReferencedType;", "p2", "IconCompatParcelizer", "(ZIJ)Z", "Lo/setExpandedActionViewsExclusive;", "Lo/JsonNodeFeature;", "p3", "(Lo/setExpandedActionViewsExclusive;ZIJ)Z", "MediaMetadataCompat", "()Z", "Lo/hasSuperClassStartingWith;", "(I)Lo/hasSuperClassStartingWith;", "AudioAttributesImplApi21Parcelizer", "()Lo/hasSuperClassStartingWith;", "Landroid/graphics/Rect;", "(Lo/JsonNodeFeature;)Landroid/graphics/Rect;", "", "RemoteActionCompatParcelizer", "(FFFF)Landroid/graphics/Rect;", "Lo/valueInstantiatorInstance;", "(ILo/hasSuperClassStartingWith;Lo/valueInstantiatorInstance;)V", "write", "(Lo/valueInstantiatorInstance;Lo/hasSuperClassStartingWith;)V", "Lo/AbstractDeserializer;", "Landroid/text/SpannableString;", "(Lo/AbstractDeserializer;)Landroid/text/SpannableString;", "AudioAttributesCompatParcelizer", "(I)Z", "read", "", "", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "(II)Landroid/view/accessibility/AccessibilityEvent;", "", "p4", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "Landroid/os/Bundle;", "(IILandroid/os/Bundle;)Z", "(ILo/hasSuperClassStartingWith;Ljava/lang/String;Landroid/os/Bundle;)V", "Lo/findAndAddVirtualProperties;", "Lo/WritableTypeIdInclusion;", "(Lo/valueInstantiatorInstance;Landroid/graphics/Rect;Lo/findAndAddVirtualProperties;)Lo/WritableTypeIdInclusion;", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Lo/WritableTypeIdInclusion;", "Landroid/graphics/RectF;", "(Lo/valueInstantiatorInstance;Lo/WritableTypeIdInclusion;)Landroid/graphics/RectF;", "Lo/calloc;", "Lo/tryToResolveUnresolved;", "Lo/resetWithString;", "(Lo/findAndAddVirtualProperties;JLo/tryToResolveUnresolved;)Lo/resetWithString;", "(Lo/resetWithString;FF)Landroid/graphics/Rect;", "", "(Lo/resetWithString;)[F", "Landroid/graphics/Region;", "(Lo/resetWithString;FF)Landroid/graphics/Region;", "(Lo/WritableTypeIdInclusion;FF)Landroid/graphics/Rect;", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)Z", "(FF)I", "(I)V", "Lo/AccessorNamingStrategyProvider;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Lo/AccessorNamingStrategyProvider;", "T", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "MediaBrowserCompatItemReceiver", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/_assertNotNull;", "(Lo/_assertNotNull;)V", "Lo/setBackgroundDrawable;", "(Lo/_assertNotNull;Lo/setBackgroundDrawable;)V", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "(Lo/setExpandedActionViewsExclusive;)V", "Lo/JsonTypeResolver;", "(ILjava/util/List;)Z", "(Lo/JsonTypeResolver;)V", "(IILjava/lang/String;)V", "Lo/JsonValueInstantiator;", "(Lo/valueInstantiatorInstance;Lo/JsonValueInstantiator;)V", "(I)I", "(Lo/valueInstantiatorInstance;IZZ)Z", "(Lo/valueInstantiatorInstance;IIZ)Z", "(Lo/valueInstantiatorInstance;)I", "(Lo/valueInstantiatorInstance;)Z", "Lo/withSimpleName$MediaBrowserCompatCustomActionResultReceiver;", "(Lo/valueInstantiatorInstance;I)Lo/withSimpleName$MediaBrowserCompatCustomActionResultReceiver;", "(Lo/valueInstantiatorInstance;)Ljava/lang/String;", "Lo/valueInstantiators;", "(Lo/valueInstantiators;)Lo/AbstractDeserializer;", "onSkipToNext", "Landroidx/compose/ui/platform/AndroidComposeView;", "()Landroidx/compose/ui/platform/AndroidComposeView;", "I", "Lkotlin/Function1;", "Lo/getAnswerMap;", "Landroid/view/accessibility/AccessibilityManager;", "Landroid/view/accessibility/AccessibilityManager;", "Z", "", "J", "(J)V", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "MediaDescriptionCompat", "Ljava/util/List;", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RatingCompat", "Ljava/lang/Boolean;", "Landroid/os/Handler;", "onPlay", "Landroid/os/Handler;", "Lo/translateLowerCaseWithSeparator$AudioAttributesCompatParcelizer;", "onPlayFromUri", "Lo/translateLowerCaseWithSeparator$AudioAttributesCompatParcelizer;", "onPlayFromMediaId", "onCustomAction", "Lo/hasSuperClassStartingWith;", "onFastForward", "onCommand", "onSetShuffleMode", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/setProvider;", "Lo/withAdditionalKeyDeserializers;", "onPrepareFromSearch", "Lo/setProvider;", "handleMediaPlayPauseIfPendingOnHandler", "onSeekTo", "onAddQueueItem", "Lo/setSupportButtonTintList;", "Lo/setSupportButtonTintList;", "onMediaButtonEvent", "Lo/AlertDialogLayout;", "onPrepareFromMediaId", "onRemoveQueueItemAt", "Ljava/lang/Integer;", "onPause", "Lo/setCustomView;", "onSetPlaybackSpeed", "Lo/setCustomView;", "Lo/fromCursor;", "Lo/fromCursor;", "onPlayFromSearch", "Lo/translateLowerCaseWithSeparator$IconCompatParcelizer;", "onPrepareFromUri", "Lo/translateLowerCaseWithSeparator$IconCompatParcelizer;", "Lo/setExpandedActionViewsExclusive;", "()Lo/setExpandedActionViewsExclusive;", "onPrepare", "Lo/setBackgroundDrawable;", "Lo/setExpandActivityOverflowButtonContentDescription;", "Lo/setExpandActivityOverflowButtonContentDescription;", "()Lo/setExpandActivityOverflowButtonContentDescription;", "onRemoveQueueItem", "onRewind", "Ljava/lang/String;", "()Ljava/lang/String;", "Lo/getDelegateType;", "onSkipToPrevious", "Lo/getDelegateType;", "onSetRating", "Lo/JsonValueInstantiator;", "onSetCaptioningEnabled", "onSetRepeatMode", "(Lo/hasSuperClassStartingWith;)Landroid/graphics/Rect;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "", "onSkipToQueueItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class translateLowerCaseWithSeparator extends deserializeUsingCustom implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    public Boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String onPrepareFromUri;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private long AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String onSeekTo;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final AccessibilityManager AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private int onFastForward;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private boolean onSetCaptioningEnabled;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private List<? extends AccessibilityServiceInfo> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private setSupportButtonTintList<setSupportButtonTintList<CharSequence>> onMediaButtonEvent;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final fromCursor<getShowPopup> onPlayFromSearch;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private boolean onPlayFromUri;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private setExpandedActionViewsExclusive<JsonNodeFeature> onPrepare;
    private hasSuperClassStartingWith onCustomAction;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private hasSuperClassStartingWith onCommand;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final setExpandActivityOverflowButtonContentDescription onSetRepeatMode;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private setExpandActivityOverflowButtonContentDescription onRewind;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final Handler MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private int MediaMetadataCompat;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private setExpandActivityOverflowButtonContentDescription onRemoveQueueItem;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private AudioAttributesCompatParcelizer RatingCompat;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private setBackgroundDrawable onPrepareFromMediaId;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private setSupportButtonTintList<AlertDialogLayout<CharSequence>> onPlayFromMediaId;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final setProvider<withAdditionalKeyDeserializers> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private IconCompatParcelizer onPrepareFromSearch;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private setProvider<JsonValueInstantiator> onSetRating;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private Integer onPause;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private JsonValueInstantiator onSetPlaybackSpeed;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final setProvider<withAdditionalKeyDeserializers> onAddQueueItem;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private final Runnable onSkipToNext;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private final setCustomView<_assertNotNull> onPlay;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private final List<JsonTypeResolver> onSkipToQueueItem;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private final getAnswerMap<JsonTypeResolver, getShowPopup> onSkipToPrevious;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private final AndroidComposeView write;

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private final getDelegateType onRemoveQueueItemAt;
    public static final int RemoteActionCompatParcelizer = 8;
    private static final setWindowTitle MediaBrowserCompatItemReceiver = ActionBarOverlayLayoutLayoutParams.write(_handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_0, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_1, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_2, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_3, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_4, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_5, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_6, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_7, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_8, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_9, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_10, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_11, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_12, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_13, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_14, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_15, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_16, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_17, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_18, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_19, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_20, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_21, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_22, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_23, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_24, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_25, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_26, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_27, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_28, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_29, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_30, _handleApos.AudioAttributesCompatParcelizer.accessibility_custom_action_31);
    public int read = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public getAnswerMap<? super AccessibilityEvent, Boolean> IconCompatParcelizer = new AnonymousClass3();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesImplApi26Parcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;
        Object write;

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return translateLowerCaseWithSeparator.this.AudioAttributesCompatParcelizer(this);
        }
    }

    public translateLowerCaseWithSeparator(AndroidComposeView androidComposeView) {
        this.write = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        toMagicModuleMetaRepoModel.read(systemService, "");
        this.AudioAttributesCompatParcelizer = (AccessibilityManager) systemService;
        this.AudioAttributesImplApi21Parcelizer = 100L;
        this.MediaDescriptionCompat = new Handler(Looper.getMainLooper());
        this.RatingCompat = new AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = Integer.MIN_VALUE;
        this.MediaMetadataCompat = Integer.MIN_VALUE;
        this.handleMediaPlayPauseIfPendingOnHandler = new setProvider<>(0, 1, null);
        this.onAddQueueItem = new setProvider<>(0, 1, null);
        this.onMediaButtonEvent = new setSupportButtonTintList<>(0, 1, null);
        this.onPlayFromMediaId = new setSupportButtonTintList<>(0, 1, null);
        this.onFastForward = -1;
        this.onPlay = new setCustomView<>(0, 1, null);
        this.onPlayFromSearch = getLastName.read(1, null, 6);
        this.onPlayFromUri = true;
        this.onPrepare = ActionMenuView.RemoteActionCompatParcelizer();
        this.onPrepareFromMediaId = new setBackgroundDrawable(0, 1, null);
        this.onRemoveQueueItem = new setExpandActivityOverflowButtonContentDescription(0, 1, null);
        this.onRewind = new setExpandActivityOverflowButtonContentDescription(0, 1, null);
        this.onPrepareFromUri = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.onSeekTo = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.onRemoveQueueItemAt = new getDelegateType();
        this.onSetRating = ActionMenuView.write();
        this.onSetPlaybackSpeed = new JsonValueInstantiator(androidComposeView.getAddContentView().read(), ActionMenuView.RemoteActionCompatParcelizer());
        this.onSetRepeatMode = setUiOptions.RemoteActionCompatParcelizer();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.onSkipToNext = new Runnable() { // from class: o.PropertyNamingStrategyLowerDotCaseStrategy
            @Override // java.lang.Runnable
            public final void run() {
                translateLowerCaseWithSeparator.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
            }
        };
        this.onSkipToQueueItem = new ArrayList();
        this.onSkipToPrevious = new AnonymousClass4();
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final AndroidComposeView getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: o.translateLowerCaseWithSeparator$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/accessibility/AccessibilityEvent;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<AccessibilityEvent, Boolean> {
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(translateLowerCaseWithSeparator.this.getWrite().getParent().requestSendAccessibilityEvent(translateLowerCaseWithSeparator.this.getWrite(), accessibilityEvent));
        }

        AnonymousClass3() {
            super(1);
        }
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.AudioAttributesImplApi21Parcelizer = j;
    }

    private final void MediaBrowserCompatMediaItem() {
        this.MediaBrowserCompatItemReceiver = null;
    }

    private final List<AccessibilityServiceInfo> MediaDescriptionCompat() {
        List list = this.MediaBrowserCompatItemReceiver;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.AudioAttributesCompatParcelizer.getEnabledAccessibilityServiceList(-1);
        this.MediaBrowserCompatItemReceiver = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (this.RemoteActionCompatParcelizer) {
            return true;
        }
        return this.AudioAttributesCompatParcelizer.isEnabled() && !MediaDescriptionCompat().isEmpty();
    }

    private final boolean RatingCompat() {
        if (this.RemoteActionCompatParcelizer) {
            return true;
        }
        return this.AudioAttributesCompatParcelizer.isEnabled() && this.AudioAttributesCompatParcelizer.isTouchExplorationEnabled();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\r\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/translateLowerCaseWithSeparator$IconCompatParcelizer;", "", "Lo/valueInstantiatorInstance;", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "<init>", "(Lo/valueInstantiatorInstance;IIIIJ)V", "IconCompatParcelizer", "Lo/valueInstantiatorInstance;", "AudioAttributesCompatParcelizer", "()Lo/valueInstantiatorInstance;", "I", "read", "()I", "write", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "J", "AudioAttributesImplBaseParcelizer", "()J", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private final long MediaBrowserCompatItemReceiver;
        private final valueInstantiatorInstance IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        public IconCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, int i, int i2, int i3, int i4, long j) {
            this.IconCompatParcelizer = valueinstantiatorinstance;
            this.AudioAttributesCompatParcelizer = i;
            this.write = i2;
            this.RemoteActionCompatParcelizer = i3;
            this.read = i4;
            this.MediaBrowserCompatItemReceiver = j;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final valueInstantiatorInstance getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final int getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final int getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final long getMediaBrowserCompatItemReceiver() {
            return this.MediaBrowserCompatItemReceiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final setExpandedActionViewsExclusive<JsonNodeFeature> AudioAttributesImplApi26Parcelizer() {
        if (this.onPlayFromUri) {
            this.onPlayFromUri = false;
            this.onPrepare = addModule.write(this.write.getAddContentView(), -1, AnonymousClass2.AudioAttributesCompatParcelizer);
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                PropertyNamingStrategyPropertyNamingStrategyBase.read(this.onPrepare, this.onRemoveQueueItem, this.onRewind, this.write.getContext().getResources());
            }
        }
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: o.translateLowerCaseWithSeparator$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/valueInstantiatorInstance;", "p0", "", "IconCompatParcelizer", "(Lo/valueInstantiatorInstance;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<valueInstantiatorInstance, Boolean> {
        public static final AnonymousClass2 AudioAttributesCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(valueInstantiatorInstance valueinstantiatorinstance) {
            return Boolean.valueOf(typeResolverBuilderInstance.RemoteActionCompatParcelizer(valueinstantiatorinstance));
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setExpandActivityOverflowButtonContentDescription getOnRemoveQueueItem() {
        return this.onRemoveQueueItem;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setExpandActivityOverflowButtonContentDescription getOnRewind() {
        return this.onRewind;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getOnPrepareFromUri() {
        return this.onPrepareFromUri;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getOnSeekTo() {
        return this.onSeekTo;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View p0) {
        if (this.AudioAttributesCompatParcelizer.isEnabled()) {
            MediaBrowserCompatMediaItem();
        }
        this.AudioAttributesCompatParcelizer.addAccessibilityStateChangeListener(this);
        this.AudioAttributesCompatParcelizer.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View p0) {
        this.MediaDescriptionCompat.removeCallbacks(this.onSkipToNext);
        this.AudioAttributesCompatParcelizer.removeAccessibilityStateChangeListener(this);
        this.AudioAttributesCompatParcelizer.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean p0) {
        MediaBrowserCompatMediaItem();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean p0) {
        MediaBrowserCompatMediaItem();
    }

    public final boolean IconCompatParcelizer(boolean p0, int p1, long p2) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), p0, p1, p2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean IconCompatParcelizer(kotlin.setExpandedActionViewsExclusive<kotlin.JsonNodeFeature> r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.IconCompatParcelizer(o.setExpandedActionViewsExclusive, boolean, int, long):boolean");
    }

    private final boolean MediaMetadataCompat() {
        Boolean bool = this.MediaBrowserCompatMediaItem;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(bool, Boolean.TRUE)) {
            return true;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(bool, Boolean.FALSE)) {
            return false;
        }
        return AccessorNamingStrategy.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final hasSuperClassStartingWith IconCompatParcelizer(int p0) {
        hasGetter remoteActionCompatParcelizer;
        anyIgnorals lifecycle;
        AndroidComposeView.IconCompatParcelizer iconCompatParcelizerPlaybackStateCompatCustomAction = this.write.PlaybackStateCompatCustomAction();
        if (((iconCompatParcelizerPlaybackStateCompatCustomAction == null || (remoteActionCompatParcelizer = iconCompatParcelizerPlaybackStateCompatCustomAction.getRemoteActionCompatParcelizer()) == null || (lifecycle = remoteActionCompatParcelizer.getLifecycle()) == null) ? null : lifecycle.getAudioAttributesImplApi26Parcelizer()) == anyIgnorals.write.AudioAttributesCompatParcelizer) {
            return AudioAttributesImplApi21Parcelizer();
        }
        JsonNodeFeature jsonNodeFeatureAudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(p0);
        if (jsonNodeFeatureAudioAttributesCompatParcelizer == null) {
            return AudioAttributesImplApi21Parcelizer();
        }
        valueInstantiatorInstance remoteActionCompatParcelizer2 = jsonNodeFeatureAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(withDeserializerModifier.read(remoteActionCompatParcelizer2.AudioAttributesImplBaseParcelizer(), _this.INSTANCE.onPlayFromMediaId()), Boolean.TRUE);
        if (zRemoteActionCompatParcelizer && !MediaMetadataCompat()) {
            return null;
        }
        hasSuperClassStartingWith hassuperclassstartingwith = hasSuperClassStartingWith.read();
        hassuperclassstartingwith.write(zRemoteActionCompatParcelizer);
        if (p0 == -1) {
            ViewParent parentForAccessibility = this.write.getParentForAccessibility();
            hassuperclassstartingwith.IconCompatParcelizer(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            valueInstantiatorInstance valueinstantiatorinstanceMediaBrowserCompatMediaItem = remoteActionCompatParcelizer2.MediaBrowserCompatMediaItem();
            Integer numValueOf = valueinstantiatorinstanceMediaBrowserCompatMediaItem != null ? Integer.valueOf(valueinstantiatorinstanceMediaBrowserCompatMediaItem.getAudioAttributesImplApi21Parcelizer()) : null;
            if (numValueOf == null) {
                StringBuilder sb = new StringBuilder("semanticsNode ");
                sb.append(p0);
                sb.append(" has null parent");
                reportWrongTokenException.write(sb.toString());
                throw new PlanDetailsCreator();
            }
            int iIntValue = numValueOf.intValue();
            hassuperclassstartingwith.write(this.write, iIntValue != this.write.getAddContentView().read().getAudioAttributesImplApi21Parcelizer() ? iIntValue : -1);
        }
        hassuperclassstartingwith.IconCompatParcelizer(this.write, p0);
        hassuperclassstartingwith.IconCompatParcelizer(IconCompatParcelizer(jsonNodeFeatureAudioAttributesCompatParcelizer));
        IconCompatParcelizer(p0, hassuperclassstartingwith, remoteActionCompatParcelizer2);
        return hassuperclassstartingwith;
    }

    private final hasSuperClassStartingWith AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesCompatParcelizer.isEnabled()) {
            return null;
        }
        return hasSuperClassStartingWith.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect IconCompatParcelizer(JsonNodeFeature p0) {
        appendReferring audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer();
        return RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.getRead(), audioAttributesCompatParcelizer.getWrite(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), audioAttributesCompatParcelizer.getIconCompatParcelizer());
    }

    private final Rect RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3) {
        long j = -1;
        long jRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(p0)) << 32) | (((long) Float.floatToRawIntBits(p1)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
        long j2 = -1;
        long jRemoteActionCompatParcelizer2 = this.write.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((Float.floatToRawIntBits(p2) << 32) | (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & ((long) Float.floatToRawIntBits(p3)))));
        int i = (int) (jRemoteActionCompatParcelizer >> 32);
        int i2 = (int) (jRemoteActionCompatParcelizer2 >> 32);
        int i3 = (int) jRemoteActionCompatParcelizer;
        int i4 = (int) jRemoteActionCompatParcelizer2;
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x063a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void IconCompatParcelizer(int r22, kotlin.hasSuperClassStartingWith r23, kotlin.valueInstantiatorInstance r24) {
        /*
            Method dump skipped, instruction units count: 2611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.IconCompatParcelizer(int, o.hasSuperClassStartingWith, o.valueInstantiatorInstance):void");
    }

    private static final boolean RemoteActionCompatParcelizer(withAdditionalKeyDeserializers withadditionalkeydeserializers) {
        if (withadditionalkeydeserializers.RemoteActionCompatParcelizer().invoke().floatValue() >= withadditionalkeydeserializers.IconCompatParcelizer().invoke().floatValue() || withadditionalkeydeserializers.getIconCompatParcelizer()) {
            return withadditionalkeydeserializers.RemoteActionCompatParcelizer().invoke().floatValue() > BitmapDescriptorFactory.HUE_RED && withadditionalkeydeserializers.getIconCompatParcelizer();
        }
        return true;
    }

    private static final boolean write(withAdditionalKeyDeserializers withadditionalkeydeserializers) {
        if (withadditionalkeydeserializers.RemoteActionCompatParcelizer().invoke().floatValue() <= BitmapDescriptorFactory.HUE_RED || withadditionalkeydeserializers.getIconCompatParcelizer()) {
            return withadditionalkeydeserializers.RemoteActionCompatParcelizer().invoke().floatValue() < withadditionalkeydeserializers.IconCompatParcelizer().invoke().floatValue() && withadditionalkeydeserializers.getIconCompatParcelizer();
        }
        return true;
    }

    private final void write(valueInstantiatorInstance p0, hasSuperClassStartingWith p1) {
        if (p0.getWrite().read(_this.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            p1.AudioAttributesImplApi21Parcelizer(true);
            p1.RemoteActionCompatParcelizer((CharSequence) withDeserializerModifier.read(p0.getWrite(), _this.INSTANCE.MediaBrowserCompatCustomActionResultReceiver()));
        }
    }

    private final SpannableString IconCompatParcelizer(AbstractDeserializer abstractDeserializer) {
        return (SpannableString) AudioAttributesCompatParcelizer(canCreateFromString.write(abstractDeserializer, this.write.AudioAttributesImplApi21Parcelizer(), this.write.MediaDescriptionCompat(), this.onRemoveQueueItemAt), 100000);
    }

    private final void RemoteActionCompatParcelizer(valueInstantiatorInstance p0, hasSuperClassStartingWith p1) {
        AbstractDeserializer abstractDeserializerAudioAttributesImplBaseParcelizer = PropertyNamingStrategyPropertyNamingStrategyBase.AudioAttributesImplBaseParcelizer(p0);
        p1.MediaBrowserCompatItemReceiver(abstractDeserializerAudioAttributesImplBaseParcelizer != null ? IconCompatParcelizer(abstractDeserializerAudioAttributesImplBaseParcelizer) : null);
    }

    private final boolean AudioAttributesCompatParcelizer(int p0) {
        return this.MediaBrowserCompatSearchResultReceiver == p0;
    }

    private final boolean read(int p0) {
        if (!RatingCompat() || AudioAttributesCompatParcelizer(p0)) {
            return false;
        }
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i != Integer.MIN_VALUE) {
            RemoteActionCompatParcelizer$default(this, i, C.DEFAULT_BUFFER_SEGMENT_SIZE, null, null, 12, null);
        }
        this.MediaBrowserCompatSearchResultReceiver = p0;
        this.write.invalidate();
        RemoteActionCompatParcelizer$default(this, p0, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean RemoteActionCompatParcelizer$default(translateLowerCaseWithSeparator translatelowercasewithseparator, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return translatelowercasewithseparator.RemoteActionCompatParcelizer(i, i2, num, (List<String>) list);
    }

    private final boolean RemoteActionCompatParcelizer(int p0, int p1, Integer p2, List<String> p3) {
        if (p0 == Integer.MIN_VALUE || !MediaBrowserCompatCustomActionResultReceiver()) {
            return false;
        }
        AccessibilityEvent accessibilityEventWrite = write(p0, p1);
        if (p2 != null) {
            accessibilityEventWrite.setContentChangeTypes(p2.intValue());
        }
        if (p3 != null) {
            accessibilityEventWrite.setContentDescription(ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer(p3, ",", null, null, 0, null, null, 62, null));
        }
        return read(accessibilityEventWrite);
    }

    private final boolean read(AccessibilityEvent p0) {
        if (!MediaBrowserCompatCustomActionResultReceiver()) {
            return false;
        }
        if (p0.getEventType() == 2048 || p0.getEventType() == 32768) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        }
        try {
            return this.IconCompatParcelizer.invoke(p0).booleanValue();
        } finally {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        }
    }

    private final AccessibilityEvent write(int p0, int p1) {
        JsonNodeFeature jsonNodeFeatureAudioAttributesCompatParcelizer;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(p1);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.write.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.write, p0);
        if (MediaBrowserCompatCustomActionResultReceiver() && (jsonNodeFeatureAudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(p0)) != null) {
            accessibilityEventObtain.setPassword(jsonNodeFeatureAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getWrite().read(_this.INSTANCE.onPrepareFromMediaId()));
            findNameForRegularGetter.IconCompatParcelizer(accessibilityEventObtain, toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(withDeserializerModifier.read(jsonNodeFeatureAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer().getWrite(), _this.INSTANCE.onPlayFromMediaId()), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    private final AccessibilityEvent IconCompatParcelizer(int p0, Integer p1, Integer p2, Integer p3, CharSequence p4) {
        AccessibilityEvent accessibilityEventWrite = write(p0, 8192);
        if (p1 != null) {
            accessibilityEventWrite.setFromIndex(p1.intValue());
        }
        if (p2 != null) {
            accessibilityEventWrite.setToIndex(p2.intValue());
        }
        if (p3 != null) {
            accessibilityEventWrite.setItemCount(p3.intValue());
        }
        if (p4 != null) {
            accessibilityEventWrite.getText().add(p4);
        }
        return accessibilityEventWrite;
    }

    private final boolean RemoteActionCompatParcelizer(int p0) {
        if (!AudioAttributesCompatParcelizer(p0)) {
            return false;
        }
        this.MediaBrowserCompatSearchResultReceiver = Integer.MIN_VALUE;
        this.onCustomAction = null;
        this.write.invalidate();
        RemoteActionCompatParcelizer$default(this, p0, C.DEFAULT_BUFFER_SEGMENT_SIZE, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00fb -> B:63:0x00fc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:63:0x00fc
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean AudioAttributesCompatParcelizer(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 1976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.AudioAttributesCompatParcelizer(int, int, android.os.Bundle):boolean");
    }

    private static final boolean IconCompatParcelizer(withAdditionalKeyDeserializers withadditionalkeydeserializers, float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED || withadditionalkeydeserializers.RemoteActionCompatParcelizer().invoke().floatValue() <= BitmapDescriptorFactory.HUE_RED) {
            return f > BitmapDescriptorFactory.HUE_RED && withadditionalkeydeserializers.RemoteActionCompatParcelizer().invoke().floatValue() < withadditionalkeydeserializers.IconCompatParcelizer().invoke().floatValue();
        }
        return true;
    }

    private static final float RemoteActionCompatParcelizer(float f, float f2) {
        return Math.signum(f) == Math.signum(f2) ? Math.abs(f) < Math.abs(f2) ? f : f2 : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(int p0, hasSuperClassStartingWith p1, String p2, Bundle p3) {
        valueInstantiatorInstance remoteActionCompatParcelizer;
        float[] fArrRemoteActionCompatParcelizer;
        deserializeFromNumber deserializefromnumberAudioAttributesCompatParcelizer;
        JsonNodeFeature jsonNodeFeatureAudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(p0);
        if (jsonNodeFeatureAudioAttributesCompatParcelizer == null || (remoteActionCompatParcelizer = jsonNodeFeatureAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) == null) {
            return;
        }
        String strWrite = write(remoteActionCompatParcelizer);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) this.onPrepareFromUri)) {
            int iIconCompatParcelizer = this.onRemoveQueueItem.IconCompatParcelizer(p0);
            if (iIconCompatParcelizer != -1) {
                p1.MediaBrowserCompatCustomActionResultReceiver().putInt(p2, iIconCompatParcelizer);
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) this.onSeekTo)) {
            int iIconCompatParcelizer2 = this.onRewind.IconCompatParcelizer(p0);
            if (iIconCompatParcelizer2 != -1) {
                p1.MediaBrowserCompatCustomActionResultReceiver().putInt(p2, iIconCompatParcelizer2);
                return;
            }
            return;
        }
        if (remoteActionCompatParcelizer.getWrite().read(withAbstractTypeResolver.INSTANCE.MediaBrowserCompatCustomActionResultReceiver()) && p3 != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i = p3.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i2 = p3.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i2 <= 0 || i < 0) {
                return;
            }
            if (i >= (strWrite != null ? strWrite.length() : Integer.MAX_VALUE) || (deserializefromnumberAudioAttributesCompatParcelizer = NoClass.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.getWrite())) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                if (i4 >= deserializefromnumberAudioAttributesCompatParcelizer.getIconCompatParcelizer().getWrite().length()) {
                    arrayList.add(null);
                } else {
                    arrayList.add(RemoteActionCompatParcelizer(remoteActionCompatParcelizer, deserializefromnumberAudioAttributesCompatParcelizer.write(i4)));
                }
            }
            p1.MediaBrowserCompatCustomActionResultReceiver().putParcelableArray(p2, (Parcelable[]) arrayList.toArray(new RectF[0]));
            return;
        }
        if (remoteActionCompatParcelizer.getWrite().read(_this.INSTANCE.onSetPlaybackSpeed()) && p3 != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) "androidx.compose.ui.semantics.testTag")) {
            String str = (String) withDeserializerModifier.read(remoteActionCompatParcelizer.getWrite(), _this.INSTANCE.onSetPlaybackSpeed());
            if (str != null) {
                p1.MediaBrowserCompatCustomActionResultReceiver().putCharSequence(p2, str);
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) "androidx.compose.ui.semantics.id")) {
            p1.MediaBrowserCompatCustomActionResultReceiver().putInt(p2, remoteActionCompatParcelizer.getAudioAttributesImplApi21Parcelizer());
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) "androidx.compose.ui.semantics.shapeType")) {
            findAndAddVirtualProperties findandaddvirtualproperties = (findAndAddVirtualProperties) withDeserializerModifier.read(remoteActionCompatParcelizer.getWrite(), _this.INSTANCE.onRewind());
            if (findandaddvirtualproperties != null) {
                WritableTypeIdInclusion writableTypeIdInclusionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, RemoteActionCompatParcelizer(p1), findandaddvirtualproperties);
                resetWithString resetwithstring = read(findandaddvirtualproperties, writableTypeIdInclusionAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getOnStop());
                if (resetwithstring instanceof resetWithString.read) {
                    p1.MediaBrowserCompatCustomActionResultReceiver().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    p1.MediaBrowserCompatCustomActionResultReceiver().putParcelable("androidx.compose.ui.semantics.shapeRect", IconCompatParcelizer(resetwithstring, writableTypeIdInclusionAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), writableTypeIdInclusionAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()));
                    return;
                } else if (resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer) {
                    p1.MediaBrowserCompatCustomActionResultReceiver().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    p1.MediaBrowserCompatCustomActionResultReceiver().putParcelable("androidx.compose.ui.semantics.shapeRect", IconCompatParcelizer(resetwithstring, writableTypeIdInclusionAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), writableTypeIdInclusionAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()));
                    p1.MediaBrowserCompatCustomActionResultReceiver().putFloatArray("androidx.compose.ui.semantics.shapeCorners", RemoteActionCompatParcelizer(resetwithstring));
                    return;
                } else {
                    if (resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer) {
                        p1.MediaBrowserCompatCustomActionResultReceiver().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        p1.MediaBrowserCompatCustomActionResultReceiver().putParcelable("androidx.compose.ui.semantics.shapeRegion", write(resetwithstring, writableTypeIdInclusionAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer(), writableTypeIdInclusionAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()));
                        return;
                    }
                    throw new RenewEligibleCreator();
                }
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) "androidx.compose.ui.semantics.shapeRect")) {
            findAndAddVirtualProperties findandaddvirtualproperties2 = (findAndAddVirtualProperties) withDeserializerModifier.read(remoteActionCompatParcelizer.getWrite(), _this.INSTANCE.onRewind());
            if (findandaddvirtualproperties2 != null) {
                WritableTypeIdInclusion writableTypeIdInclusionAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, RemoteActionCompatParcelizer(p1), findandaddvirtualproperties2);
                Rect rectIconCompatParcelizer = IconCompatParcelizer(read(findandaddvirtualproperties2, writableTypeIdInclusionAudioAttributesCompatParcelizer2.MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getOnStop()), writableTypeIdInclusionAudioAttributesCompatParcelizer2.getAudioAttributesCompatParcelizer(), writableTypeIdInclusionAudioAttributesCompatParcelizer2.getRemoteActionCompatParcelizer());
                if (rectIconCompatParcelizer != null) {
                    p1.MediaBrowserCompatCustomActionResultReceiver().putParcelable("androidx.compose.ui.semantics.shapeRect", rectIconCompatParcelizer);
                    return;
                }
                return;
            }
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) "androidx.compose.ui.semantics.shapeCorners")) {
            findAndAddVirtualProperties findandaddvirtualproperties3 = (findAndAddVirtualProperties) withDeserializerModifier.read(remoteActionCompatParcelizer.getWrite(), _this.INSTANCE.onRewind());
            if (findandaddvirtualproperties3 == null || (fArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(read(findandaddvirtualproperties3, AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, RemoteActionCompatParcelizer(p1), findandaddvirtualproperties3).MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getOnStop()))) == null) {
                return;
            }
            p1.MediaBrowserCompatCustomActionResultReceiver().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrRemoteActionCompatParcelizer);
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p2, (Object) "androidx.compose.ui.semantics.shapeRegion")) {
            findAndAddVirtualProperties findandaddvirtualproperties4 = (findAndAddVirtualProperties) withDeserializerModifier.read(remoteActionCompatParcelizer.getWrite(), _this.INSTANCE.onRewind());
            if (findandaddvirtualproperties4 != null) {
                WritableTypeIdInclusion writableTypeIdInclusionAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, RemoteActionCompatParcelizer(p1), findandaddvirtualproperties4);
                Region regionWrite = write(read(findandaddvirtualproperties4, writableTypeIdInclusionAudioAttributesCompatParcelizer3.MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getOnStop()), writableTypeIdInclusionAudioAttributesCompatParcelizer3.getAudioAttributesCompatParcelizer(), writableTypeIdInclusionAudioAttributesCompatParcelizer3.getRemoteActionCompatParcelizer());
                if (regionWrite != null) {
                    p1.MediaBrowserCompatCustomActionResultReceiver().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionWrite);
                    return;
                }
                return;
            }
            return;
        }
        setButtonDrawable<MapperConfig<?>> setbuttondrawable = remoteActionCompatParcelizer.getWrite().read();
        if (setbuttondrawable == null) {
            return;
        }
        Object[] objArr = setbuttondrawable.write;
        long[] jArr = setbuttondrawable.AudioAttributesCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j = jArr[i5];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j) < 128) {
                        MapperConfig mapperConfig = (MapperConfig) objArr[(i5 << 3) + i7];
                        String remoteActionCompatParcelizer2 = mapperConfig.getRemoteActionCompatParcelizer();
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) remoteActionCompatParcelizer2, (Object) p2)) {
                            Object obj = withDeserializerModifier.read(remoteActionCompatParcelizer.getWrite(), mapperConfig);
                            if (obj instanceof Serializable) {
                                p1.MediaBrowserCompatCustomActionResultReceiver().putSerializable(remoteActionCompatParcelizer2, (Serializable) obj);
                            } else {
                                if (!(obj instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                p1.MediaBrowserCompatCustomActionResultReceiver().putParcelable(remoteActionCompatParcelizer2, (Parcelable) obj);
                            }
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    private final Rect RemoteActionCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
        Rect rect = new Rect();
        hassuperclassstartingwith.read(rect);
        return rect;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\t8\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lo/translateLowerCaseWithSeparator$MediaBrowserCompatItemReceiver;", "Lo/getConfigOverride;", "T", "Lo/MapperConfig;", "p0", "p1", "", "write", "(Lo/MapperConfig;Ljava/lang/Object;)V", "", "RemoteActionCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatItemReceiver implements getConfigOverride {

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private boolean AudioAttributesCompatParcelizer;
        final /* synthetic */ findAndAddVirtualProperties write;

        MediaBrowserCompatItemReceiver(findAndAddVirtualProperties findandaddvirtualproperties) {
            this.write = findandaddvirtualproperties;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        @Override // kotlin.getConfigOverride
        public final <T> void write(MapperConfig<T> p0, T p1) {
            if (p1 == this.write) {
                this.AudioAttributesCompatParcelizer = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[LOOP:0: B:5:0x0021->B:39:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095 A[EDGE_INSN: B:52:0x0095->B:40:0x0095 BREAK  A[LOOP:0: B:5:0x0021->B:39:0x0090], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.WritableTypeIdInclusion AudioAttributesCompatParcelizer(kotlin.valueInstantiatorInstance r11, android.graphics.Rect r12, kotlin.findAndAddVirtualProperties r13) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.AudioAttributesCompatParcelizer(o.valueInstantiatorInstance, android.graphics.Rect, o.findAndAddVirtualProperties):o.WritableTypeIdInclusion");
    }

    private final WritableTypeIdInclusion read(Rect rect, Rect rect2) {
        float f = rect.left - rect2.left;
        float f2 = rect.top - rect2.top;
        return new WritableTypeIdInclusion(f, f2, rect.width() + f, rect.height() + f2);
    }

    private final RectF RemoteActionCompatParcelizer(valueInstantiatorInstance p0, WritableTypeIdInclusion p1) {
        if (p0 == null) {
            return null;
        }
        WritableTypeIdInclusion writableTypeIdInclusionRemoteActionCompatParcelizer = p1.RemoteActionCompatParcelizer(p0.MediaMetadataCompat());
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = p0.IconCompatParcelizer();
        WritableTypeIdInclusion writableTypeIdInclusionWrite = writableTypeIdInclusionRemoteActionCompatParcelizer.IconCompatParcelizer(writableTypeIdInclusionIconCompatParcelizer) ? writableTypeIdInclusionRemoteActionCompatParcelizer.write(writableTypeIdInclusionIconCompatParcelizer) : null;
        if (writableTypeIdInclusionWrite == null) {
            return null;
        }
        long j = -1;
        long jRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(writableTypeIdInclusionWrite.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(writableTypeIdInclusionWrite.getAudioAttributesCompatParcelizer())) << 32)));
        long j2 = -1;
        long jRemoteActionCompatParcelizer2 = this.write.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(writableTypeIdInclusionWrite.getIconCompatParcelizer())) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(writableTypeIdInclusionWrite.getWrite())) << 32)));
        int i = (int) (jRemoteActionCompatParcelizer >> 32);
        int i2 = (int) (jRemoteActionCompatParcelizer2 >> 32);
        int i3 = (int) jRemoteActionCompatParcelizer;
        int i4 = (int) jRemoteActionCompatParcelizer2;
        return new RectF(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
    }

    private final resetWithString read(findAndAddVirtualProperties findandaddvirtualproperties, long j, tryToResolveUnresolved trytoresolveunresolved) {
        return findandaddvirtualproperties.write(j, trytoresolveunresolved, this.write.AudioAttributesImplApi21Parcelizer());
    }

    private final Rect IconCompatParcelizer(resetWithString resetwithstring, float f, float f2) {
        if ((resetwithstring instanceof resetWithString.read) || (resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer)) {
            return read(resetwithstring.getRead(), f, f2);
        }
        return null;
    }

    private final float[] RemoteActionCompatParcelizer(resetWithString resetwithstring) {
        if (!(resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer)) {
            return null;
        }
        resetWithString.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (resetWithString.RemoteActionCompatParcelizer) resetwithstring;
        return new float[]{Float.intBitsToFloat((int) (remoteActionCompatParcelizer.getRead().getWrite() >> 32)), Float.intBitsToFloat((int) remoteActionCompatParcelizer.getRead().getWrite()), Float.intBitsToFloat((int) (remoteActionCompatParcelizer.getRead().getMediaBrowserCompatItemReceiver() >> 32)), Float.intBitsToFloat((int) remoteActionCompatParcelizer.getRead().getMediaBrowserCompatItemReceiver()), Float.intBitsToFloat((int) (remoteActionCompatParcelizer.getRead().getMediaBrowserCompatCustomActionResultReceiver() >> 32)), Float.intBitsToFloat((int) remoteActionCompatParcelizer.getRead().getMediaBrowserCompatCustomActionResultReceiver()), Float.intBitsToFloat((int) (remoteActionCompatParcelizer.getRead().getAudioAttributesImplBaseParcelizer() >> 32)), Float.intBitsToFloat((int) remoteActionCompatParcelizer.getRead().getAudioAttributesImplBaseParcelizer())};
    }

    private final Region write(resetWithString resetwithstring, float f, float f2) {
        if (!(resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer)) {
            return null;
        }
        resetWithString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (resetWithString.AudioAttributesCompatParcelizer) resetwithstring;
        Region region = new Region(read$default(this, audioAttributesCompatParcelizer.getRead().write(f, f2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null));
        Region region2 = new Region();
        removeSoftRefsClearedByGc iconCompatParcelizer = audioAttributesCompatParcelizer.getIconCompatParcelizer();
        if (iconCompatParcelizer instanceof getCurrentSegment) {
            Path remoteActionCompatParcelizer = ((getCurrentSegment) iconCompatParcelizer).getRemoteActionCompatParcelizer();
            remoteActionCompatParcelizer.offset(f, f2);
            region2.setPath(remoteActionCompatParcelizer, region);
            return region2;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    static /* synthetic */ Rect read$default(translateLowerCaseWithSeparator translatelowercasewithseparator, WritableTypeIdInclusion writableTypeIdInclusion, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return translatelowercasewithseparator.read(writableTypeIdInclusion, f, f2);
    }

    private final Rect read(WritableTypeIdInclusion writableTypeIdInclusion, float f, float f2) {
        return new Rect((int) (writableTypeIdInclusion.getAudioAttributesCompatParcelizer() + f), (int) (writableTypeIdInclusion.getRemoteActionCompatParcelizer() + f2), (int) (writableTypeIdInclusion.getWrite() + f), (int) (writableTypeIdInclusion.getIconCompatParcelizer() + f2));
    }

    public final boolean RemoteActionCompatParcelizer(MotionEvent p0) {
        if (!RatingCompat()) {
            return false;
        }
        int action = p0.getAction();
        if (action == 7 || action == 9) {
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0.getX(), p0.getY());
            boolean zDispatchGenericMotionEvent = this.write.onSkipToNext().dispatchGenericMotionEvent(p0);
            AudioAttributesImplApi21Parcelizer(iAudioAttributesCompatParcelizer);
            if (iAudioAttributesCompatParcelizer == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.read != Integer.MIN_VALUE) {
            AudioAttributesImplApi21Parcelizer(Integer.MIN_VALUE);
            return true;
        }
        return this.write.onSkipToNext().dispatchGenericMotionEvent(p0);
    }

    public final int AudioAttributesCompatParcelizer(float p0, float p1) {
        int iWrite;
        _configureGenerator.RemoteActionCompatParcelizer$default(this.write, false, 1, null);
        addValueInstantiators addvalueinstantiators = new addValueInstantiators();
        long j = -1;
        _assertNotNull.AudioAttributesCompatParcelizer$default(this.write.getAddMenuProvider(), getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(p1)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(p0)) << 32)), addvalueinstantiators, 0, false, 12, null);
        int iWrite2 = IntermediateLoginResponseBody.write((List) addvalueinstantiators);
        while (true) {
            iWrite = Integer.MIN_VALUE;
            if (iWrite2 < 0) {
                break;
            }
            _assertNotNull _assertnotnullAudioAttributesImplApi26Parcelizer = collectLongDefaults.AudioAttributesImplApi26Parcelizer(addvalueinstantiators.get(iWrite2));
            if (this.write.onSkipToNext().AudioAttributesCompatParcelizer().get(_assertnotnullAudioAttributesImplApi26Parcelizer) != null) {
                return Integer.MIN_VALUE;
            }
            if (_assertnotnullAudioAttributesImplApi26Parcelizer.get_init_lambda2().write(_bind.write(8))) {
                iWrite = write(_assertnotnullAudioAttributesImplApi26Parcelizer.getIconCompatParcelizer());
                valueInstantiatorInstance valueinstantiatorinstanceWrite = virtualPropertyWriterInstance.write(_assertnotnullAudioAttributesImplApi26Parcelizer, false);
                if (addModule.RemoteActionCompatParcelizer(valueinstantiatorinstanceWrite) && !typeResolverBuilderInstance.RemoteActionCompatParcelizer(valueinstantiatorinstanceWrite)) {
                    break;
                }
            }
            iWrite2--;
        }
        return iWrite;
    }

    private final void AudioAttributesImplApi21Parcelizer(int p0) {
        int i = this.read;
        if (i == p0) {
            return;
        }
        this.read = p0;
        RemoteActionCompatParcelizer$default(this, p0, 128, null, null, 12, null);
        RemoteActionCompatParcelizer$default(this, i, 256, null, null, 12, null);
    }

    @Override // kotlin.deserializeUsingCustom
    public final AccessorNamingStrategyProvider getAccessibilityNodeProvider(View p0) {
        return this.RatingCompat;
    }

    private final <T extends CharSequence> T AudioAttributesCompatParcelizer(T p0, int p1) {
        if (p1 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0".toString());
        }
        if (p0 == null || p0.length() == 0 || p0.length() <= p1) {
            return p0;
        }
        int i = p1 - 1;
        if (Character.isHighSurrogate(p0.charAt(i)) && Character.isLowSurrogate(p0.charAt(p1))) {
            p1 = i;
        }
        T t = (T) p0.subSequence(0, p1);
        toMagicModuleMetaRepoModel.read(t, "");
        return t;
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.onPlayFromUri = true;
        if (!MediaBrowserCompatCustomActionResultReceiver() || this.onSetCaptioningEnabled) {
            return;
        }
        this.onSetCaptioningEnabled = true;
        this.MediaDescriptionCompat.post(this.onSkipToNext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        if (kotlin.setCountry.IconCompatParcelizer(r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:13:0x0032, B:22:0x005a, B:25:0x0069, B:27:0x0071, B:29:0x007a, B:31:0x0085, B:32:0x0096, B:34:0x009d, B:35:0x00a6, B:18:0x0047, B:21:0x004e), top: B:44:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c1 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(kotlin.SampleVideos<? super kotlin.getShowPopup> r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.AudioAttributesCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    public final void RemoteActionCompatParcelizer(_assertNotNull p0) {
        this.onPlayFromUri = true;
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            read(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(_assertNotNull p0) {
        if (this.onPlay.add(p0)) {
            this.onPlayFromSearch.read(getShowPopup.INSTANCE);
        }
    }

    private final void IconCompatParcelizer(_assertNotNull p0) {
        if (!p0.AudioAttributesImplApi26Parcelizer() || this.write.onSkipToNext().AudioAttributesCompatParcelizer().containsKey(p0)) {
            return;
        }
        int iconCompatParcelizer = p0.getIconCompatParcelizer();
        withAdditionalKeyDeserializers withadditionalkeydeserializersAudioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        withAdditionalKeyDeserializers withadditionalkeydeserializersAudioAttributesCompatParcelizer2 = this.onAddQueueItem.AudioAttributesCompatParcelizer(iconCompatParcelizer);
        if (withadditionalkeydeserializersAudioAttributesCompatParcelizer == null && withadditionalkeydeserializersAudioAttributesCompatParcelizer2 == null) {
            return;
        }
        AccessibilityEvent accessibilityEventWrite = write(iconCompatParcelizer, 4096);
        if (withadditionalkeydeserializersAudioAttributesCompatParcelizer != null) {
            accessibilityEventWrite.setScrollX((int) withadditionalkeydeserializersAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer().invoke().floatValue());
            accessibilityEventWrite.setMaxScrollX((int) withadditionalkeydeserializersAudioAttributesCompatParcelizer.IconCompatParcelizer().invoke().floatValue());
        }
        if (withadditionalkeydeserializersAudioAttributesCompatParcelizer2 != null) {
            accessibilityEventWrite.setScrollY((int) withadditionalkeydeserializersAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer().invoke().floatValue());
            accessibilityEventWrite.setMaxScrollY((int) withadditionalkeydeserializersAudioAttributesCompatParcelizer2.IconCompatParcelizer().invoke().floatValue());
        }
        read(accessibilityEventWrite);
    }

    private final void write(_assertNotNull p0, setBackgroundDrawable p1) {
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp;
        _assertNotNull _assertnotnullRemoteActionCompatParcelizer;
        if (!p0.AudioAttributesImplApi26Parcelizer() || this.write.onSkipToNext().AudioAttributesCompatParcelizer().containsKey(p0)) {
            return;
        }
        if (!p0.get_init_lambda2().write(_bind.write(8))) {
            p0 = PropertyNamingStrategyPropertyNamingStrategyBase.RemoteActionCompatParcelizer(p0, (getAnswerMap<? super _assertNotNull, Boolean>) AnonymousClass10.read);
        }
        if (p0 == null || (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = p0.accessgetReportFullyDrawnExecutorp()) == null) {
            return;
        }
        if (!c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.getRead() && (_assertnotnullRemoteActionCompatParcelizer = PropertyNamingStrategyPropertyNamingStrategyBase.RemoteActionCompatParcelizer(p0, (getAnswerMap<? super _assertNotNull, Boolean>) AnonymousClass5.IconCompatParcelizer)) != null) {
            p0 = _assertnotnullRemoteActionCompatParcelizer;
        }
        if (p0 != null) {
            int iconCompatParcelizer = p0.getIconCompatParcelizer();
            if (p1.RemoteActionCompatParcelizer(iconCompatParcelizer)) {
                RemoteActionCompatParcelizer$default(this, write(iconCompatParcelizer), 2048, 1, null, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.translateLowerCaseWithSeparator$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_assertNotNull;", "p0", "", "write", "(Lo/_assertNotNull;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements getAnswerMap<_assertNotNull, Boolean> {
        public static final AnonymousClass10 read = new AnonymousClass10();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_assertNotNull _assertnotnull) {
            return Boolean.valueOf(_assertnotnull.get_init_lambda2().write(_bind.write(8)));
        }

        AnonymousClass10() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.translateLowerCaseWithSeparator$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_assertNotNull;", "p0", "", "read", "(Lo/_assertNotNull;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_assertNotNull, Boolean> {
        public static final AnonymousClass5 IconCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(_assertNotNull _assertnotnull) {
            C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = _assertnotnull.accessgetReportFullyDrawnExecutorp();
            boolean z = false;
            if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null && c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.getRead()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        AnonymousClass5() {
            super(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaBrowserCompatSearchResultReceiver() {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.MediaBrowserCompatSearchResultReceiver():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0598  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer(kotlin.setExpandedActionViewsExclusive<kotlin.JsonNodeFeature> r52) {
        /*
            Method dump skipped, instruction units count: 1829
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.AudioAttributesCompatParcelizer(o.setExpandedActionViewsExclusive):void");
    }

    /* JADX INFO: renamed from: o.translateLowerCaseWithSeparator$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/JsonTypeResolver;", "p0", "", "read", "(Lo/JsonTypeResolver;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<JsonTypeResolver, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(JsonTypeResolver jsonTypeResolver) {
            read(jsonTypeResolver);
            return getShowPopup.INSTANCE;
        }

        public final void read(JsonTypeResolver jsonTypeResolver) {
            translateLowerCaseWithSeparator.this.write(jsonTypeResolver);
        }

        AnonymousClass4() {
            super(1);
        }
    }

    private final boolean AudioAttributesCompatParcelizer(int p0, List<JsonTypeResolver> p1) {
        boolean z;
        JsonTypeResolver jsonTypeResolverWrite = NoClass.write(p1, p0);
        if (jsonTypeResolverWrite != null) {
            z = false;
        } else {
            jsonTypeResolverWrite = new JsonTypeResolver(p0, this.onSkipToQueueItem, null, null, null, null);
            z = true;
        }
        this.onSkipToQueueItem.add(jsonTypeResolverWrite);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(JsonTypeResolver p0) {
        if (p0.onRemoveQueueItem()) {
            PropertyMetadata addOnNewIntentListener = this.write.getAddOnNewIntentListener();
            getAnswerMap<JsonTypeResolver, getShowPopup> getanswermap = this.onSkipToPrevious;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(p0, this);
            addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(p0, getanswermap, anonymousClass1);
        }
    }

    /* JADX INFO: renamed from: o.translateLowerCaseWithSeparator$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ JsonTypeResolver $read;
        final /* synthetic */ translateLowerCaseWithSeparator AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            valueInstantiatorInstance remoteActionCompatParcelizer;
            _assertNotNull iconCompatParcelizer;
            withAdditionalKeyDeserializers iconCompatParcelizer2 = this.$read.getIconCompatParcelizer();
            withAdditionalKeyDeserializers audioAttributesImplBaseParcelizer = this.$read.getAudioAttributesImplBaseParcelizer();
            Float write = this.$read.getWrite();
            Float read = this.$read.getRead();
            float fFloatValue = (iconCompatParcelizer2 == null || write == null) ? 0.0f : iconCompatParcelizer2.RemoteActionCompatParcelizer().invoke().floatValue() - write.floatValue();
            float fFloatValue2 = (audioAttributesImplBaseParcelizer == null || read == null) ? 0.0f : audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer().invoke().floatValue() - read.floatValue();
            if (fFloatValue != BitmapDescriptorFactory.HUE_RED || fFloatValue2 != BitmapDescriptorFactory.HUE_RED) {
                int iWrite = this.AudioAttributesCompatParcelizer.write(this.$read.getRemoteActionCompatParcelizer());
                JsonNodeFeature jsonNodeFeature = (JsonNodeFeature) this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver);
                if (jsonNodeFeature != null) {
                    translateLowerCaseWithSeparator translatelowercasewithseparator = this.AudioAttributesCompatParcelizer;
                    try {
                        hasSuperClassStartingWith hassuperclassstartingwith = translatelowercasewithseparator.onCustomAction;
                        if (hassuperclassstartingwith != null) {
                            hassuperclassstartingwith.IconCompatParcelizer(translatelowercasewithseparator.IconCompatParcelizer(jsonNodeFeature));
                            getShowPopup getshowpopup = getShowPopup.INSTANCE;
                        }
                    } catch (IllegalStateException unused) {
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    }
                }
                JsonNodeFeature jsonNodeFeature2 = (JsonNodeFeature) this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.MediaMetadataCompat);
                if (jsonNodeFeature2 != null) {
                    translateLowerCaseWithSeparator translatelowercasewithseparator2 = this.AudioAttributesCompatParcelizer;
                    try {
                        hasSuperClassStartingWith hassuperclassstartingwith2 = translatelowercasewithseparator2.onCommand;
                        if (hassuperclassstartingwith2 != null) {
                            hassuperclassstartingwith2.IconCompatParcelizer(translatelowercasewithseparator2.IconCompatParcelizer(jsonNodeFeature2));
                            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                        }
                    } catch (IllegalStateException unused2) {
                        getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
                    }
                }
                this.AudioAttributesCompatParcelizer.getWrite().invalidate();
                JsonNodeFeature jsonNodeFeature3 = (JsonNodeFeature) this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(iWrite);
                if (jsonNodeFeature3 != null && (remoteActionCompatParcelizer = jsonNodeFeature3.getRemoteActionCompatParcelizer()) != null && (iconCompatParcelizer = remoteActionCompatParcelizer.getIconCompatParcelizer()) != null) {
                    translateLowerCaseWithSeparator translatelowercasewithseparator3 = this.AudioAttributesCompatParcelizer;
                    if (iconCompatParcelizer2 != null) {
                        translatelowercasewithseparator3.handleMediaPlayPauseIfPendingOnHandler.write(iWrite, iconCompatParcelizer2);
                    }
                    if (audioAttributesImplBaseParcelizer != null) {
                        translatelowercasewithseparator3.onAddQueueItem.write(iWrite, audioAttributesImplBaseParcelizer);
                    }
                    translatelowercasewithseparator3.read(iconCompatParcelizer);
                }
            }
            if (iconCompatParcelizer2 != null) {
                this.$read.write(iconCompatParcelizer2.RemoteActionCompatParcelizer().invoke());
            }
            if (audioAttributesImplBaseParcelizer != null) {
                this.$read.AudioAttributesCompatParcelizer(audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer().invoke());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonTypeResolver jsonTypeResolver, translateLowerCaseWithSeparator translatelowercasewithseparator) {
            super(0);
            this.$read = jsonTypeResolver;
            this.AudioAttributesCompatParcelizer = translatelowercasewithseparator;
        }
    }

    private final void IconCompatParcelizer(int p0, int p1, String p2) {
        AccessibilityEvent accessibilityEventWrite = write(write(p0), 32);
        accessibilityEventWrite.setContentChangeTypes(p1);
        if (p2 != null) {
            accessibilityEventWrite.getText().add(p2);
        }
        read(accessibilityEventWrite);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void read(kotlin.valueInstantiatorInstance r17, kotlin.JsonValueInstantiator r18) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.read(o.valueInstantiatorInstance, o.JsonValueInstantiator):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int write(int p0) {
        if (p0 == this.write.getAddContentView().read().getAudioAttributesImplApi21Parcelizer()) {
            return -1;
        }
        return p0;
    }

    private final boolean RemoteActionCompatParcelizer(valueInstantiatorInstance p0, int p1, boolean p2, boolean p3) {
        withSimpleName.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverWrite;
        int iAudioAttributesCompatParcelizer;
        int i;
        int audioAttributesImplApi21Parcelizer = p0.getAudioAttributesImplApi21Parcelizer();
        Integer num = this.onPause;
        if (num == null || audioAttributesImplApi21Parcelizer != num.intValue()) {
            this.onFastForward = -1;
            this.onPause = Integer.valueOf(p0.getAudioAttributesImplApi21Parcelizer());
        }
        String strWrite = write(p0);
        String str = strWrite;
        if (str == null || str.length() == 0 || (mediaBrowserCompatCustomActionResultReceiverWrite = write(p0, p1)) == null) {
            return false;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0);
        if (iRemoteActionCompatParcelizer == -1) {
            iRemoteActionCompatParcelizer = p2 ? 0 : strWrite.length();
        }
        int[] iArrIconCompatParcelizer = p2 ? mediaBrowserCompatCustomActionResultReceiverWrite.read(iRemoteActionCompatParcelizer) : mediaBrowserCompatCustomActionResultReceiverWrite.IconCompatParcelizer(iRemoteActionCompatParcelizer);
        if (iArrIconCompatParcelizer == null) {
            return false;
        }
        int i2 = iArrIconCompatParcelizer[0];
        int i3 = iArrIconCompatParcelizer[1];
        if (p3 && IconCompatParcelizer(p0)) {
            iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
            if (iAudioAttributesCompatParcelizer == -1) {
                iAudioAttributesCompatParcelizer = p2 ? i2 : i3;
            }
            i = p2 ? i3 : i2;
        } else {
            iAudioAttributesCompatParcelizer = p2 ? i3 : i2;
            i = iAudioAttributesCompatParcelizer;
        }
        this.onPrepareFromSearch = new IconCompatParcelizer(p0, p2 ? 256 : 512, p1, i2, i3, SystemClock.uptimeMillis());
        read(p0, iAudioAttributesCompatParcelizer, i, true);
        return true;
    }

    private final void AudioAttributesImplBaseParcelizer(int p0) {
        IconCompatParcelizer iconCompatParcelizer = this.onPrepareFromSearch;
        if (iconCompatParcelizer != null) {
            if (p0 != iconCompatParcelizer.getIconCompatParcelizer().getAudioAttributesImplApi21Parcelizer()) {
                return;
            }
            if (SystemClock.uptimeMillis() - iconCompatParcelizer.getMediaBrowserCompatItemReceiver() <= 1000) {
                AccessibilityEvent accessibilityEventWrite = write(write(iconCompatParcelizer.getIconCompatParcelizer().getAudioAttributesImplApi21Parcelizer()), 131072);
                accessibilityEventWrite.setFromIndex(iconCompatParcelizer.getRemoteActionCompatParcelizer());
                accessibilityEventWrite.setToIndex(iconCompatParcelizer.getRead());
                accessibilityEventWrite.setAction(iconCompatParcelizer.getAudioAttributesCompatParcelizer());
                accessibilityEventWrite.setMovementGranularity(iconCompatParcelizer.getWrite());
                accessibilityEventWrite.getText().add(write(iconCompatParcelizer.getIconCompatParcelizer()));
                read(accessibilityEventWrite);
            }
        }
        this.onPrepareFromSearch = null;
    }

    private final boolean read(valueInstantiatorInstance p0, int p1, int p2, boolean p3) {
        String strWrite;
        if (p0.getWrite().read(withAbstractTypeResolver.INSTANCE.onPlayFromUri()) && PropertyNamingStrategyPropertyNamingStrategyBase.AudioAttributesImplApi26Parcelizer(p0)) {
            getModuleData getmoduledata = (getModuleData) ((defaultFeatures) p0.getWrite().write(withAbstractTypeResolver.INSTANCE.onPlayFromUri())).RemoteActionCompatParcelizer();
            if (getmoduledata != null) {
                return ((Boolean) getmoduledata.AudioAttributesCompatParcelizer(Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3))).booleanValue();
            }
            return false;
        }
        if ((p1 == p2 && p2 == this.onFastForward) || (strWrite = write(p0)) == null) {
            return false;
        }
        if (p1 < 0 || p1 != p2 || p2 > strWrite.length()) {
            p1 = -1;
        }
        this.onFastForward = p1;
        String str = strWrite;
        boolean z = str.length() > 0;
        read(IconCompatParcelizer(write(p0.getAudioAttributesImplApi21Parcelizer()), z ? Integer.valueOf(this.onFastForward) : null, z ? Integer.valueOf(this.onFastForward) : null, z ? Integer.valueOf(strWrite.length()) : null, str));
        AudioAttributesImplBaseParcelizer(p0.getAudioAttributesImplApi21Parcelizer());
        return true;
    }

    private final int AudioAttributesCompatParcelizer(valueInstantiatorInstance p0) {
        if (!p0.getWrite().read(_this.INSTANCE.IconCompatParcelizer()) && p0.getWrite().read(_this.INSTANCE.onSetCaptioningEnabled())) {
            return findProperty.AudioAttributesImplBaseParcelizer(((findProperty) p0.getWrite().write(_this.INSTANCE.onSetCaptioningEnabled())).getIconCompatParcelizer());
        }
        return this.onFastForward;
    }

    private final int RemoteActionCompatParcelizer(valueInstantiatorInstance p0) {
        if (!p0.getWrite().read(_this.INSTANCE.IconCompatParcelizer()) && p0.getWrite().read(_this.INSTANCE.onSetCaptioningEnabled())) {
            return findProperty.read(((findProperty) p0.getWrite().write(_this.INSTANCE.onSetCaptioningEnabled())).getIconCompatParcelizer());
        }
        return this.onFastForward;
    }

    private final boolean IconCompatParcelizer(valueInstantiatorInstance p0) {
        return !p0.getWrite().read(_this.INSTANCE.IconCompatParcelizer()) && p0.getWrite().read(_this.INSTANCE.AudioAttributesImplApi26Parcelizer());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver write(kotlin.valueInstantiatorInstance r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.write(r5)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto Lae
            int r2 = r2.length()
            if (r2 == 0) goto Lae
            r2 = 1
            if (r6 == r2) goto L8d
            r2 = 2
            if (r6 == r2) goto L6e
            r4 = 4
            if (r6 == r4) goto L32
            r2 = 8
            if (r6 == r2) goto L25
            r2 = 16
            if (r6 == r2) goto L32
            return r0
        L25:
            o.withSimpleName$RemoteActionCompatParcelizer$write r4 = o.withSimpleName.RemoteActionCompatParcelizer.INSTANCE
            o.withSimpleName$RemoteActionCompatParcelizer r4 = r4.RemoteActionCompatParcelizer()
            o.withSimpleName$write r4 = (o.withSimpleName.write) r4
            r4.write(r1)
            goto Lab
        L32:
            o.valueInstantiators r2 = r5.getWrite()
            o.withAbstractTypeResolver r3 = kotlin.withAbstractTypeResolver.INSTANCE
            o.MapperConfig r3 = r3.MediaBrowserCompatCustomActionResultReceiver()
            boolean r2 = r2.read(r3)
            if (r2 != 0) goto L43
            return r0
        L43:
            o.valueInstantiators r2 = r5.getWrite()
            o.deserializeFromNumber r2 = kotlin.NoClass.AudioAttributesCompatParcelizer(r2)
            if (r2 != 0) goto L4e
            return r0
        L4e:
            if (r6 != r4) goto L5f
            o.withSimpleName$read$write r4 = o.withSimpleName.read.INSTANCE
            o.withSimpleName$read r4 = r4.read()
            o.withSimpleName$write r4 = (o.withSimpleName.write) r4
            r5 = r4
            o.withSimpleName$read r5 = (o.withSimpleName.read) r5
            r5.IconCompatParcelizer(r1, r2)
            goto Lab
        L5f:
            o.withSimpleName$AudioAttributesCompatParcelizer$write r4 = o.withSimpleName.AudioAttributesCompatParcelizer.INSTANCE
            o.withSimpleName$AudioAttributesCompatParcelizer r4 = r4.AudioAttributesCompatParcelizer()
            o.withSimpleName$write r4 = (o.withSimpleName.write) r4
            r6 = r4
            o.withSimpleName$AudioAttributesCompatParcelizer r6 = (o.withSimpleName.AudioAttributesCompatParcelizer) r6
            r6.read(r1, r2, r5)
            goto Lab
        L6e:
            o.withSimpleName$MediaBrowserCompatItemReceiver$read r5 = o.withSimpleName.MediaBrowserCompatItemReceiver.INSTANCE
            androidx.compose.ui.platform.AndroidComposeView r4 = r4.write
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            o.withSimpleName$MediaBrowserCompatItemReceiver r4 = r5.RemoteActionCompatParcelizer(r4)
            o.withSimpleName$write r4 = (o.withSimpleName.write) r4
            r5 = r4
            o.withSimpleName$MediaBrowserCompatItemReceiver r5 = (o.withSimpleName.MediaBrowserCompatItemReceiver) r5
            r5.write(r1)
            goto Lab
        L8d:
            o.withSimpleName$IconCompatParcelizer$RemoteActionCompatParcelizer r5 = o.withSimpleName.IconCompatParcelizer.INSTANCE
            androidx.compose.ui.platform.AndroidComposeView r4 = r4.write
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            o.withSimpleName$IconCompatParcelizer r4 = r5.RemoteActionCompatParcelizer(r4)
            o.withSimpleName$write r4 = (o.withSimpleName.write) r4
            r5 = r4
            o.withSimpleName$IconCompatParcelizer r5 = (o.withSimpleName.IconCompatParcelizer) r5
            r5.write(r1)
        Lab:
            o.withSimpleName$MediaBrowserCompatCustomActionResultReceiver r4 = (o.withSimpleName.MediaBrowserCompatCustomActionResultReceiver) r4
            return r4
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.translateLowerCaseWithSeparator.write(o.valueInstantiatorInstance, int):o.withSimpleName$MediaBrowserCompatCustomActionResultReceiver");
    }

    private final String write(valueInstantiatorInstance p0) {
        AbstractDeserializer abstractDeserializer;
        if (p0 == null) {
            return null;
        }
        if (p0.getWrite().read(_this.INSTANCE.IconCompatParcelizer())) {
            return ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer((List) p0.getWrite().write(_this.INSTANCE.IconCompatParcelizer()), ",", null, null, 0, null, null, 62, null);
        }
        if (p0.getWrite().read(_this.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            AbstractDeserializer abstractDeserializerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0.getWrite());
            if (abstractDeserializerAudioAttributesCompatParcelizer != null) {
                return abstractDeserializerAudioAttributesCompatParcelizer.getIconCompatParcelizer();
            }
            return null;
        }
        List list = (List) withDeserializerModifier.read(p0.getWrite(), _this.INSTANCE.onSetRating());
        if (list == null || (abstractDeserializer = (AbstractDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list)) == null) {
            return null;
        }
        return abstractDeserializer.getIconCompatParcelizer();
    }

    private final AbstractDeserializer AudioAttributesCompatParcelizer(C0216valueInstantiators c0216valueInstantiators) {
        return (AbstractDeserializer) withDeserializerModifier.read(c0216valueInstantiators, _this.INSTANCE.AudioAttributesImplApi26Parcelizer());
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\b"}, d2 = {"Lo/translateLowerCaseWithSeparator$AudioAttributesCompatParcelizer;", "Lo/AccessorNamingStrategyProvider;", "<init>", "(Lo/translateLowerCaseWithSeparator;)V", "", "p0", "Lo/hasSuperClassStartingWith;", "read", "(I)Lo/hasSuperClassStartingWith;", "p1", "Landroid/os/Bundle;", "p2", "", "AudioAttributesCompatParcelizer", "(IILandroid/os/Bundle;)Z", "", "p3", "", "RemoteActionCompatParcelizer", "(ILo/hasSuperClassStartingWith;Ljava/lang/String;Landroid/os/Bundle;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class AudioAttributesCompatParcelizer extends AccessorNamingStrategyProvider {
        public AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.AccessorNamingStrategyProvider
        public final hasSuperClassStartingWith read(int p0) {
            hasSuperClassStartingWith hassuperclassstartingwithIconCompatParcelizer = translateLowerCaseWithSeparator.this.IconCompatParcelizer(p0);
            translateLowerCaseWithSeparator translatelowercasewithseparator = translateLowerCaseWithSeparator.this;
            if (translatelowercasewithseparator.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                if (p0 == translatelowercasewithseparator.MediaBrowserCompatSearchResultReceiver) {
                    translatelowercasewithseparator.onCustomAction = hassuperclassstartingwithIconCompatParcelizer;
                }
                if (p0 == translatelowercasewithseparator.MediaMetadataCompat) {
                    translatelowercasewithseparator.onCommand = hassuperclassstartingwithIconCompatParcelizer;
                }
            }
            return hassuperclassstartingwithIconCompatParcelizer;
        }

        @Override // kotlin.AccessorNamingStrategyProvider
        public final boolean AudioAttributesCompatParcelizer(int p0, int p1, Bundle p2) {
            return translateLowerCaseWithSeparator.this.AudioAttributesCompatParcelizer(p0, p1, p2);
        }

        @Override // kotlin.AccessorNamingStrategyProvider
        public final void RemoteActionCompatParcelizer(int p0, hasSuperClassStartingWith p1, String p2, Bundle p3) {
            translateLowerCaseWithSeparator.this.AudioAttributesCompatParcelizer(p0, p1, p2, p3);
        }

        @Override // kotlin.AccessorNamingStrategyProvider
        public final hasSuperClassStartingWith RemoteActionCompatParcelizer(int p0) {
            if (p0 != 1) {
                if (p0 == 2) {
                    return read(translateLowerCaseWithSeparator.this.MediaBrowserCompatSearchResultReceiver);
                }
                throw new IllegalArgumentException("Unknown focus type: ".concat(String.valueOf(p0)));
            }
            if (translateLowerCaseWithSeparator.this.MediaMetadataCompat == Integer.MIN_VALUE) {
                return null;
            }
            return read(translateLowerCaseWithSeparator.this.MediaMetadataCompat);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/translateLowerCaseWithSeparator$read;", "", "<init>", "()V", "Lo/hasSuperClassStartingWith;", "p0", "Lo/valueInstantiatorInstance;", "p1", "", "AudioAttributesCompatParcelizer", "(Lo/hasSuperClassStartingWith;Lo/valueInstantiatorInstance;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        public static final read INSTANCE = new read();

        private read() {
        }

        @getMagicModuleMeta
        public static final void AudioAttributesCompatParcelizer(hasSuperClassStartingWith p0, valueInstantiatorInstance p1) {
            defaultFeatures defaultfeatures;
            if (!PropertyNamingStrategyPropertyNamingStrategyBase.AudioAttributesImplApi26Parcelizer(p1) || (defaultfeatures = (defaultFeatures) withDeserializerModifier.read(p1.getWrite(), withAbstractTypeResolver.INSTANCE.onMediaButtonEvent())) == null) {
                return;
            }
            p0.AudioAttributesCompatParcelizer(new hasSuperClassStartingWith.read(R.id.accessibilityActionSetProgress, defaultfeatures.getRemoteActionCompatParcelizer()));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/translateLowerCaseWithSeparator$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/hasSuperClassStartingWith;", "p0", "Lo/valueInstantiatorInstance;", "p1", "", "write", "(Lo/hasSuperClassStartingWith;Lo/valueInstantiatorInstance;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static final void write(hasSuperClassStartingWith p0, valueInstantiatorInstance p1) {
            C0184keyDeserializers c0184keyDeserializers = (C0184keyDeserializers) withDeserializerModifier.read(p1.getWrite(), _this.INSTANCE.onRemoveQueueItem());
            if (PropertyNamingStrategyPropertyNamingStrategyBase.AudioAttributesImplApi26Parcelizer(p1)) {
                int iWrite = C0184keyDeserializers.INSTANCE.write();
                if (c0184keyDeserializers != null && C0184keyDeserializers.IconCompatParcelizer(c0184keyDeserializers.getWrite(), iWrite)) {
                    return;
                }
                defaultFeatures defaultfeatures = (defaultFeatures) withDeserializerModifier.read(p1.getWrite(), withAbstractTypeResolver.INSTANCE.onCustomAction());
                if (defaultfeatures != null) {
                    p0.AudioAttributesCompatParcelizer(new hasSuperClassStartingWith.read(R.id.accessibilityActionPageUp, defaultfeatures.getRemoteActionCompatParcelizer()));
                }
                defaultFeatures defaultfeatures2 = (defaultFeatures) withDeserializerModifier.read(p1.getWrite(), withAbstractTypeResolver.INSTANCE.handleMediaPlayPauseIfPendingOnHandler());
                if (defaultfeatures2 != null) {
                    p0.AudioAttributesCompatParcelizer(new hasSuperClassStartingWith.read(R.id.accessibilityActionPageDown, defaultfeatures2.getRemoteActionCompatParcelizer()));
                }
                defaultFeatures defaultfeatures3 = (defaultFeatures) withDeserializerModifier.read(p1.getWrite(), withAbstractTypeResolver.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                if (defaultfeatures3 != null) {
                    p0.AudioAttributesCompatParcelizer(new hasSuperClassStartingWith.read(R.id.accessibilityActionPageLeft, defaultfeatures3.getRemoteActionCompatParcelizer()));
                }
                defaultFeatures defaultfeatures4 = (defaultFeatures) withDeserializerModifier.read(p1.getWrite(), withAbstractTypeResolver.INSTANCE.onAddQueueItem());
                if (defaultfeatures4 != null) {
                    p0.AudioAttributesCompatParcelizer(new hasSuperClassStartingWith.read(R.id.accessibilityActionPageRight, defaultfeatures4.getRemoteActionCompatParcelizer()));
                }
            }
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                read(this.write.getAddContentView().read(), this.onSetPlaybackSpeed);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer());
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    MediaBrowserCompatSearchResultReceiver();
                    getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplApi21Parcelizer(translateLowerCaseWithSeparator translatelowercasewithseparator) {
        Trace.beginSection("measureAndLayout");
        try {
            _configureGenerator.RemoteActionCompatParcelizer$default(translatelowercasewithseparator.write, false, 1, null);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                translatelowercasewithseparator.AudioAttributesImplBaseParcelizer();
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                Trace.endSection();
                translatelowercasewithseparator.onSetCaptioningEnabled = false;
            } finally {
            }
        } finally {
        }
    }
}
