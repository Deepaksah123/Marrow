package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;
import kotlin.charsToString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 62\u00020\u0001:\u0004*\u0010\u00126B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0010\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b#\u0010\u0013J:\u0010\u0010\u001a\u00020\u00072(\u0010\u0003\u001a$\b\u0001\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070'\u0012\u0006\u0012\u0004\u0018\u00010(0$H\u0082@¢\u0006\u0004\b\u0010\u0010)J\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010*\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b*\u0010\u0013J\u001d\u0010\u0010\u001a\u00020,2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070+H\u0016¢\u0006\u0004\b\u0010\u0010-J%\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070+H\u0010¢\u0006\u0004\b*\u0010.J3\u0010\u0010\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020/2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070+H\u0010¢\u0006\u0004\b\u0010\u00102J3\u0010\u0010\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020/2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020100H\u0010¢\u0006\u0004\b\u0010\u00103J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u000201H\u0010¢\u0006\u0004\b*\u00104J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010\u001fJ)\u00106\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020(\u0018\u000105H\u0002¢\u0006\u0004\b6\u00107J3\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002080\u00192\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020(\u0018\u000105H\u0002¢\u0006\u0004\b#\u00109J\u000f\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010\u000bJ#\u0010<\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070;2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b<\u0010=J3\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00070;2\u0006\u0010\u0003\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020(\u0018\u000105H\u0002¢\u0006\u0004\b*\u0010>J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020?H\u0002¢\u0006\u0004\b*\u0010@J\r\u0010A\u001a\u00020\u0007¢\u0006\u0004\bA\u0010\u000bJ\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\u000bJ\u001d\u0010*\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020D0CH\u0010¢\u0006\u0004\b*\u0010EJ\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0010¢\u0006\u0004\b#\u0010\u001fJ\u0017\u00106\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0010¢\u0006\u0004\b6\u0010\u001fJ\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u000208H\u0010¢\u0006\u0004\b*\u0010FJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u000208H\u0010¢\u0006\u0004\b\u0010\u0010FJ+\u0010#\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u0002082\u0006\u0010\u0016\u001a\u00020G2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030HH\u0010¢\u0006\u0004\b#\u0010IJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0012\u0010\u001fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010G2\u0006\u0010\u0003\u001a\u000208H\u0010¢\u0006\u0004\b\u0012\u0010JR$\u0010\u0012\u001a\u00020K2\u0006\u0010\u0003\u001a\u00020K8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010#\u001a\u00020O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010PR\u0014\u00106\u001a\u00020Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010*\u001a\u00060(j\u0002`T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010WR\u0018\u0010 \u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010XR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010ZR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010ZR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020(058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150]8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00150Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010ZR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u0002080Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b`\u0010ZR(\u0010M\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010(0c\u0012\u0004\u0012\u0002080b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bg\u0010hR \u0010l\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020G0j8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bk\u0010eR \u0010B\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bm\u0010eR\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010Y8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010ZR\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010nR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010\b\u001a\u00020q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010rR\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010sR\u0018\u0010`\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010uR\u0016\u0010d\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010sR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020w0v8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010xR\"\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u0001050y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010zR\u0014\u0010\r\u001a\u00020{8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010|R\u001a\u0010\u001c\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\bl\u0010}\u001a\u0004\b<\u0010~R\u0014\u0010\u001a\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u000eR\u0014\u0010R\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u000eR\u0014\u0010\n\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u000eR \u0010o\u001a\u000b\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\u007f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001c\u0010\u0081\u0001R\u0015\u0010\u0082\u0001\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u000eR\u001a\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020w0\u0083\u00018G¢\u0006\u0007\u001a\u0005\ba\u0010\u0084\u0001R\u001a\u0010[\u001a\u00070\u0086\u0001R\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0087\u0001R\u0014\u0010U\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u000eR\u0015\u0010\u0088\u0001\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u000eR\u001a\u0010\u008a\u0001\u001a\u00070Kj\u0003`\u0089\u00018QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b!\u0010NR\u0015\u0010\u008b\u0001\u001a\u00020\f8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u008c\u0001\u001a\u00020\f8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u000eR\u0015\u0010\u008d\u0001\u001a\u00020\f8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u0015\u0010\u008e\u0001\u001a\u00020\f8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\bl\u0010\u000eR\u0019\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008f\u00018QX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\"\u0010\u0090\u0001"}, d2 = {"Lo/_truncate;", "Lo/convertNumberToLong;", "Lo/CurrentQuery;", "p0", "<init>", "(Lo/CurrentQuery;)V", "Lo/setStateRank;", "", "onAddQueueItem", "()Lo/setStateRank;", "onPrepareFromSearch", "()V", "", "onPrepare", "()Z", "Lo/setPassingYear;", "write", "(Lo/setPassingYear;)V", "read", "(Lo/SampleVideos;)Ljava/lang/Object;", "", "Lo/_reportMissingRootWS;", "p1", "p2", "(Ljava/lang/Throwable;Lo/_reportMissingRootWS;Z)V", "", "onPrepareFromMediaId", "()Ljava/util/List;", "onPlayFromSearch", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesImplApi26Parcelizer", "(Lo/_reportMissingRootWS;)V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "Lkotlin/Function3;", "Lo/TopUserCompanion;", "Lo/appendDesc;", "Lo/SampleVideos;", "", "(Lo/getModuleData;Lo/SampleVideos;)Ljava/lang/Object;", "IconCompatParcelizer", "Lkotlin/Function0;", "Lo/_contentReference;", "(Lo/getCreatedOnDateMs;)Lo/_contentReference;", "(Lo/_reportMissingRootWS;Lo/MagicModuleSubmissionRequestBody;)V", "Lo/isResourceManaged;", "Lo/setButtonDrawable;", "Lo/rawReference;", "(Lo/_reportMissingRootWS;Lo/isResourceManaged;Lo/MagicModuleSubmissionRequestBody;)Lo/setButtonDrawable;", "(Lo/_reportMissingRootWS;Lo/isResourceManaged;Lo/setButtonDrawable;)Lo/setButtonDrawable;", "(Lo/rawReference;)V", "Lo/setEmojiCompatEnabled;", "AudioAttributesCompatParcelizer", "(Lo/_reportMissingRootWS;Lo/setEmojiCompatEnabled;)Lo/_reportMissingRootWS;", "Lo/getFilter;", "(Ljava/util/List;Lo/setEmojiCompatEnabled;)Ljava/util/List;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lkotlin/Function1;", "MediaBrowserCompatItemReceiver", "(Lo/_reportMissingRootWS;)Lo/getAnswerMap;", "(Lo/_reportMissingRootWS;Lo/setEmojiCompatEnabled;)Lo/getAnswerMap;", "Lo/ParseDigitsTaskCharSequence;", "(Lo/ParseDigitsTaskCharSequence;)V", "onCustomAction", "onCommand", "", "Lo/JsonReadContext;", "(Ljava/util/Set;)V", "(Lo/getFilter;)V", "Lo/checkValue;", "Lo/_closeInput;", "(Lo/getFilter;Lo/checkValue;Lo/_closeInput;)V", "(Lo/getFilter;)Lo/checkValue;", "", "J", "MediaBrowserCompatMediaItem", "()J", "Lo/ParserBase;", "Lo/ParserBase;", "Lo/parseBigDecimal;", "onPlayFromUri", "Lo/parseBigDecimal;", "Lo/SynchronizedObject;", "onPrepareFromUri", "Ljava/lang/Object;", "Lo/setPassingYear;", "Ljava/lang/Throwable;", "", "Ljava/util/List;", "onRewind", "Lo/setEmojiCompatEnabled;", "Lo/UTF32Reader;", "MediaBrowserCompatSearchResultReceiver", "Lo/UTF32Reader;", "onPause", "RatingCompat", "Lo/OutputDecorator;", "Lo/createRootContext;", "onPlay", "Lo/setKeyListener;", "Lo/setFieldName;", "onPlayFromMediaId", "Lo/setFieldName;", "MediaMetadataCompat", "Lo/setKeyListener;", "onFastForward", "MediaDescriptionCompat", "onMediaButtonEvent", "Ljava/util/Set;", "onRemoveQueueItem", "Lo/setStateRank;", "", "I", "Z", "Lo/_truncate$read;", "Lo/_truncate$read;", "Lo/getResolutionSize;", "Lo/_truncate$IconCompatParcelizer;", "Lo/getResolutionSize;", "Lo/applyWeights;", "Lo/applyWeights;", "Lo/isMockTest;", "Lo/isMockTest;", "Lo/CurrentQuery;", "()Lo/CurrentQuery;", "Lo/setDropDownBackgroundResource;", "Lo/_closeScope;", "Lo/setDropDownBackgroundResource;", "onSeekTo", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "onRemoveQueueItemAt", "Lo/_truncate$write;", "Lo/_truncate$write;", "onSetShuffleMode", "Lo/CompositeKeyHashCode;", "onSetPlaybackSpeed", "onSetRepeatMode", "onSetCaptioningEnabled", "onSetRating", "onSkipToPrevious", "Lo/createChildArrayContext;", "()Lo/createChildArrayContext;", "setSessionImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _truncate extends convertNumberToLong {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getResolutionSize<IconCompatParcelizer> onMediaButtonEvent;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private long read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private List<? extends _reportMissingRootWS> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<_reportMissingRootWS> AudioAttributesImplApi26Parcelizer;
    private Throwable MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final ParserBase RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final List<_reportMissingRootWS> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final UTF32Reader<_reportMissingRootWS> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final isMockTest onPrepare;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final CurrentQuery onPlayFromSearch;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private Set<_reportMissingRootWS> onCustomAction;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int onAddQueueItem;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private boolean onPlay;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private List<_reportMissingRootWS> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private boolean onFastForward;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private read onPause;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final setKeyListener<getFilter, checkValue> MediaDescriptionCompat;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> onCommand;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final List<getFilter> RatingCompat;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final setKeyListener<Object, Object> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final setFieldName MediaMetadataCompat;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private setDropDownBackgroundResource<_closeScope> onRemoveQueueItem;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final parseBigDecimal AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final write onRewind;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final applyWeights<setEmojiCompatEnabled<rawReference>> onPlayFromMediaId;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private setPassingYear write;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private setStateRank<? super getShowPopup> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private setEmojiCompatEnabled<Object> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int read = 8;
    private static final getResolutionSize<illegalSurrogateDesc<write>> RemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(reportStrangeStream.RemoteActionCompatParcelizer());
    private static final AtomicReference<Boolean> write = new AtomicReference<>(Boolean.FALSE);

    @Override // kotlin.convertNumberToLong
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public final boolean getWrite() {
        return false;
    }

    @Override // kotlin.convertNumberToLong
    public final createChildArrayContext AudioAttributesImplApi21Parcelizer() {
        return null;
    }

    @Override // kotlin.convertNumberToLong
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final long getRemoteActionCompatParcelizer() {
        return 1000L;
    }

    @Override // kotlin.convertNumberToLong
    public final void IconCompatParcelizer(Set<JsonReadContext> p0) {
    }

    public _truncate(CurrentQuery currentQuery) {
        ParserBase parserBase = new ParserBase(new getCreatedOnDateMs() { // from class: o._truncateOffsets
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return _truncate.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.write);
            }
        });
        this.RemoteActionCompatParcelizer = parserBase;
        this.AudioAttributesCompatParcelizer = new parseBigDecimal(new getCreatedOnDateMs() { // from class: o.appendSourceDescription
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return _truncate.onMediaButtonEvent(this.AudioAttributesCompatParcelizer);
            }
        });
        this.IconCompatParcelizer = new Object();
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
        this.AudioAttributesImplBaseParcelizer = new setEmojiCompatEnabled<>(0, 1, null);
        this.MediaBrowserCompatItemReceiver = new UTF32Reader<>(new _reportMissingRootWS[16], 0);
        this.MediaBrowserCompatSearchResultReceiver = new ArrayList();
        this.RatingCompat = new ArrayList();
        this.MediaBrowserCompatMediaItem = OutputDecorator.RemoteActionCompatParcelizer(null, 1, null);
        this.MediaMetadataCompat = new setFieldName();
        this.MediaDescriptionCompat = setAutoSizeTextTypeUniformWithPresetSizes.read();
        this.onCommand = OutputDecorator.RemoteActionCompatParcelizer(null, 1, null);
        this.onMediaButtonEvent = setStartTime.RemoteActionCompatParcelizer(IconCompatParcelizer.IconCompatParcelizer);
        this.onPlayFromMediaId = new applyWeights<>();
        isMockTest ismocktestRemoteActionCompatParcelizer = getUserConfig.RemoteActionCompatParcelizer((setPassingYear) currentQuery.get(setPassingYear.b_));
        ismocktestRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.contentOffset
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return _truncate.IconCompatParcelizer(this.IconCompatParcelizer, (Throwable) obj);
            }
        });
        this.onPrepare = ismocktestRemoteActionCompatParcelizer;
        this.onPlayFromSearch = currentQuery.plus(parserBase).plus(ismocktestRemoteActionCompatParcelizer);
        this.onRewind = new write();
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(_truncate _truncateVar) {
        _truncateVar.onPrepareFromSearch();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onMediaButtonEvent(_truncate _truncateVar) {
        _truncateVar.onPrepareFromSearch();
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lo/_truncate$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "read", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesImplApi26Parcelizer;
        private static final /* synthetic */ IconCompatParcelizer[] AudioAttributesImplBaseParcelizer;
        public static final IconCompatParcelizer read = new IconCompatParcelizer("ShutDown", 0);
        public static final IconCompatParcelizer MediaBrowserCompatItemReceiver = new IconCompatParcelizer("ShuttingDown", 1);
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer("Inactive", 2);
        public static final IconCompatParcelizer write = new IconCompatParcelizer("InactivePendingWork", 3);
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("Idle", 4);
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer("PendingWork", 5);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            AudioAttributesImplBaseParcelizer = iconCompatParcelizerArrRemoteActionCompatParcelizer;
            AudioAttributesImplApi26Parcelizer = getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArrRemoteActionCompatParcelizer);
        }

        private static final /* synthetic */ IconCompatParcelizer[] RemoteActionCompatParcelizer() {
            return new IconCompatParcelizer[]{read, MediaBrowserCompatItemReceiver, IconCompatParcelizer, write, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) AudioAttributesImplBaseParcelizer.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final _truncate _truncateVar, final Throwable th) {
        setStateRank<? super getShowPopup> setstaterank;
        setStateRank<? super getShowPopup> setstaterank2;
        CancellationException cancellationExceptionAudioAttributesCompatParcelizer = getJSONArray.AudioAttributesCompatParcelizer("Recomposer effect job completed", th);
        synchronized (_truncateVar.IconCompatParcelizer) {
            setPassingYear setpassingyear = _truncateVar.write;
            setstaterank = null;
            if (setpassingyear != null) {
                _truncateVar.onMediaButtonEvent.write(IconCompatParcelizer.MediaBrowserCompatItemReceiver);
                if (!_truncateVar.onFastForward) {
                    setpassingyear.RemoteActionCompatParcelizer(cancellationExceptionAudioAttributesCompatParcelizer);
                } else {
                    setstaterank2 = _truncateVar.handleMediaPlayPauseIfPendingOnHandler;
                    if (setstaterank2 == null) {
                    }
                    _truncateVar.handleMediaPlayPauseIfPendingOnHandler = null;
                    setpassingyear.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.contentLength
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return _truncate.IconCompatParcelizer(this.read, th, (Throwable) obj);
                        }
                    });
                    setstaterank = setstaterank2;
                }
                setstaterank2 = null;
                _truncateVar.handleMediaPlayPauseIfPendingOnHandler = null;
                setpassingyear.RemoteActionCompatParcelizer(new getAnswerMap() { // from class: o.contentLength
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return _truncate.IconCompatParcelizer(this.read, th, (Throwable) obj);
                    }
                });
                setstaterank = setstaterank2;
            } else {
                _truncateVar.MediaBrowserCompatCustomActionResultReceiver = cancellationExceptionAudioAttributesCompatParcelizer;
                _truncateVar.onMediaButtonEvent.write(IconCompatParcelizer.read);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
        if (setstaterank != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterank.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_truncate _truncateVar, Throwable th, Throwable th2) {
        synchronized (_truncateVar.IconCompatParcelizer) {
            if (th != null) {
                if (th2 != null) {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        getPlanName.IconCompatParcelizer(th, th2);
                    }
                }
            }
            th = null;
            _truncateVar.MediaBrowserCompatCustomActionResultReceiver = th;
            _truncateVar.onMediaButtonEvent.write(IconCompatParcelizer.read);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.convertNumberToLong
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final CurrentQuery getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    private final boolean onPause() {
        return !this.onPlay && this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private final boolean onFastForward() {
        return !this.onPlay && this.AudioAttributesCompatParcelizer.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onPlay() {
        boolean zOnPause;
        synchronized (this.IconCompatParcelizer) {
            zOnPause = onPause();
        }
        return zOnPause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final setStateRank<getShowPopup> onAddQueueItem() {
        IconCompatParcelizer iconCompatParcelizer;
        if (this.onMediaButtonEvent.IconCompatParcelizer().compareTo(IconCompatParcelizer.MediaBrowserCompatItemReceiver) <= 0) {
            handleMediaPlayPauseIfPendingOnHandler();
            this.AudioAttributesImplBaseParcelizer = new setEmojiCompatEnabled<>(0, 1, null);
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            this.MediaBrowserCompatSearchResultReceiver.clear();
            this.RatingCompat.clear();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
            setStateRank<? super getShowPopup> setstaterank = this.handleMediaPlayPauseIfPendingOnHandler;
            if (setstaterank != null) {
                setstaterank.write((Throwable) null);
            }
            this.handleMediaPlayPauseIfPendingOnHandler = null;
            this.onPause = null;
            return null;
        }
        if (this.onPause != null) {
            iconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer;
        } else if (this.write == null) {
            this.AudioAttributesImplBaseParcelizer = new setEmojiCompatEnabled<>(0, 1, null);
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
            if (onPause() || onFastForward()) {
                iconCompatParcelizer = IconCompatParcelizer.write;
            } else {
                iconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer;
            }
        } else if (this.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer() != 0 || this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer() || !this.MediaBrowserCompatSearchResultReceiver.isEmpty() || !this.RatingCompat.isEmpty() || this.onAddQueueItem > 0 || onPause() || onFastForward() || OutputDecorator.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatMediaItem)) {
            iconCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer;
        } else {
            iconCompatParcelizer = IconCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        this.onMediaButtonEvent.write(iconCompatParcelizer);
        if (iconCompatParcelizer != IconCompatParcelizer.RemoteActionCompatParcelizer) {
            return null;
        }
        setStateRank setstaterank2 = this.handleMediaPlayPauseIfPendingOnHandler;
        this.handleMediaPlayPauseIfPendingOnHandler = null;
        return setstaterank2;
    }

    private final void onPrepareFromSearch() {
        setStateRank<getShowPopup> setstaterankOnAddQueueItem;
        synchronized (this.IconCompatParcelizer) {
            setstaterankOnAddQueueItem = onAddQueueItem();
            if (this.onMediaButtonEvent.IconCompatParcelizer().compareTo(IconCompatParcelizer.MediaBrowserCompatItemReceiver) <= 0) {
                throw getJSONArray.AudioAttributesCompatParcelizer("Recomposer shutdown; frame clock awaiter will never resume", this.MediaBrowserCompatCustomActionResultReceiver);
            }
        }
        if (setstaterankOnAddQueueItem != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterankOnAddQueueItem.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onPlayFromUri() {
        boolean z;
        synchronized (this.IconCompatParcelizer) {
            z = this.onFastForward;
        }
        if (!z) {
            return true;
        }
        Iterator<setPassingYear> itWrite = this.onPrepare.bk_().write();
        while (itWrite.hasNext()) {
            if (itWrite.next().read()) {
                return true;
            }
        }
        return false;
    }

    public final setUpdatedStatus<IconCompatParcelizer> RatingCompat() {
        return this.onMediaButtonEvent;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_truncate$write;", "Lo/allocBase64Buffer;", "<init>", "(Lo/_truncate;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class write implements allocBase64Buffer {
        public write() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\b\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\r"}, d2 = {"Lo/_truncate$read;", "Lo/maxContentSnippetLength;", "", "p0", "", "p1", "<init>", "(ZLjava/lang/Throwable;)V", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read implements maxContentSnippetLength {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final Throwable IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final boolean RemoteActionCompatParcelizer;

        public read(boolean z, Throwable th) {
            this.RemoteActionCompatParcelizer = z;
            this.IconCompatParcelizer = th;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final Throwable getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onPrepare() {
        boolean zOnPlayFromMediaId;
        IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        synchronized (this.IconCompatParcelizer) {
            if (this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer()) {
                return onPlayFromMediaId();
            }
            List<_reportMissingRootWS> listOnPlayFromSearch = onPlayFromSearch();
            Set<? extends Object> setWrite = freeBuffers.write(this.AudioAttributesImplBaseParcelizer);
            this.AudioAttributesImplBaseParcelizer = new setEmojiCompatEnabled<>(0, 1, null);
            try {
                _truncate _truncateVar = this;
                int size = listOnPlayFromSearch.size();
                for (int i = 0; i < size; i++) {
                    listOnPlayFromSearch.get(i).write(setWrite);
                    if (this.onMediaButtonEvent.IconCompatParcelizer().compareTo(IconCompatParcelizer.MediaBrowserCompatItemReceiver) <= 0) {
                        break;
                    }
                }
                synchronized (this.IconCompatParcelizer) {
                    if (onAddQueueItem() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                    zOnPlayFromMediaId = onPlayFromMediaId();
                }
                return zOnPlayFromMediaId;
            } catch (Throwable th) {
                synchronized (this.IconCompatParcelizer) {
                    this.AudioAttributesImplBaseParcelizer.write((Iterable<? extends Object>) setWrite);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(setPassingYear p0) {
        synchronized (this.IconCompatParcelizer) {
            Throwable th = this.MediaBrowserCompatCustomActionResultReceiver;
            if (th != null) {
                throw th;
            }
            if (this.onMediaButtonEvent.IconCompatParcelizer().compareTo(IconCompatParcelizer.MediaBrowserCompatItemReceiver) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            }
            if (this.write != null) {
                throw new IllegalStateException("Recomposer already running".toString());
            }
            this.write = p0;
            onAddQueueItem();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getModuleData<TopUserCompanion, appendDesc, SampleVideos<? super getShowPopup>, Object> {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        /* synthetic */ Object IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x017c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0147 -> B:22:0x014c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0164 -> B:11:0x00bf). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 383
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o._truncate.MediaBrowserCompatCustomActionResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final void IconCompatParcelizer(kotlin._truncate r23, java.util.List<kotlin._reportMissingRootWS> r24, java.util.List<kotlin.getFilter> r25, java.util.List<kotlin._reportMissingRootWS> r26, kotlin.setEmojiCompatEnabled<kotlin._reportMissingRootWS> r27, kotlin.setEmojiCompatEnabled<kotlin._reportMissingRootWS> r28, kotlin.setEmojiCompatEnabled<java.lang.Object> r29, kotlin.setEmojiCompatEnabled<kotlin._reportMissingRootWS> r30) {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o._truncate.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(o._truncate, java.util.List, java.util.List, java.util.List, o.setEmojiCompatEnabled, o.setEmojiCompatEnabled, o.setEmojiCompatEnabled, o.setEmojiCompatEnabled):void");
        }

        private static final void IconCompatParcelizer(List<getFilter> list, _truncate _truncateVar) {
            list.clear();
            synchronized (_truncateVar.IconCompatParcelizer) {
                List list2 = _truncateVar.RatingCompat;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((getFilter) list2.get(i));
                }
                _truncateVar.RatingCompat.clear();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v67 */
        /* JADX WARN: Type inference failed for: r0v69 */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v14, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v16 */
        /* JADX WARN: Type inference failed for: r11v17 */
        /* JADX WARN: Type inference failed for: r11v18, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r11v19, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r11v20 */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r12v23, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r12v9, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r3v8, types: [T[], java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v12, types: [o.parseDigitsRecursive] */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v18, types: [o.setEmojiCompatEnabled] */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v6, types: [T[]] */
        public static final getShowPopup RemoteActionCompatParcelizer(_truncate _truncateVar, setEmojiCompatEnabled setemojicompatenabled, setEmojiCompatEnabled setemojicompatenabled2, List list, List list2, setEmojiCompatEnabled setemojicompatenabled3, List list3, setEmojiCompatEnabled setemojicompatenabled4, Set set, long j) {
            boolean z;
            List list4;
            long[] jArr;
            ?? r11 = list2;
            ?? r12 = setemojicompatenabled3;
            List list5 = list3;
            setEmojiCompatEnabled setemojicompatenabled5 = setemojicompatenabled4;
            if (_truncateVar.onPlay()) {
                Object objIconCompatParcelizer = multiplyConjugate.INSTANCE.IconCompatParcelizer("Recomposer:animation");
                try {
                    _truncateVar.RemoteActionCompatParcelizer.read(j);
                    parseDigitsRecursive.INSTANCE.read();
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } finally {
                    multiplyConjugate.INSTANCE.write(objIconCompatParcelizer);
                }
            }
            Object objIconCompatParcelizer2 = multiplyConjugate.INSTANCE.IconCompatParcelizer("Recomposer:recompose");
            try {
                _truncateVar.onPrepare();
                synchronized (_truncateVar.IconCompatParcelizer) {
                    UTF32Reader uTF32Reader = _truncateVar.MediaBrowserCompatItemReceiver;
                    Object[] objArr = uTF32Reader.IconCompatParcelizer;
                    int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
                    z = false;
                    for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
                        list.add((_reportMissingRootWS) objArr[i]);
                    }
                    _truncateVar.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                }
                setemojicompatenabled.RemoteActionCompatParcelizer();
                setemojicompatenabled2.RemoteActionCompatParcelizer();
            } catch (Throwable th) {
                throw th;
            }
            while (true) {
                if (list.isEmpty() && ((Collection) r11).isEmpty()) {
                    break;
                }
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        _reportMissingRootWS _reportmissingrootws = (_reportMissingRootWS) list.get(i2);
                        _reportMissingRootWS _reportmissingrootwsAudioAttributesCompatParcelizer = _truncateVar.AudioAttributesCompatParcelizer(_reportmissingrootws, (setEmojiCompatEnabled<Object>) setemojicompatenabled);
                        if (_reportmissingrootwsAudioAttributesCompatParcelizer != null) {
                            list3.add(_reportmissingrootwsAudioAttributesCompatParcelizer);
                            getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                            getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
                        }
                        setemojicompatenabled2.write(_reportmissingrootws);
                    }
                    list.clear();
                    if (setemojicompatenabled.AudioAttributesImplApi21Parcelizer() || _truncateVar.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer() != 0) {
                        synchronized (_truncateVar.IconCompatParcelizer) {
                            List listOnPlayFromSearch = _truncateVar.onPlayFromSearch();
                            int size2 = listOnPlayFromSearch.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                _reportMissingRootWS _reportmissingrootws2 = (_reportMissingRootWS) listOnPlayFromSearch.get(i3);
                                if (!setemojicompatenabled2.RemoteActionCompatParcelizer(_reportmissingrootws2) && _reportmissingrootws2.read(set)) {
                                    list.add(_reportmissingrootws2);
                                }
                            }
                            UTF32Reader uTF32Reader2 = _truncateVar.MediaBrowserCompatItemReceiver;
                            int audioAttributesCompatParcelizer2 = uTF32Reader2.getAudioAttributesCompatParcelizer();
                            int i4 = 0;
                            for (int i5 = 0; i5 < audioAttributesCompatParcelizer2; i5++) {
                                _reportMissingRootWS _reportmissingrootws3 = (_reportMissingRootWS) uTF32Reader2.IconCompatParcelizer[i5];
                                if (!setemojicompatenabled2.RemoteActionCompatParcelizer(_reportmissingrootws3) && !list.contains(_reportmissingrootws3)) {
                                    list.add(_reportmissingrootws3);
                                    i4++;
                                } else if (i4 > 0) {
                                    uTF32Reader2.IconCompatParcelizer[i5 - i4] = uTF32Reader2.IconCompatParcelizer[i5];
                                }
                            }
                            int i6 = audioAttributesCompatParcelizer2 - i4;
                            getOrderDetails.AudioAttributesCompatParcelizer((Object[]) uTF32Reader2.IconCompatParcelizer, (Object) null, i6, audioAttributesCompatParcelizer2);
                            uTF32Reader2.AudioAttributesCompatParcelizer(i6);
                            getShowPopup getshowpopup5 = getShowPopup.INSTANCE;
                        }
                    }
                    if (list.isEmpty()) {
                        list4 = list2;
                        try {
                            IconCompatParcelizer(list4, _truncateVar);
                            while (!list4.isEmpty()) {
                                try {
                                    setemojicompatenabled3.RemoteActionCompatParcelizer((Iterable) _truncateVar.RemoteActionCompatParcelizer((List<getFilter>) list4, (setEmojiCompatEnabled<Object>) setemojicompatenabled));
                                    IconCompatParcelizer(list4, _truncateVar);
                                } catch (Throwable th2) {
                                    th = th2;
                                    _truncate.read$default(_truncateVar, th, null, true, 2, null);
                                    IconCompatParcelizer(_truncateVar, list, list2, list3, setemojicompatenabled3, setemojicompatenabled4, setemojicompatenabled, setemojicompatenabled2);
                                    return getShowPopup.INSTANCE;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        list4 = list2;
                    }
                    r12 = setemojicompatenabled3;
                    list5 = list3;
                    setemojicompatenabled5 = setemojicompatenabled4;
                    z = false;
                    r11 = list4;
                } catch (Throwable th4) {
                    try {
                        _truncate.read$default(_truncateVar, th4, null, true, 2, null);
                        IconCompatParcelizer(_truncateVar, list, list2, list3, setemojicompatenabled3, setemojicompatenabled4, setemojicompatenabled, setemojicompatenabled2);
                        return getShowPopup.INSTANCE;
                    } finally {
                        list.clear();
                    }
                }
                throw th;
            }
            parseDigitsRecursive parsedigitsrecursiveAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer();
            ?? constructreader = parsedigitsrecursiveAudioAttributesCompatParcelizer instanceof ParseDigitsTaskCharSequence ? new constructReader((ParseDigitsTaskCharSequence) parsedigitsrecursiveAudioAttributesCompatParcelizer, null, null, true, false) : new detectEncoding(parsedigitsrecursiveAudioAttributesCompatParcelizer, null, true, z);
            try {
                try {
                    parseDigitsRecursive parsedigitsrecursiveOnPause = constructreader.onPause();
                    try {
                        try {
                            if (!list5.isEmpty()) {
                                try {
                                    _truncateVar.read = _truncateVar.getRead() + 1;
                                    try {
                                        int size3 = list5.size();
                                        for (int i7 = 0; i7 < size3; i7++) {
                                            setemojicompatenabled5.write((_reportMissingRootWS) list5.get(i7));
                                        }
                                        int size4 = list5.size();
                                        for (int i8 = 0; i8 < size4; i8++) {
                                            ((_reportMissingRootWS) list5.get(i8)).read();
                                        }
                                        list3.clear();
                                    } catch (Throwable th5) {
                                        r11 = constructreader;
                                        constructreader = 0;
                                        try {
                                            _truncate.read$default(_truncateVar, th5, null, false, 6, null);
                                            constructreader = setemojicompatenabled4;
                                            IconCompatParcelizer(_truncateVar, list, list2, list3, setemojicompatenabled3, constructreader, setemojicompatenabled, setemojicompatenabled2);
                                            getShowPopup getshowpopup6 = getShowPopup.INSTANCE;
                                            try {
                                                list3.clear();
                                                r11.AudioAttributesImplApi26Parcelizer(parsedigitsrecursiveOnPause);
                                                r11.write();
                                                return getshowpopup6;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                constructreader = parsedigitsrecursiveOnPause;
                                                r12 = constructreader;
                                                r11.AudioAttributesImplApi26Parcelizer(r12);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            list3.clear();
                                            throw th7;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    r11 = constructreader;
                                    constructreader = parsedigitsrecursiveOnPause;
                                }
                            }
                            r11 = constructreader;
                            try {
                                if (setemojicompatenabled3.AudioAttributesImplApi21Parcelizer()) {
                                    try {
                                        setemojicompatenabled5.write((setButtonDrawable) r12);
                                        setButtonDrawable setbuttondrawable = (setButtonDrawable) r12;
                                        Object[] objArr2 = setbuttondrawable.write;
                                        long[] jArr2 = setbuttondrawable.AudioAttributesCompatParcelizer;
                                        int length = jArr2.length - 2;
                                        if (length >= 0) {
                                            int i9 = 0;
                                            while (true) {
                                                long j2 = jArr2[i9];
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                                    int i11 = 0;
                                                    while (i11 < i10) {
                                                        if ((j2 & 255) < 128) {
                                                            ((_reportMissingRootWS) objArr2[(i9 << 3) + i11]).AudioAttributesImplApi26Parcelizer();
                                                        }
                                                        j2 >>= 8;
                                                        i11++;
                                                        jArr2 = jArr2;
                                                    }
                                                    jArr = jArr2;
                                                    if (i10 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr = jArr2;
                                                }
                                                if (i9 == length) {
                                                    break;
                                                }
                                                i9++;
                                                jArr2 = jArr;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        r12 = parsedigitsrecursiveOnPause;
                                        try {
                                            _truncate.read$default(_truncateVar, th9, null, false, 6, null);
                                            IconCompatParcelizer(_truncateVar, list, list2, list3, setemojicompatenabled3, setemojicompatenabled4, setemojicompatenabled, setemojicompatenabled2);
                                            getShowPopup getshowpopup7 = getShowPopup.INSTANCE;
                                            r11.AudioAttributesImplApi26Parcelizer(r12);
                                            r11.write();
                                            return getshowpopup7;
                                        } finally {
                                            setemojicompatenabled3.RemoteActionCompatParcelizer();
                                        }
                                    }
                                }
                                r12 = parsedigitsrecursiveOnPause;
                                if (setemojicompatenabled4.AudioAttributesImplApi21Parcelizer()) {
                                    try {
                                        setEmojiCompatEnabled setemojicompatenabled6 = setemojicompatenabled5;
                                        Object[] objArr3 = setemojicompatenabled6.write;
                                        long[] jArr3 = setemojicompatenabled6.AudioAttributesCompatParcelizer;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j3 = jArr3[i12];
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j3 & 255) < 128) {
                                                            ((_reportMissingRootWS) objArr3[(i12 << 3) + i14]).AudioAttributesImplBaseParcelizer();
                                                        }
                                                        j3 >>= 8;
                                                    }
                                                    if (i13 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i12 == length2) {
                                                    break;
                                                }
                                                i12++;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        try {
                                            _truncate.read$default(_truncateVar, th10, null, false, 6, null);
                                            IconCompatParcelizer(_truncateVar, list, list2, list3, setemojicompatenabled3, setemojicompatenabled4, setemojicompatenabled, setemojicompatenabled2);
                                            getShowPopup getshowpopup8 = getShowPopup.INSTANCE;
                                            r11.AudioAttributesImplApi26Parcelizer(r12);
                                            r11.write();
                                            return getshowpopup8;
                                        } finally {
                                            setemojicompatenabled4.RemoteActionCompatParcelizer();
                                        }
                                    }
                                }
                                getShowPopup getshowpopup9 = getShowPopup.INSTANCE;
                                r11.AudioAttributesImplApi26Parcelizer(r12);
                                r11.write();
                                synchronized (_truncateVar.IconCompatParcelizer) {
                                    _truncateVar.onAddQueueItem();
                                }
                                parseDigitsRecursive.INSTANCE.write();
                                setemojicompatenabled2.RemoteActionCompatParcelizer();
                                setemojicompatenabled.RemoteActionCompatParcelizer();
                                _truncateVar.onCustomAction = null;
                                getShowPopup getshowpopup10 = getShowPopup.INSTANCE;
                                multiplyConjugate.INSTANCE.write(objIconCompatParcelizer2);
                                return getShowPopup.INSTANCE;
                            } catch (Throwable th11) {
                                th = th11;
                                r11.AudioAttributesImplApi26Parcelizer(r12);
                                throw th;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        r12 = parsedigitsrecursiveOnPause;
                        r11 = constructreader;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    r11.write();
                    throw th;
                }
            } catch (Throwable th15) {
                th = th15;
                r11 = constructreader;
                r11.write();
                throw th;
            }
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(3, sampleVideos);
        }

        @Override // kotlin.getModuleData
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object AudioAttributesCompatParcelizer(TopUserCompanion topUserCompanion, appendDesc appenddesc, SampleVideos<? super getShowPopup> sampleVideos) {
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = _truncate.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
            mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = appenddesc;
            return mediaBrowserCompatCustomActionResultReceiver.invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object read(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = write(new MediaBrowserCompatCustomActionResultReceiver(null), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    static /* synthetic */ void read$default(_truncate _truncateVar, Throwable th, _reportMissingRootWS _reportmissingrootws, boolean z, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            _reportmissingrootws = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        _truncateVar.read(th, _reportmissingrootws, z);
    }

    private final void read(Throwable p0, _reportMissingRootWS p1, boolean p2) throws Throwable {
        if (write.get().booleanValue() && !(p0 instanceof _getNumberFloat)) {
            synchronized (this.IconCompatParcelizer) {
                imag.write("Error was captured in composition while live edit was enabled.", p0);
                this.MediaBrowserCompatSearchResultReceiver.clear();
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
                this.AudioAttributesImplBaseParcelizer = new setEmojiCompatEnabled<>(0, 1, null);
                this.RatingCompat.clear();
                OutputDecorator.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
                this.onPause = new read(p2, p0);
                if (p1 != null) {
                    AudioAttributesImplApi21Parcelizer(p1);
                }
                onAddQueueItem();
            }
            return;
        }
        synchronized (this.IconCompatParcelizer) {
            imag.write("Error was captured in composition.", p0);
            read readVar = this.onPause;
            if (readVar == null) {
                this.onPause = new read(false, p0);
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } else {
                throw readVar.getIconCompatParcelizer();
            }
        }
        throw p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<_reportMissingRootWS> onPrepareFromMediaId() {
        List<_reportMissingRootWS> listOnPlayFromSearch;
        synchronized (this.IconCompatParcelizer) {
            listOnPlayFromSearch = onPlayFromSearch();
        }
        return listOnPlayFromSearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<_reportMissingRootWS> onPlayFromSearch() {
        List list = this.AudioAttributesImplApi21Parcelizer;
        if (list != null) {
            return list;
        }
        List<_reportMissingRootWS> list2 = this.AudioAttributesImplApi26Parcelizer;
        ArrayList arrayListRemoteActionCompatParcelizer = list2.isEmpty() ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : new ArrayList(list2);
        this.AudioAttributesImplApi21Parcelizer = arrayListRemoteActionCompatParcelizer;
        return arrayListRemoteActionCompatParcelizer;
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        List<_reportMissingRootWS> listOnPlayFromSearch = onPlayFromSearch();
        int size = listOnPlayFromSearch.size();
        for (int i = 0; i < size; i++) {
            AudioAttributesImplBaseParcelizer(listOnPlayFromSearch.get(i));
        }
        this.AudioAttributesImplApi26Parcelizer.clear();
        this.AudioAttributesImplApi21Parcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    private final void AudioAttributesImplApi26Parcelizer(_reportMissingRootWS p0) {
        if (this.AudioAttributesImplApi26Parcelizer.remove(p0)) {
            this.AudioAttributesImplApi21Parcelizer = null;
            AudioAttributesImplBaseParcelizer(p0);
        }
    }

    private final void write(_reportMissingRootWS p0) {
        this.AudioAttributesImplApi26Parcelizer.add(p0);
        this.AudioAttributesImplApi21Parcelizer = null;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(_reportMissingRootWS p0) {
        setDropDownBackgroundResource<_closeScope> setdropdownbackgroundresource = this.onRemoveQueueItem;
        if (setdropdownbackgroundresource != null) {
            setDropDownBackgroundResource<_closeScope> setdropdownbackgroundresource2 = setdropdownbackgroundresource;
            Object[] objArr = setdropdownbackgroundresource2.IconCompatParcelizer;
            int i = setdropdownbackgroundresource2.RemoteActionCompatParcelizer;
            for (int i2 = 0; i2 < i; i2++) {
                _closeScope _closescope = (_closeScope) objArr[i2];
                if (p0 instanceof _matchTrue) {
                    _closescope.write((_matchTrue) p0);
                }
            }
        }
    }

    private final void AudioAttributesImplBaseParcelizer(_reportMissingRootWS p0) {
        setDropDownBackgroundResource<_closeScope> setdropdownbackgroundresource = this.onRemoveQueueItem;
        if (setdropdownbackgroundresource != null) {
            setDropDownBackgroundResource<_closeScope> setdropdownbackgroundresource2 = setdropdownbackgroundresource;
            Object[] objArr = setdropdownbackgroundresource2.IconCompatParcelizer;
            int i = setdropdownbackgroundresource2.RemoteActionCompatParcelizer;
            for (int i2 = 0; i2 < i; i2++) {
                _closeScope _closescope = (_closeScope) objArr[i2];
                if (p0 instanceof _matchTrue) {
                    _closescope.IconCompatParcelizer((_matchTrue) p0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesImplApi21Parcelizer(_reportMissingRootWS p0) {
        ArrayList arrayList = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = arrayList;
        }
        if (!arrayList.contains(p0)) {
            arrayList.add(p0);
        }
        AudioAttributesImplApi26Parcelizer(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onMediaButtonEvent() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.IconCompatParcelizer
            monitor-enter(r0)
            o.setEmojiCompatEnabled<java.lang.Object> r1 = r2.AudioAttributesImplBaseParcelizer     // Catch: java.lang.Throwable -> L25
            boolean r1 = r1.AudioAttributesImplApi21Parcelizer()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L22
            o.UTF32Reader<o._reportMissingRootWS> r1 = r2.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L25
            int r1 = r1.getAudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L14
            goto L22
        L14:
            boolean r1 = r2.onPause()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L22
            boolean r2 = r2.onFastForward()     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L22
            r2 = 0
            goto L23
        L22:
            r2 = 1
        L23:
            monitor-exit(r0)
            return r2
        L25:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._truncate.onMediaButtonEvent():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        if (onMediaButtonEvent()) {
            return getShowPopup.INSTANCE;
        }
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        synchronized (this.IconCompatParcelizer) {
            if (!onMediaButtonEvent()) {
                this.handleMediaPlayPauseIfPendingOnHandler = setstatesolvedcount2;
                setstatesolvedcount2 = null;
            }
        }
        if (setstatesolvedcount2 != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstatesolvedcount2.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ getModuleData<TopUserCompanion, appendDesc, SampleVideos<? super getShowPopup>, Object> AudioAttributesCompatParcelizer;
        private /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ appendDesc write;

        /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o._truncate.MediaBrowserCompatItemReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: all -> 0x00c2, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x001b, B:9:0x0024, B:12:0x0035, B:14:0x0045, B:16:0x0051, B:18:0x005a, B:21:0x0063, B:24:0x0073, B:25:0x0076, B:28:0x007e, B:39:0x00a9, B:29:0x0081, B:30:0x0087, B:32:0x008d, B:35:0x0095, B:38:0x00a5), top: B:50:0x0007 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final kotlin.getShowPopup RemoteActionCompatParcelizer(kotlin._truncate r17, java.util.Set r18, kotlin.parseDigitsRecursive r19) {
            /*
                r0 = r18
                java.lang.Object r1 = kotlin._truncate.RatingCompat(r17)
                monitor-enter(r1)
                o.getResolutionSize r2 = kotlin._truncate.onCommand(r17)     // Catch: java.lang.Throwable -> Lc2
                java.lang.Object r2 = r2.IconCompatParcelizer()     // Catch: java.lang.Throwable -> Lc2
                o._truncate$IconCompatParcelizer r2 = (o._truncate.IconCompatParcelizer) r2     // Catch: java.lang.Throwable -> Lc2
                o._truncate$IconCompatParcelizer r3 = o._truncate.IconCompatParcelizer.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Lc2
                java.lang.Enum r3 = (java.lang.Enum) r3     // Catch: java.lang.Throwable -> Lc2
                int r2 = r2.compareTo(r3)     // Catch: java.lang.Throwable -> Lc2
                if (r2 < 0) goto Lae
                o.setEmojiCompatEnabled r2 = kotlin._truncate.MediaBrowserCompatSearchResultReceiver(r17)     // Catch: java.lang.Throwable -> Lc2
                boolean r3 = r0 instanceof kotlin.loadMore
                r4 = 1
                if (r3 == 0) goto L81
                o.loadMore r0 = (kotlin.loadMore) r0     // Catch: java.lang.Throwable -> Lc2
                o.setButtonDrawable r0 = r0.RemoteActionCompatParcelizer()     // Catch: java.lang.Throwable -> Lc2
                java.lang.Object[] r3 = r0.write     // Catch: java.lang.Throwable -> Lc2
                long[] r0 = r0.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> Lc2
                int r5 = r0.length     // Catch: java.lang.Throwable -> Lc2
                int r5 = r5 + (-2)
                if (r5 < 0) goto La9
                r6 = 0
                r7 = r6
            L35:
                r8 = r0[r7]     // Catch: java.lang.Throwable -> Lc2
                long r10 = ~r8     // Catch: java.lang.Throwable -> Lc2
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L7c
                int r10 = r7 - r5
                int r10 = ~r10     // Catch: java.lang.Throwable -> Lc2
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L4f:
                if (r12 >= r10) goto L7a
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L76
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]     // Catch: java.lang.Throwable -> Lc2
                boolean r14 = r13 instanceof kotlin.constructParser
                if (r14 == 0) goto L73
                r14 = r13
                o.constructParser r14 = (kotlin.constructParser) r14     // Catch: java.lang.Throwable -> Lc2
                o.DoubleToDecimal$read r15 = kotlin.DoubleToDecimal.INSTANCE     // Catch: java.lang.Throwable -> Lc2
                int r15 = kotlin.DoubleToDecimal.AudioAttributesCompatParcelizer(r4)     // Catch: java.lang.Throwable -> Lc2
                boolean r14 = r14.IconCompatParcelizer(r15)     // Catch: java.lang.Throwable -> Lc2
                if (r14 != 0) goto L73
                goto L76
            L73:
                r2.write(r13)     // Catch: java.lang.Throwable -> Lc2
            L76:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L4f
            L7a:
                if (r10 != r11) goto La9
            L7c:
                if (r7 == r5) goto La9
                int r7 = r7 + 1
                goto L35
            L81:
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> Lc2
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc2
            L87:
                boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc2
                if (r3 == 0) goto La9
                java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Lc2
                boolean r5 = r3 instanceof kotlin.constructParser
                if (r5 == 0) goto La5
                r5 = r3
                o.constructParser r5 = (kotlin.constructParser) r5     // Catch: java.lang.Throwable -> Lc2
                o.DoubleToDecimal$read r6 = kotlin.DoubleToDecimal.INSTANCE     // Catch: java.lang.Throwable -> Lc2
                int r6 = kotlin.DoubleToDecimal.AudioAttributesCompatParcelizer(r4)     // Catch: java.lang.Throwable -> Lc2
                boolean r5 = r5.IconCompatParcelizer(r6)     // Catch: java.lang.Throwable -> Lc2
                if (r5 != 0) goto La5
                goto L87
            La5:
                r2.write(r3)     // Catch: java.lang.Throwable -> Lc2
                goto L87
            La9:
                o.setStateRank r0 = kotlin._truncate.read(r17)     // Catch: java.lang.Throwable -> Lc2
                goto Laf
            Lae:
                r0 = 0
            Laf:
                monitor-exit(r1)
                if (r0 == 0) goto Lbf
                o.SampleVideos r0 = (kotlin.SampleVideos) r0
                o.getRfBanners$IconCompatParcelizer r1 = kotlin.C0177getRfBanners.IconCompatParcelizer
                o.getShowPopup r1 = kotlin.getShowPopup.INSTANCE
                java.lang.Object r1 = kotlin.C0177getRfBanners.read(r1)
                r0.resumeWith(r1)
            Lbf:
                o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
                return r0
            Lc2:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o._truncate.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(o._truncate, java.util.Set, o.parseDigitsRecursive):o.getShowPopup");
        }

        /* JADX INFO: renamed from: o._truncate$MediaBrowserCompatItemReceiver$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            final /* synthetic */ getModuleData<TopUserCompanion, appendDesc, SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer;
            int read;
            final /* synthetic */ appendDesc write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesCompatParcelizer;
                    getModuleData<TopUserCompanion, appendDesc, SampleVideos<? super getShowPopup>, Object> getmoduledata = this.RemoteActionCompatParcelizer;
                    appendDesc appenddesc = this.write;
                    this.read = 1;
                    if (getmoduledata.AudioAttributesCompatParcelizer(topUserCompanion, appenddesc, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(getModuleData<? super TopUserCompanion, ? super appendDesc, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, appendDesc appenddesc, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = getmoduledata;
                this.write = appenddesc;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
                anonymousClass4.AudioAttributesCompatParcelizer = obj;
                return anonymousClass4;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        MediaBrowserCompatItemReceiver(getModuleData<? super TopUserCompanion, ? super appendDesc, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, appendDesc appenddesc, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = getmoduledata;
            this.write = appenddesc;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver = _truncate.this.new MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, this.write, sampleVideos);
            mediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer = obj;
            return mediaBrowserCompatItemReceiver;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final Object write(getModuleData<? super TopUserCompanion, ? super appendDesc, ? super SampleVideos<? super getShowPopup>, ? extends Object> getmoduledata, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaBrowserCompatItemReceiver(getmoduledata, TokenFilterInclusion.IconCompatParcelizer(sampleVideos.getWrite()), null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this.IconCompatParcelizer) {
            if (this.onMediaButtonEvent.IconCompatParcelizer().compareTo(IconCompatParcelizer.AudioAttributesCompatParcelizer) >= 0) {
                this.onMediaButtonEvent.write(IconCompatParcelizer.MediaBrowserCompatItemReceiver);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        this.onPrepare.RemoteActionCompatParcelizer((CancellationException) null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<IconCompatParcelizer, SampleVideos<? super Boolean>, Object> {
        int AudioAttributesCompatParcelizer;
        /* synthetic */ Object read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.AudioAttributesCompatParcelizer != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            return QBankStatsResponse.AudioAttributesCompatParcelizer(((IconCompatParcelizer) this.read) == IconCompatParcelizer.read);
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(sampleVideos);
            remoteActionCompatParcelizer.read = obj;
            return remoteActionCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(IconCompatParcelizer iconCompatParcelizer, SampleVideos<? super Boolean> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(iconCompatParcelizer, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = VerifyNewNumberRequest.write(RatingCompat(), new RemoteActionCompatParcelizer(null), sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    @Override // kotlin.convertNumberToLong
    public final _contentReference write(getCreatedOnDateMs<getShowPopup> p0) {
        return this.AudioAttributesCompatParcelizer.read(p0);
    }

    @Override // kotlin.convertNumberToLong
    public final void IconCompatParcelizer(_reportMissingRootWS p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) throws Throwable {
        boolean z;
        boolean zMediaMetadataCompat = p0.MediaMetadataCompat();
        synchronized (this.IconCompatParcelizer) {
            if (this.onMediaButtonEvent.IconCompatParcelizer().compareTo(IconCompatParcelizer.MediaBrowserCompatItemReceiver) > 0) {
                boolean zContains = onPlayFromSearch().contains(p0);
                z = !zContains;
                if (!zContains) {
                    MediaBrowserCompatCustomActionResultReceiver(p0);
                }
            } else {
                z = true;
            }
        }
        try {
            ParseDigitsTaskCharSequence parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver(p0), IconCompatParcelizer(p0, (setEmojiCompatEnabled<Object>) null));
            try {
                ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer;
                parseDigitsRecursive parsedigitsrecursiveOnPause = parseDigitsTaskCharSequence.onPause();
                try {
                    p0.AudioAttributesCompatParcelizer(p1);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    synchronized (this.IconCompatParcelizer) {
                        if (this.onMediaButtonEvent.IconCompatParcelizer().compareTo(IconCompatParcelizer.MediaBrowserCompatItemReceiver) > 0) {
                            if (!onPlayFromSearch().contains(p0)) {
                                write(p0);
                            }
                        } else {
                            AudioAttributesImplBaseParcelizer(p0);
                        }
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    }
                    if (!zMediaMetadataCompat) {
                        parseDigitsRecursive.INSTANCE.write();
                    }
                    try {
                        IconCompatParcelizer(p0);
                        try {
                            p0.read();
                            p0.AudioAttributesImplApi26Parcelizer();
                            if (zMediaMetadataCompat) {
                                return;
                            }
                            parseDigitsRecursive.INSTANCE.write();
                        } catch (Throwable th) {
                            read$default(this, th, null, false, 6, null);
                        }
                    } catch (Throwable th2) {
                        read(th2, p0, true);
                    }
                } finally {
                    parseDigitsTaskCharSequence.AudioAttributesImplApi26Parcelizer(parsedigitsrecursiveOnPause);
                }
            } finally {
                IconCompatParcelizer(parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer);
            }
        } catch (Throwable th3) {
            if (z) {
                synchronized (this.IconCompatParcelizer) {
                    AudioAttributesImplBaseParcelizer(p0);
                    getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                }
            }
            read(th3, p0, true);
        }
    }

    @Override // kotlin.convertNumberToLong
    public final setButtonDrawable<rawReference> write(_reportMissingRootWS p0, isResourceManaged p1, setButtonDrawable<rawReference> p2) {
        try {
            onPrepare();
            p0.write(freeBuffers.write(p2));
            isResourceManaged isresourcemanagedIconCompatParcelizer = p0.IconCompatParcelizer(p1);
            try {
                _reportMissingRootWS _reportmissingrootwsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, (setEmojiCompatEnabled<Object>) null);
                if (_reportmissingrootwsAudioAttributesCompatParcelizer != null) {
                    IconCompatParcelizer(p0);
                    _reportmissingrootwsAudioAttributesCompatParcelizer.read();
                    _reportmissingrootwsAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                }
                setEmojiCompatEnabled<rawReference> setemojicompatenabledAudioAttributesCompatParcelizer = this.onPlayFromMediaId.AudioAttributesCompatParcelizer();
                return setemojicompatenabledAudioAttributesCompatParcelizer != null ? setemojicompatenabledAudioAttributesCompatParcelizer : setSupportAllCaps.IconCompatParcelizer();
            } finally {
                p0.IconCompatParcelizer(isresourcemanagedIconCompatParcelizer);
            }
        } finally {
            this.onPlayFromMediaId.IconCompatParcelizer(null);
        }
    }

    @Override // kotlin.convertNumberToLong
    public final void IconCompatParcelizer(rawReference p0) {
        setEmojiCompatEnabled<rawReference> setemojicompatenabledAudioAttributesCompatParcelizer = this.onPlayFromMediaId.AudioAttributesCompatParcelizer();
        if (setemojicompatenabledAudioAttributesCompatParcelizer == null) {
            setemojicompatenabledAudioAttributesCompatParcelizer = setSupportAllCaps.AudioAttributesCompatParcelizer();
            this.onPlayFromMediaId.IconCompatParcelizer(setemojicompatenabledAudioAttributesCompatParcelizer);
        }
        setemojicompatenabledAudioAttributesCompatParcelizer.write(p0);
    }

    private final void IconCompatParcelizer(_reportMissingRootWS p0) {
        synchronized (this.IconCompatParcelizer) {
            List<getFilter> list = this.RatingCompat;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(list.get(i).getRead(), p0)) {
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    write(arrayList, this, p0);
                    while (!arrayList.isEmpty()) {
                        RemoteActionCompatParcelizer(arrayList, (setEmojiCompatEnabled<Object>) null);
                        write(arrayList, this, p0);
                    }
                    return;
                }
            }
        }
    }

    private static final void write(List<getFilter> list, _truncate _truncateVar, _reportMissingRootWS _reportmissingrootws) {
        list.clear();
        synchronized (_truncateVar.IconCompatParcelizer) {
            Iterator<getFilter> it = _truncateVar.RatingCompat.iterator();
            while (it.hasNext()) {
                getFilter next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(next.getRead(), _reportmissingrootws)) {
                    list.add(next);
                    it.remove();
                }
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _reportMissingRootWS AudioAttributesCompatParcelizer(final _reportMissingRootWS p0, final setEmojiCompatEnabled<Object> p1) {
        Set<_reportMissingRootWS> set;
        if (p0.MediaMetadataCompat() || p0.IconCompatParcelizer() || ((set = this.onCustomAction) != null && set.contains(p0))) {
            return null;
        }
        ParseDigitsTaskCharSequence parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer = parseDigitsRecursive.INSTANCE.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver(p0), IconCompatParcelizer(p0, p1));
        try {
            ParseDigitsTaskCharSequence parseDigitsTaskCharSequence = parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer;
            parseDigitsRecursive parsedigitsrecursiveOnPause = parseDigitsTaskCharSequence.onPause();
            if (p1 != null) {
                try {
                    if (p1.AudioAttributesImplApi21Parcelizer()) {
                        p0.IconCompatParcelizer(new getCreatedOnDateMs() { // from class: o.IOContext
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return _truncate.read(p1, p0);
                            }
                        });
                    }
                } finally {
                    parseDigitsTaskCharSequence.AudioAttributesImplApi26Parcelizer(parsedigitsrecursiveOnPause);
                }
            }
            if (p0.MediaBrowserCompatMediaItem()) {
                return p0;
            }
            return null;
        } finally {
            IconCompatParcelizer(parseDigitsTaskCharSequenceAudioAttributesCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup read(kotlin.setEmojiCompatEnabled r13, kotlin._reportMissingRootWS r14) {
        /*
            o.setButtonDrawable r13 = (kotlin.setButtonDrawable) r13
            java.lang.Object[] r0 = r13.write
            long[] r13 = r13.AudioAttributesCompatParcelizer
            int r1 = r13.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L45
            r2 = 0
            r3 = r2
        Ld:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L40
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L27:
            if (r8 >= r6) goto L3e
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3a
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r14.write(r9)
        L3a:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L27
        L3e:
            if (r6 != r7) goto L45
        L40:
            if (r3 == r1) goto L45
            int r3 = r3 + 1
            goto Ld
        L45:
            o.getShowPopup r13 = kotlin.getShowPopup.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._truncate.read(o.setEmojiCompatEnabled, o._reportMissingRootWS):o.getShowPopup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i;
        setDropDownBackgroundResource setdropdownbackgroundresourceAudioAttributesCompatParcelizer;
        synchronized (this.IconCompatParcelizer) {
            if (OutputDecorator.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatMediaItem)) {
                setTextAppearance settextappearanceAudioAttributesImplBaseParcelizer = OutputDecorator.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatMediaItem);
                OutputDecorator.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                this.MediaMetadataCompat.AudioAttributesCompatParcelizer();
                OutputDecorator.IconCompatParcelizer(this.onCommand);
                setDropDownBackgroundResource setdropdownbackgroundresource = new setDropDownBackgroundResource(settextappearanceAudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer());
                Object[] objArr = settextappearanceAudioAttributesImplBaseParcelizer.IconCompatParcelizer;
                int i2 = settextappearanceAudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
                for (int i3 = 0; i3 < i2; i3++) {
                    getFilter getfilter = (getFilter) objArr[i3];
                    setdropdownbackgroundresource.AudioAttributesCompatParcelizer(setAction.write(getfilter, this.MediaDescriptionCompat.AudioAttributesImplApi26Parcelizer(getfilter)));
                }
                setdropdownbackgroundresourceAudioAttributesCompatParcelizer = setdropdownbackgroundresource;
                this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
            } else {
                setdropdownbackgroundresourceAudioAttributesCompatParcelizer = setSupportCompoundDrawablesTintMode.AudioAttributesCompatParcelizer();
            }
        }
        Object[] objArr2 = setdropdownbackgroundresourceAudioAttributesCompatParcelizer.IconCompatParcelizer;
        int i4 = setdropdownbackgroundresourceAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        for (i = 0; i < i4; i++) {
            Pair pair = (Pair) objArr2[i];
            getFilter getfilter2 = (getFilter) pair.RemoteActionCompatParcelizer();
            checkValue checkvalue = (checkValue) pair.read();
            if (checkvalue != null) {
                getfilter2.getRead().RemoteActionCompatParcelizer(checkvalue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_reportMissingRootWS _reportmissingrootws, Object obj) {
        _reportmissingrootws.IconCompatParcelizer(obj);
        return getShowPopup.INSTANCE;
    }

    private final getAnswerMap<Object, getShowPopup> MediaBrowserCompatItemReceiver(final _reportMissingRootWS p0) {
        return new getAnswerMap() { // from class: o.buildSourceDescription
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return _truncate.IconCompatParcelizer(p0, obj);
            }
        };
    }

    private final getAnswerMap<Object, getShowPopup> IconCompatParcelizer(final _reportMissingRootWS p0, final setEmojiCompatEnabled<Object> p1) {
        return new getAnswerMap() { // from class: o.getRawContent
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return _truncate.write(p0, p1, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_reportMissingRootWS _reportmissingrootws, setEmojiCompatEnabled setemojicompatenabled, Object obj) {
        _reportmissingrootws.write(obj);
        if (setemojicompatenabled != null) {
            setemojicompatenabled.write(obj);
        }
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(ParseDigitsTaskCharSequence p0) {
        try {
            if (p0.IconCompatParcelizer() instanceof charsToString.IconCompatParcelizer) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            p0.write();
        }
    }

    private final boolean onPlayFromMediaId() {
        return this.MediaBrowserCompatItemReceiver.getAudioAttributesCompatParcelizer() != 0 || onPause() || onFastForward() || OutputDecorator.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatMediaItem);
    }

    public final void onCustomAction() {
        synchronized (this.IconCompatParcelizer) {
            this.onPlay = true;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void onCommand() {
        setStateRank<getShowPopup> setstaterankOnAddQueueItem;
        synchronized (this.IconCompatParcelizer) {
            if (this.onPlay) {
                this.onPlay = false;
                setstaterankOnAddQueueItem = onAddQueueItem();
            } else {
                setstaterankOnAddQueueItem = null;
            }
        }
        if (setstaterankOnAddQueueItem != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterankOnAddQueueItem.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
    }

    @Override // kotlin.convertNumberToLong
    public final boolean write() {
        return write.get().booleanValue();
    }

    @Override // kotlin.convertNumberToLong
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final boolean getAudioAttributesCompatParcelizer() {
        return getDupDetector.read(_validJsonValueList.write(), getDupDetector.INSTANCE.IconCompatParcelizer());
    }

    @Override // kotlin.convertNumberToLong
    public final boolean MediaDescriptionCompat() {
        return !getDupDetector.read(_validJsonValueList.write(), getDupDetector.INSTANCE.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.convertNumberToLong
    public final void RemoteActionCompatParcelizer(_reportMissingRootWS p0) {
        synchronized (this.IconCompatParcelizer) {
            AudioAttributesImplApi26Parcelizer(p0);
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(p0);
            this.MediaBrowserCompatSearchResultReceiver.remove(p0);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    @Override // kotlin.convertNumberToLong
    public final void AudioAttributesCompatParcelizer(_reportMissingRootWS p0) {
        setStateRank<getShowPopup> setstaterankOnAddQueueItem;
        synchronized (this.IconCompatParcelizer) {
            if (this.MediaBrowserCompatItemReceiver.write(p0)) {
                setstaterankOnAddQueueItem = null;
            } else {
                this.MediaBrowserCompatItemReceiver.read(p0);
                setstaterankOnAddQueueItem = onAddQueueItem();
            }
        }
        if (setstaterankOnAddQueueItem != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterankOnAddQueueItem.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
    }

    @Override // kotlin.convertNumberToLong
    public final void IconCompatParcelizer(getFilter p0) {
        setStateRank<getShowPopup> setstaterankOnAddQueueItem;
        synchronized (this.IconCompatParcelizer) {
            this.RatingCompat.add(p0);
            setstaterankOnAddQueueItem = onAddQueueItem();
        }
        if (setstaterankOnAddQueueItem != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterankOnAddQueueItem.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
    }

    @Override // kotlin.convertNumberToLong
    public final void write(getFilter p0) {
        setStateRank<getShowPopup> setstaterankOnAddQueueItem;
        synchronized (this.IconCompatParcelizer) {
            OutputDecorator.write(this.MediaBrowserCompatMediaItem, p0.RemoteActionCompatParcelizer(), p0);
            if (p0.MediaBrowserCompatItemReceiver() != null) {
                RemoteActionCompatParcelizer(this, p0, p0);
            }
            setstaterankOnAddQueueItem = onAddQueueItem();
        }
        if (setstaterankOnAddQueueItem != null) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            setstaterankOnAddQueueItem.resumeWith(C0177getRfBanners.read(getShowPopup.INSTANCE));
        }
    }

    private static final void RemoteActionCompatParcelizer(_truncate _truncateVar, getFilter getfilter, getFilter getfilter2) {
        List<getFilter> listMediaBrowserCompatItemReceiver = getfilter2.MediaBrowserCompatItemReceiver();
        if (listMediaBrowserCompatItemReceiver != null) {
            int size = listMediaBrowserCompatItemReceiver.size();
            for (int i = 0; i < size; i++) {
                getFilter getfilter3 = listMediaBrowserCompatItemReceiver.get(i);
                _truncateVar.MediaMetadataCompat.read(getfilter3.RemoteActionCompatParcelizer(), new parse(getfilter3, getfilter));
                RemoteActionCompatParcelizer(_truncateVar, getfilter, getfilter3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    @Override // kotlin.convertNumberToLong
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(kotlin.getFilter r18, kotlin.checkValue r19, kotlin._closeInput<?> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.IconCompatParcelizer
            monitor-enter(r3)
            o.setKeyListener<o.getFilter, o.checkValue> r4 = r0.MediaDescriptionCompat     // Catch: java.lang.Throwable -> L71
            r4.RemoteActionCompatParcelizer(r1, r2)     // Catch: java.lang.Throwable -> L71
            o.setKeyListener<java.lang.Object, java.lang.Object> r4 = r0.onCommand     // Catch: java.lang.Throwable -> L71
            o.setTextAppearance r1 = kotlin.OutputDecorator.read(r4, r1)     // Catch: java.lang.Throwable -> L71
            boolean r4 = r1.AudioAttributesImplBaseParcelizer()     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L6d
            r4 = r20
            o.AppCompatButton r1 = r2.RemoteActionCompatParcelizer(r4, r1)     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r2 = r1.IconCompatParcelizer     // Catch: java.lang.Throwable -> L71
            java.lang.Object[] r4 = r1.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L71
            long[] r1 = r1.RemoteActionCompatParcelizer     // Catch: java.lang.Throwable -> L71
            int r5 = r1.length     // Catch: java.lang.Throwable -> L71
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6d
            r6 = 0
            r7 = r6
        L2d:
            r8 = r1[r7]     // Catch: java.lang.Throwable -> L71
            long r10 = ~r8     // Catch: java.lang.Throwable -> L71
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L68
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L71
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L47:
            if (r12 >= r10) goto L66
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L62
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L71
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L71
            o.checkValue r13 = (kotlin.checkValue) r13     // Catch: java.lang.Throwable -> L71
            o.getFilter r14 = (kotlin.getFilter) r14     // Catch: java.lang.Throwable -> L71
            o.setKeyListener<o.getFilter, o.checkValue> r15 = r0.MediaDescriptionCompat     // Catch: java.lang.Throwable -> L71
            r15.RemoteActionCompatParcelizer(r14, r13)     // Catch: java.lang.Throwable -> L71
        L62:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L47
        L66:
            if (r10 != r11) goto L6d
        L68:
            if (r7 == r5) goto L6d
            int r7 = r7 + 1
            goto L2d
        L6d:
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE     // Catch: java.lang.Throwable -> L71
            monitor-exit(r3)
            return
        L71:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._truncate.RemoteActionCompatParcelizer(o.getFilter, o.checkValue, o._closeInput):void");
    }

    @Override // kotlin.convertNumberToLong
    public final void read(_reportMissingRootWS p0) {
        synchronized (this.IconCompatParcelizer) {
            LinkedHashSet linkedHashSet = this.onCustomAction;
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                this.onCustomAction = linkedHashSet;
            }
            linkedHashSet.add(p0);
        }
    }

    @Override // kotlin.convertNumberToLong
    public final checkValue read(getFilter p0) {
        checkValue checkvalueIconCompatParcelizer;
        synchronized (this.IconCompatParcelizer) {
            checkvalueIconCompatParcelizer = this.MediaDescriptionCompat.IconCompatParcelizer(p0);
        }
        return checkvalueIconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o._truncate$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR$\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/_truncate$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/_truncate$write;", "Lo/_truncate;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/_truncate$write;)V", "IconCompatParcelizer", "Lo/getResolutionSize;", "Lo/illegalSurrogateDesc;", "RemoteActionCompatParcelizer", "Lo/getResolutionSize;", "read", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lo/read;", "write", "Ljava/util/concurrent/atomic/AtomicReference;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void AudioAttributesCompatParcelizer(write p0) {
            illegalSurrogateDesc illegalsurrogatedesc;
            illegalSurrogateDesc illegalsurrogatedesc2;
            do {
                illegalsurrogatedesc = (illegalSurrogateDesc) _truncate.RemoteActionCompatParcelizer.IconCompatParcelizer();
                illegalsurrogatedesc2 = illegalsurrogatedesc.read(p0);
                if (illegalsurrogatedesc == illegalsurrogatedesc2) {
                    return;
                }
            } while (!_truncate.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(illegalsurrogatedesc, illegalsurrogatedesc2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void IconCompatParcelizer(write p0) {
            illegalSurrogateDesc illegalsurrogatedesc;
            illegalSurrogateDesc illegalsurrogatedescRemoteActionCompatParcelizer;
            do {
                illegalsurrogatedesc = (illegalSurrogateDesc) _truncate.RemoteActionCompatParcelizer.IconCompatParcelizer();
                illegalsurrogatedescRemoteActionCompatParcelizer = illegalsurrogatedesc.RemoteActionCompatParcelizer(p0);
                if (illegalsurrogatedesc == illegalsurrogatedescRemoteActionCompatParcelizer) {
                    return;
                }
            } while (!_truncate.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(illegalsurrogatedesc, illegalsurrogatedescRemoteActionCompatParcelizer));
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.convertNumberToLong
    public final setButtonDrawable<rawReference> write(_reportMissingRootWS p0, isResourceManaged p1, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p2) {
        try {
            isResourceManaged isresourcemanagedIconCompatParcelizer = p0.IconCompatParcelizer(p1);
            try {
                IconCompatParcelizer(p0, p2);
                setEmojiCompatEnabled<rawReference> setemojicompatenabledAudioAttributesCompatParcelizer = this.onPlayFromMediaId.AudioAttributesCompatParcelizer();
                return setemojicompatenabledAudioAttributesCompatParcelizer != null ? setemojicompatenabledAudioAttributesCompatParcelizer : setSupportAllCaps.IconCompatParcelizer();
            } finally {
                p0.IconCompatParcelizer(isresourcemanagedIconCompatParcelizer);
            }
        } finally {
            this.onPlayFromMediaId.IconCompatParcelizer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016f, code lost:
    
        r0 = r11.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        if (r3 >= r0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0183, code lost:
    
        if (r11.get(r3).IconCompatParcelizer() == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0185, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0188, code lost:
    
        r0 = new java.util.ArrayList(r11.size());
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0199, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019b, code lost:
    
        r10 = r11.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a5, code lost:
    
        if (r10.IconCompatParcelizer() != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a7, code lost:
    
        r10 = r10.write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ae, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01af, code lost:
    
        if (r10 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b1, code lost:
    
        r0.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b7, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ba, code lost:
    
        r0 = r0;
        r3 = r17.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01be, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bf, code lost:
    
        kotlin.IntermediateLoginResponseBody.IconCompatParcelizer((java.util.Collection) r17.RatingCompat, (java.lang.Iterable) r0);
        r0 = kotlin.getShowPopup.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ca, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01cb, code lost:
    
        r0 = new java.util.ArrayList(r11.size());
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01dc, code lost:
    
        if (r4 >= r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01de, code lost:
    
        r10 = r11.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e9, code lost:
    
        if (r10.IconCompatParcelizer() == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        r0.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f1, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f4, code lost:
    
        r11 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<kotlin._reportMissingRootWS> RemoteActionCompatParcelizer(java.util.List<kotlin.getFilter> r18, kotlin.setEmojiCompatEnabled<java.lang.Object> r19) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._truncate.RemoteActionCompatParcelizer(java.util.List, o.setEmojiCompatEnabled):java.util.List");
    }
}
