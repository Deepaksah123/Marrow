package kotlin;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.parseDigitsRecursive;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000f-B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001b\u0010\u0015J\r\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u0015J\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u0015J5\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001f2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010 H\u0014¢\u0006\u0004\b\u000f\u0010#J'\u0010%\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J?\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001f2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010 2\b\u0010'\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b\u000f\u0010(J\r\u0010)\u001a\u00020\u0013¢\u0006\u0004\b)\u0010\u0015J=\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001f2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010 2\b\u0010'\u001a\u0004\u0018\u00010$¢\u0006\u0004\b*\u0010(J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020+2\b\u0010\u0018\u001a\u0004\u0018\u00010$¢\u0006\u0004\b*\u0010,J!\u0010%\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020+2\b\u0010\u0018\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010,J!\u0010-\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020+2\b\u0010\u0018\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u0015J-\u0010\u000f\u001a\u00020\u00132\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010 2\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010/J\u0019\u00100\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u00101J5\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u0002022\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u0002042\u0006\u0010'\u001a\u0002052\u0006\u00106\u001a\u00020\t¢\u0006\u0004\b*\u00107J=\u0010\u0019\u001a\u00020\u0013*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u0002022\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u0002042\u0006\u0010'\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u00108JM\u0010%\u001a\u00020\u0013*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u0002022\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u0002042\u0006\u0010'\u001a\u0002052\u0006\u00106\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010;JE\u0010-\u001a\u00020\u0013*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u0002022\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u0002042\u0006\u0010'\u001a\u0002052\u0006\u00106\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010<JE\u0010*\u001a\u00020\u0013*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u0002022\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u0002042\u0006\u0010'\u001a\u0002052\u0006\u00106\u001a\u00020\t2\u0006\u00109\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010<J%\u0010-\u001a\u00020\t*\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u0002032\u0006\u0010\u0018\u001a\u000205H\u0002¢\u0006\u0004\b-\u0010=J7\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u0002022\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u0002042\u0006\u0010'\u001a\u0002052\u0006\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u00107J\r\u0010?\u001a\u00020>¢\u0006\u0004\b?\u0010@J\u0017\u0010*\u001a\u0002032\u0006\u0010\u0006\u001a\u000203H\u0016¢\u0006\u0004\b*\u0010AJ\u0017\u0010\u000f\u001a\u0002032\u0006\u0010\u0006\u001a\u000203H\u0016¢\u0006\u0004\b\u000f\u0010AJ\u0017\u0010B\u001a\u0002032\u0006\u0010\u0006\u001a\u000203H\u0016¢\u0006\u0004\bB\u0010AJ\u0017\u0010%\u001a\u0002032\u0006\u0010\u0006\u001a\u000203H\u0016¢\u0006\u0004\b%\u0010AJ\u0013\u0010-\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010CJ\u001f\u0010\u000f\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u000203H\u0016¢\u0006\u0004\b\u000f\u0010DJ'\u0010\u0019\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010EJ\u001f\u0010%\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020FH\u0016¢\u0006\u0004\b%\u0010GJ\u0017\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020FH\u0016¢\u0006\u0004\b*\u0010HJ\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020FH\u0002¢\u0006\u0004\b\u0019\u0010IJ\u001f\u0010%\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020FH\u0002¢\u0006\u0004\b%\u0010IJ\u001f\u0010-\u001a\u00020>2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010JJ'\u0010%\u001a\u0002032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u0002032\u0006\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010KJ'\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020L2\u0006\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010MJ\u0017\u0010\u0019\u001a\u0002032\u0006\u0010\u0006\u001a\u000203H\u0016¢\u0006\u0004\b\u0019\u0010AJ!\u0010%\u001a\u0002032\u0006\u0010\u0006\u001a\u0002032\b\b\u0002\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010NJ!\u0010\u0019\u001a\u0002032\u0006\u0010\u0006\u001a\u0002032\b\b\u0002\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010NJ\u001f\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020OH\u0004¢\u0006\u0004\b*\u0010PJ\r\u0010Q\u001a\u00020\u0013¢\u0006\u0004\bQ\u0010\u0015J\r\u0010R\u001a\u00020\u0013¢\u0006\u0004\bR\u0010\u0015J)\u0010%\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020L2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\tH\u0000¢\u0006\u0004\b%\u0010SJ\u001f\u0010*\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020L2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010TJ\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u000203H\u0004¢\u0006\u0004\b\u0016\u0010UJ\u0017\u0010V\u001a\u00020\t2\u0006\u0010\u0006\u001a\u000203H\u0004¢\u0006\u0004\bV\u0010UJ\u000f\u0010W\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010\u0015J\u000f\u0010X\u001a\u00020\u0013H\u0016¢\u0006\u0004\bX\u0010\u0015J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b*\u0010YJ\r\u0010Z\u001a\u00020\t¢\u0006\u0004\bZ\u0010\u0012J\u0017\u0010[\u001a\u0002032\u0006\u0010\u0006\u001a\u000203H\u0002¢\u0006\u0004\b[\u0010AJ\u0017\u00100\u001a\u00020\\2\u0006\u0010\u0006\u001a\u00020\\H\u0004¢\u0006\u0004\b0\u0010AJ\u001f\u0010-\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u0002032\u0006\u0010\u0018\u001a\u00020\\H\u0004¢\u0006\u0004\b-\u0010]R\u001a\u0010\u0019\u001a\u00020\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u000f\u001a\u00020\t8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\bb\u0010c\"\u0004\bV\u00101R\"\u0010*\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bd\u0010c\u001a\u0004\be\u0010\u0012\"\u0004\b-\u00101R\u0014\u0010-\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR$\u0010%\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010h\u001a\u0004\bi\u0010j\"\u0004\bV\u0010kR$\u0010n\u001a\u0004\u0018\u00010\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bl\u0010h\u001a\u0004\bm\u0010j\"\u0004\bn\u0010kR\u0014\u0010V\u001a\u00020o8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010pR\u0014\u00100\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010qR\u0014\u0010B\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010qR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010\u0016\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bv\u0010cR\u0011\u0010y\u001a\u00020w8G¢\u0006\u0006\u001a\u0004\b-\u0010xR\u0016\u0010{\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bz\u0010cR:\u0010}\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010 2\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010 8\u0004@BX\u0085\u000e¢\u0006\u0006\n\u0004\b*\u0010|R\u0017\u0010f\u001a\u00020~8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010z\u001a\u00020o8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010b\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b`\u0010\u0083\u0001R\u0017\u0010d\u001a\u00030\u0084\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010sR\u0016\u0010\u0088\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0012R\u0014\u0010r\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0012R\u001b\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b[\u0010\u008a\u0001R)\u0010t\u001a\u00030\u0089\u00012\u0007\u0010\u0006\u001a\u00030\u0089\u00018Q@QX\u0090\u000e¢\u0006\u000f\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0005\b\u000f\u0010\u008d\u0001R,\u0010`\u001a\u0005\u0018\u00010\u008e\u00012\t\u0010\u0006\u001a\u0005\u0018\u00010\u008e\u00018'@eX¦\u000e¢\u0006\u000e\u001a\u0005\b}\u0010\u008f\u0001\"\u0005\b-\u0010\u0090\u0001R\"\u0010^\u001a\f\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u0091\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R/\u0010\u0093\u0001\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8\u0017@UX\u0097\u000e¢\u0006\u0016\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010x\"\u0005\b}\u0010\u0098\u0001R \u0010\u0081\u0001\u001a\u00020\u001f8\u0007@DX\u0087\f¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u0083\u0001\u001a\u0005\b\u009a\u0001\u0010qR\u0019\u0010\u007f\u001a\u0005\u0018\u00010\u009b\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0014\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010uR\u0014\u0010l\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010uR\u001a\u0010 \u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b{\u0010\u009f\u0001R\u0016\u0010\u0014\u001a\u00020L8EX\u0084\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0017\u0010\u0095\u0001\u001a\u00030£\u00018CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bd\u0010¤\u0001R\u001b\u0010v\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010¦\u0001R\u0017\u0010©\u0001\u001a\u00030§\u00018AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010xR(\u0010e\u001a\u00030ª\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0005\b\u0019\u0010®\u0001R%\u0010\u0099\u0001\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0005\b\u0088\u0001\u0010c\u001a\u0005\b©\u0001\u0010\u0012\"\u0004\bn\u00101R%\u0010°\u0001\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0014\n\u0005\b \u0001\u0010c\u001a\u0005\b¯\u0001\u0010\u0012\"\u0004\bB\u00101R\u001a\u0010\u0085\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\by\u0010±\u0001R\u001a\u0010¨\u0001\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b}\u0010²\u0001R/\u0010µ\u0001\u001a\u0019\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u0013\u0018\u00010³\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010´\u0001R+\u0010¬\u0001\u001a\u0017\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00130³\u00018CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bb\u0010¶\u0001R\u001d\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130·\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bf\u0010¸\u0001R&\u0010\u009e\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0001@BX\u0081\u000e¢\u0006\r\n\u0004\br\u0010c\u001a\u0005\b\u0099\u0001\u0010\u0012R-\u0010i\u001a\u0005\u0018\u00010º\u00012\t\u0010\u0006\u001a\u0005\u0018\u00010º\u00018\u0007@BX\u0087\u000e¢\u0006\u000f\n\u0005\bt\u0010»\u0001\u001a\u0006\bµ\u0001\u0010¼\u0001R\u001b\u0010¯\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010±\u0001R\u0015\u0010m\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010\u0012R\u0013\u0010¡\u0001\u001a\u00020\\8G¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010x"}, d2 = {"Lo/_bindAndClose;", "Lo/createDeserializationContext;", "Lo/isTypeOrSuperTypeOf;", "Lo/isAbstract;", "Lo/createDummyDeserializationContext;", "Lo/_assertNotNull;", "p0", "<init>", "(Lo/_assertNotNull;)V", "", "Lo/_handleOddName$IconCompatParcelizer;", "MediaBrowserCompatItemReceiver", "(Z)Lo/_handleOddName$IconCompatParcelizer;", "Lo/_bind;", "(I)Z", "RemoteActionCompatParcelizer", "(I)Lo/_handleOddName$IconCompatParcelizer;", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "()Z", "", "onRewind", "()V", "RatingCompat", "", "p1", "IconCompatParcelizer", "(II)V", "PlaybackStateCompatCustomAction", "r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0", "_init_lambda3", "Lo/hasReferringProperties;", "", "Lkotlin/Function1;", "Lo/validateAppend;", "p2", "(JFLo/getAnswerMap;)V", "Lo/hasAnyGetter;", "read", "(JFLo/hasAnyGetter;)V", "p3", "(JFLo/getAnswerMap;Lo/hasAnyGetter;)V", "r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28", "AudioAttributesCompatParcelizer", "Lo/JsonParserDelegate;", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "write", "_init_lambda2", "(Lo/getAnswerMap;Z)V", "MediaBrowserCompatCustomActionResultReceiver", "(Z)V", "Lo/_bindAndClose$RemoteActionCompatParcelizer;", "Lo/getReferencedType;", "Lo/addValueInstantiators;", "Lo/handleWeirdNumberValue;", "p4", "(Lo/_bindAndClose$RemoteActionCompatParcelizer;JLo/addValueInstantiators;IZ)V", "(Lo/_handleOddName$IconCompatParcelizer;Lo/_bindAndClose$RemoteActionCompatParcelizer;JLo/addValueInstantiators;IZ)V", "p5", "p6", "(Lo/_handleOddName$IconCompatParcelizer;Lo/_bindAndClose$RemoteActionCompatParcelizer;JLo/addValueInstantiators;IZFZ)V", "(Lo/_handleOddName$IconCompatParcelizer;Lo/_bindAndClose$RemoteActionCompatParcelizer;JLo/addValueInstantiators;IZF)V", "(Lo/_handleOddName$IconCompatParcelizer;JI)Z", "Lo/WritableTypeIdInclusion;", "_init_lambda4", "()Lo/WritableTypeIdInclusion;", "(J)J", "AudioAttributesImplBaseParcelizer", "(Lo/isAbstract;)Lo/_bindAndClose;", "(Lo/isAbstract;J)J", "(Lo/isAbstract;JZ)J", "Lo/resetWithShared;", "(Lo/isAbstract;[F)V", "([F)V", "(Lo/_bindAndClose;[F)V", "(Lo/isAbstract;Z)Lo/WritableTypeIdInclusion;", "(Lo/_bindAndClose;JZ)J", "Lo/getType;", "(Lo/_bindAndClose;Lo/getType;Z)V", "(JZ)J", "Lo/releaseBuffers;", "(Lo/JsonParserDelegate;Lo/releaseBuffers;)V", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8", "(Lo/getType;ZZ)V", "(Lo/getType;Z)V", "(J)Z", "AudioAttributesImplApi21Parcelizer", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "ResultReceiver", "(Lo/_bindAndClose;)Lo/_bindAndClose;", "_init_lambda5", "MediaBrowserCompatMediaItem", "Lo/calloc;", "(JJ)F", "onPlayFromSearch", "Lo/_assertNotNull;", "onPause", "()Lo/_assertNotNull;", "handleMediaPlayPauseIfPendingOnHandler", "Z", "onCustomAction", "onSetRepeatMode", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/_handleOddName$IconCompatParcelizer;", "Lo/_bindAndClose;", "MediaSessionCompatResultReceiverWrapper", "()Lo/_bindAndClose;", "(Lo/_bindAndClose;)V", "onPrepareFromUri", "MediaSessionCompatQueueItem", "AudioAttributesImplApi26Parcelizer", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "()F", "onPlayFromMediaId", "()Lo/createDeserializationContext;", "onFastForward", "()Lo/isAbstract;", "onRemoveQueueItemAt", "Lo/getKey;", "()J", "MediaBrowserCompatSearchResultReceiver", "onCommand", "MediaDescriptionCompat", "Lo/getAnswerMap;", "MediaMetadataCompat", "Lo/bufferMapProperty;", "onPrepareFromMediaId", "Lo/bufferMapProperty;", "onPlayFromUri", "Lo/tryToResolveUnresolved;", "F", "Lo/KeyDeserializer;", "onSetPlaybackSpeed", "()Lo/KeyDeserializer;", "onAddQueueItem", "onPlay", "Lo/withHandlersFrom;", "Lo/withHandlersFrom;", "onMediaButtonEvent", "()Lo/withHandlersFrom;", "(Lo/withHandlersFrom;)V", "Lo/readerFor;", "()Lo/readerFor;", "(Lo/readerFor;)V", "Lo/AlertDialogLayout;", "Lo/weirdNumberException;", "onPrepareFromSearch", "Lo/AlertDialogLayout;", "onSeekTo", "J", "onPrepare", "(J)V", "onSetRating", "PlaybackStateCompat", "", "q_", "()Ljava/lang/Object;", "onStop", "Lo/getType;", "onRemoveQueueItem", "ParcelableVolumeInfo", "()Lo/getType;", "Lo/PropertyMetadata;", "()Lo/PropertyMetadata;", "Lo/setNamingStrategy;", "Lo/setNamingStrategy;", "Lo/PropertyValueAny;", "setSessionImpl", "onSetShuffleMode", "Lo/findAndAddVirtualProperties;", "Lo/findAndAddVirtualProperties;", "onSkipToNext", "()Lo/findAndAddVirtualProperties;", "(Lo/findAndAddVirtualProperties;)V", "MediaSessionCompatToken", "onSetCaptioningEnabled", "Lo/hasAnyGetter;", "Lo/JsonParserDelegate;", "Lkotlin/Function2;", "Lo/MagicModuleSubmissionRequestBody;", "onSkipToPrevious", "()Lo/MagicModuleSubmissionRequestBody;", "Lkotlin/Function0;", "Lo/getCreatedOnDateMs;", "onSkipToQueueItem", "Lo/_reportUnkownFormat;", "Lo/_reportUnkownFormat;", "()Lo/_reportUnkownFormat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class _bindAndClose extends createDeserializationContext implements isTypeOrSuperTypeOf, isAbstract, createDummyDeserializationContext {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    protected getAnswerMap<? super validateAppend, getShowPopup> MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private withHandlersFrom onMediaButtonEvent;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private hasAnyGetter onSetPlaybackSpeed;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private getType onRemoveQueueItem;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private JsonParserDelegate setSessionImpl;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> onSkipToPrevious;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private hasAnyGetter MediaSessionCompatToken;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private _reportUnkownFormat MediaSessionCompatResultReceiverWrapper;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private boolean onSetRating;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private boolean onStop;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final _assertNotNull IconCompatParcelizer;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private setNamingStrategy onRemoveQueueItemAt;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private AlertDialogLayout<weirdNumberException> onPlayFromSearch;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private _bindAndClose AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private boolean onSetCaptioningEnabled;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private _bindAndClose read;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private float onPlayFromUri;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final getAnswerMap<_bindAndClose, getShowPopup> AudioAttributesImplApi21Parcelizer = AnonymousClass2.IconCompatParcelizer;
    private static final getAnswerMap<_bindAndClose, getShowPopup> AudioAttributesImplBaseParcelizer = AnonymousClass5.IconCompatParcelizer;
    private static final resolveAbstractType MediaBrowserCompatCustomActionResultReceiver = new resolveAbstractType();
    private static final setNamingStrategy AudioAttributesImplApi26Parcelizer = new setNamingStrategy();
    private static final float[] MediaBrowserCompatItemReceiver = resetWithShared.RemoteActionCompatParcelizer(null, 1, null);
    private static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new read();
    private static final RemoteActionCompatParcelizer read = new IconCompatParcelizer();

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private bufferMapProperty MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getIconCompatParcelizer().getOnSkipToQueueItem();

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private tryToResolveUnresolved onCommand = getIconCompatParcelizer().getOnStop();

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private float handleMediaPlayPauseIfPendingOnHandler = 0.8f;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private long onPrepareFromSearch = hasReferringProperties.INSTANCE.write();

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private findAndAddVirtualProperties onSetRepeatMode = parseVersion.read();

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> onSkipToQueueItem = new AnonymousClass3();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH&¢\u0006\u0004\b\b\u0010\u000bJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_bindAndClose$RemoteActionCompatParcelizer;", "", "Lo/_bind;", "AudioAttributesCompatParcelizer", "()I", "Lo/_handleOddName$IconCompatParcelizer;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_handleOddName$IconCompatParcelizer;)Z", "Lo/_assertNotNull;", "(Lo/_assertNotNull;)Z", "Lo/getReferencedType;", "p1", "Lo/addValueInstantiators;", "p2", "Lo/handleWeirdNumberValue;", "p3", "p4", "", "IconCompatParcelizer", "(Lo/_assertNotNull;JLo/addValueInstantiators;IZ)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoteActionCompatParcelizer {
        int AudioAttributesCompatParcelizer();

        void IconCompatParcelizer(_assertNotNull p0, long p1, addValueInstantiators p2, int p3, boolean p4);

        boolean RemoteActionCompatParcelizer(_assertNotNull p0);

        boolean RemoteActionCompatParcelizer(_handleOddName.IconCompatParcelizer p0);
    }

    public abstract _handleOddName.IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

    /* JADX INFO: renamed from: MediaMetadataCompat */
    public abstract readerFor getWrite();

    public abstract void RatingCompat();

    protected abstract void write(readerFor readerfor);

    public _bindAndClose(_assertNotNull _assertnotnull) {
        this.IconCompatParcelizer = _assertnotnull;
    }

    @Override // kotlin.createDeserializationContext, kotlin.getSerializationConfig
    /* JADX INFO: renamed from: onPause, reason: from getter */
    public _assertNotNull getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final void AudioAttributesImplApi21Parcelizer(_bindAndClose _bindandclose) {
        this.read = _bindandclose;
    }

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from getter */
    public final _bindAndClose getRead() {
        return this.read;
    }

    public final void AudioAttributesImplApi26Parcelizer(_bindAndClose _bindandclose) {
        this.AudioAttributesImplApi26Parcelizer = _bindandclose;
    }

    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: from getter */
    public final _bindAndClose getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.getValueHandler
    /* JADX INFO: renamed from: read */
    public tryToResolveUnresolved getRead() {
        return getIconCompatParcelizer().getOnStop();
    }

    @Override // kotlin.bufferMapProperty
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public float getRead() {
        return getIconCompatParcelizer().getOnSkipToQueueItem().getRead();
    }

    @Override // kotlin.getParameter
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
    public float getIconCompatParcelizer() {
        return getIconCompatParcelizer().getOnSkipToQueueItem().getIconCompatParcelizer();
    }

    @Override // kotlin.createDeserializationContext
    public createDeserializationContext onPlayFromMediaId() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.createDeserializationContext
    public isAbstract onFastForward() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final _handleOddName.IconCompatParcelizer MediaBrowserCompatItemReceiver(boolean p0) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (getIconCompatParcelizer().r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() == this) {
            return getIconCompatParcelizer().get_init_lambda2().getAudioAttributesImplApi21Parcelizer();
        }
        if (p0) {
            _bindAndClose _bindandclose = this.AudioAttributesImplApi26Parcelizer;
            if (_bindandclose == null || (iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = _bindandclose.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) == null) {
                return null;
            }
            return iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getAudioAttributesImplBaseParcelizer();
        }
        _bindAndClose _bindandclose2 = this.AudioAttributesImplApi26Parcelizer;
        if (_bindandclose2 != null) {
            return _bindandclose2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        return null;
    }

    private final boolean MediaBrowserCompatItemReceiver(int p0) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(_findTreeDeserializer.AudioAttributesCompatParcelizer(p0));
        return iconCompatParcelizerMediaBrowserCompatItemReceiver != null && collectLongDefaults.read(iconCompatParcelizerMediaBrowserCompatItemReceiver, p0);
    }

    public final _handleOddName.IconCompatParcelizer RemoteActionCompatParcelizer(int p0) {
        boolean zAudioAttributesCompatParcelizer = _findTreeDeserializer.AudioAttributesCompatParcelizer(p0);
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (!zAudioAttributesCompatParcelizer && (iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getMediaBrowserCompatItemReceiver()) == null) {
            return null;
        }
        for (_handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(zAudioAttributesCompatParcelizer); iconCompatParcelizerMediaBrowserCompatItemReceiver != null && (iconCompatParcelizerMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer() & p0) != 0; iconCompatParcelizerMediaBrowserCompatItemReceiver = iconCompatParcelizerMediaBrowserCompatItemReceiver.getAudioAttributesImplBaseParcelizer()) {
            if ((iconCompatParcelizerMediaBrowserCompatItemReceiver.getWrite() & p0) != 0) {
                return iconCompatParcelizerMediaBrowserCompatItemReceiver;
            }
            if (iconCompatParcelizerMediaBrowserCompatItemReceiver == iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                return null;
            }
        }
        return null;
    }

    @Override // kotlin.isAbstract
    public final long write() {
        return getIconCompatParcelizer();
    }

    public final boolean r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        if (this.MediaSessionCompatResultReceiverWrapper != null && this.handleMediaPlayPauseIfPendingOnHandler <= BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        _bindAndClose _bindandclose = this.AudioAttributesImplApi26Parcelizer;
        if (_bindandclose != null) {
            return _bindandclose.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
        return false;
    }

    public KeyDeserializer onSetPlaybackSpeed() {
        return getIconCompatParcelizer().getAccessaddObserverForBackInvoker().read();
    }

    @Override // kotlin.createDeserializationContext
    public createDeserializationContext onAddQueueItem() {
        return this.read;
    }

    @Override // kotlin.createDeserializationContext
    public void onRewind() {
        hasAnyGetter hasanygetter = this.MediaSessionCompatToken;
        if (hasanygetter != null) {
            read(getRead(), this.onPlayFromUri, hasanygetter);
        } else {
            RemoteActionCompatParcelizer(getRead(), this.onPlayFromUri, this.MediaMetadataCompat);
        }
    }

    @Override // kotlin.createDeserializationContext
    public boolean onPlay() {
        return this.onMediaButtonEvent != null;
    }

    @Override // kotlin.isAbstract
    public boolean MediaBrowserCompatItemReceiver() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getRatingCompat();
    }

    @Override // kotlin.createDeserializationContext
    public withHandlersFrom onMediaButtonEvent() {
        withHandlersFrom withhandlersfrom = this.onMediaButtonEvent;
        if (withhandlersfrom != null) {
            return withhandlersfrom;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void RemoteActionCompatParcelizer(kotlin.withHandlersFrom r4) {
        /*
            r3 = this;
            o.withHandlersFrom r0 = r3.onMediaButtonEvent
            if (r4 == r0) goto L8c
            r3.onMediaButtonEvent = r4
            if (r0 == 0) goto L1c
            int r1 = r4.getIconCompatParcelizer()
            int r2 = r0.getIconCompatParcelizer()
            if (r1 != r2) goto L1c
            int r1 = r4.getRead()
            int r0 = r0.getRead()
            if (r1 == r0) goto L27
        L1c:
            int r0 = r4.getIconCompatParcelizer()
            int r1 = r4.getRead()
            r3.IconCompatParcelizer(r0, r1)
        L27:
            o.AlertDialogLayout<o.weirdNumberException> r0 = r3.onPlayFromSearch
            if (r0 == 0) goto L34
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            boolean r0 = r0.write()
            if (r0 != 0) goto L3e
        L34:
            java.util.Map r0 = r4.AudioAttributesImplApi26Parcelizer()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
        L3e:
            o.AlertDialogLayout<o.weirdNumberException> r0 = r3.onPlayFromSearch
            java.util.Map r1 = r4.AudioAttributesImplApi26Parcelizer()
            boolean r0 = kotlin._bindAsTreeOrNull.AudioAttributesCompatParcelizer(r0, r1)
            if (r0 != 0) goto L8c
            o.KeyDeserializer r0 = r3.onSetPlaybackSpeed()
            o.properties r0 = r0.getOnPause()
            r0.AudioAttributesImplApi21Parcelizer()
            o.AlertDialogLayout<o.weirdNumberException> r0 = r3.onPlayFromSearch
            if (r0 != 0) goto L5f
            o.AlertDialogLayout r0 = kotlin.setSupportCompoundDrawablesTintList.IconCompatParcelizer()
            r3.onPlayFromSearch = r0
        L5f:
            r0.AudioAttributesCompatParcelizer()
            java.util.Map r3 = r4.AudioAttributesImplApi26Parcelizer()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L6e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r0.RemoteActionCompatParcelizer(r1, r4)
            goto L6e
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._bindAndClose.RemoteActionCompatParcelizer(o.withHandlersFrom):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    protected void IconCompatParcelizer(int p0, int p1) {
        _bindAndClose _bindandclose;
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            long j = -1;
            _reportunkownformat.IconCompatParcelizer(getKey.read((((long) p0) << 32) | (((long) p1) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
        } else if (getIconCompatParcelizer().MediaDescriptionCompat() && (_bindandclose = this.AudioAttributesImplApi26Parcelizer) != null) {
            _bindandclose.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        }
        long j2 = -1;
        MediaBrowserCompatItemReceiver(getKey.read((((long) p1) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) p0) << 32)));
        if (this.MediaMetadataCompat != null) {
            MediaBrowserCompatCustomActionResultReceiver(false);
        }
        int iWrite = _bind.write(4);
        boolean zAudioAttributesCompatParcelizer = _findTreeDeserializer.AudioAttributesCompatParcelizer(iWrite);
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (zAudioAttributesCompatParcelizer || (iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getMediaBrowserCompatItemReceiver()) != null) {
            for (_handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(zAudioAttributesCompatParcelizer); iconCompatParcelizerMediaBrowserCompatItemReceiver != null && (iconCompatParcelizerMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer() & iWrite) != 0; iconCompatParcelizerMediaBrowserCompatItemReceiver = iconCompatParcelizerMediaBrowserCompatItemReceiver.getAudioAttributesImplBaseParcelizer()) {
                if ((iconCompatParcelizerMediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = iconCompatParcelizerMediaBrowserCompatItemReceiver;
                    UTF32Reader uTF32Reader = null;
                    while (iconCompatParcelizerWrite != 0) {
                        if (iconCompatParcelizerWrite instanceof addKeySerializers) {
                            ((addKeySerializers) iconCompatParcelizerWrite).m_();
                        } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                            int i = 0;
                            iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                            while (iconCompatParcelizerOnRemoveQueueItem != null) {
                                if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                                    i++;
                                    if (i == 1) {
                                        iconCompatParcelizerWrite = iconCompatParcelizerOnRemoveQueueItem;
                                    } else {
                                        if (uTF32Reader == null) {
                                            uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                        }
                                        if (iconCompatParcelizerWrite != 0) {
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizerWrite);
                                            }
                                            iconCompatParcelizerWrite = 0;
                                        }
                                        if (uTF32Reader != null) {
                                            uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                                        }
                                    }
                                }
                                iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                            }
                            if (i != 1) {
                            }
                        }
                        iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                    }
                }
                if (iconCompatParcelizerMediaBrowserCompatItemReceiver == iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    break;
                }
            }
        }
        _configureGenerator onMediaButtonEvent = getIconCompatParcelizer().getOnMediaButtonEvent();
        if (onMediaButtonEvent != null) {
            onMediaButtonEvent.AudioAttributesCompatParcelizer(getIconCompatParcelizer());
        }
    }

    @Override // kotlin.createDeserializationContext
    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public long getRead() {
        return this.onPrepareFromSearch;
    }

    protected void MediaMetadataCompat(long j) {
        this.onPrepareFromSearch = j;
    }

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from getter */
    public final float getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // kotlin.withStaticTyping, kotlin.hasHandlers
    /* JADX INFO: renamed from: q_ */
    public Object getOnPrepareFromUri() {
        if (!getIconCompatParcelizer().get_init_lambda2().write(_bind.write(64))) {
            return null;
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        for (_handleOddName.IconCompatParcelizer audioAttributesCompatParcelizer = getIconCompatParcelizer().get_init_lambda2().getAudioAttributesCompatParcelizer(); audioAttributesCompatParcelizer != null; audioAttributesCompatParcelizer = audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
            if ((_bind.write(64) & audioAttributesCompatParcelizer.getWrite()) != 0) {
                int iWrite = _bind.write(64);
                UTF32Reader uTF32Reader = null;
                _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesCompatParcelizer;
                while (iconCompatParcelizerWrite != 0) {
                    if (iconCompatParcelizerWrite instanceof ObjectWriterPrefetch) {
                        writeVar.write = ((ObjectWriterPrefetch) iconCompatParcelizerWrite).IconCompatParcelizer(getIconCompatParcelizer().getOnSkipToQueueItem(), writeVar.write);
                    } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                        int i = 0;
                        iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                        while (iconCompatParcelizerOnRemoveQueueItem != null) {
                            if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                                i++;
                                if (i == 1) {
                                    iconCompatParcelizerWrite = iconCompatParcelizerOnRemoveQueueItem;
                                } else {
                                    if (uTF32Reader == null) {
                                        uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                    }
                                    if (iconCompatParcelizerWrite != 0) {
                                        if (uTF32Reader != null) {
                                            uTF32Reader.read(iconCompatParcelizerWrite);
                                        }
                                        iconCompatParcelizerWrite = 0;
                                    }
                                    if (uTF32Reader != null) {
                                        uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                                    }
                                }
                            }
                            iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                            iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                        }
                        if (i != 1) {
                        }
                    }
                    iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                }
            }
        }
        return writeVar.write;
    }

    public final void PlaybackStateCompatCustomAction() {
        getIconCompatParcelizer().getAccessaddObserverForBackInvoker().onRewind();
    }

    @Override // kotlin.isAbstract
    public final isAbstract RemoteActionCompatParcelizer() {
        if (!MediaBrowserCompatItemReceiver()) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (_assertNotNull iconCompatParcelizer = getIconCompatParcelizer(); iconCompatParcelizer != null; iconCompatParcelizer = iconCompatParcelizer._init_lambda4()) {
                sb.append('\n');
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sb, "");
                sb.append("|");
                sb.append(iconCompatParcelizer);
                sb.append(" isAttached=");
                sb.append(iconCompatParcelizer.AudioAttributesImplApi26Parcelizer());
                sb.append(" modifier=");
                sb.append(iconCompatParcelizer.getAddObserverForBackInvoker());
                sb.append(" tail=");
                sb.append(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            }
            reportWrongTokenException.read(sb.toString());
        }
        PlaybackStateCompatCustomAction();
        return getIconCompatParcelizer().r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().AudioAttributesImplApi26Parcelizer;
    }

    public final isAbstract onStop() {
        if (!MediaBrowserCompatItemReceiver()) {
            reportWrongTokenException.read("LayoutCoordinate operations are only valid when isAttached is true");
        }
        PlaybackStateCompatCustomAction();
        return this.AudioAttributesImplApi26Parcelizer;
    }

    protected final getType ParcelableVolumeInfo() {
        getType gettype = this.onRemoveQueueItem;
        if (gettype != null) {
            return gettype;
        }
        getType gettype2 = new getType(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onRemoveQueueItem = gettype2;
        return gettype2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PropertyMetadata onCustomAction() {
        return _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).getAddOnNewIntentListener();
    }

    public final long setSessionImpl() {
        return getAudioAttributesImplApi21Parcelizer();
    }

    public final void IconCompatParcelizer(findAndAddVirtualProperties findandaddvirtualproperties) {
        this.onSetRepeatMode = findandaddvirtualproperties;
    }

    /* JADX INFO: renamed from: onSkipToNext, reason: from getter */
    public final findAndAddVirtualProperties getOnSetRepeatMode() {
        return this.onSetRepeatMode;
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.onSetRating = z;
    }

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from getter */
    public final boolean getOnSetRating() {
        return this.onSetRating;
    }

    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.onSetCaptioningEnabled = z;
    }

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from getter */
    public final boolean getOnSetCaptioningEnabled() {
        return this.onSetCaptioningEnabled;
    }

    @Override // kotlin._parser
    public void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2) {
        if (this.RemoteActionCompatParcelizer) {
            readerFor readerforMediaMetadataCompat = getWrite();
            toMagicModuleMetaRepoModel.write(readerforMediaMetadataCompat);
            RemoteActionCompatParcelizer(readerforMediaMetadataCompat.getRead(), p1, p2, null);
            return;
        }
        RemoteActionCompatParcelizer(p0, p1, p2, null);
    }

    @Override // kotlin._parser
    public void read(long p0, float p1, hasAnyGetter p2) {
        if (this.RemoteActionCompatParcelizer) {
            readerFor readerforMediaMetadataCompat = getWrite();
            toMagicModuleMetaRepoModel.write(readerforMediaMetadataCompat);
            RemoteActionCompatParcelizer(readerforMediaMetadataCompat.getRead(), p1, null, p2);
            return;
        }
        RemoteActionCompatParcelizer(p0, p1, null, p2);
    }

    public final void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        if (this.MediaSessionCompatResultReceiverWrapper != null) {
            if (this.MediaSessionCompatToken != null) {
                this.MediaSessionCompatToken = null;
            }
            RemoteActionCompatParcelizer$default(this, null, false, 2, null);
            _assertNotNull.AudioAttributesCompatParcelizer$default(getIconCompatParcelizer(), false, 1, null);
        }
    }

    public final void AudioAttributesCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2, hasAnyGetter p3) {
        RemoteActionCompatParcelizer(hasReferringProperties.AudioAttributesCompatParcelizer(p0, getAudioAttributesImplBaseParcelizer()), p1, p2, p3);
    }

    public final void AudioAttributesCompatParcelizer(JsonParserDelegate p0, hasAnyGetter p1) {
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            _reportunkownformat.RemoteActionCompatParcelizer(p0, p1);
            return;
        }
        float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(getRead());
        float fAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(getRead());
        p0.RemoteActionCompatParcelizer(fIconCompatParcelizer, fAudioAttributesCompatParcelizer);
        read(p0, p1);
        p0.RemoteActionCompatParcelizer(-fIconCompatParcelizer, -fAudioAttributesCompatParcelizer);
    }

    public void write(JsonParserDelegate p0, hasAnyGetter p1) {
        _bindAndClose _bindandclose = this.read;
        if (_bindandclose != null) {
            _bindandclose.AudioAttributesCompatParcelizer(p0, p1);
        }
    }

    private final MagicModuleSubmissionRequestBody<JsonParserDelegate, hasAnyGetter, getShowPopup> handleMediaPlayPauseIfPendingOnHandler() {
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = this.onSkipToPrevious;
        if (magicModuleSubmissionRequestBody != null) {
            return magicModuleSubmissionRequestBody;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(new AnonymousClass4());
        this.onSkipToPrevious = anonymousClass1;
        return anonymousClass1;
    }

    /* JADX INFO: renamed from: o._bindAndClose$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            _bindAndClose _bindandclose = _bindAndClose.this;
            JsonParserDelegate jsonParserDelegate = _bindandclose.setSessionImpl;
            toMagicModuleMetaRepoModel.write(jsonParserDelegate);
            _bindandclose.read(jsonParserDelegate, _bindAndClose.this.onSetPlaybackSpeed);
        }

        AnonymousClass4() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: o._bindAndClose$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/JsonParserDelegate;", "p0", "Lo/hasAnyGetter;", "p1", "", "IconCompatParcelizer", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<JsonParserDelegate, hasAnyGetter, getShowPopup> {
        final /* synthetic */ getCreatedOnDateMs<getShowPopup> $write;

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(JsonParserDelegate jsonParserDelegate, hasAnyGetter hasanygetter) {
            IconCompatParcelizer(jsonParserDelegate, hasanygetter);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(JsonParserDelegate jsonParserDelegate, hasAnyGetter hasanygetter) {
            if (_bindAndClose.this.getIconCompatParcelizer().MediaDescriptionCompat()) {
                _bindAndClose.this.setSessionImpl = jsonParserDelegate;
                _bindAndClose.this.onSetPlaybackSpeed = hasanygetter;
                PropertyMetadata propertyMetadataOnCustomAction = _bindAndClose.this.onCustomAction();
                propertyMetadataOnCustomAction.IconCompatParcelizer.IconCompatParcelizer(_bindAndClose.this, (getAnswerMap<? super _bindAndClose, getShowPopup>) _bindAndClose.AudioAttributesImplBaseParcelizer, this.$write);
                _bindAndClose.this.onStop = false;
                return;
            }
            _bindAndClose.this.onStop = true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            super(2);
            this.$write = getcreatedondatems;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(_bindAndClose _bindandclose, getAnswerMap getanswermap, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        _bindandclose.RemoteActionCompatParcelizer((getAnswerMap<? super validateAppend, getShowPopup>) getanswermap, z);
    }

    public final void RemoteActionCompatParcelizer(getAnswerMap<? super validateAppend, getShowPopup> p0, boolean p1) {
        _configureGenerator onMediaButtonEvent;
        if (p0 != null && this.MediaSessionCompatToken != null) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("layerBlock can't be provided when explicitLayer is provided");
        }
        _assertNotNull iconCompatParcelizer = getIconCompatParcelizer();
        boolean z = (!p1 && this.MediaMetadataCompat == p0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, iconCompatParcelizer.getOnSkipToQueueItem()) && this.onCommand == iconCompatParcelizer.getOnStop()) ? false : true;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizer.getOnSkipToQueueItem();
        this.onCommand = iconCompatParcelizer.getOnStop();
        if (iconCompatParcelizer.AudioAttributesImplApi26Parcelizer() && p0 != null) {
            this.MediaMetadataCompat = p0;
            if (this.MediaSessionCompatResultReceiverWrapper != null) {
                if (z) {
                    MediaBrowserCompatCustomActionResultReceiver$default(this, false, 1, null);
                    return;
                }
                return;
            }
            _reportUnkownFormat _reportunkownformat = _configureGenerator.read$default(_serializerProvider.AudioAttributesCompatParcelizer(iconCompatParcelizer), handleMediaPlayPauseIfPendingOnHandler(), this.onSkipToQueueItem, null, 4, null);
            _reportunkownformat.IconCompatParcelizer(getIconCompatParcelizer());
            _reportunkownformat.write(getRead());
            this.MediaSessionCompatResultReceiverWrapper = _reportunkownformat;
            MediaBrowserCompatCustomActionResultReceiver$default(this, false, 1, null);
            iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(true);
            this.onSkipToQueueItem.invoke();
            return;
        }
        this.MediaMetadataCompat = null;
        _reportUnkownFormat _reportunkownformat2 = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat2 != null) {
            if (!getTextBuffer.write(_reportunkownformat2.read())) {
                iconCompatParcelizer.getDefaultViewModelProviderFactory();
            }
            _reportunkownformat2.IconCompatParcelizer();
            iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(true);
            this.onSkipToQueueItem.invoke();
            if (MediaBrowserCompatItemReceiver() && iconCompatParcelizer.MediaDescriptionCompat() && (onMediaButtonEvent = iconCompatParcelizer.getOnMediaButtonEvent()) != null) {
                onMediaButtonEvent.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            }
        }
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.onStop = false;
    }

    static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver$default(_bindAndClose _bindandclose, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        _bindandclose.MediaBrowserCompatCustomActionResultReceiver(z);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(boolean p0) {
        _configureGenerator onMediaButtonEvent;
        if (this.MediaSessionCompatToken == null) {
            _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
            if (_reportunkownformat != null) {
                getAnswerMap<? super validateAppend, getShowPopup> getanswermap = this.MediaMetadataCompat;
                if (getanswermap != null) {
                    resolveAbstractType resolveabstracttype = MediaBrowserCompatCustomActionResultReceiver;
                    resolveabstracttype.onPlayFromUri();
                    resolveabstracttype.AudioAttributesCompatParcelizer(getIconCompatParcelizer().getOnSkipToQueueItem());
                    resolveabstracttype.IconCompatParcelizer(getIconCompatParcelizer().getOnStop());
                    resolveabstracttype.MediaBrowserCompatItemReceiver(SetterlessProperty.AudioAttributesCompatParcelizer(write()));
                    PropertyMetadata propertyMetadataOnCustomAction = onCustomAction();
                    propertyMetadataOnCustomAction.IconCompatParcelizer.IconCompatParcelizer(this, AudioAttributesImplApi21Parcelizer, new AnonymousClass7(getanswermap, this));
                    setNamingStrategy setnamingstrategy = this.onRemoveQueueItemAt;
                    if (setnamingstrategy == null) {
                        setnamingstrategy = new setNamingStrategy();
                        this.onRemoveQueueItemAt = setnamingstrategy;
                    }
                    setNamingStrategy setnamingstrategy2 = AudioAttributesImplApi26Parcelizer;
                    setnamingstrategy2.read(setnamingstrategy);
                    setnamingstrategy.AudioAttributesCompatParcelizer(resolveabstracttype);
                    _reportunkownformat.IconCompatParcelizer(resolveabstracttype);
                    boolean z = this.MediaDescriptionCompat;
                    this.MediaDescriptionCompat = resolveabstracttype.getOnAddQueueItem();
                    this.handleMediaPlayPauseIfPendingOnHandler = resolveabstracttype.getAudioAttributesCompatParcelizer();
                    boolean zIconCompatParcelizer = setnamingstrategy2.IconCompatParcelizer(setnamingstrategy);
                    if (p0 && ((!zIconCompatParcelizer || z != this.MediaDescriptionCompat) && (onMediaButtonEvent = getIconCompatParcelizer().getOnMediaButtonEvent()) != null)) {
                        onMediaButtonEvent.AudioAttributesCompatParcelizer(getIconCompatParcelizer());
                    }
                    if (zIconCompatParcelizer) {
                        return;
                    }
                    _assertNotNull iconCompatParcelizer = getIconCompatParcelizer();
                    addMixIn accessaddObserverForBackInvoker = iconCompatParcelizer.getAccessaddObserverForBackInvoker();
                    if (accessaddObserverForBackInvoker.getOnPlayFromMediaId() > 0) {
                        if (accessaddObserverForBackInvoker.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || accessaddObserverForBackInvoker.getHandleMediaPlayPauseIfPendingOnHandler()) {
                            _assertNotNull.AudioAttributesCompatParcelizer$default(iconCompatParcelizer, false, 1, null);
                        }
                        accessaddObserverForBackInvoker.getOnFastForward().onPrepareFromUri();
                    }
                    iconCompatParcelizer.getDefaultViewModelProviderFactory();
                    _configureGenerator _configuregeneratorAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(iconCompatParcelizer);
                    getAttributes addObserverForBackInvokerlambda7 = _configuregeneratorAudioAttributesCompatParcelizer.getAddObserverForBackInvokerlambda7();
                    if (this == iconCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8()) {
                        getAttributes.RemoteActionCompatParcelizer$default(addObserverForBackInvokerlambda7, iconCompatParcelizer, false, 2, null);
                    } else {
                        addObserverForBackInvokerlambda7.read(iconCompatParcelizer);
                    }
                    if (iconCompatParcelizer.getAddOnMultiWindowModeChangedListener() > 0) {
                        _configuregeneratorAudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(iconCompatParcelizer);
                        return;
                    }
                    return;
                }
                reportWrongTokenException.write("updateLayerParameters requires a non-null layerBlock");
                throw new PlanDetailsCreator();
            }
            if (this.MediaMetadataCompat != null) {
                reportWrongTokenException.read("null layer with a non-null layerBlock");
            }
        }
    }

    /* JADX INFO: renamed from: o._bindAndClose$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass7 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ getAnswerMap<validateAppend, getShowPopup> $RemoteActionCompatParcelizer;
        final /* synthetic */ _bindAndClose write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            this.$RemoteActionCompatParcelizer.invoke(_bindAndClose.MediaBrowserCompatCustomActionResultReceiver);
            boolean z = this.write.getOnSetRepeatMode() != _bindAndClose.MediaBrowserCompatCustomActionResultReceiver.getMediaDescriptionCompat();
            boolean z2 = this.write.getOnSetRating() != _bindAndClose.MediaBrowserCompatCustomActionResultReceiver.getOnAddQueueItem();
            if (z || z2) {
                this.write.IconCompatParcelizer(_bindAndClose.MediaBrowserCompatCustomActionResultReceiver.getMediaDescriptionCompat());
                this.write.AudioAttributesImplApi26Parcelizer(_bindAndClose.MediaBrowserCompatCustomActionResultReceiver.getOnAddQueueItem());
                if (this.write.getOnSetCaptioningEnabled() && (z2 || this.write.getOnSetRating())) {
                    this.write.getIconCompatParcelizer().menuHostHelperlambda0();
                }
            }
            this.write.AudioAttributesImplBaseParcelizer(true);
            _bindAndClose.MediaBrowserCompatCustomActionResultReceiver.onPrepareFromSearch();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass7(getAnswerMap<? super validateAppend, getShowPopup> getanswermap, _bindAndClose _bindandclose) {
            super(0);
            this.$RemoteActionCompatParcelizer = getanswermap;
            this.write = _bindandclose;
        }
    }

    /* JADX INFO: renamed from: o._bindAndClose$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        public final void RemoteActionCompatParcelizer() {
            _bindAndClose audioAttributesImplApi26Parcelizer = _bindAndClose.this.getAudioAttributesImplApi26Parcelizer();
            if (audioAttributesImplApi26Parcelizer != null) {
                audioAttributesImplApi26Parcelizer.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            }
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass3() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: onSetRating, reason: from getter */
    public final boolean getOnStop() {
        return this.onStop;
    }

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from getter */
    public final _reportUnkownFormat getMediaSessionCompatResultReceiverWrapper() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // kotlin.createDummyDeserializationContext
    public boolean onRemoveQueueItem() {
        return (this.MediaSessionCompatResultReceiverWrapper == null || this.MediaBrowserCompatMediaItem || !getIconCompatParcelizer().AudioAttributesImplApi26Parcelizer()) ? false : true;
    }

    public final long onSkipToQueueItem() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.d_(getIconCompatParcelizer().getOnSkipToNext().write());
    }

    public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer p0, long p1, addValueInstantiators p2, int p3, boolean p4) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0.AudioAttributesCompatParcelizer());
        boolean z = false;
        if (!RatingCompat(p1)) {
            if (handleWeirdNumberValue.read(p3, handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer())) {
                float fWrite = write(p1, onSkipToQueueItem());
                if ((Float.floatToRawIntBits(fWrite) & Integer.MAX_VALUE) >= 2139095040 || !p2.RemoteActionCompatParcelizer(fWrite, false)) {
                    return;
                }
                write(iconCompatParcelizerRemoteActionCompatParcelizer, p0, p1, p2, p3, false, fWrite);
                return;
            }
            return;
        }
        if (iconCompatParcelizerRemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer(p0, p1, p2, p3, p4);
            return;
        }
        if (AudioAttributesImplApi21Parcelizer(p1)) {
            IconCompatParcelizer(iconCompatParcelizerRemoteActionCompatParcelizer, p0, p1, p2, p3, p4);
            return;
        }
        float fWrite2 = !handleWeirdNumberValue.read(p3, handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer()) ? Float.POSITIVE_INFINITY : write(p1, onSkipToQueueItem());
        if ((Float.floatToRawIntBits(fWrite2) & Integer.MAX_VALUE) < 2139095040 && p2.RemoteActionCompatParcelizer(fWrite2, p4)) {
            z = true;
        }
        read(iconCompatParcelizerRemoteActionCompatParcelizer, p0, p1, p2, p3, p4, fWrite2, z);
    }

    private final void IconCompatParcelizer(_handleOddName.IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, addValueInstantiators addvalueinstantiators, int i, boolean z) {
        if (iconCompatParcelizer != null) {
            int i2 = addvalueinstantiators.IconCompatParcelizer;
            addvalueinstantiators.write(addvalueinstantiators.IconCompatParcelizer + 1, addvalueinstantiators.size());
            addvalueinstantiators.IconCompatParcelizer++;
            addvalueinstantiators.write.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            addvalueinstantiators.read.read(addSerializers.AudioAttributesCompatParcelizer(-1.0f, z, false));
            IconCompatParcelizer(_bindAsTreeOrNull.IconCompatParcelizer(iconCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), _bind.write(2)), remoteActionCompatParcelizer, j, addvalueinstantiators, i, z);
            addvalueinstantiators.IconCompatParcelizer = i2;
            return;
        }
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer, j, addvalueinstantiators, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(_handleOddName.IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, addValueInstantiators addvalueinstantiators, int i, boolean z, float f, boolean z2) {
        if (iconCompatParcelizer == null) {
            RemoteActionCompatParcelizer(remoteActionCompatParcelizer, j, addvalueinstantiators, i, z);
            return;
        }
        if (write(iconCompatParcelizer, j, i)) {
            addvalueinstantiators.read(iconCompatParcelizer, z, new AnonymousClass6(iconCompatParcelizer, remoteActionCompatParcelizer, j, addvalueinstantiators, i, z, f, z2));
        } else if (z2) {
            write(iconCompatParcelizer, remoteActionCompatParcelizer, j, addvalueinstantiators, i, z, f);
        } else {
            AudioAttributesCompatParcelizer(iconCompatParcelizer, remoteActionCompatParcelizer, j, addvalueinstantiators, i, z, f);
        }
    }

    /* JADX INFO: renamed from: o._bindAndClose$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass6 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ RemoteActionCompatParcelizer $AudioAttributesCompatParcelizer;
        final /* synthetic */ boolean $AudioAttributesImplApi26Parcelizer;
        final /* synthetic */ _handleOddName.IconCompatParcelizer $AudioAttributesImplBaseParcelizer;
        final /* synthetic */ addValueInstantiators $IconCompatParcelizer;
        final /* synthetic */ boolean $MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ long $RemoteActionCompatParcelizer;
        final /* synthetic */ int $read;
        final /* synthetic */ float $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        public final void write() {
            _bindAndClose.this.read(_bindAsTreeOrNull.IconCompatParcelizer(this.$AudioAttributesImplBaseParcelizer, this.$AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), _bind.write(2)), this.$AudioAttributesCompatParcelizer, this.$RemoteActionCompatParcelizer, this.$IconCompatParcelizer, this.$read, this.$AudioAttributesImplApi26Parcelizer, this.$write, this.$MediaBrowserCompatCustomActionResultReceiver);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(_handleOddName.IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, addValueInstantiators addvalueinstantiators, int i, boolean z, float f, boolean z2) {
            super(0);
            this.$AudioAttributesImplBaseParcelizer = iconCompatParcelizer;
            this.$AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            this.$RemoteActionCompatParcelizer = j;
            this.$IconCompatParcelizer = addvalueinstantiators;
            this.$read = i;
            this.$AudioAttributesImplApi26Parcelizer = z;
            this.$write = f;
            this.$MediaBrowserCompatCustomActionResultReceiver = z2;
        }
    }

    private final void write(_handleOddName.IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, addValueInstantiators addvalueinstantiators, int i, boolean z, float f) {
        if (iconCompatParcelizer != null) {
            int i2 = addvalueinstantiators.IconCompatParcelizer;
            addvalueinstantiators.write(addvalueinstantiators.IconCompatParcelizer + 1, addvalueinstantiators.size());
            addvalueinstantiators.IconCompatParcelizer++;
            addvalueinstantiators.write.AudioAttributesCompatParcelizer(iconCompatParcelizer);
            addvalueinstantiators.read.read(addSerializers.AudioAttributesCompatParcelizer(f, z, false));
            read(_bindAsTreeOrNull.IconCompatParcelizer(iconCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), _bind.write(2)), remoteActionCompatParcelizer, j, addvalueinstantiators, i, z, f, true);
            addvalueinstantiators.IconCompatParcelizer = i2;
            return;
        }
        RemoteActionCompatParcelizer(remoteActionCompatParcelizer, j, addvalueinstantiators, i, z);
    }

    private final void AudioAttributesCompatParcelizer(_handleOddName.IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, addValueInstantiators addvalueinstantiators, int i, boolean z, float f) {
        if (iconCompatParcelizer == null) {
            RemoteActionCompatParcelizer(remoteActionCompatParcelizer, j, addvalueinstantiators, i, z);
        } else if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer(iconCompatParcelizer)) {
            addvalueinstantiators.IconCompatParcelizer(iconCompatParcelizer, f, z, new AnonymousClass8(iconCompatParcelizer, remoteActionCompatParcelizer, j, addvalueinstantiators, i, z, f));
        } else {
            read(_bindAsTreeOrNull.IconCompatParcelizer(iconCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), _bind.write(2)), remoteActionCompatParcelizer, j, addvalueinstantiators, i, z, f, false);
        }
    }

    /* JADX INFO: renamed from: o._bindAndClose$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ long $AudioAttributesCompatParcelizer;
        final /* synthetic */ int $IconCompatParcelizer;
        final /* synthetic */ _handleOddName.IconCompatParcelizer $MediaBrowserCompatCustomActionResultReceiver;
        final /* synthetic */ boolean $MediaBrowserCompatItemReceiver;
        final /* synthetic */ RemoteActionCompatParcelizer $RemoteActionCompatParcelizer;
        final /* synthetic */ addValueInstantiators $read;
        final /* synthetic */ float $write;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            _bindAndClose.this.read(_bindAsTreeOrNull.IconCompatParcelizer(this.$MediaBrowserCompatCustomActionResultReceiver, this.$RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), _bind.write(2)), this.$RemoteActionCompatParcelizer, this.$AudioAttributesCompatParcelizer, this.$read, this.$IconCompatParcelizer, this.$MediaBrowserCompatItemReceiver, this.$write, false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(_handleOddName.IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, addValueInstantiators addvalueinstantiators, int i, boolean z, float f) {
            super(0);
            this.$MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer;
            this.$RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            this.$AudioAttributesCompatParcelizer = j;
            this.$read = addvalueinstantiators;
            this.$IconCompatParcelizer = i;
            this.$MediaBrowserCompatItemReceiver = z;
            this.$write = f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    private final boolean write(_handleOddName.IconCompatParcelizer iconCompatParcelizer, long j, int i) {
        if (iconCompatParcelizer == 0) {
            return false;
        }
        if (!handleWeirdNumberValue.read(i, handleWeirdNumberValue.INSTANCE.read()) && !handleWeirdNumberValue.read(i, handleWeirdNumberValue.INSTANCE.IconCompatParcelizer())) {
            return false;
        }
        int iWrite = _bind.write(16);
        UTF32Reader uTF32Reader = null;
        while (iconCompatParcelizer != 0) {
            if (iconCompatParcelizer instanceof forRootType) {
                long jF_ = ((forRootType) iconCompatParcelizer).f_();
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) >= (-withNulls.IconCompatParcelizer(jF_, getRead())) && Float.intBitsToFloat(i2) < MediaBrowserCompatSearchResultReceiver() + withNulls.AudioAttributesCompatParcelizer(jF_, getRead())) {
                    int i3 = (int) j;
                    if (Float.intBitsToFloat(i3) >= (-withNulls.write(jF_)) && Float.intBitsToFloat(i3) < AudioAttributesImplBaseParcelizer() + withNulls.read(jF_)) {
                        return true;
                    }
                }
                return false;
            }
            if ((iconCompatParcelizer.getWrite() & iWrite) != 0 && (iconCompatParcelizer instanceof addAbstractTypeResolver)) {
                _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) iconCompatParcelizer).getIconCompatParcelizer();
                int i4 = 0;
                iconCompatParcelizer = iconCompatParcelizer;
                while (iconCompatParcelizerOnRemoveQueueItem != null) {
                    if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                        i4++;
                        if (i4 == 1) {
                            iconCompatParcelizer = iconCompatParcelizerOnRemoveQueueItem;
                        } else {
                            if (uTF32Reader == null) {
                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                            }
                            if (iconCompatParcelizer != 0) {
                                if (uTF32Reader != null) {
                                    uTF32Reader.read(iconCompatParcelizer);
                                }
                                iconCompatParcelizer = 0;
                            }
                            if (uTF32Reader != null) {
                                uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                            }
                        }
                    }
                    iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                    iconCompatParcelizer = iconCompatParcelizer;
                }
                if (i4 != 1) {
                }
            }
            iconCompatParcelizer = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
        }
        return false;
    }

    public void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer p0, long p1, addValueInstantiators p2, int p3, boolean p4) {
        _bindAndClose _bindandclose = this.read;
        if (_bindandclose != null) {
            _bindandclose.AudioAttributesCompatParcelizer(p0, IconCompatParcelizer$default(_bindandclose, p1, false, 2, null), p2, p3, p4);
        }
    }

    public final WritableTypeIdInclusion _init_lambda4() {
        if (!MediaBrowserCompatItemReceiver()) {
            return WritableTypeIdInclusion.INSTANCE.write();
        }
        isAbstract isabstractRemoteActionCompatParcelizer = hasRawClass.RemoteActionCompatParcelizer(this);
        getType gettypeParcelableVolumeInfo = ParcelableVolumeInfo();
        long jMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(onSkipToQueueItem());
        int i = (int) (jMediaBrowserCompatCustomActionResultReceiver >> 32);
        gettypeParcelableVolumeInfo.IconCompatParcelizer(-Float.intBitsToFloat(i));
        int i2 = (int) jMediaBrowserCompatCustomActionResultReceiver;
        gettypeParcelableVolumeInfo.write(-Float.intBitsToFloat(i2));
        gettypeParcelableVolumeInfo.read(MediaBrowserCompatSearchResultReceiver() + Float.intBitsToFloat(i));
        gettypeParcelableVolumeInfo.RemoteActionCompatParcelizer(AudioAttributesImplBaseParcelizer() + Float.intBitsToFloat(i2));
        while (this != isabstractRemoteActionCompatParcelizer) {
            this.read(gettypeParcelableVolumeInfo, false, true);
            if (gettypeParcelableVolumeInfo.read()) {
                return WritableTypeIdInclusion.INSTANCE.write();
            }
            this = this.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.write(this);
        }
        return toCanonical.write(gettypeParcelableVolumeInfo);
    }

    @Override // kotlin.isAbstract
    public long AudioAttributesCompatParcelizer(long p0) {
        if (!MediaBrowserCompatItemReceiver()) {
            reportWrongTokenException.read("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return RemoteActionCompatParcelizer(hasRawClass.RemoteActionCompatParcelizer(this), _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).IconCompatParcelizer(p0));
    }

    @Override // kotlin.isAbstract
    public long RemoteActionCompatParcelizer(long p0) {
        if (!MediaBrowserCompatItemReceiver()) {
            reportWrongTokenException.read("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).RemoteActionCompatParcelizer(IconCompatParcelizer(p0));
    }

    @Override // kotlin.isAbstract
    public long AudioAttributesImplBaseParcelizer(long p0) {
        if (!MediaBrowserCompatItemReceiver()) {
            reportWrongTokenException.read("LayoutCoordinate operations are only valid when isAttached is true");
        }
        isAbstract isabstractRemoteActionCompatParcelizer = hasRawClass.RemoteActionCompatParcelizer(this);
        return RemoteActionCompatParcelizer(isabstractRemoteActionCompatParcelizer, getReferencedType.AudioAttributesCompatParcelizer(_serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).AudioAttributesCompatParcelizer(p0), hasRawClass.AudioAttributesCompatParcelizer(isabstractRemoteActionCompatParcelizer)));
    }

    @Override // kotlin.isAbstract
    public long read(long p0) {
        return _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).write(IconCompatParcelizer(p0));
    }

    private final _bindAndClose write(isAbstract isabstract) {
        _bindAndClose _bindandcloseIconCompatParcelizer;
        withContentType withcontenttype = isabstract instanceof withContentType ? (withContentType) isabstract : null;
        if (withcontenttype != null && (_bindandcloseIconCompatParcelizer = withcontenttype.IconCompatParcelizer()) != null) {
            return _bindandcloseIconCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.read(isabstract, "");
        return (_bindAndClose) isabstract;
    }

    @Override // kotlin.isAbstract
    public long RemoteActionCompatParcelizer(isAbstract p0, long p1) {
        return IconCompatParcelizer(p0, p1, true);
    }

    @Override // kotlin.isAbstract
    public long IconCompatParcelizer(isAbstract p0, long p1, boolean p2) {
        if (p0 instanceof withContentType) {
            withContentType withcontenttype = (withContentType) p0;
            withcontenttype.IconCompatParcelizer().PlaybackStateCompatCustomAction();
            return getReferencedType.AudioAttributesCompatParcelizer(withcontenttype.IconCompatParcelizer(this, getReferencedType.AudioAttributesCompatParcelizer(p1 ^ (-9223372034707292160L)), p2) ^ (-9223372034707292160L));
        }
        _bindAndClose _bindandcloseWrite = write(p0);
        _bindandcloseWrite.PlaybackStateCompatCustomAction();
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_bindandcloseWrite);
        while (_bindandcloseWrite != _bindandcloseAudioAttributesCompatParcelizer) {
            p1 = _bindandcloseWrite.read(p1, p2);
            _bindandcloseWrite = _bindandcloseWrite.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.write(_bindandcloseWrite);
        }
        return read(_bindandcloseAudioAttributesCompatParcelizer, p1, p2);
    }

    @Override // kotlin.isAbstract
    public void read(isAbstract p0, float[] p1) {
        _bindAndClose _bindandcloseWrite = write(p0);
        _bindandcloseWrite.PlaybackStateCompatCustomAction();
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_bindandcloseWrite);
        resetWithShared.RemoteActionCompatParcelizer(p1);
        _bindandcloseWrite.IconCompatParcelizer(_bindandcloseAudioAttributesCompatParcelizer, p1);
        read(_bindandcloseAudioAttributesCompatParcelizer, p1);
    }

    @Override // kotlin.isAbstract
    public void AudioAttributesCompatParcelizer(float[] p0) {
        _configureGenerator _configuregeneratorAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer());
        _bindAndClose _bindandcloseWrite = write(hasRawClass.RemoteActionCompatParcelizer(this));
        IconCompatParcelizer(_bindandcloseWrite, p0);
        if (_configuregeneratorAudioAttributesCompatParcelizer instanceof useRootWrapping) {
            ((useRootWrapping) _configuregeneratorAudioAttributesCompatParcelizer).read(p0);
            return;
        }
        long jMediaBrowserCompatCustomActionResultReceiver = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(_bindandcloseWrite);
        if ((9223372034707292159L & jMediaBrowserCompatCustomActionResultReceiver) != 9205357640488583168L) {
            resetWithShared.read(p0, Float.intBitsToFloat((int) (jMediaBrowserCompatCustomActionResultReceiver >> 32)), Float.intBitsToFloat((int) jMediaBrowserCompatCustomActionResultReceiver), BitmapDescriptorFactory.HUE_RED);
        }
    }

    private final void IconCompatParcelizer(_bindAndClose p0, float[] p1) {
        while (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this, p0)) {
            _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
            if (_reportunkownformat != null) {
                _reportunkownformat.RemoteActionCompatParcelizer(p1);
            }
            if (!hasReferringProperties.write(this.getRead(), hasReferringProperties.INSTANCE.write())) {
                float[] fArr = MediaBrowserCompatItemReceiver;
                resetWithShared.RemoteActionCompatParcelizer(fArr);
                resetWithShared.read$default(fArr, hasReferringProperties.IconCompatParcelizer(r0), hasReferringProperties.AudioAttributesCompatParcelizer(r0), BitmapDescriptorFactory.HUE_RED, 4, null);
                resetWithShared.RemoteActionCompatParcelizer(p1, fArr);
            }
            this = this.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.write(this);
        }
    }

    private final void read(_bindAndClose p0, float[] p1) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this)) {
            return;
        }
        _bindAndClose _bindandclose = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(_bindandclose);
        _bindandclose.read(p0, p1);
        if (!hasReferringProperties.write(getRead(), hasReferringProperties.INSTANCE.write())) {
            float[] fArr = MediaBrowserCompatItemReceiver;
            resetWithShared.RemoteActionCompatParcelizer(fArr);
            resetWithShared.read$default(fArr, -hasReferringProperties.IconCompatParcelizer(getRead()), -hasReferringProperties.AudioAttributesCompatParcelizer(getRead()), BitmapDescriptorFactory.HUE_RED, 4, null);
            resetWithShared.RemoteActionCompatParcelizer(p1, fArr);
        }
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            _reportunkownformat.IconCompatParcelizer(p1);
        }
    }

    @Override // kotlin.isAbstract
    public WritableTypeIdInclusion write(isAbstract p0, boolean p1) {
        if (!MediaBrowserCompatItemReceiver()) {
            reportWrongTokenException.read("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!p0.MediaBrowserCompatItemReceiver()) {
            StringBuilder sb = new StringBuilder("LayoutCoordinates ");
            sb.append(p0);
            sb.append(" is not attached!");
            reportWrongTokenException.read(sb.toString());
        }
        _bindAndClose _bindandcloseWrite = write(p0);
        _bindandcloseWrite.PlaybackStateCompatCustomAction();
        _bindAndClose _bindandcloseAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_bindandcloseWrite);
        getType gettypeParcelableVolumeInfo = ParcelableVolumeInfo();
        gettypeParcelableVolumeInfo.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        gettypeParcelableVolumeInfo.write(BitmapDescriptorFactory.HUE_RED);
        gettypeParcelableVolumeInfo.read((int) (p0.write() >> 32));
        gettypeParcelableVolumeInfo.RemoteActionCompatParcelizer((int) p0.write());
        while (_bindandcloseWrite != _bindandcloseAudioAttributesCompatParcelizer) {
            read$default(_bindandcloseWrite, gettypeParcelableVolumeInfo, p1, false, 4, null);
            if (gettypeParcelableVolumeInfo.read()) {
                return WritableTypeIdInclusion.INSTANCE.write();
            }
            _bindandcloseWrite = _bindandcloseWrite.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.write(_bindandcloseWrite);
        }
        AudioAttributesCompatParcelizer(_bindandcloseAudioAttributesCompatParcelizer, gettypeParcelableVolumeInfo, p1);
        return toCanonical.write(gettypeParcelableVolumeInfo);
    }

    private final long read(_bindAndClose p0, long p1, boolean p2) {
        if (p0 == this) {
            return p1;
        }
        _bindAndClose _bindandclose = this.AudioAttributesImplApi26Parcelizer;
        if (_bindandclose == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, _bindandclose)) {
            return IconCompatParcelizer(p1, p2);
        }
        return IconCompatParcelizer(_bindandclose.read(p0, p1, p2), p2);
    }

    private final void AudioAttributesCompatParcelizer(_bindAndClose p0, getType p1, boolean p2) {
        if (p0 == this) {
            return;
        }
        _bindAndClose _bindandclose = this.AudioAttributesImplApi26Parcelizer;
        if (_bindandclose != null) {
            _bindandclose.AudioAttributesCompatParcelizer(p0, p1, p2);
        }
        AudioAttributesCompatParcelizer(p1, p2);
    }

    @Override // kotlin.isAbstract
    public long IconCompatParcelizer(long p0) {
        if (!MediaBrowserCompatItemReceiver()) {
            reportWrongTokenException.read("LayoutCoordinate operations are only valid when isAttached is true");
        }
        PlaybackStateCompatCustomAction();
        long j = p0;
        while (this != null) {
            if (_verifyNoLeadingZeroes.MediaBrowserCompatMediaItem) {
                _assertNotNull iconCompatParcelizer = this.getIconCompatParcelizer();
                if (this == iconCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() && !iconCompatParcelizer.getRemoteActionCompatParcelizer()) {
                    long jWrite = _serializerProvider.AudioAttributesCompatParcelizer(iconCompatParcelizer).getAddObserverForBackInvokerlambda7().write(iconCompatParcelizer);
                    if (!hasReferringProperties.write(jWrite, hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer())) {
                        return referringProperties.RemoteActionCompatParcelizer(j, jWrite);
                    }
                }
            }
            j = read$default(this, j, false, 2, null);
            this = this.AudioAttributesImplApi26Parcelizer;
        }
        return j;
    }

    public static /* synthetic */ long read$default(_bindAndClose _bindandclose, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return _bindandclose.read(j, z);
    }

    public long read(long p0, boolean p1) {
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            p0 = _reportunkownformat.IconCompatParcelizer(p0, false);
        }
        return (p1 || !getMediaBrowserCompatItemReceiver()) ? referringProperties.RemoteActionCompatParcelizer(p0, getRead()) : p0;
    }

    public static /* synthetic */ long IconCompatParcelizer$default(_bindAndClose _bindandclose, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return _bindandclose.IconCompatParcelizer(j, z);
    }

    public long IconCompatParcelizer(long p0, boolean p1) {
        if (p1 || !getMediaBrowserCompatItemReceiver()) {
            p0 = referringProperties.AudioAttributesCompatParcelizer(p0, getRead());
        }
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        return _reportunkownformat != null ? _reportunkownformat.IconCompatParcelizer(p0, true) : p0;
    }

    protected final void AudioAttributesCompatParcelizer(JsonParserDelegate p0, releaseBuffers p1) {
        p0.read(0.5f, 0.5f, ((int) (getIconCompatParcelizer() >> 32)) - 0.5f, ((int) getIconCompatParcelizer()) - 0.5f, p1);
    }

    public final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        if (getIconCompatParcelizer().MediaDescriptionCompat()) {
            _init_lambda3();
        }
    }

    public final void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        this.MediaBrowserCompatMediaItem = true;
        this.onSkipToQueueItem.invoke();
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        if (hasReferringProperties.write(getRead(), hasReferringProperties.INSTANCE.write())) {
            return;
        }
        getIconCompatParcelizer().getDefaultViewModelProviderFactory();
    }

    public static /* synthetic */ void read$default(_bindAndClose _bindandclose, getType gettype, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        _bindandclose.read(gettype, z, z2);
    }

    public final void read(getType p0, boolean p1, boolean p2) {
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            if (this.MediaDescriptionCompat) {
                if (p2) {
                    long jOnSkipToQueueItem = onSkipToQueueItem();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jOnSkipToQueueItem >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) jOnSkipToQueueItem) / 2.0f;
                    long j = -1;
                    p0.IconCompatParcelizer(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (write() >> 32)) + fIntBitsToFloat, ((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & write())) + fIntBitsToFloat2);
                } else if (p1) {
                    long j2 = -1;
                    p0.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (write() >> 32), (int) (((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))) & write()));
                }
                if (p0.read()) {
                    return;
                }
            }
            _reportunkownformat.write(p0, false);
        }
        float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(getRead());
        p0.IconCompatParcelizer(p0.getRemoteActionCompatParcelizer() + fIconCompatParcelizer);
        p0.read(p0.getAudioAttributesCompatParcelizer() + fIconCompatParcelizer);
        float fAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(getRead());
        p0.write(p0.getRead() + fAudioAttributesCompatParcelizer);
        p0.RemoteActionCompatParcelizer(p0.getWrite() + fAudioAttributesCompatParcelizer);
    }

    private final void AudioAttributesCompatParcelizer(getType p0, boolean p1) {
        float fIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(getRead());
        p0.IconCompatParcelizer(p0.getRemoteActionCompatParcelizer() - fIconCompatParcelizer);
        p0.read(p0.getAudioAttributesCompatParcelizer() - fIconCompatParcelizer);
        float fAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(getRead());
        p0.write(p0.getRead() - fAudioAttributesCompatParcelizer);
        p0.RemoteActionCompatParcelizer(p0.getWrite() - fAudioAttributesCompatParcelizer);
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            _reportunkownformat.write(p0, true);
            if (this.MediaDescriptionCompat && p1) {
                p0.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (int) (write() >> 32), (int) write());
                p0.read();
            }
        }
    }

    protected final boolean RatingCompat(long p0) {
        if ((((9187343241974906880L ^ (p0 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        return _reportunkownformat == null || !this.MediaDescriptionCompat || _reportunkownformat.RemoteActionCompatParcelizer(p0);
    }

    public void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            _reportunkownformat.invalidate();
            return;
        }
        _bindAndClose _bindandclose = this.AudioAttributesImplApi26Parcelizer;
        if (_bindandclose != null) {
            _bindandclose.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        }
    }

    public void ResultReceiver() {
        _reportUnkownFormat _reportunkownformat = this.MediaSessionCompatResultReceiverWrapper;
        if (_reportunkownformat != null) {
            _reportunkownformat.invalidate();
        }
    }

    public final _bindAndClose AudioAttributesCompatParcelizer(_bindAndClose p0) {
        _assertNotNull iconCompatParcelizer = p0.getIconCompatParcelizer();
        _assertNotNull iconCompatParcelizer2 = getIconCompatParcelizer();
        if (iconCompatParcelizer == iconCompatParcelizer2) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            int iWrite = _bind.write(2);
            if (!iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitLocalAncestors called on an unattached node");
            }
            for (_handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver = iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver2.getRead().getMediaBrowserCompatItemReceiver(); mediaBrowserCompatItemReceiver != null; mediaBrowserCompatItemReceiver = mediaBrowserCompatItemReceiver.getMediaBrowserCompatItemReceiver()) {
                if ((mediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0 && mediaBrowserCompatItemReceiver == iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    return p0;
                }
            }
            return this;
        }
        while (iconCompatParcelizer.getOnPlayFromUri() > iconCompatParcelizer2.getOnPlayFromUri()) {
            iconCompatParcelizer = iconCompatParcelizer._init_lambda4();
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer);
        }
        while (iconCompatParcelizer2.getOnPlayFromUri() > iconCompatParcelizer.getOnPlayFromUri()) {
            iconCompatParcelizer2 = iconCompatParcelizer2._init_lambda4();
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer2);
        }
        while (iconCompatParcelizer != iconCompatParcelizer2) {
            iconCompatParcelizer = iconCompatParcelizer._init_lambda4();
            iconCompatParcelizer2 = iconCompatParcelizer2._init_lambda4();
            if (iconCompatParcelizer == null || iconCompatParcelizer2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (iconCompatParcelizer2 != getIconCompatParcelizer()) {
            if (iconCompatParcelizer != p0.getIconCompatParcelizer()) {
                return iconCompatParcelizer.onPrepareFromUri();
            }
            return p0;
        }
        return this;
    }

    protected final float write(long p0, long p1) {
        if (MediaBrowserCompatSearchResultReceiver() >= Float.intBitsToFloat((int) (p1 >> 32)) && AudioAttributesImplBaseParcelizer() >= Float.intBitsToFloat((int) p1)) {
            return Float.POSITIVE_INFINITY;
        }
        long jMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(p1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMediaBrowserCompatCustomActionResultReceiver >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jMediaBrowserCompatCustomActionResultReceiver);
        long jMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(p0);
        if ((fIntBitsToFloat > BitmapDescriptorFactory.HUE_RED || fIntBitsToFloat2 > BitmapDescriptorFactory.HUE_RED) && Float.intBitsToFloat((int) (jMediaBrowserCompatMediaItem >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) jMediaBrowserCompatMediaItem) <= fIntBitsToFloat2) {
            return getReferencedType.RemoteActionCompatParcelizer(jMediaBrowserCompatMediaItem);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: o._bindAndClose$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u000b\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a"}, d2 = {"Lo/_bindAndClose$write;", "", "<init>", "()V", "Lkotlin/Function1;", "Lo/_bindAndClose;", "", "AudioAttributesImplApi21Parcelizer", "Lo/getAnswerMap;", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "Lo/resolveAbstractType;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/resolveAbstractType;", "write", "Lo/setNamingStrategy;", "AudioAttributesImplApi26Parcelizer", "Lo/setNamingStrategy;", "RemoteActionCompatParcelizer", "Lo/resetWithShared;", "MediaBrowserCompatItemReceiver", "[F", "IconCompatParcelizer", "Lo/_bindAndClose$RemoteActionCompatParcelizer;", "Lo/_bindAndClose$RemoteActionCompatParcelizer;", "()Lo/_bindAndClose$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
            return _bindAndClose.RemoteActionCompatParcelizer;
        }

        public final RemoteActionCompatParcelizer write() {
            return _bindAndClose.read;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: o._bindAndClose$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_bindAndClose;", "p0", "", "IconCompatParcelizer", "(Lo/_bindAndClose;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_bindAndClose, getShowPopup> {
        public static final AnonymousClass2 IconCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_bindAndClose _bindandclose) throws Throwable {
            IconCompatParcelizer(_bindandclose);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_bindAndClose _bindandclose) throws Throwable {
            _assertNotNull iconCompatParcelizer = _bindandclose.getIconCompatParcelizer();
            try {
                if (_bindandclose.onRemoveQueueItem()) {
                    _bindAndClose.MediaBrowserCompatCustomActionResultReceiver$default(_bindandclose, false, 1, null);
                }
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } catch (Throwable th) {
                iconCompatParcelizer.IconCompatParcelizer(th);
                throw new PlanDetailsCreator();
            }
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o._bindAndClose$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_bindAndClose;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/_bindAndClose;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<_bindAndClose, getShowPopup> {
        public static final AnonymousClass5 IconCompatParcelizer = new AnonymousClass5();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_bindAndClose _bindandclose) {
            AudioAttributesCompatParcelizer(_bindandclose);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(_bindAndClose _bindandclose) {
            _reportUnkownFormat mediaSessionCompatResultReceiverWrapper = _bindandclose.getMediaSessionCompatResultReceiverWrapper();
            if (mediaSessionCompatResultReceiverWrapper != null) {
                mediaSessionCompatResultReceiverWrapper.invalidate();
            }
        }

        AnonymousClass5() {
            super(1);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/_bindAndClose$read;", "Lo/_bindAndClose$RemoteActionCompatParcelizer;", "Lo/_bind;", "Lo/forRootType;", "AudioAttributesCompatParcelizer", "()I", "Lo/_handleOddName$IconCompatParcelizer;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_handleOddName$IconCompatParcelizer;)Z", "Lo/_assertNotNull;", "(Lo/_assertNotNull;)Z", "Lo/getReferencedType;", "p1", "Lo/addValueInstantiators;", "p2", "Lo/handleWeirdNumberValue;", "p3", "p4", "", "IconCompatParcelizer", "(Lo/_assertNotNull;JLo/addValueInstantiators;IZ)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements RemoteActionCompatParcelizer {
        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(_assertNotNull p0) {
            return true;
        }

        read() {
        }

        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(_assertNotNull p0, long p1, addValueInstantiators p2, int p3, boolean p4) {
            p0.RemoteActionCompatParcelizer(p1, p2, p3, p4);
        }

        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final int AudioAttributesCompatParcelizer() {
            return _bind.write(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(_handleOddName.IconCompatParcelizer p0) {
            int iWrite = _bind.write(16);
            UTF32Reader uTF32Reader = null;
            while (p0 != 0) {
                if (p0 instanceof forRootType) {
                    if (((forRootType) p0).k_()) {
                        return true;
                    }
                } else if ((p0.getWrite() & iWrite) != 0 && (p0 instanceof addAbstractTypeResolver)) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) p0).getIconCompatParcelizer();
                    int i = 0;
                    p0 = p0;
                    while (iconCompatParcelizerOnRemoveQueueItem != null) {
                        if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                            i++;
                            if (i == 1) {
                                p0 = iconCompatParcelizerOnRemoveQueueItem;
                            } else {
                                if (uTF32Reader == null) {
                                    uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                }
                                if (p0 != 0) {
                                    if (uTF32Reader != null) {
                                        uTF32Reader.read(p0);
                                    }
                                    p0 = 0;
                                }
                                if (uTF32Reader != null) {
                                    uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                                }
                            }
                        }
                        iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                        p0 = p0;
                    }
                    if (i != 1) {
                    }
                }
                p0 = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\fJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/_bindAndClose$IconCompatParcelizer;", "Lo/_bindAndClose$RemoteActionCompatParcelizer;", "Lo/_bind;", "Lo/hasIndex;", "AudioAttributesCompatParcelizer", "()I", "Lo/_handleOddName$IconCompatParcelizer;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/_handleOddName$IconCompatParcelizer;)Z", "Lo/_assertNotNull;", "(Lo/_assertNotNull;)Z", "Lo/getReferencedType;", "p1", "Lo/addValueInstantiators;", "p2", "Lo/handleWeirdNumberValue;", "p3", "p4", "", "IconCompatParcelizer", "(Lo/_assertNotNull;JLo/addValueInstantiators;IZ)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements RemoteActionCompatParcelizer {
        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(_handleOddName.IconCompatParcelizer p0) {
            return false;
        }

        IconCompatParcelizer() {
        }

        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(_assertNotNull p0) {
            C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = p0.accessgetReportFullyDrawnExecutorp();
            boolean z = false;
            if (c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp != null && c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp.getAudioAttributesImplApi21Parcelizer()) {
                z = true;
            }
            return !z;
        }

        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(_assertNotNull p0, long p1, addValueInstantiators p2, int p3, boolean p4) {
            p0.AudioAttributesCompatParcelizer(p1, p2, p3, p4);
        }

        @Override // o._bindAndClose.RemoteActionCompatParcelizer
        public final int AudioAttributesCompatParcelizer() {
            return _bind.write(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        _handleOddName.IconCompatParcelizer mediaBrowserCompatItemReceiver;
        if (MediaBrowserCompatItemReceiver(_bind.write(128))) {
            parseDigitsRecursive.Companion companion = parseDigitsRecursive.INSTANCE;
            parseDigitsRecursive parsedigitsrecursiveIconCompatParcelizer = companion.IconCompatParcelizer();
            getAnswerMap<Object, getShowPopup> getanswermapAudioAttributesImplApi26Parcelizer = parsedigitsrecursiveIconCompatParcelizer != null ? parsedigitsrecursiveIconCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
            parseDigitsRecursive parsedigitsrecursive = companion.read(parsedigitsrecursiveIconCompatParcelizer);
            try {
                int iWrite = _bind.write(128);
                boolean zAudioAttributesCompatParcelizer = _findTreeDeserializer.AudioAttributesCompatParcelizer(iWrite);
                if (!zAudioAttributesCompatParcelizer) {
                    mediaBrowserCompatItemReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().getMediaBrowserCompatItemReceiver();
                    if (mediaBrowserCompatItemReceiver != null) {
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
                mediaBrowserCompatItemReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                for (_handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(zAudioAttributesCompatParcelizer); iconCompatParcelizerMediaBrowserCompatItemReceiver != null && (iconCompatParcelizerMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer() & iWrite) != 0; iconCompatParcelizerMediaBrowserCompatItemReceiver = iconCompatParcelizerMediaBrowserCompatItemReceiver.getAudioAttributesImplBaseParcelizer()) {
                    if ((iconCompatParcelizerMediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        UTF32Reader uTF32Reader = null;
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = iconCompatParcelizerMediaBrowserCompatItemReceiver;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof _writeCloseable) {
                                ((_writeCloseable) iconCompatParcelizerWrite).AudioAttributesCompatParcelizer(getIconCompatParcelizer());
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizerOnRemoveQueueItem != null) {
                                    if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizerOnRemoveQueueItem;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                                            }
                                        }
                                    }
                                    iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                        }
                    }
                    if (iconCompatParcelizerMediaBrowserCompatItemReceiver == mediaBrowserCompatItemReceiver) {
                        break;
                    }
                }
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            } finally {
                companion.AudioAttributesCompatParcelizer(parsedigitsrecursiveIconCompatParcelizer, parsedigitsrecursive, getanswermapAudioAttributesImplApi26Parcelizer);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void _init_lambda3() {
        if (MediaBrowserCompatItemReceiver(_bind.write(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES))) {
            int iWrite = _bind.write(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            boolean zAudioAttributesCompatParcelizer = _findTreeDeserializer.AudioAttributesCompatParcelizer(iWrite);
            _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            if (zAudioAttributesCompatParcelizer || (iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getMediaBrowserCompatItemReceiver()) != null) {
                for (_handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(zAudioAttributesCompatParcelizer); iconCompatParcelizerMediaBrowserCompatItemReceiver != null && (iconCompatParcelizerMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer() & iWrite) != 0; iconCompatParcelizerMediaBrowserCompatItemReceiver = iconCompatParcelizerMediaBrowserCompatItemReceiver.getAudioAttributesImplBaseParcelizer()) {
                    if ((iconCompatParcelizerMediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = iconCompatParcelizerMediaBrowserCompatItemReceiver;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof getSimpleName) {
                                ((getSimpleName) iconCompatParcelizerWrite).write();
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizerOnRemoveQueueItem != null) {
                                    if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizerOnRemoveQueueItem;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                                            }
                                        }
                                    }
                                    iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                        }
                    }
                    if (iconCompatParcelizerMediaBrowserCompatItemReceiver == iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                        return;
                    }
                }
            }
        }
    }

    private final void RemoteActionCompatParcelizer(long p0, float p1, getAnswerMap<? super validateAppend, getShowPopup> p2, hasAnyGetter p3) {
        if (p3 != null) {
            if (p2 != null) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("both ways to create layers shouldn't be used together");
            }
            if (this.MediaSessionCompatToken != p3) {
                this.MediaSessionCompatToken = null;
                RemoteActionCompatParcelizer$default(this, null, false, 2, null);
                this.MediaSessionCompatToken = p3;
            }
            if (this.MediaSessionCompatResultReceiverWrapper == null) {
                _reportUnkownFormat _reportunkownformat = _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).read(handleMediaPlayPauseIfPendingOnHandler(), this.onSkipToQueueItem, p3);
                _reportunkownformat.IconCompatParcelizer(getIconCompatParcelizer());
                _reportunkownformat.write(p0);
                this.MediaSessionCompatResultReceiverWrapper = _reportunkownformat;
                getIconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver(true);
                this.onSkipToQueueItem.invoke();
            }
        } else {
            if (this.MediaSessionCompatToken != null) {
                this.MediaSessionCompatToken = null;
                RemoteActionCompatParcelizer$default(this, null, false, 2, null);
            }
            RemoteActionCompatParcelizer$default(this, p2, false, 2, null);
        }
        if (!hasReferringProperties.write(getRead(), p0)) {
            _serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).write(_loadMore.INSTANCE.write());
            MediaMetadataCompat(p0);
            getIconCompatParcelizer().getAccessaddObserverForBackInvoker().getOnFastForward().onPrepareFromUri();
            _reportUnkownFormat _reportunkownformat2 = this.MediaSessionCompatResultReceiverWrapper;
            if (_reportunkownformat2 != null) {
                _reportunkownformat2.write(p0);
            } else {
                _bindAndClose _bindandclose = this.AudioAttributesImplApi26Parcelizer;
                if (_bindandclose != null) {
                    _bindandclose.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
                }
            }
            getIconCompatParcelizer().getDefaultViewModelProviderFactory();
            write(this);
            _configureGenerator onMediaButtonEvent = getIconCompatParcelizer().getOnMediaButtonEvent();
            if (onMediaButtonEvent != null) {
                onMediaButtonEvent.AudioAttributesCompatParcelizer(getIconCompatParcelizer());
            }
        }
        this.onPlayFromUri = p1;
        if (this == getIconCompatParcelizer().r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8()) {
            getAttributes.RemoteActionCompatParcelizer$default(_serializerProvider.AudioAttributesCompatParcelizer(getIconCompatParcelizer()).getAddObserverForBackInvokerlambda7(), getIconCompatParcelizer(), false, 2, null);
        }
        if (getMediaBrowserCompatMediaItem()) {
            return;
        }
        write(onMediaButtonEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(JsonParserDelegate p0, hasAnyGetter p1) {
        _handleOddName.IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(_bind.write(4));
        if (iconCompatParcelizerRemoteActionCompatParcelizer == null) {
            write(p0, p1);
        } else {
            getIconCompatParcelizer().MediaSessionCompatQueueItem().write(p0, SetterlessProperty.AudioAttributesCompatParcelizer(write()), this, iconCompatParcelizerRemoteActionCompatParcelizer, p1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void _init_lambda2() {
        int iWrite = _bind.write(4194304);
        boolean zAudioAttributesCompatParcelizer = _findTreeDeserializer.AudioAttributesCompatParcelizer(iWrite);
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (zAudioAttributesCompatParcelizer || (iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getMediaBrowserCompatItemReceiver()) != null) {
            for (_handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(zAudioAttributesCompatParcelizer); iconCompatParcelizerMediaBrowserCompatItemReceiver != null && (iconCompatParcelizerMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer() & iWrite) != 0; iconCompatParcelizerMediaBrowserCompatItemReceiver = iconCompatParcelizerMediaBrowserCompatItemReceiver.getAudioAttributesImplBaseParcelizer()) {
                if ((iconCompatParcelizerMediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = iconCompatParcelizerMediaBrowserCompatItemReceiver;
                    UTF32Reader uTF32Reader = null;
                    while (iconCompatParcelizerWrite != 0) {
                        if (iconCompatParcelizerWrite instanceof _writeCloseable) {
                            ((_writeCloseable) iconCompatParcelizerWrite).write(this);
                        } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                            int i = 0;
                            iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                            while (iconCompatParcelizerOnRemoveQueueItem != null) {
                                if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                                    i++;
                                    if (i == 1) {
                                        iconCompatParcelizerWrite = iconCompatParcelizerOnRemoveQueueItem;
                                    } else {
                                        if (uTF32Reader == null) {
                                            uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                        }
                                        if (iconCompatParcelizerWrite != 0) {
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizerWrite);
                                            }
                                            iconCompatParcelizerWrite = 0;
                                        }
                                        if (uTF32Reader != null) {
                                            uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                                        }
                                    }
                                }
                                iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                            }
                            if (i != 1) {
                            }
                        }
                        iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                    }
                }
                if (iconCompatParcelizerMediaBrowserCompatItemReceiver == iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    return;
                }
            }
        }
    }

    protected final boolean AudioAttributesImplApi21Parcelizer(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) p0);
        return fIntBitsToFloat >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat2 >= BitmapDescriptorFactory.HUE_RED && fIntBitsToFloat < ((float) MediaBrowserCompatSearchResultReceiver()) && fIntBitsToFloat2 < ((float) AudioAttributesImplBaseParcelizer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final boolean _init_lambda5() {
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(_findTreeDeserializer.AudioAttributesCompatParcelizer(_bind.write(16)));
        if (iconCompatParcelizerMediaBrowserCompatItemReceiver != null && iconCompatParcelizerMediaBrowserCompatItemReceiver.getRatingCompat()) {
            _handleOddName.IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerMediaBrowserCompatItemReceiver;
            int iWrite = _bind.write(16);
            if (!iconCompatParcelizer.getRead().getRatingCompat()) {
                reportWrongTokenException.read("visitLocalDescendants called on an unattached node");
            }
            _handleOddName.IconCompatParcelizer read2 = iconCompatParcelizer.getRead();
            if ((read2.getRemoteActionCompatParcelizer() & iWrite) != 0) {
                while (read2 != null) {
                    if ((read2.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = read2;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof forRootType) {
                                if (((forRootType) iconCompatParcelizerWrite).h_()) {
                                    return true;
                                }
                            } else if ((iconCompatParcelizerWrite.getWrite() & iWrite) != 0 && (iconCompatParcelizerWrite instanceof addAbstractTypeResolver)) {
                                _handleOddName.IconCompatParcelizer iconCompatParcelizerOnRemoveQueueItem = ((addAbstractTypeResolver) iconCompatParcelizerWrite).getIconCompatParcelizer();
                                int i = 0;
                                iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                while (iconCompatParcelizerOnRemoveQueueItem != null) {
                                    if ((iconCompatParcelizerOnRemoveQueueItem.getWrite() & iWrite) != 0) {
                                        i++;
                                        if (i == 1) {
                                            iconCompatParcelizerWrite = iconCompatParcelizerOnRemoveQueueItem;
                                        } else {
                                            if (uTF32Reader == null) {
                                                uTF32Reader = new UTF32Reader(new _handleOddName.IconCompatParcelizer[16], 0);
                                            }
                                            if (iconCompatParcelizerWrite != 0) {
                                                if (uTF32Reader != null) {
                                                    uTF32Reader.read(iconCompatParcelizerWrite);
                                                }
                                                iconCompatParcelizerWrite = 0;
                                            }
                                            if (uTF32Reader != null) {
                                                uTF32Reader.read(iconCompatParcelizerOnRemoveQueueItem);
                                            }
                                        }
                                    }
                                    iconCompatParcelizerOnRemoveQueueItem = iconCompatParcelizerOnRemoveQueueItem.getAudioAttributesImplBaseParcelizer();
                                    iconCompatParcelizerWrite = iconCompatParcelizerWrite;
                                }
                                if (i != 1) {
                                }
                            }
                            iconCompatParcelizerWrite = collectLongDefaults.write((UTF32Reader<_handleOddName.IconCompatParcelizer>) uTF32Reader);
                        }
                    }
                    read2 = read2.getAudioAttributesImplBaseParcelizer();
                }
            }
        }
        return false;
    }

    private final long MediaBrowserCompatMediaItem(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat < BitmapDescriptorFactory.HUE_RED ? -fIntBitsToFloat : fIntBitsToFloat - MediaBrowserCompatSearchResultReceiver());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) p0);
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat2 < BitmapDescriptorFactory.HUE_RED ? -fIntBitsToFloat2 : fIntBitsToFloat2 - AudioAttributesImplBaseParcelizer()))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    protected final long MediaBrowserCompatCustomActionResultReceiver(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) p0);
        float fAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        long j = -1;
        return calloc.write((((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, (fIntBitsToFloat - fMediaBrowserCompatSearchResultReceiver) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(BitmapDescriptorFactory.HUE_RED, (fIntBitsToFloat2 - fAudioAttributesImplBaseParcelizer) / 2.0f))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }
}
