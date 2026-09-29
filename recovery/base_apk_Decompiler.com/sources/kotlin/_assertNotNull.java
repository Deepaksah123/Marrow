package kotlin;

import android.view.View;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Comparator;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._configureGenerator;
import kotlin._handleOddName;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\u0018 H:B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u0011J\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b \u0010!J'\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0000¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010'\u001a\u00020\u000fH\u0000¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020+H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0000¢\u0006\u0004\b.\u0010\u0011J\u000f\u0010/\u001a\u00020\u001aH\u0016¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u001a2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b8\u00107J\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b \u00107J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b,\u00107J\u0015\u00109\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b9\u00107J\u0015\u0010:\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b:\u00107J\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u00107J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u00107J\u0015\u0010\u001d\u001a\u00020<2\u0006\u0010\n\u001a\u00020;¢\u0006\u0004\b\u001d\u0010=J\u000f\u0010>\u001a\u00020\u000fH\u0002¢\u0006\u0004\b>\u0010\u0011J\u000f\u0010?\u001a\u00020\u000fH\u0000¢\u0006\u0004\b?\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020@H\u0002¢\u0006\u0004\b\u0018\u0010AJ\u000f\u0010B\u001a\u00020\u000fH\u0002¢\u0006\u0004\bB\u0010\u0011J\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010\u0011J\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010\u0011J\u000f\u0010E\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010\u0011J!\u0010H\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020F2\b\u0010\f\u001a\u0004\u0018\u00010GH\u0000¢\u0006\u0004\bH\u0010IJ3\u0010H\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020J2\u0006\u0010\f\u001a\u00020K2\b\b\u0002\u0010\"\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\tH\u0000¢\u0006\u0004\bH\u0010NJ3\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020J2\u0006\u0010\f\u001a\u00020K2\b\b\u0002\u0010\"\u001a\u00020L2\b\b\u0002\u0010M\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010NJ\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010!J-\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010OJ-\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001d\u0010OJ\u000f\u0010P\u001a\u00020\u000fH\u0000¢\u0006\u0004\bP\u0010\u0011J\u000f\u0010Q\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010\u0011J\u000f\u0010R\u001a\u00020\u000fH\u0000¢\u0006\u0004\bR\u0010\u0011J\u0019\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010SJ\u0019\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b,\u0010SJ\u000f\u0010T\u001a\u00020\u000fH\u0000¢\u0006\u0004\bT\u0010\u0011J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020V0UH\u0016¢\u0006\u0004\b6\u0010WJ\u000f\u0010X\u001a\u00020\u000fH\u0000¢\u0006\u0004\bX\u0010\u0011J\u001b\u0010H\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010YH\u0000¢\u0006\u0004\bH\u0010ZJ\u001b\u0010 \u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010YH\u0000¢\u0006\u0004\b \u0010ZJ\u000f\u0010[\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010\u0011J\u000f\u0010\\\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\\\u0010\u0011J\u000f\u0010]\u001a\u00020\u000fH\u0000¢\u0006\u0004\b]\u0010\u0011J\u000f\u0010^\u001a\u00020\u000fH\u0000¢\u0006\u0004\b^\u0010\u0011J\u000f\u0010_\u001a\u00020\u000fH\u0016¢\u0006\u0004\b_\u0010\u0011J\u000f\u0010`\u001a\u00020\u000fH\u0016¢\u0006\u0004\b`\u0010\u0011J\u000f\u0010a\u001a\u00020\u000fH\u0000¢\u0006\u0004\ba\u0010\u0011J\u000f\u0010b\u001a\u00020\u000fH\u0002¢\u0006\u0004\bb\u0010\u0011J\u000f\u0010c\u001a\u00020\u000fH\u0000¢\u0006\u0004\bc\u0010\u0011J\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b,\u0010\u0011R\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\"\u0010\u001d\u001a\u00020\u000b8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\b_\u0010jR\"\u0010H\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bk\u0010e\u001a\u0004\bl\u0010%\"\u0004\bH\u0010SR\"\u0010,\u001a\u00020m8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\b\u001d\u0010rR\"\u0010\u0018\u001a\u00020s8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bt\u0010o\u001a\u0004\bu\u0010q\"\u0004\b\u0018\u0010rR\"\u00108\u001a\u00020m8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bu\u0010o\u001a\u0004\bv\u0010q\"\u0004\bH\u0010rR\"\u00109\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bw\u0010e\u001a\u0004\bx\u0010%\"\u0004\b6\u0010SR\"\u00106\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\by\u0010e\u001a\u0004\bz\u0010%\"\u0004\b\u001d\u0010SR\u001c\u0010:\u001a\u00020\u000b8\u0016@\u0017X\u0097\u000e¢\u0006\f\n\u0004\ba\u0010g\"\u0004\bH\u0010jR\u001c\u0010h\u001a\u00020\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bl\u0010e\u001a\u0004\b{\u0010%R.\u0010_\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00008\u0001@CX\u0081\u000e¢\u0006\u0012\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0004\b\u001d\u0010!R\u0016\u0010\u0082\u0001\u001a\u0004\u0018\u00010\t8G¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010gR\u001d\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0084\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bh\u0010\u0085\u0001R\u001b\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00000U8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010WR!\u0010T\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0088\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0089\u0001R\u001c\u0010z\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010U8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010WR\u001b\u0010.\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010U8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010WR\u0017\u0010a\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010eR\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0088\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001c\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000U8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010WR\u0019\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010}R\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00008AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u007fR,\u0010k\u001a\u0004\u0018\u00010+2\b\u0010\n\u001a\u0004\u0018\u00010+8\u0001@BX\u0081\u000e¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R2\u0010\u0090\u0001\u001a\f\u0018\u00010\u0098\u0001j\u0005\u0018\u0001`\u0099\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0005\b,\u0010\u009d\u0001R\u0015\u0010\u0087\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010%R\u001e\u0010\u009f\u0001\u001a\u00020\u000b8\u0001@\u0000X\u0081\f¢\u0006\r\n\u0004\bT\u0010g\u001a\u0005\b\u009e\u0001\u0010iR\u0018\u0010¢\u0001\u001a\u00030 \u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010¡\u0001R\u001a\u0010¦\u0001\u001a\u0005\u0018\u00010£\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0017\u0010\u009e\u0001\u001a\u00030§\u00018AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bf\u0010¨\u0001R\u0017\u0010t\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010eR\u001d\u0010l\u001a\u00020\t8\u0000@\u0001X\u0081\u000e¢\u0006\r\n\u0005\b¦\u0001\u0010e\"\u0004\bh\u0010SR\u0019\u0010d\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b1\u0010©\u0001R\u0017\u0010n\u001a\u0004\u0018\u00010(8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010*R\u0018\u0010«\u0001\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010eR\u001e\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0088\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0089\u0001R\u0017\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010eR\u001d\u0010p\u001a\t\u0012\u0004\u0012\u00020\u00000\u0088\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010\u008e\u0001R\u0015\u0010\u009b\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010%R\u0015\u0010|\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010%R1\u0010´\u0001\u001a\u00030¯\u00012\u0007\u0010\n\u001a\u00030¯\u00018\u0017@WX\u0097\u000e¢\u0006\u0016\n\u0005\b\u0016\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0005\b\u0018\u0010³\u0001R\u001a\u0010u\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010µ\u0001R1\u0010\u0094\u0001\u001a\u00030¶\u00012\u0007\u0010\n\u001a\u00030¶\u00018\u0017@WX\u0097\u000e¢\u0006\u0016\n\u0005\b.\u0010·\u0001\u001a\u0006\b\u009f\u0001\u0010¸\u0001\"\u0005\b\u0018\u0010¹\u0001R1\u0010¾\u0001\u001a\u00030º\u00012\u0007\u0010\n\u001a\u00030º\u00018\u0017@WX\u0097\u000e¢\u0006\u0016\n\u0006\b¬\u0001\u0010»\u0001\u001a\u0005\b9\u0010¼\u0001\"\u0005\b\u001d\u0010½\u0001R1\u0010w\u001a\u00030¿\u00012\u0007\u0010\n\u001a\u00030¿\u00018\u0017@WX\u0097\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0005\b \u0010Ã\u0001R1\u0010f\u001a\u00030Ä\u00012\u0007\u0010\n\u001a\u00030Ä\u00018\u0017@WX\u0097\u000e¢\u0006\u0017\n\u0006\b\u008f\u0001\u0010Å\u0001\u001a\u0006\b¢\u0001\u0010Æ\u0001\"\u0005\bH\u0010Ç\u0001R\u0019\u0010~\u001a\u0005\u0018\u00010È\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0015\u0010\u008c\u0001\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010iR\u0015\u0010¤\u0001\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010iR\u0016\u0010Ë\u0001\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010%R\u0018\u0010\u00ad\u0001\u001a\u00030Ì\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010Í\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010%R\u0013\u0010±\u0001\u001a\u00020\t8G¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010%R\u0016\u0010Ð\u0001\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010iR\u0018\u0010Ó\u0001\u001a\u00030Ñ\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ò\u0001R\u0018\u0010Ô\u0001\u001a\u00030Ñ\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ò\u0001R(\u0010×\u0001\u001a\u00030Ñ\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\b\u009e\u0001\u0010Õ\u0001\u001a\u0005\b|\u0010Ò\u0001\"\u0005\bH\u0010Ö\u0001R\u0019\u0010Ø\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b~\u0010Õ\u0001R#\u0010x\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0013\n\u0004\bz\u0010e\u001a\u0005\b\u0091\u0001\u0010%\"\u0004\b \u0010SR\u001f\u0010v\u001a\u00030Ù\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010Ú\u0001\u001a\u0006\b×\u0001\u0010Û\u0001R\u0017\u0010\u0093\u0001\u001a\u00030Ü\u00018AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bt\u0010Ý\u0001R\u001f\u0010Ï\u0001\u001a\u00030Þ\u00018\u0001X\u0081\u0004¢\u0006\u000f\n\u0006\b«\u0001\u0010ß\u0001\u001a\u0005\bw\u0010à\u0001R\u0018\u0010ª\u0001\u001a\u00030Ü\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ý\u0001R\u0018\u0010ä\u0001\u001a\u00030á\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R+\u0010\u0096\u0001\u001a\u0005\u0018\u00010å\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\bË\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0005\b\u0018\u0010é\u0001R\u001a\u0010?\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b6\u0010ê\u0001R\u001e\u0010Á\u0001\u001a\u00020\t8\u0000@\u0001X\u0081\u000e¢\u0006\r\n\u0005\b\u0091\u0001\u0010e\"\u0004\b:\u0010SR\u001a\u0010®\u0001\u001a\u0005\u0018\u00010Ü\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010Ý\u0001R\u0018\u0010\u008d\u0001\u001a\u00020@8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b_\u0010ë\u0001R\u001b\u0010ç\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010ë\u0001R\u0015\u0010'\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010%R&\u0010C\u001a\u00020@2\u0006\u0010\n\u001a\u00020@8W@WX\u0096\u000e¢\u0006\u000e\u001a\u0006\b\u0083\u0001\u0010ì\u0001\"\u0004\b \u0010AR\u0016\u0010P\u001a\u00030í\u00018WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bH\u0010î\u0001R.\u0010Q\u001a\u0011\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010ï\u00018\u0000@\u0001X\u0081\u000e¢\u0006\u000f\n\u0006\b´\u0001\u0010ð\u0001\"\u0005\bH\u0010ñ\u0001R.\u0010X\u001a\u0011\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f\u0018\u00010ï\u00018\u0000@\u0001X\u0081\u000e¢\u0006\u000f\n\u0006\b¾\u0001\u0010ð\u0001\"\u0005\b\u0018\u0010ñ\u0001R#\u0010$\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0013\n\u0004\bp\u0010e\u001a\u0005\bÔ\u0001\u0010%\"\u0004\b9\u0010SR,\u0010Î\u0001\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8\u0007@GX\u0087\u000e¢\u0006\u0013\n\u0005\b\u0090\u0001\u0010g\u001a\u0004\bd\u0010i\"\u0004\bh\u0010jR\u0015\u0010E\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010%R\u0016\u0010\u0080\u0001\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010%R\u0015\u0010{\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010%R\u0015\u0010[\u001a\u00020\t8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010%R\u0018\u0010]\u001a\u0004\u0018\u00010\u00058WX\u0096\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010ò\u0001R\u001b\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050U8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010WR&\u0010\\\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0017@RX\u0097\u000e¢\u0006\u000e\n\u0005\b¢\u0001\u0010e\u001a\u0005\b\u0082\u0001\u0010%"}, d2 = {"Lo/_assertNotNull;", "Lo/_getByteArrayBuilder;", "Lo/getPathReference;", "Lo/createDummyDeserializationContext;", "Lo/isEnumImplType;", "Lo/namingStrategyInstance;", "Lo/getDependencies;", "Lo/_writeCloseableValue;", "Lo/_configureGenerator$IconCompatParcelizer;", "", "p0", "", "p1", "<init>", "(ZI)V", "", "onCreate", "()V", "onMenuItemSelected", "getViewModelStore", "Landroid/view/View;", "Lo/write;", "onSetCaptioningEnabled", "()Landroid/view/View;", "AudioAttributesCompatParcelizer", "(ILo/_assertNotNull;)V", "", "(Lo/_assertNotNull;)Ljava/lang/String;", "getOnBackPressedDispatcher", "IconCompatParcelizer", "(II)V", "getLastCustomNonConfigurationInstance", "read", "(Lo/_assertNotNull;)V", "p2", "(III)V", "addOnPictureInPictureModeChangedListener", "()Z", "getSavedStateRegistry", "menuHostHelperlambda0", "Lo/valueInstantiators;", "onBackPressed", "()Lo/valueInstantiators;", "Lo/_configureGenerator;", "write", "(Lo/_configureGenerator;)V", "onAddQueueItem", "toString", "()Ljava/lang/String;", "RatingCompat", "(I)Ljava/lang/String;", "Lo/ObjectMapper;", "invalidateMenu", "()Lo/ObjectMapper;", "AudioAttributesImplApi21Parcelizer", "(I)I", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "", "", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "onMultiWindowModeChanged", "ensureViewModelStore", "Lo/_handleOddName;", "(Lo/_handleOddName;)V", "onCreatePanelMenu", "addMenuProvider", "getFullyDrawnReporter", "addOnConfigurationChangedListener", "Lo/JsonParserDelegate;", "Lo/hasAnyGetter;", "RemoteActionCompatParcelizer", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "Lo/getReferencedType;", "Lo/addValueInstantiators;", "Lo/handleWeirdNumberValue;", "p3", "(JLo/addValueInstantiators;IZ)V", "(ZZZ)V", "getOnBackPressedDispatcherannotations", "addContentView", "getDefaultViewModelProviderFactory", "(Z)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "", "Lo/getAbsentValue;", "()Ljava/util/List;", "getSavedStateRegistryControllerannotations", "Lo/PropertyValueAny;", "(Lo/PropertyValueAny;)Z", "getDefaultViewModelCreationExtras", "addOnUserLeaveHintListener", "addOnTrimMemoryListener", "getActivityResultRegistry", "MediaBrowserCompatSearchResultReceiver", "s_", "onCommand", "initializeViewTreeOwners", "getLifecycle", "onSeekTo", "Z", "ParcelableVolumeInfo", "I", "MediaBrowserCompatItemReceiver", "()I", "(I)V", "onMediaButtonEvent", "onRemoveQueueItemAt", "Lo/hasReferringProperties;", "onRemoveQueueItem", "J", "onSetRepeatMode", "()J", "(J)V", "Lo/getKey;", "onPrepareFromUri", "setSessionImpl", "_init_lambda2", "onSkipToNext", "r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28", "MediaMetadataCompat", "onCustomAction", "addOnContextAvailableListener", "onSetRating", "Lo/_assertNotNull;", "MediaSessionCompatResultReceiverWrapper", "()Lo/_assertNotNull;", "addOnNewIntentListener", "()Ljava/lang/Boolean;", "MediaBrowserCompatMediaItem", "PlaybackStateCompatCustomAction", "Lo/writer;", "Lo/writer;", "MediaDescriptionCompat", "onPrepareFromMediaId", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "Lo/isTypeOrSuperTypeOf;", "onFastForward", "MediaSessionCompatQueueItem", "addObserverForBackInvoker", "()Lo/UTF32Reader;", "handleMediaPlayPauseIfPendingOnHandler", "onPause", "onPlay", "onPlayFromMediaId", "_init_lambda4", "onSkipToQueueItem", "Lo/_configureGenerator;", "accessensureViewModelStore", "()Lo/_configureGenerator;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Lo/InteropViewFactoryHolder;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "onSetShuffleMode", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "onPrepare", "onPlayFromUri", "Lo/_assertNotNull$RemoteActionCompatParcelizer;", "()Lo/_assertNotNull$RemoteActionCompatParcelizer;", "onPlayFromSearch", "Lo/setPropertyNamingStrategy;", "MediaSessionCompatToken", "()Lo/setPropertyNamingStrategy;", "onPrepareFromSearch", "Lo/getSubtypeResolver;", "()Lo/getSubtypeResolver;", "Lo/valueInstantiators;", "accessgetReportFullyDrawnExecutorp", "onRewind", "onSetPlaybackSpeed", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "accessonBackPresseds1027565324", "Lo/withTypeHandler;", "Lo/withTypeHandler;", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "()Lo/withTypeHandler;", "(Lo/withTypeHandler;)V", "onSkipToPrevious", "Lo/ObjectMapper;", "Lo/bufferMapProperty;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V", "Lo/tryToResolveUnresolved;", "Lo/tryToResolveUnresolved;", "()Lo/tryToResolveUnresolved;", "(Lo/tryToResolveUnresolved;)V", "onStop", "Lo/CoercionConfig;", "Lo/CoercionConfig;", "addObserverForBackInvokerlambda7", "()Lo/CoercionConfig;", "(Lo/CoercionConfig;)V", "Lo/_getCharDesc;", "Lo/_getCharDesc;", "()Lo/_getCharDesc;", "(Lo/_getCharDesc;)V", "Lo/expectComma;", "onActivityResult", "()Lo/expectComma;", "PlaybackStateCompat", "Lo/_readMapAndClose;", "()Lo/_readMapAndClose;", "addOnMultiWindowModeChangedListener", "accessaddObserverForBackInvoker", "ResultReceiver", "Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "()Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0", "Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "(Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;)V", "_init_lambda3", "r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8", "Lo/ObjectReader;", "Lo/ObjectReader;", "()Lo/ObjectReader;", "Lo/_bindAndClose;", "()Lo/_bindAndClose;", "Lo/addMixIn;", "Lo/addMixIn;", "()Lo/addMixIn;", "", "onConfigurationChanged", "()F", "_init_lambda5", "Lo/isThrowable;", "Lo/isThrowable;", "createFullyDrawnExecutor", "()Lo/isThrowable;", "(Lo/isThrowable;)V", "Lo/_bindAndClose;", "Lo/_handleOddName;", "()Lo/_handleOddName;", "Lo/isAbstract;", "()Lo/isAbstract;", "Lkotlin/Function1;", "Lo/getAnswerMap;", "(Lo/getAnswerMap;)V", "()Lo/namingStrategyInstance;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _assertNotNull implements _getByteArrayBuilder, getPathReference, createDummyDeserializationContext, namingStrategyInstance, getDependencies, _writeCloseableValue, _configureGenerator.IconCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private _bindAndClose ensureViewModelStore;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private _assertNotNull onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final writer<_assertNotNull> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private UTF32Reader<_assertNotNull> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private _handleOddName addObserverForBackInvoker;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private int onPlayFromUri;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final UTF32Reader<_assertNotNull> onSetPlaybackSpeed;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: from kotlin metadata */
    private boolean onCommand;

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from kotlin metadata */
    private MediaBrowserCompatCustomActionResultReceiver r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from kotlin metadata */
    private _handleOddName createFullyDrawnExecutor;

    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from kotlin metadata */
    private isThrowable accessensureViewModelStore;

    /* JADX INFO: renamed from: PlaybackStateCompatCustomAction, reason: from kotlin metadata */
    private int RatingCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private C0216valueInstantiators onSeekTo;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private _getCharDesc ParcelableVolumeInfo;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private bufferMapProperty onSkipToQueueItem;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private AndroidViewHolder onPause;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private int addOnMultiWindowModeChangedListener;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private boolean addObserverForBackInvokerlambda7;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private boolean onPrepareFromUri;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private boolean addOnUserLeaveHintListener;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private boolean onRewind;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private MediaBrowserCompatCustomActionResultReceiver _init_lambda3;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private ObjectMapper setSessionImpl;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private boolean onRemoveQueueItemAt;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private long write;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final addMixIn accessaddObserverForBackInvoker;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private withTypeHandler onSkipToPrevious;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private tryToResolveUnresolved onStop;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private _assertNotNull MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private boolean addOnPictureInPictureModeChangedListener;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private final ObjectReader _init_lambda2;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private getAnswerMap<? super _configureGenerator, getShowPopup> addContentView;

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private _configureGenerator onMediaButtonEvent;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private getAnswerMap<? super _configureGenerator, getShowPopup> getSavedStateRegistryControllerannotations;

    /* JADX INFO: renamed from: r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, reason: from kotlin metadata */
    private CoercionConfig onSkipToNext;

    /* JADX INFO: renamed from: r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, reason: from kotlin metadata */
    private boolean onSetCaptioningEnabled;

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int IconCompatParcelizer = 8;
    private static final AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer();
    private static final getCreatedOnDateMs<_assertNotNull> write = AnonymousClass3.AudioAttributesCompatParcelizer;
    private static final CoercionConfig RemoteActionCompatParcelizer = new write();
    private static final Comparator<_assertNotNull> AudioAttributesImplBaseParcelizer = new Comparator() { // from class: o._readValue
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return _assertNotNull.RemoteActionCompatParcelizer((_assertNotNull) obj, (_assertNotNull) obj2);
        }
    };

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.values().length];
            try {
                iArr[RemoteActionCompatParcelizer.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public _assertNotNull(boolean z, int i) {
        this.read = z;
        this.IconCompatParcelizer = i;
        this.write = hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer = getKey.INSTANCE.RemoteActionCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = hasReferringProperties.INSTANCE.RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = true;
        this.MediaDescriptionCompat = new writer<>(new UTF32Reader(new _assertNotNull[16], 0), new AnonymousClass5());
        this.onSetPlaybackSpeed = new UTF32Reader<>(new _assertNotNull[16], 0);
        this.onSetCaptioningEnabled = true;
        this.onSkipToPrevious = AudioAttributesImplApi26Parcelizer;
        this.onSkipToQueueItem = _serializerProvider.read;
        this.onStop = tryToResolveUnresolved.write;
        this.onSkipToNext = RemoteActionCompatParcelizer;
        this.ParcelableVolumeInfo = _getCharDesc.INSTANCE.RemoteActionCompatParcelizer();
        this._init_lambda3 = MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        this._init_lambda2 = new ObjectReader(this);
        this.accessaddObserverForBackInvoker = new addMixIn(this);
        this.addObserverForBackInvokerlambda7 = true;
        this.addObserverForBackInvoker = _handleOddName.INSTANCE;
    }

    public /* synthetic */ _assertNotNull(boolean z, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? withValueInstantiators.IconCompatParcelizer() : i);
    }

    @Override // kotlin.isEnumImplType
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void MediaBrowserCompatSearchResultReceiver(int i) {
        this.IconCompatParcelizer = i;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(long j) {
        this.write = j;
    }

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.AudioAttributesCompatParcelizer = j;
    }

    /* JADX INFO: renamed from: setSessionImpl, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.AudioAttributesImplApi26Parcelizer = j;
    }

    /* JADX INFO: renamed from: _init_lambda2, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    /* JADX INFO: renamed from: r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.getDependencies
    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    /* JADX INFO: renamed from: addOnContextAvailableListener, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from getter */
    public final _assertNotNull getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    private final void IconCompatParcelizer(_assertNotNull _assertnotnull) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_assertnotnull, this.MediaBrowserCompatSearchResultReceiver)) {
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = _assertnotnull;
        if (_assertnotnull != null) {
            this.accessaddObserverForBackInvoker.write();
            _bindAndClose read = onPrepareFromUri().getRead();
            for (_bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(); !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, read) && _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != null; _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getRead()) {
                _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.RatingCompat();
            }
        } else {
            this.accessaddObserverForBackInvoker.onRemoveQueueItem();
        }
        getOnBackPressedDispatcherannotations();
    }

    public final Boolean addOnNewIntentListener() {
        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
        if (setpropertynamingstrategyMediaSessionCompatToken != null) {
            return Boolean.valueOf(setpropertynamingstrategyMediaSessionCompatToken.onFastForward());
        }
        return null;
    }

    /* JADX INFO: renamed from: o._assertNotNull$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            _assertNotNull.this.getAccessaddObserverForBackInvoker().onPlayFromSearch();
        }

        AnonymousClass5() {
            super(0);
        }
    }

    public final List<_assertNotNull> onPrepareFromMediaId() {
        return this.MediaDescriptionCompat.write().read();
    }

    private final void onCreate() {
        if (this.onCommand) {
            this.onCommand = false;
            UTF32Reader<_assertNotNull> uTF32Reader = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (uTF32Reader == null) {
                uTF32Reader = new UTF32Reader<>(new _assertNotNull[16], 0);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = uTF32Reader;
            }
            uTF32Reader.RemoteActionCompatParcelizer();
            UTF32Reader<_assertNotNull> uTF32ReaderWrite = this.MediaDescriptionCompat.write();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderWrite.IconCompatParcelizer;
            int iWrite = uTF32ReaderWrite.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < iWrite; i++) {
                _assertNotNull _assertnotnull = _assertnotnullArr[i];
                if (!_assertnotnull.read) {
                    uTF32Reader.read(_assertnotnull);
                } else {
                    uTF32Reader.read(uTF32Reader.getAudioAttributesCompatParcelizer(), _assertnotnull.addObserverForBackInvoker());
                }
            }
            this.accessaddObserverForBackInvoker.onPlayFromSearch();
        }
    }

    public final List<isTypeOrSuperTypeOf> onFastForward() {
        return ParcelableVolumeInfo().RatingCompat();
    }

    public final List<isTypeOrSuperTypeOf> onMediaButtonEvent() {
        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
        toMagicModuleMetaRepoModel.write(setpropertynamingstrategyMediaSessionCompatToken);
        return setpropertynamingstrategyMediaSessionCompatToken.RatingCompat();
    }

    private final void onMenuItemSelected() {
        _assertNotNull _assertnotnull;
        if (this.RatingCompat > 0) {
            this.onCommand = true;
        }
        if (!this.read || (_assertnotnull = this.onPlayFromMediaId) == null) {
            return;
        }
        _assertnotnull.onMenuItemSelected();
    }

    public final UTF32Reader<_assertNotNull> addObserverForBackInvoker() {
        getViewModelStore();
        if (this.RatingCompat == 0) {
            return this.MediaDescriptionCompat.write();
        }
        UTF32Reader<_assertNotNull> uTF32Reader = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.write(uTF32Reader);
        return uTF32Reader;
    }

    public final void getViewModelStore() {
        if (this.RatingCompat > 0) {
            onCreate();
        }
    }

    public final List<_assertNotNull> onPause() {
        return addObserverForBackInvoker().read();
    }

    public final _assertNotNull _init_lambda4() {
        _assertNotNull _assertnotnull = this.onPlayFromMediaId;
        while (_assertnotnull != null && _assertnotnull.read) {
            _assertnotnull = _assertnotnull.onPlayFromMediaId;
        }
        return _assertnotnull;
    }

    /* JADX INFO: renamed from: accessensureViewModelStore, reason: from getter */
    public final _configureGenerator getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from getter */
    public final AndroidViewHolder getOnPause() {
        return this.onPause;
    }

    public final void write(AndroidViewHolder androidViewHolder) {
        this.onPause = androidViewHolder;
    }

    public final View onSetCaptioningEnabled() {
        AndroidViewHolder androidViewHolder = this.onPause;
        if (androidViewHolder != null) {
            return androidViewHolder.RemoteActionCompatParcelizer();
        }
        return null;
    }

    @Override // kotlin.isEnumImplType
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.onMediaButtonEvent != null;
    }

    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public final int getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    public final RemoteActionCompatParcelizer onSkipToQueueItem() {
        return this.accessaddObserverForBackInvoker.getAudioAttributesImplApi21Parcelizer();
    }

    public final setPropertyNamingStrategy MediaSessionCompatToken() {
        return this.accessaddObserverForBackInvoker.getOnPrepareFromMediaId();
    }

    public final getSubtypeResolver ParcelableVolumeInfo() {
        return this.accessaddObserverForBackInvoker.getOnFastForward();
    }

    public final void AudioAttributesCompatParcelizer(int p0, _assertNotNull p1) {
        if (p1.onPlayFromMediaId != null && p1.onMediaButtonEvent != null) {
            reportWrongTokenException.read(AudioAttributesCompatParcelizer(p1));
        }
        p1.onPlayFromMediaId = this;
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(p0, p1);
        getOnBackPressedDispatcher();
        if (p1.read) {
            this.RatingCompat++;
        }
        onMenuItemSelected();
        _configureGenerator _configuregenerator = this.onMediaButtonEvent;
        if (_configuregenerator != null) {
            p1.write(_configuregenerator);
        }
        if (p1.accessaddObserverForBackInvoker.getOnPlayFromMediaId() > 0) {
            addMixIn addmixin = this.accessaddObserverForBackInvoker;
            addmixin.AudioAttributesCompatParcelizer(addmixin.getOnPlayFromMediaId() + 1);
        }
        if (p1.addOnMultiWindowModeChangedListener > 0) {
            MediaBrowserCompatItemReceiver(this.addOnMultiWindowModeChangedListener + 1);
        }
    }

    private final String AudioAttributesCompatParcelizer(_assertNotNull p0) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(p0);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(RatingCompat$default(this, 0, 1, null));
        sb.append(" Other tree: ");
        _assertNotNull _assertnotnull = p0.onPlayFromMediaId;
        sb.append(_assertnotnull != null ? RatingCompat$default(_assertnotnull, 0, 1, null) : null);
        return sb.toString();
    }

    public final void getOnBackPressedDispatcher() {
        if (this.read) {
            _assertNotNull _assertnotnull_init_lambda4 = _init_lambda4();
            if (_assertnotnull_init_lambda4 != null) {
                _assertnotnull_init_lambda4.getOnBackPressedDispatcher();
                return;
            }
            return;
        }
        this.onSetCaptioningEnabled = true;
    }

    public final void IconCompatParcelizer(int p0, int p1) {
        if (p1 < 0) {
            StringBuilder sb = new StringBuilder("count (");
            sb.append(p1);
            sb.append(") must be greater than 0");
            reportWrongTokenException.AudioAttributesCompatParcelizer(sb.toString());
        }
        int i = (p1 + p0) - 1;
        if (p0 > i) {
            return;
        }
        while (true) {
            read(this.MediaDescriptionCompat.write().IconCompatParcelizer[i]);
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(i);
            if (i == p0) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void getLastCustomNonConfigurationInstance() {
        for (int iWrite = this.MediaDescriptionCompat.write().getAudioAttributesCompatParcelizer() - 1; iWrite >= 0; iWrite--) {
            read(this.MediaDescriptionCompat.write().IconCompatParcelizer[iWrite]);
        }
        this.MediaDescriptionCompat.IconCompatParcelizer();
    }

    private final void read(_assertNotNull p0) {
        if (p0.accessaddObserverForBackInvoker.getOnPlayFromMediaId() > 0) {
            this.accessaddObserverForBackInvoker.AudioAttributesCompatParcelizer(r0.getOnPlayFromMediaId() - 1);
        }
        if (this.onMediaButtonEvent != null) {
            p0.onAddQueueItem();
        }
        p0.onPlayFromMediaId = null;
        if (p0.addOnMultiWindowModeChangedListener > 0) {
            MediaBrowserCompatItemReceiver(this.addOnMultiWindowModeChangedListener - 1);
        }
        p0.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().AudioAttributesImplApi26Parcelizer((_bindAndClose) null);
        if (p0.read) {
            this.RatingCompat--;
            UTF32Reader<_assertNotNull> uTF32ReaderWrite = p0.MediaDescriptionCompat.write();
            _assertNotNull[] _assertnotnullArr = uTF32ReaderWrite.IconCompatParcelizer;
            int iWrite = uTF32ReaderWrite.getAudioAttributesCompatParcelizer();
            for (int i = 0; i < iWrite; i++) {
                _assertnotnullArr[i].r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().AudioAttributesImplApi26Parcelizer((_bindAndClose) null);
            }
        }
        onMenuItemSelected();
        getOnBackPressedDispatcher();
    }

    public final void AudioAttributesCompatParcelizer(int p0, int p1, int p2) {
        if (p0 == p1) {
            return;
        }
        for (int i = 0; i < p2; i++) {
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(p0 > p1 ? p1 + i : (p1 + p2) - 2, this.MediaDescriptionCompat.RemoteActionCompatParcelizer(p0 > p1 ? p0 + i : p0));
        }
        getOnBackPressedDispatcher();
        onMenuItemSelected();
        getOnBackPressedDispatcherannotations();
    }

    @Override // kotlin.namingStrategyInstance
    public final boolean addOnPictureInPictureModeChangedListener() {
        return r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        this.onRemoveQueueItemAt = z;
    }

    public final void getSavedStateRegistry() {
        if (this.onRewind) {
            return;
        }
        _serializerProvider.AudioAttributesCompatParcelizer(this).AudioAttributesImplApi26Parcelizer(this);
    }

    public final void menuHostHelperlambda0() {
        if (this.onRewind) {
            return;
        }
        if (!_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer) {
            this.onSeekTo = null;
            _serializerProvider.AudioAttributesCompatParcelizer(this).onPrepareFromUri();
        } else {
            if (this._init_lambda2.AudioAttributesImplBaseParcelizer() || onPlayFromMediaId()) {
                this.onRemoveQueueItemAt = true;
                return;
            }
            C0216valueInstantiators c0216valueInstantiators = this.onSeekTo;
            this.onSeekTo = onBackPressed();
            this.onRemoveQueueItemAt = false;
            _configureGenerator _configuregeneratorAudioAttributesCompatParcelizer = _serializerProvider.AudioAttributesCompatParcelizer(this);
            _configuregeneratorAudioAttributesCompatParcelizer.getAddContentView().AudioAttributesCompatParcelizer(this, c0216valueInstantiators);
            _configuregeneratorAudioAttributesCompatParcelizer.onPrepareFromUri();
        }
    }

    @Override // kotlin.namingStrategyInstance
    public final C0216valueInstantiators accessgetReportFullyDrawnExecutorp() {
        if (!AudioAttributesImplApi26Parcelizer() || getAddOnUserLeaveHintListener() || !this._init_lambda2.write(_bind.write(8))) {
            return null;
        }
        if (!_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer && this.onSeekTo == null) {
            this.onSeekTo = onBackPressed();
        }
        return this.onSeekTo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, o.valueInstantiators] */
    private final C0216valueInstantiators onBackPressed() {
        this.onRewind = true;
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        writeVar.write = new C0216valueInstantiators();
        PropertyMetadata addOnNewIntentListener = _serializerProvider.AudioAttributesCompatParcelizer(this).getAddOnNewIntentListener();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(writeVar);
        getAnswerMap getanswermap = addOnNewIntentListener.RemoteActionCompatParcelizer;
        addOnNewIntentListener.IconCompatParcelizer.IconCompatParcelizer(this, (getAnswerMap<? super _assertNotNull, getShowPopup>) getanswermap, anonymousClass1);
        this.onRewind = false;
        return (C0216valueInstantiators) writeVar.write;
    }

    /* JADX INFO: renamed from: o._assertNotNull$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "write", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.write<C0216valueInstantiators> $read;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            write();
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r5v7, types: [T, o.valueInstantiators] */
        public final void write() {
            ObjectReader objectReader = _assertNotNull.this.get_init_lambda2();
            int iWrite = _bind.write(8);
            MagicModuleUseCaseImplWhenMappings.write<C0216valueInstantiators> writeVar = this.$read;
            if ((objectReader.MediaBrowserCompatSearchResultReceiver() & iWrite) != 0) {
                for (_handleOddName.IconCompatParcelizer audioAttributesCompatParcelizer = objectReader.getAudioAttributesCompatParcelizer(); audioAttributesCompatParcelizer != null; audioAttributesCompatParcelizer = audioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver()) {
                    if ((audioAttributesCompatParcelizer.getWrite() & iWrite) != 0) {
                        _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesCompatParcelizer;
                        UTF32Reader uTF32Reader = null;
                        while (iconCompatParcelizerWrite != 0) {
                            if (iconCompatParcelizerWrite instanceof hasIndex) {
                                hasIndex hasindex = (hasIndex) iconCompatParcelizerWrite;
                                if (hasindex.getAudioAttributesCompatParcelizer()) {
                                    writeVar.write = new C0216valueInstantiators();
                                    writeVar.write.AudioAttributesCompatParcelizer(true);
                                }
                                if (hasindex.getRead()) {
                                    writeVar.write.read(true);
                                }
                                hasindex.write(writeVar.write);
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
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MagicModuleUseCaseImplWhenMappings.write<C0216valueInstantiators> writeVar) {
            super(0);
            this.$read = writeVar;
        }
    }

    public final void write(_configureGenerator p0) {
        _assertNotNull _assertnotnull;
        if (this.onMediaButtonEvent != null) {
            StringBuilder sb = new StringBuilder("Cannot attach ");
            sb.append(this);
            sb.append(" as it already is attached.  Tree: ");
            sb.append(RatingCompat$default(this, 0, 1, null));
            reportWrongTokenException.read(sb.toString());
        }
        _assertNotNull _assertnotnull2 = this.onPlayFromMediaId;
        if (_assertnotnull2 != null) {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_assertnotnull2 != null ? _assertnotnull2.onMediaButtonEvent : null, p0)) {
                StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
                sb2.append(p0);
                sb2.append(") than the parent's owner(");
                _assertNotNull _assertnotnull_init_lambda4 = _init_lambda4();
                sb2.append(_assertnotnull_init_lambda4 != null ? _assertnotnull_init_lambda4.onMediaButtonEvent : null);
                sb2.append("). This tree: ");
                sb2.append(RatingCompat$default(this, 0, 1, null));
                sb2.append(" Parent tree: ");
                _assertNotNull _assertnotnull3 = this.onPlayFromMediaId;
                sb2.append(_assertnotnull3 != null ? RatingCompat$default(_assertnotnull3, 0, 1, null) : null);
                reportWrongTokenException.read(sb2.toString());
            }
        }
        _assertNotNull _assertnotnull_init_lambda42 = _init_lambda4();
        if (_assertnotnull_init_lambda42 == null) {
            ParcelableVolumeInfo().read(true);
            getAttributes.RemoteActionCompatParcelizer$default(p0.getAddObserverForBackInvokerlambda7(), this, false, 2, null);
            setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
            if (setpropertynamingstrategyMediaSessionCompatToken != null) {
                setpropertynamingstrategyMediaSessionCompatToken.onPrepare();
            }
        }
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().AudioAttributesImplApi26Parcelizer(_assertnotnull_init_lambda42 != null ? _assertnotnull_init_lambda42.onPrepareFromUri() : null);
        this.onMediaButtonEvent = p0;
        this.onPlayFromUri = (_assertnotnull_init_lambda42 != null ? _assertnotnull_init_lambda42.onPlayFromUri : -1) + 1;
        _handleOddName _handleoddname = this.createFullyDrawnExecutor;
        if (_handleoddname != null) {
            AudioAttributesCompatParcelizer(_handleoddname);
        }
        this.createFullyDrawnExecutor = null;
        if (!_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer && this._init_lambda2.write(_bind.write(8))) {
            menuHostHelperlambda0();
        }
        p0.RemoteActionCompatParcelizer(this);
        if (this.MediaBrowserCompatItemReceiver) {
            IconCompatParcelizer(this);
        } else {
            _assertNotNull _assertnotnull4 = this.onPlayFromMediaId;
            if (_assertnotnull4 == null || (_assertnotnull = _assertnotnull4.MediaBrowserCompatSearchResultReceiver) == null) {
                _assertnotnull = this.MediaBrowserCompatSearchResultReceiver;
            }
            IconCompatParcelizer(_assertnotnull);
            if (this.MediaBrowserCompatSearchResultReceiver == null && this._init_lambda2.write(_bind.write(512))) {
                IconCompatParcelizer(this);
            }
        }
        if (!getAddOnUserLeaveHintListener()) {
            this._init_lambda2.AudioAttributesImplApi21Parcelizer();
        }
        UTF32Reader<_assertNotNull> uTF32ReaderWrite = this.MediaDescriptionCompat.write();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderWrite.IconCompatParcelizer;
        int iWrite = uTF32ReaderWrite.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertnotnullArr[i].write(p0);
        }
        if (!getAddOnUserLeaveHintListener()) {
            this._init_lambda2.RatingCompat();
        }
        getOnBackPressedDispatcherannotations();
        if (_assertnotnull_init_lambda42 != null) {
            _assertnotnull_init_lambda42.getOnBackPressedDispatcherannotations();
        }
        getAnswerMap<? super _configureGenerator, getShowPopup> getanswermap = this.addContentView;
        if (getanswermap != null) {
            getanswermap.invoke(p0);
        }
        this.accessaddObserverForBackInvoker.onSetCaptioningEnabled();
        if (_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer && !getAddOnUserLeaveHintListener() && this._init_lambda2.write(_bind.write(8))) {
            menuHostHelperlambda0();
        }
        p0.read(this);
    }

    public final void onAddQueueItem() {
        _configureGenerator _configuregenerator = this.onMediaButtonEvent;
        if (_configuregenerator == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            _assertNotNull _assertnotnull_init_lambda4 = _init_lambda4();
            sb.append(_assertnotnull_init_lambda4 != null ? RatingCompat$default(_assertnotnull_init_lambda4, 0, 1, null) : null);
            reportWrongTokenException.write(sb.toString());
            throw new PlanDetailsCreator();
        }
        _assertNotNull _assertnotnull_init_lambda42 = _init_lambda4();
        if (_assertnotnull_init_lambda42 != null) {
            _assertnotnull_init_lambda42.ensureViewModelStore();
            _assertnotnull_init_lambda42.getOnBackPressedDispatcherannotations();
            ParcelableVolumeInfo().RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
            setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
            if (setpropertynamingstrategyMediaSessionCompatToken != null) {
                setpropertynamingstrategyMediaSessionCompatToken.write(MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
            }
        }
        this.accessaddObserverForBackInvoker.onSetRating();
        _bindAndClose read = onPrepareFromUri().getRead();
        for (_bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(); !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, read) && _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != null; _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getRead()) {
            _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getAnswerMap<? super _configureGenerator, getShowPopup> getanswermap = this.getSavedStateRegistryControllerannotations;
        if (getanswermap != null) {
            getanswermap.invoke(_configuregenerator);
        }
        if (!_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer && this._init_lambda2.write(_bind.write(8))) {
            menuHostHelperlambda0();
        }
        this._init_lambda2.MediaBrowserCompatMediaItem();
        this.onPrepareFromUri = true;
        UTF32Reader<_assertNotNull> uTF32ReaderWrite = this.MediaDescriptionCompat.write();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderWrite.IconCompatParcelizer;
        int iWrite = uTF32ReaderWrite.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertnotnullArr[i].onAddQueueItem();
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        this.onPrepareFromUri = false;
        this._init_lambda2.MediaBrowserCompatCustomActionResultReceiver();
        _configuregenerator.IconCompatParcelizer(this);
        _configuregenerator.getAddObserverForBackInvokerlambda7().IconCompatParcelizer(this);
        this.onMediaButtonEvent = null;
        IconCompatParcelizer((_assertNotNull) null);
        this.onPlayFromUri = 0;
        ParcelableVolumeInfo().onRemoveQueueItemAt();
        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken2 = MediaSessionCompatToken();
        if (setpropertynamingstrategyMediaSessionCompatToken2 != null) {
            setpropertynamingstrategyMediaSessionCompatToken2.onPlayFromUri();
        }
        if (_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer && this._init_lambda2.write(_bind.write(8))) {
            C0216valueInstantiators c0216valueInstantiators = this.onSeekTo;
            this.onSeekTo = null;
            this.onRemoveQueueItemAt = false;
            _configuregenerator.getAddContentView().AudioAttributesCompatParcelizer(this, c0216valueInstantiators);
            _configuregenerator.onPrepareFromUri();
        }
    }

    public final UTF32Reader<_assertNotNull> accessonBackPresseds1027565324() {
        if (this.onSetCaptioningEnabled) {
            this.onSetPlaybackSpeed.RemoteActionCompatParcelizer();
            UTF32Reader<_assertNotNull> uTF32Reader = this.onSetPlaybackSpeed;
            uTF32Reader.read(uTF32Reader.getAudioAttributesCompatParcelizer(), addObserverForBackInvoker());
            this.onSetPlaybackSpeed.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer);
            this.onSetCaptioningEnabled = false;
        }
        return this.onSetPlaybackSpeed;
    }

    @Override // kotlin.createDummyDeserializationContext
    public final boolean onRemoveQueueItem() {
        return AudioAttributesImplApi26Parcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0164converter.write(this, null));
        sb.append(" children: ");
        sb.append(onPause().size());
        sb.append(" measurePolicy: ");
        sb.append(getOnSkipToPrevious());
        sb.append(" deactivated: ");
        sb.append(getAddOnUserLeaveHintListener());
        return sb.toString();
    }

    public final boolean onRewind() {
        long sessionImpl = onPrepareFromUri().setSessionImpl();
        return PropertyValueAny.AudioAttributesImplApi26Parcelizer(sessionImpl) && PropertyValueAny.IconCompatParcelizer(sessionImpl);
    }

    static /* synthetic */ String RatingCompat$default(_assertNotNull _assertnotnull, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return _assertnotnull.RatingCompat(i);
    }

    private final String RatingCompat(int p0) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p0; i++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i2 = 0; i2 < iWrite; i2++) {
            sb.append(_assertnotnullArr[i2].RatingCompat(p0 + 1));
        }
        String string = sb.toString();
        if (p0 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        return strSubstring;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0010\u001a\u00020\u000b*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/_assertNotNull$AudioAttributesCompatParcelizer;", "Lo/withTypeHandler;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Lo/getValueHandler;", "", "Lo/hasHandlers;", "", "p1", "", "AudioAttributesImplBaseParcelizer", "(Lo/getValueHandler;Ljava/util/List;I)Ljava/lang/Void;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AudioAttributesCompatParcelizer implements withTypeHandler {

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final String RemoteActionCompatParcelizer;

        public AudioAttributesCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.withTypeHandler
        public /* synthetic */ int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List list, int i) {
            return ((Number) AudioAttributesImplApi26Parcelizer(getvaluehandler, list, i)).intValue();
        }

        @Override // kotlin.withTypeHandler
        public /* synthetic */ int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List list, int i) {
            return ((Number) MediaBrowserCompatCustomActionResultReceiver(getvaluehandler, list, i)).intValue();
        }

        @Override // kotlin.withTypeHandler
        public /* synthetic */ int read(getValueHandler getvaluehandler, List list, int i) {
            return ((Number) IconCompatParcelizer(getvaluehandler, list, i)).intValue();
        }

        @Override // kotlin.withTypeHandler
        public /* synthetic */ int write(getValueHandler getvaluehandler, List list, int i) {
            return ((Number) AudioAttributesImplBaseParcelizer(getvaluehandler, list, i)).intValue();
        }

        public Void AudioAttributesImplBaseParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            throw new IllegalStateException(this.RemoteActionCompatParcelizer.toString());
        }

        public Void AudioAttributesImplApi26Parcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            throw new IllegalStateException(this.RemoteActionCompatParcelizer.toString());
        }

        public Void MediaBrowserCompatCustomActionResultReceiver(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            throw new IllegalStateException(this.RemoteActionCompatParcelizer.toString());
        }

        public Void IconCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            throw new IllegalStateException(this.RemoteActionCompatParcelizer.toString());
        }
    }

    /* JADX INFO: renamed from: r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, reason: from getter */
    public final withTypeHandler getOnSkipToPrevious() {
        return this.onSkipToPrevious;
    }

    @Override // kotlin.getDependencies
    public final void AudioAttributesCompatParcelizer(withTypeHandler withtypehandler) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSkipToPrevious, withtypehandler)) {
            return;
        }
        this.onSkipToPrevious = withtypehandler;
        ObjectMapper objectMapper = this.setSessionImpl;
        if (objectMapper != null) {
            objectMapper.write(getOnSkipToPrevious());
        }
        getOnBackPressedDispatcherannotations();
    }

    private final ObjectMapper invalidateMenu() {
        ObjectMapper objectMapper = this.setSessionImpl;
        if (objectMapper != null) {
            return objectMapper;
        }
        ObjectMapper objectMapper2 = new ObjectMapper(this, getOnSkipToPrevious());
        this.setSessionImpl = objectMapper2;
        return objectMapper2;
    }

    public final int AudioAttributesImplApi21Parcelizer(int p0) {
        return invalidateMenu().AudioAttributesImplApi21Parcelizer(p0);
    }

    public final int AudioAttributesImplApi26Parcelizer(int p0) {
        return invalidateMenu().AudioAttributesImplBaseParcelizer(p0);
    }

    public final int read(int p0) {
        return invalidateMenu().write(p0);
    }

    public final int write(int p0) {
        return invalidateMenu().AudioAttributesCompatParcelizer(p0);
    }

    public final int AudioAttributesImplBaseParcelizer(int p0) {
        return invalidateMenu().MediaBrowserCompatItemReceiver(p0);
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(int p0) {
        return invalidateMenu().IconCompatParcelizer(p0);
    }

    public final int IconCompatParcelizer(int p0) {
        return invalidateMenu().RemoteActionCompatParcelizer(p0);
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        return invalidateMenu().read(p0);
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final bufferMapProperty getOnSkipToQueueItem() {
        return this.onSkipToQueueItem;
    }

    @Override // kotlin.getDependencies
    public final void AudioAttributesCompatParcelizer(bufferMapProperty buffermapproperty) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSkipToQueueItem, buffermapproperty)) {
            return;
        }
        this.onSkipToQueueItem = buffermapproperty;
        onMultiWindowModeChanged();
        for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = this._init_lambda2.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
            audioAttributesImplApi21Parcelizer.e_();
        }
    }

    @Override // kotlin.isEnumImplType
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final tryToResolveUnresolved getOnStop() {
        return this.onStop;
    }

    @Override // kotlin.getDependencies
    public final void IconCompatParcelizer(tryToResolveUnresolved trytoresolveunresolved) {
        if (this.onStop != trytoresolveunresolved) {
            this.onStop = trytoresolveunresolved;
            onMultiWindowModeChanged();
            for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = this._init_lambda2.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
                audioAttributesImplApi21Parcelizer.d_();
            }
        }
    }

    /* JADX INFO: renamed from: addObserverForBackInvokerlambda7, reason: from getter */
    public final CoercionConfig getOnSkipToNext() {
        return this.onSkipToNext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // kotlin.getDependencies
    public final void read(CoercionConfig coercionConfig) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSkipToNext, coercionConfig)) {
            return;
        }
        this.onSkipToNext = coercionConfig;
        ObjectReader objectReader = this._init_lambda2;
        int iWrite = _bind.write(16);
        if ((objectReader.MediaBrowserCompatSearchResultReceiver() & iWrite) != 0) {
            for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = objectReader.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
                if ((audioAttributesImplApi21Parcelizer.getWrite() & iWrite) != 0) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplApi21Parcelizer;
                    UTF32Reader uTF32Reader = null;
                    while (iconCompatParcelizerWrite != 0) {
                        if (iconCompatParcelizerWrite instanceof forRootType) {
                            ((forRootType) iconCompatParcelizerWrite).g_();
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
                if ((audioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final _getCharDesc getParcelableVolumeInfo() {
        return this.ParcelableVolumeInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.getDependencies
    public final void RemoteActionCompatParcelizer(_getCharDesc _getchardesc) {
        this.ParcelableVolumeInfo = _getchardesc;
        AudioAttributesCompatParcelizer((bufferMapProperty) _getchardesc.write(getDefaultNullValueSerializer.IconCompatParcelizer()));
        IconCompatParcelizer((tryToResolveUnresolved) _getchardesc.write(getDefaultNullValueSerializer.RatingCompat()));
        read((CoercionConfig) _getchardesc.write(getDefaultNullValueSerializer.onAddQueueItem()));
        ObjectReader objectReader = this._init_lambda2;
        int iWrite = _bind.write(32768);
        if ((objectReader.MediaBrowserCompatSearchResultReceiver() & iWrite) != 0) {
            for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = objectReader.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
                if ((audioAttributesImplApi21Parcelizer.getWrite() & iWrite) != 0) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplApi21Parcelizer;
                    UTF32Reader uTF32Reader = null;
                    while (iconCompatParcelizerWrite != 0) {
                        if (iconCompatParcelizerWrite instanceof getLongMask) {
                            _handleOddName.IconCompatParcelizer iconCompatParcelizerOnFastForward = ((getLongMask) iconCompatParcelizerWrite).getRead();
                            if (iconCompatParcelizerOnFastForward.getRatingCompat()) {
                                _findTreeDeserializer.AudioAttributesCompatParcelizer(iconCompatParcelizerOnFastForward);
                            } else {
                                iconCompatParcelizerOnFastForward.AudioAttributesImplApi21Parcelizer(true);
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
                if ((audioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                    return;
                }
            }
        }
    }

    private final expectComma onActivityResult() {
        return (expectComma) getParcelableVolumeInfo().write(JsonWriteContext.read());
    }

    public final Void IconCompatParcelizer(Throwable p0) throws Throwable {
        expectComma expectcommaOnActivityResult = onActivityResult();
        if (expectcommaOnActivityResult == null) {
            throw p0;
        }
        expectcommaOnActivityResult.IconCompatParcelizer(p0, this);
        throw p0;
    }

    private final void onMultiWindowModeChanged() {
        getOnBackPressedDispatcherannotations();
        _assertNotNull _assertnotnull_init_lambda4 = _init_lambda4();
        if (_assertnotnull_init_lambda4 != null) {
            _assertnotnull_init_lambda4.ensureViewModelStore();
        }
        getSavedStateRegistryControllerannotations();
    }

    @Override // kotlin.isEnumImplType
    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.accessaddObserverForBackInvoker.onPlayFromUri();
    }

    @Override // kotlin.isEnumImplType
    public final int IconCompatParcelizer() {
        return this.accessaddObserverForBackInvoker.AudioAttributesImplBaseParcelizer();
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        KeyDeserializer keyDeserializerMediaBrowserCompatMediaItem;
        properties propertiesVarIconCompatParcelizer;
        addMixIn addmixin = this.accessaddObserverForBackInvoker;
        return addmixin.read().IconCompatParcelizer().AudioAttributesCompatParcelizer() || !((keyDeserializerMediaBrowserCompatMediaItem = addmixin.MediaBrowserCompatMediaItem()) == null || (propertiesVarIconCompatParcelizer = keyDeserializerMediaBrowserCompatMediaItem.IconCompatParcelizer()) == null || !propertiesVarIconCompatParcelizer.AudioAttributesCompatParcelizer());
    }

    public final _readMapAndClose MediaSessionCompatQueueItem() {
        return _serializerProvider.AudioAttributesCompatParcelizer(this).getAddOnMultiWindowModeChangedListener();
    }

    @Override // kotlin.isEnumImplType
    public final boolean MediaDescriptionCompat() {
        return ParcelableVolumeInfo().onPrepareFromMediaId();
    }

    public final boolean addOnMultiWindowModeChangedListener() {
        return ParcelableVolumeInfo().onPlayFromUri();
    }

    public final int accessaddObserverForBackInvoker() {
        return ParcelableVolumeInfo().AudioAttributesImplApi26Parcelizer();
    }

    public final MediaBrowserCompatCustomActionResultReceiver ResultReceiver() {
        return ParcelableVolumeInfo().onMediaButtonEvent();
    }

    public final MediaBrowserCompatCustomActionResultReceiver r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverOnCustomAction;
        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
        return (setpropertynamingstrategyMediaSessionCompatToken == null || (mediaBrowserCompatCustomActionResultReceiverOnCustomAction = setpropertynamingstrategyMediaSessionCompatToken.onCustomAction()) == null) ? MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer : mediaBrowserCompatCustomActionResultReceiverOnCustomAction;
    }

    public final void RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        this._init_lambda3 = mediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: onSetRating, reason: from getter */
    public final MediaBrowserCompatCustomActionResultReceiver get_init_lambda3() {
        return this._init_lambda3;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final boolean getR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public final void read(boolean z) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = z;
    }

    /* JADX INFO: renamed from: _init_lambda3, reason: from getter */
    public final ObjectReader get_init_lambda2() {
        return this._init_lambda2;
    }

    public final _bindAndClose onPrepareFromUri() {
        return this._init_lambda2.getRead();
    }

    /* JADX INFO: renamed from: onSkipToNext, reason: from getter */
    public final addMixIn getAccessaddObserverForBackInvoker() {
        return this.accessaddObserverForBackInvoker;
    }

    public final _bindAndClose r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        return this._init_lambda2.getIconCompatParcelizer();
    }

    private final float onConfigurationChanged() {
        return ParcelableVolumeInfo().onPause();
    }

    public final void AudioAttributesCompatParcelizer(isThrowable isthrowable) {
        this.accessensureViewModelStore = isthrowable;
    }

    /* JADX INFO: renamed from: createFullyDrawnExecutor, reason: from getter */
    public final isThrowable getAccessensureViewModelStore() {
        return this.accessensureViewModelStore;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.addObserverForBackInvokerlambda7 = z;
    }

    public final _bindAndClose onSetPlaybackSpeed() {
        if (this.addObserverForBackInvokerlambda7) {
            _bindAndClose _bindandcloseOnPrepareFromUri = onPrepareFromUri();
            _bindAndClose audioAttributesImplApi26Parcelizer = r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().getAudioAttributesImplApi26Parcelizer();
            this.ensureViewModelStore = null;
            while (true) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_bindandcloseOnPrepareFromUri, audioAttributesImplApi26Parcelizer)) {
                    break;
                }
                if ((_bindandcloseOnPrepareFromUri != null ? _bindandcloseOnPrepareFromUri.getMediaSessionCompatResultReceiverWrapper() : null) != null) {
                    this.ensureViewModelStore = _bindandcloseOnPrepareFromUri;
                    break;
                }
                _bindandcloseOnPrepareFromUri = _bindandcloseOnPrepareFromUri != null ? _bindandcloseOnPrepareFromUri.getAudioAttributesImplApi26Parcelizer() : null;
            }
        }
        _bindAndClose _bindandclose = this.ensureViewModelStore;
        if (_bindandclose == null || _bindandclose.getMediaSessionCompatResultReceiverWrapper() != null) {
            return _bindandclose;
        }
        reportWrongTokenException.write("layer was not set");
        throw new PlanDetailsCreator();
    }

    public final void ensureViewModelStore() {
        _bindAndClose _bindandcloseOnSetPlaybackSpeed = onSetPlaybackSpeed();
        if (_bindandcloseOnSetPlaybackSpeed != null) {
            _bindandcloseOnSetPlaybackSpeed.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
            return;
        }
        _assertNotNull _assertnotnull_init_lambda4 = _init_lambda4();
        if (_assertnotnull_init_lambda4 != null) {
            _assertnotnull_init_lambda4.ensureViewModelStore();
        }
    }

    public final boolean onPlayFromMediaId() {
        return this.createFullyDrawnExecutor != null;
    }

    /* JADX INFO: renamed from: PlaybackStateCompatCustomAction, reason: from getter */
    public final _handleOddName getAddObserverForBackInvoker() {
        return this.addObserverForBackInvoker;
    }

    @Override // kotlin.getDependencies
    public final void read(_handleOddName _handleoddname) {
        if (this.read && getAddObserverForBackInvoker() != _handleOddName.INSTANCE) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getAddOnUserLeaveHintListener()) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("modifier is updated when deactivated");
        }
        if (AudioAttributesImplApi26Parcelizer()) {
            AudioAttributesCompatParcelizer(_handleoddname);
            if (this.onRemoveQueueItemAt) {
                menuHostHelperlambda0();
                return;
            }
            return;
        }
        this.createFullyDrawnExecutor = _handleoddname;
    }

    private final void AudioAttributesCompatParcelizer(_handleOddName p0) {
        boolean zWrite = this._init_lambda2.write(_bind.write(16));
        boolean zWrite2 = this._init_lambda2.write(_bind.write(1024));
        this.addObserverForBackInvoker = p0;
        this._init_lambda2.write(p0);
        boolean zWrite3 = this._init_lambda2.write(_bind.write(16));
        boolean zWrite4 = this._init_lambda2.write(_bind.write(1024));
        this.accessaddObserverForBackInvoker.onSetCaptioningEnabled();
        if (this.MediaBrowserCompatSearchResultReceiver == null && this._init_lambda2.write(_bind.write(512))) {
            IconCompatParcelizer(this);
        }
        if (zWrite == zWrite3 && zWrite2 == zWrite4) {
            return;
        }
        _serializerProvider.AudioAttributesCompatParcelizer(this).getAddObserverForBackInvokerlambda7().write(this, zWrite4, zWrite3);
    }

    private final void onCreatePanelMenu() {
        this._init_lambda2.AudioAttributesImplApi26Parcelizer();
    }

    public final void addMenuProvider() {
        this.accessaddObserverForBackInvoker.onPrepare();
    }

    @Override // kotlin.isEnumImplType
    public final isAbstract RemoteActionCompatParcelizer() {
        return onPrepareFromUri();
    }

    public final void RemoteActionCompatParcelizer(getAnswerMap<? super _configureGenerator, getShowPopup> getanswermap) {
        this.addContentView = getanswermap;
    }

    public final void AudioAttributesCompatParcelizer(getAnswerMap<? super _configureGenerator, getShowPopup> getanswermap) {
        this.getSavedStateRegistryControllerannotations = getanswermap;
    }

    public final void AudioAttributesImplBaseParcelizer(boolean z) {
        this.addOnPictureInPictureModeChangedListener = z;
    }

    /* JADX INFO: renamed from: r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0, reason: from getter */
    public final boolean getAddOnPictureInPictureModeChangedListener() {
        return this.addOnPictureInPictureModeChangedListener;
    }

    /* JADX INFO: renamed from: onSeekTo, reason: from getter */
    public final int getAddOnMultiWindowModeChangedListener() {
        return this.addOnMultiWindowModeChangedListener;
    }

    public final void MediaBrowserCompatItemReceiver(int i) {
        _assertNotNull _assertnotnull_init_lambda4;
        _assertNotNull _assertnotnull_init_lambda42;
        int i2 = this.addOnMultiWindowModeChangedListener;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (_assertnotnull_init_lambda42 = _init_lambda4()) != null) {
                _assertnotnull_init_lambda42.MediaBrowserCompatItemReceiver(_assertnotnull_init_lambda42.addOnMultiWindowModeChangedListener + 1);
            }
            if (i == 0 && this.addOnMultiWindowModeChangedListener > 0 && (_assertnotnull_init_lambda4 = _init_lambda4()) != null) {
                _assertnotnull_init_lambda4.MediaBrowserCompatItemReceiver(_assertnotnull_init_lambda4.addOnMultiWindowModeChangedListener - 1);
            }
            this.addOnMultiWindowModeChangedListener = i;
        }
    }

    public final void read(int p0, int p1) {
        _parser.IconCompatParcelizer iconCompatParcelizerOnPause;
        _bindAndClose _bindandcloseOnPrepareFromUri;
        if (this._init_lambda3 == MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            initializeViewTreeOwners();
        }
        _assertNotNull _assertnotnull_init_lambda4 = _init_lambda4();
        if (_assertnotnull_init_lambda4 == null || (_bindandcloseOnPrepareFromUri = _assertnotnull_init_lambda4.onPrepareFromUri()) == null || (iconCompatParcelizerOnPause = _bindandcloseOnPrepareFromUri.getMediaDescriptionCompat()) == null) {
            iconCompatParcelizerOnPause = _serializerProvider.AudioAttributesCompatParcelizer(this).onPause();
        }
        _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(iconCompatParcelizerOnPause, ParcelableVolumeInfo(), p0, p1, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
    }

    public final void getFullyDrawnReporter() {
        if (this._init_lambda3 == MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            initializeViewTreeOwners();
        }
        ParcelableVolumeInfo().onRewind();
    }

    public final void addOnConfigurationChangedListener() {
        if (this._init_lambda3 == MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            initializeViewTreeOwners();
        }
        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
        toMagicModuleMetaRepoModel.write(setpropertynamingstrategyMediaSessionCompatToken);
        setpropertynamingstrategyMediaSessionCompatToken.onPlayFromSearch();
    }

    public final void RemoteActionCompatParcelizer(JsonParserDelegate p0, hasAnyGetter p1) throws Throwable {
        try {
            r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().AudioAttributesCompatParcelizer(p0, p1);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        } catch (Throwable th) {
            this.IconCompatParcelizer(th);
            throw new PlanDetailsCreator();
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(_assertNotNull _assertnotnull, long j, addValueInstantiators addvalueinstantiators, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = handleWeirdNumberValue.INSTANCE.write();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        _assertnotnull.RemoteActionCompatParcelizer(j, addvalueinstantiators, i3, z);
    }

    public final void RemoteActionCompatParcelizer(long p0, addValueInstantiators p1, int p2, boolean p3) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().AudioAttributesCompatParcelizer(_bindAndClose.INSTANCE.AudioAttributesCompatParcelizer(), _bindAndClose.IconCompatParcelizer$default(r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), p0, false, 2, null), p1, p2, p3);
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer$default(_assertNotNull _assertnotnull, long j, addValueInstantiators addvalueinstantiators, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        _assertnotnull.AudioAttributesCompatParcelizer(j, addvalueinstantiators, i3, z);
    }

    public final void AudioAttributesCompatParcelizer(long p0, addValueInstantiators p1, int p2, boolean p3) {
        r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8().AudioAttributesCompatParcelizer(_bindAndClose.INSTANCE.write(), _bindAndClose.IconCompatParcelizer$default(r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(), p0, false, 2, null), p1, handleWeirdNumberValue.INSTANCE.AudioAttributesCompatParcelizer(), p3);
    }

    public final void write(_assertNotNull p0) {
        if (WhenMappings.RemoteActionCompatParcelizer[p0.onSkipToQueueItem().ordinal()] == 1) {
            if (p0.PlaybackStateCompat()) {
                IconCompatParcelizer$default(p0, true, false, false, 6, null);
                return;
            }
            if (p0.onSkipToPrevious()) {
                p0.write(true);
            }
            if (p0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                AudioAttributesCompatParcelizer$default(p0, true, false, false, 6, null);
                return;
            } else {
                if (p0.onStop()) {
                    p0.AudioAttributesCompatParcelizer(true);
                    return;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected state ");
        sb.append(p0.onSkipToQueueItem());
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer$default(_assertNotNull _assertnotnull, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        _assertnotnull.AudioAttributesCompatParcelizer(z, z2, z3);
    }

    public final void AudioAttributesCompatParcelizer(boolean p0, boolean p1, boolean p2) {
        _configureGenerator _configuregenerator;
        if (this.onPrepareFromUri || this.read || (_configuregenerator = this.onMediaButtonEvent) == null) {
            return;
        }
        _configureGenerator.RemoteActionCompatParcelizer$default(_configuregenerator, this, false, p0, p1, 2, null);
        if (p2) {
            ParcelableVolumeInfo().write(p0);
        }
    }

    public static /* synthetic */ void IconCompatParcelizer$default(_assertNotNull _assertnotnull, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        _assertnotnull.IconCompatParcelizer(z, z2, z3);
    }

    public final void IconCompatParcelizer(boolean p0, boolean p1, boolean p2) {
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            reportWrongTokenException.read("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        _configureGenerator _configuregenerator = this.onMediaButtonEvent;
        if (_configuregenerator == null || this.onPrepareFromUri || this.read) {
            return;
        }
        _configuregenerator.RemoteActionCompatParcelizer(this, true, p0, p1);
        if (p2) {
            setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
            toMagicModuleMetaRepoModel.write(setpropertynamingstrategyMediaSessionCompatToken);
            setpropertynamingstrategyMediaSessionCompatToken.read(p0);
        }
    }

    public final void getOnBackPressedDispatcherannotations() {
        if (this.read) {
            _assertNotNull _assertnotnull_init_lambda4 = _init_lambda4();
            if (_assertnotnull_init_lambda4 != null) {
                _assertnotnull_init_lambda4.getOnBackPressedDispatcherannotations();
                return;
            }
            return;
        }
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            IconCompatParcelizer$default(this, false, false, false, 7, null);
        } else {
            AudioAttributesCompatParcelizer$default(this, false, false, false, 7, null);
        }
    }

    public final void addContentView() {
        if (this.addOnMultiWindowModeChangedListener == 0 || onStop() || r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() || this.addOnPictureInPictureModeChangedListener) {
            return;
        }
        _serializerProvider.AudioAttributesCompatParcelizer(this).AudioAttributesImplApi21Parcelizer(this);
    }

    public final void getDefaultViewModelProviderFactory() {
        getAttributes addObserverForBackInvokerlambda7;
        this.AudioAttributesImplBaseParcelizer = true;
        _configureGenerator _configuregenerator = this.onMediaButtonEvent;
        if (_configuregenerator == null || (addObserverForBackInvokerlambda7 = _configuregenerator.getAddObserverForBackInvokerlambda7()) == null) {
            return;
        }
        addObserverForBackInvokerlambda7.RemoteActionCompatParcelizer(this);
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer$default(_assertNotNull _assertnotnull, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        _assertnotnull.AudioAttributesCompatParcelizer(z);
    }

    public final void AudioAttributesCompatParcelizer(boolean p0) {
        _configureGenerator _configuregenerator;
        if (this.read || (_configuregenerator = this.onMediaButtonEvent) == null) {
            return;
        }
        _configureGenerator.write$default(_configuregenerator, this, false, p0, 2, null);
    }

    public static /* synthetic */ void write$default(_assertNotNull _assertnotnull, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        _assertnotnull.write(z);
    }

    public final void write(boolean p0) {
        _configureGenerator _configuregenerator;
        if (this.read || (_configuregenerator = this.onMediaButtonEvent) == null) {
            return;
        }
        _configuregenerator.write(this, true, p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (onSkipToQueueItem() != RemoteActionCompatParcelizer.IconCompatParcelizer || onStop() || r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() || getAddOnUserLeaveHintListener() || !MediaDescriptionCompat()) {
            return;
        }
        ObjectReader objectReader = this._init_lambda2;
        int iWrite = _bind.write(256);
        if ((objectReader.MediaBrowserCompatSearchResultReceiver() & iWrite) != 0) {
            for (_handleOddName.IconCompatParcelizer audioAttributesImplApi21Parcelizer = objectReader.getAudioAttributesImplApi21Parcelizer(); audioAttributesImplApi21Parcelizer != null; audioAttributesImplApi21Parcelizer = audioAttributesImplApi21Parcelizer.getAudioAttributesImplBaseParcelizer()) {
                if ((audioAttributesImplApi21Parcelizer.getWrite() & iWrite) != 0) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = audioAttributesImplApi21Parcelizer;
                    UTF32Reader uTF32Reader = null;
                    while (iconCompatParcelizerWrite != 0) {
                        if (iconCompatParcelizerWrite instanceof insertAnnotationIntrospector) {
                            insertAnnotationIntrospector insertannotationintrospector = (insertAnnotationIntrospector) iconCompatParcelizerWrite;
                            insertannotationintrospector.AudioAttributesCompatParcelizer(collectLongDefaults.write((Module) insertannotationintrospector, _bind.write(256)));
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
                if ((audioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer() & iWrite) == 0) {
                    return;
                }
            }
        }
    }

    @Override // kotlin.isEnumImplType
    public final List<getAbsentValue> AudioAttributesImplApi21Parcelizer() {
        return this._init_lambda2.AudioAttributesCompatParcelizer();
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer$default(_assertNotNull _assertnotnull, PropertyValueAny propertyValueAny, int i, Object obj) {
        if ((i & 1) != 0) {
            propertyValueAny = _assertnotnull.accessaddObserverForBackInvoker.MediaBrowserCompatSearchResultReceiver();
        }
        return _assertnotnull.RemoteActionCompatParcelizer(propertyValueAny);
    }

    public final boolean RemoteActionCompatParcelizer(PropertyValueAny p0) {
        if (p0 == null || this.MediaBrowserCompatSearchResultReceiver == null) {
            return false;
        }
        setPropertyNamingStrategy setpropertynamingstrategyMediaSessionCompatToken = MediaSessionCompatToken();
        toMagicModuleMetaRepoModel.write(setpropertynamingstrategyMediaSessionCompatToken);
        return setpropertynamingstrategyMediaSessionCompatToken.IconCompatParcelizer(p0.getRead());
    }

    public static /* synthetic */ boolean read$default(_assertNotNull _assertnotnull, PropertyValueAny propertyValueAny, int i, Object obj) {
        if ((i & 1) != 0) {
            propertyValueAny = _assertnotnull.accessaddObserverForBackInvoker.AudioAttributesImplApi26Parcelizer();
        }
        return _assertnotnull.read(propertyValueAny);
    }

    public final boolean read(PropertyValueAny p0) {
        if (p0 == null) {
            return false;
        }
        if (this._init_lambda3 == MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
            onCommand();
        }
        return ParcelableVolumeInfo().RemoteActionCompatParcelizer(p0.getRead());
    }

    public final boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        return this.accessaddObserverForBackInvoker.onPlayFromMediaId();
    }

    public final boolean onStop() {
        return this.accessaddObserverForBackInvoker.RatingCompat();
    }

    public final boolean PlaybackStateCompat() {
        return this.accessaddObserverForBackInvoker.getRatingCompat();
    }

    public final boolean onSkipToPrevious() {
        return this.accessaddObserverForBackInvoker.getMediaMetadataCompat();
    }

    public final void getDefaultViewModelCreationExtras() {
        this.accessaddObserverForBackInvoker.onPrepareFromMediaId();
    }

    public final void addOnUserLeaveHintListener() {
        this.accessaddObserverForBackInvoker.onPrepareFromUri();
    }

    public final void addOnTrimMemoryListener() {
        this.accessaddObserverForBackInvoker.onSeekTo();
    }

    public final void getActivityResultRegistry() {
        this.accessaddObserverForBackInvoker.onRemoveQueueItemAt();
    }

    @Override // kotlin.getPathReference
    public final void MediaBrowserCompatSearchResultReceiver() {
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            IconCompatParcelizer$default(this, false, false, false, 5, null);
        } else {
            AudioAttributesCompatParcelizer$default(this, false, false, false, 5, null);
        }
        PropertyValueAny propertyValueAnyAudioAttributesImplApi26Parcelizer = this.accessaddObserverForBackInvoker.AudioAttributesImplApi26Parcelizer();
        if (propertyValueAnyAudioAttributesImplApi26Parcelizer != null) {
            _configureGenerator _configuregenerator = this.onMediaButtonEvent;
            if (_configuregenerator != null) {
                _configuregenerator.AudioAttributesCompatParcelizer(this, propertyValueAnyAudioAttributesImplApi26Parcelizer.getRead());
                return;
            }
            return;
        }
        _configureGenerator _configuregenerator2 = this.onMediaButtonEvent;
        if (_configuregenerator2 != null) {
            _configureGenerator.RemoteActionCompatParcelizer$default(_configuregenerator2, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // o._configureGenerator.IconCompatParcelizer
    public final void s_() {
        _bindAndClose _bindandcloseOnPrepareFromUri = onPrepareFromUri();
        int iWrite = _bind.write(4194304);
        boolean zAudioAttributesCompatParcelizer = _findTreeDeserializer.AudioAttributesCompatParcelizer(iWrite);
        _handleOddName.IconCompatParcelizer iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = _bindandcloseOnPrepareFromUri.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (zAudioAttributesCompatParcelizer || (iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iconCompatParcelizerMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getMediaBrowserCompatItemReceiver()) != null) {
            for (_handleOddName.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatItemReceiver = _bindandcloseOnPrepareFromUri.MediaBrowserCompatItemReceiver(zAudioAttributesCompatParcelizer); iconCompatParcelizerMediaBrowserCompatItemReceiver != null && (iconCompatParcelizerMediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer() & iWrite) != 0; iconCompatParcelizerMediaBrowserCompatItemReceiver = iconCompatParcelizerMediaBrowserCompatItemReceiver.getAudioAttributesImplBaseParcelizer()) {
                if ((iconCompatParcelizerMediaBrowserCompatItemReceiver.getWrite() & iWrite) != 0) {
                    _handleOddName.IconCompatParcelizer iconCompatParcelizerWrite = iconCompatParcelizerMediaBrowserCompatItemReceiver;
                    UTF32Reader uTF32Reader = null;
                    while (iconCompatParcelizerWrite != 0) {
                        if (iconCompatParcelizerWrite instanceof _writeCloseable) {
                            ((_writeCloseable) iconCompatParcelizerWrite).write(onPrepareFromUri());
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

    public final void onCommand() {
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = this._init_lambda3;
        this._init_lambda3 = MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull._init_lambda3 != MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
                _assertnotnull.onCommand();
            }
        }
    }

    private final void initializeViewTreeOwners() {
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = this._init_lambda3;
        this._init_lambda3 = MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            if (_assertnotnull._init_lambda3 == MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                _assertnotnull.initializeViewTreeOwners();
            }
        }
    }

    @Override // kotlin.namingStrategyInstance
    public final namingStrategyInstance _init_lambda5() {
        return _init_lambda4();
    }

    @Override // kotlin.namingStrategyInstance
    public final List<namingStrategyInstance> onPrepareFromSearch() {
        return onPause();
    }

    @Override // kotlin.isEnumImplType
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getAddOnUserLeaveHintListener() {
        return this.addOnUserLeaveHintListener;
    }

    @Override // kotlin._getByteArrayBuilder
    public final void read() {
        getAttributes addObserverForBackInvokerlambda7;
        getAttributes addObserverForBackInvokerlambda72;
        if (!AudioAttributesImplApi26Parcelizer()) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.onPause;
        if (androidViewHolder != null) {
            androidViewHolder.read();
        }
        isThrowable isthrowable = this.accessensureViewModelStore;
        if (isthrowable != null) {
            isthrowable.read();
        }
        this.onRewind = false;
        if (getAddOnUserLeaveHintListener()) {
            this.addOnUserLeaveHintListener = false;
            if (!_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer) {
                menuHostHelperlambda0();
            }
        } else {
            onCreatePanelMenu();
        }
        int iconCompatParcelizer = getIconCompatParcelizer();
        _configureGenerator _configuregenerator = this.onMediaButtonEvent;
        if (_configuregenerator != null && (addObserverForBackInvokerlambda72 = _configuregenerator.getAddObserverForBackInvokerlambda7()) != null) {
            addObserverForBackInvokerlambda72.IconCompatParcelizer(this);
        }
        MediaBrowserCompatSearchResultReceiver(withValueInstantiators.IconCompatParcelizer());
        _configureGenerator _configuregenerator2 = this.onMediaButtonEvent;
        if (_configuregenerator2 != null) {
            _configuregenerator2.IconCompatParcelizer(this, iconCompatParcelizer);
        }
        this._init_lambda2.AudioAttributesImplApi21Parcelizer();
        this._init_lambda2.RatingCompat();
        if (_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer && this._init_lambda2.write(_bind.write(8))) {
            menuHostHelperlambda0();
        }
        write(this);
        _configureGenerator _configuregenerator3 = this.onMediaButtonEvent;
        if (_configuregenerator3 != null) {
            _configuregenerator3.read(this, iconCompatParcelizer);
        }
        _configureGenerator _configuregenerator4 = this.onMediaButtonEvent;
        if (_configuregenerator4 == null || (addObserverForBackInvokerlambda7 = _configuregenerator4.getAddObserverForBackInvokerlambda7()) == null) {
            return;
        }
        addObserverForBackInvokerlambda7.RemoteActionCompatParcelizer(this, true);
    }

    @Override // kotlin._getByteArrayBuilder
    public final void AudioAttributesCompatParcelizer() {
        AndroidViewHolder androidViewHolder = this.onPause;
        if (androidViewHolder != null) {
            androidViewHolder.AudioAttributesCompatParcelizer();
        }
        isThrowable isthrowable = this.accessensureViewModelStore;
        if (isthrowable != null) {
            isthrowable.AudioAttributesCompatParcelizer();
        }
        this.addOnUserLeaveHintListener = true;
        onCreatePanelMenu();
        if (AudioAttributesImplApi26Parcelizer()) {
            if (!_verifyNoLeadingZeroes.AudioAttributesCompatParcelizer) {
                menuHostHelperlambda0();
            } else {
                this.onSeekTo = null;
                this.onRemoveQueueItemAt = false;
            }
        }
        _configureGenerator _configuregenerator = this.onMediaButtonEvent;
        if (_configuregenerator != null) {
            _configuregenerator.write(this);
        }
    }

    @Override // kotlin._getByteArrayBuilder
    public final void write() {
        AndroidViewHolder androidViewHolder = this.onPause;
        if (androidViewHolder != null) {
            androidViewHolder.write();
        }
        isThrowable isthrowable = this.accessensureViewModelStore;
        if (isthrowable != null) {
            isthrowable.write();
        }
        _bindAndClose read = onPrepareFromUri().getRead();
        for (_bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(); !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, read) && _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != null; _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.getRead()) {
            _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        }
    }

    /* JADX INFO: renamed from: o._assertNotNull$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0013j\b\u0012\u0004\u0012\u00020\u000b`\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$Companion;", "", "<init>", "()V", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "NotPlacedPlaceOrder", "", "getNotPlacedPlaceOrder$ui$annotations", "Constructor", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "getConstructor$ui", "()Lkotlin/jvm/functions/Function0;", "DummyViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getDummyViewConfiguration$ui", "()Landroidx/compose/ui/platform/ViewConfiguration;", "ZComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getZComparator$ui", "()Ljava/util/Comparator;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final getCreatedOnDateMs<_assertNotNull> AudioAttributesCompatParcelizer() {
            return _assertNotNull.write;
        }

        public final Comparator<_assertNotNull> read() {
            return _assertNotNull.AudioAttributesImplBaseParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/_assertNotNull$IconCompatParcelizer;", "Lo/_assertNotNull$AudioAttributesCompatParcelizer;", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "", "read", "(Lo/withContentValueHandler;Ljava/util/List;J)Ljava/lang/Void;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
        IconCompatParcelizer() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // kotlin.withTypeHandler
        public final /* synthetic */ withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List list, long j) {
            return (withHandlersFrom) read(withcontentvaluehandler, (List<? extends isTypeOrSuperTypeOf>) list, j);
        }

        public final Void read(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    /* JADX INFO: renamed from: o._assertNotNull$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/_assertNotNull;", "read", "()Lo/_assertNotNull;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<_assertNotNull> {
        public static final AnonymousClass3 AudioAttributesCompatParcelizer = new AnonymousClass3();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final _assertNotNull invoke() {
            return new _assertNotNull(false, 0 == true ? 1 : 0, 3, null);
        }

        AnonymousClass3() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004R\u0014\u0010\u0003\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\nR\u0014\u0010\u0006\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004"}, d2 = {"Lo/_assertNotNull$write;", "Lo/CoercionConfig;", "", "IconCompatParcelizer", "()J", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer", "write", "", "()F", "Lo/handleIdValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements CoercionConfig {
        @Override // kotlin.CoercionConfig
        public final long AudioAttributesCompatParcelizer() {
            return 40L;
        }

        @Override // kotlin.CoercionConfig
        public final long IconCompatParcelizer() {
            return 400L;
        }

        @Override // kotlin.CoercionConfig
        public final float RemoteActionCompatParcelizer() {
            return 16.0f;
        }

        @Override // kotlin.CoercionConfig
        public final long read() {
            return 300L;
        }

        write() {
        }

        @Override // kotlin.CoercionConfig
        public final long write() {
            return handleIdValue.INSTANCE.AudioAttributesCompatParcelizer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RemoteActionCompatParcelizer(_assertNotNull _assertnotnull, _assertNotNull _assertnotnull2) {
        if (_assertnotnull.onConfigurationChanged() == _assertnotnull2.onConfigurationChanged()) {
            return toMagicModuleMetaRepoModel.read(_assertnotnull.accessaddObserverForBackInvoker(), _assertnotnull2.accessaddObserverForBackInvoker());
        }
        return Float.compare(_assertnotnull.onConfigurationChanged(), _assertnotnull2.onConfigurationChanged());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/_assertNotNull$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "write", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private static final /* synthetic */ RemoteActionCompatParcelizer[] AudioAttributesImplBaseParcelizer;
        private static final /* synthetic */ getMagicModuleSavedMcqCount MediaBrowserCompatCustomActionResultReceiver;
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer("Measuring", 0);
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer("LookaheadMeasuring", 1);
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer("LayingOut", 2);
        public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer("LookaheadLayingOut", 3);
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer("Idle", 4);

        private RemoteActionCompatParcelizer(String str, int i) {
        }

        static {
            RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = read();
            AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizerArr;
            MediaBrowserCompatCustomActionResultReceiver = getMagicModuleTimeline.IconCompatParcelizer(remoteActionCompatParcelizerArr);
        }

        private static final /* synthetic */ RemoteActionCompatParcelizer[] read() {
            return new RemoteActionCompatParcelizer[]{write, AudioAttributesCompatParcelizer, read, RemoteActionCompatParcelizer, IconCompatParcelizer};
        }

        public static RemoteActionCompatParcelizer valueOf(String str) {
            return (RemoteActionCompatParcelizer) Enum.valueOf(RemoteActionCompatParcelizer.class, str);
        }

        public static RemoteActionCompatParcelizer[] values() {
            return (RemoteActionCompatParcelizer[]) AudioAttributesImplBaseParcelizer.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/_assertNotNull$MediaBrowserCompatCustomActionResultReceiver;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaBrowserCompatCustomActionResultReceiver {
        private static final /* synthetic */ getMagicModuleSavedMcqCount read;
        private static final /* synthetic */ MediaBrowserCompatCustomActionResultReceiver[] write;
        public static final MediaBrowserCompatCustomActionResultReceiver AudioAttributesCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver("InMeasureBlock", 0);
        public static final MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver("InLayoutBlock", 1);
        public static final MediaBrowserCompatCustomActionResultReceiver IconCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver("NotUsed", 2);

        private MediaBrowserCompatCustomActionResultReceiver(String str, int i) {
        }

        static {
            MediaBrowserCompatCustomActionResultReceiver[] mediaBrowserCompatCustomActionResultReceiverArrIconCompatParcelizer = IconCompatParcelizer();
            write = mediaBrowserCompatCustomActionResultReceiverArrIconCompatParcelizer;
            read = getMagicModuleTimeline.IconCompatParcelizer(mediaBrowserCompatCustomActionResultReceiverArrIconCompatParcelizer);
        }

        private static final /* synthetic */ MediaBrowserCompatCustomActionResultReceiver[] IconCompatParcelizer() {
            return new MediaBrowserCompatCustomActionResultReceiver[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, IconCompatParcelizer};
        }

        public static MediaBrowserCompatCustomActionResultReceiver valueOf(String str) {
            return (MediaBrowserCompatCustomActionResultReceiver) Enum.valueOf(MediaBrowserCompatCustomActionResultReceiver.class, str);
        }

        public static MediaBrowserCompatCustomActionResultReceiver[] values() {
            return (MediaBrowserCompatCustomActionResultReceiver[]) write.clone();
        }
    }

    public final void getSavedStateRegistryControllerannotations() {
        _bindAndClose _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        _bindAndClose _bindandcloseOnPrepareFromUri = onPrepareFromUri();
        while (_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != _bindandcloseOnPrepareFromUri) {
            toMagicModuleMetaRepoModel.read(_bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, "");
            _findRootDeserializer _findrootdeserializer = (_findRootDeserializer) _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
            _reportUnkownFormat mediaSessionCompatResultReceiverWrapper = _findrootdeserializer.getMediaSessionCompatResultReceiverWrapper();
            if (mediaSessionCompatResultReceiverWrapper != null) {
                mediaSessionCompatResultReceiverWrapper.invalidate();
            }
            _bindandcloseR8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = _findrootdeserializer.getRead();
        }
        _reportUnkownFormat mediaSessionCompatResultReceiverWrapper2 = onPrepareFromUri().getMediaSessionCompatResultReceiverWrapper();
        if (mediaSessionCompatResultReceiverWrapper2 != null) {
            mediaSessionCompatResultReceiverWrapper2.invalidate();
        }
    }

    public final void getLifecycle() {
        UTF32Reader<_assertNotNull> uTF32ReaderAddObserverForBackInvoker = addObserverForBackInvoker();
        _assertNotNull[] _assertnotnullArr = uTF32ReaderAddObserverForBackInvoker.IconCompatParcelizer;
        int iWrite = uTF32ReaderAddObserverForBackInvoker.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < iWrite; i++) {
            _assertNotNull _assertnotnull = _assertnotnullArr[i];
            MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = _assertnotnull.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
            _assertnotnull._init_lambda3 = mediaBrowserCompatCustomActionResultReceiver;
            if (mediaBrowserCompatCustomActionResultReceiver != MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer) {
                _assertnotnull.getLifecycle();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public _assertNotNull() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }
}
