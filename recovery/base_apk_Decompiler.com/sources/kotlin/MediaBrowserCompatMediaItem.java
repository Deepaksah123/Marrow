package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import in.juspay.hyper.constants.LogCategory;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.MediaBrowserCompatMediaItem;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.accessaddObserverForBackInvoker;
import kotlin.anyIgnorals;
import kotlin.setOnChartValueSelectedListener;
import kotlin.setRenderer;
import kotlin.withFieldVisibility;
import kotlin.withNext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 È\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u0011:\nÉ\u0001È\u0001Ê\u0001Ë\u0001Ì\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0007¢\u0006\u0004\b\u0014\u0010\u0016J#\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010 J'\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\u001e\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020.0'¢\u0006\u0004\b/\u0010*J\u001b\u00101\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002000'¢\u0006\u0004\b1\u0010*J\u001b\u00103\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002020'¢\u0006\u0004\b3\u0010*J\u001b\u00104\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120'¢\u0006\u0004\b4\u0010*J\u0015\u00106\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u000205¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u001aH\u0002¢\u0006\u0004\b;\u0010\u0016J\u000f\u0010<\u001a\u00020\u001aH\u0016¢\u0006\u0004\b<\u0010\u0016J\u000f\u0010=\u001a\u00020\u001aH\u0016¢\u0006\u0004\b=\u0010\u0016J)\u0010>\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u000100H\u0015¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u001aH\u0017¢\u0006\u0004\b@\u0010\u0016J\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020(H\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010CH\u0014¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020G2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020G2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020GH\u0017¢\u0006\u0004\bM\u0010NJ\u001f\u0010M\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020G2\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\bM\u0010OJ\u0017\u0010P\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u000200H\u0014¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020FH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020GH\u0017¢\u0006\u0004\bT\u0010NJ\u001f\u0010T\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020G2\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\bT\u0010OJ)\u0010U\u001a\u00020G2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020FH\u0016¢\u0006\u0004\bU\u0010VJ-\u0010Z\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020X0W2\u0006\u0010\"\u001a\u00020YH\u0017¢\u0006\u0004\bZ\u0010[J\u0011\u0010]\u001a\u0004\u0018\u00010\\H\u0017¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u0004\u0018\u00010\\¢\u0006\u0004\b_\u0010^J\u0017\u0010`\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020CH\u0014¢\u0006\u0004\b`\u0010EJ\u0017\u0010a\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\ba\u0010\u0015J\u000f\u0010b\u001a\u00020\u001aH\u0014¢\u0006\u0004\bb\u0010\u0016J\u0011\u0010d\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\bd\u0010eJA\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j\"\u0004\b\u0000\u0010f\"\u0004\b\u0001\u0010g2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010h2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010i¢\u0006\u0004\bk\u0010lJI\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000j\"\u0004\b\u0000\u0010f\"\u0004\b\u0001\u0010g2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010h2\u0006\u0010\u0019\u001a\u00020m2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010i¢\u0006\u0004\bk\u0010nJ\u0017\u0010o\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001dH\u0016¢\u0006\u0004\bo\u0010\u001fJ\u001b\u0010p\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\bp\u0010*J\u0015\u0010q\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020+¢\u0006\u0004\bq\u0010-J\u001b\u0010r\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020.0'¢\u0006\u0004\br\u0010*J\u001b\u0010s\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002000'¢\u0006\u0004\bs\u0010*J\u001b\u0010t\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002020'¢\u0006\u0004\bt\u0010*J\u001b\u0010u\u001a\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120'¢\u0006\u0004\bu\u0010*J\u0015\u0010v\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u000205¢\u0006\u0004\bv\u00107J\u000f\u0010w\u001a\u00020\u001aH\u0016¢\u0006\u0004\bw\u0010\u0016J\u0019\u0010x\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\bx\u0010yJ#\u0010x\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\bx\u0010\u001cJ\u0017\u0010x\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\bx\u0010\u0015J\u001f\u0010z\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u0012H\u0017¢\u0006\u0004\bz\u0010{J)\u0010z\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u0002002\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010CH\u0017¢\u0006\u0004\bz\u0010|JE\u0010\u0081\u0001\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020}2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u0001002\u0006\u0010~\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010\u0080\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001JP\u0010\u0081\u0001\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020}2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u0001002\u0006\u0010~\u001a\u00020\u00122\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010\u0080\u0001\u001a\u00020\u00122\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010CH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001c\u0010\u0088\u0001\u001a\u00020m8\u0007¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010fR\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0099\u0001\u001a\u00030\u0094\u00018WX\u0097\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u009a\u0001\u001a\u00020G8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020G8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001R!\u0010¡\u0001\u001a\u00030\u009d\u00018WX\u0097\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0096\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010£\u0001\u001a\u0004\u0018\u00010\\8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010^R\u0018\u0010§\u0001\u001a\u00030¤\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010©\u0001\u001a\u00030¨\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¬\u0001\u001a\u00030«\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R'\u0010²\u0001\u001a\u00020$8GX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\b®\u0001\u0010\u0096\u0001\u0012\u0005\b±\u0001\u0010\u0016\u001a\u0006\b¯\u0001\u0010°\u0001R$\u0010´\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R$\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0'0³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010µ\u0001R$\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002000'0³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b·\u0001\u0010µ\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002020'0³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010µ\u0001R$\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'0³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010µ\u0001R\u001e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u0002050³\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bº\u0001\u0010µ\u0001R\u0017\u0010»\u0001\u001a\u0002088\u0002X\u0083\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010À\u0001\u001a\u00030½\u00018G¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001f\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÂ\u0001\u0010Ã\u0001\u0012\u0005\bÄ\u0001\u0010\u0016R\u0018\u0010Ç\u0001\u001a\u00030\u0085\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001"}, d2 = {"Lo/MediaBrowserCompatMediaItem;", "Lo/_checkFloatSpecialValue;", "Lo/r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;", "Lo/hasGetter;", "Lo/TypeResolutionContext;", "Lo/anyExplicitsWithoutIgnoral;", "Lo/PieChart;", "Lo/onSetShuffleMode;", "Lo/_init_lambda3;", "Lo/r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;", "Lo/_isPosInf;", "Lo/_isTrue;", "Lo/_failDoubleToIntCoercion;", "Lo/_findCoercionFromBlankString;", "Lo/_findCoercionFromEmptyArray;", "Lo/_findCoercionFromEmptyString;", "Lo/UntypedObjectDeserializerNR;", "Lo/onRewind;", "", "p0", "<init>", "(I)V", "()V", "Landroid/view/View;", "Landroid/view/ViewGroup$LayoutParams;", "p1", "", "addContentView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "Lo/UntypedObjectDeserializerNRScope;", "addMenuProvider", "(Lo/UntypedObjectDeserializerNRScope;)V", "(Lo/UntypedObjectDeserializerNRScope;Lo/hasGetter;)V", "Lo/anyIgnorals$write;", "p2", "(Lo/UntypedObjectDeserializerNRScope;Lo/hasGetter;Lo/anyIgnorals$write;)V", "Lo/onSetRating;", "addObserverForBackInvoker", "(Lo/onSetRating;)V", "Lo/wrapAsJsonMappingException;", "Landroid/content/res/Configuration;", "addOnConfigurationChangedListener", "(Lo/wrapAsJsonMappingException;)V", "Lo/PlaybackStateCompatCustomAction;", "addOnContextAvailableListener", "(Lo/PlaybackStateCompatCustomAction;)V", "Lo/_checkTextualNull;", "addOnMultiWindowModeChangedListener", "Landroid/content/Intent;", "addOnNewIntentListener", "Lo/_isIntNumber;", "addOnPictureInPictureModeChangedListener", "addOnTrimMemoryListener", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "Lo/MediaBrowserCompatMediaItem$RemoteActionCompatParcelizer;", "createFullyDrawnExecutor", "()Lo/MediaBrowserCompatMediaItem$RemoteActionCompatParcelizer;", "ensureViewModelStore", "initializeViewTreeOwners", "invalidateMenu", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "onNewIntent", "(Landroid/content/Intent;)V", "onPanelClosed", "(ILandroid/view/Menu;)V", "onPictureInPictureModeChanged", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "", "", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "onRetainCustomNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainNonConfigurationInstance", "onSaveInstanceState", "onTrimMemory", "onUserLeaveHint", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "I", "O", "Lo/accessaddObserverForBackInvoker;", "Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "registerForActivityResult", "(Lo/accessaddObserverForBackInvoker;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;", "(Lo/accessaddObserverForBackInvoker;Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;Lo/r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;)Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "removeMenuProvider", "removeOnConfigurationChangedListener", "removeOnContextAvailableListener", "removeOnMultiWindowModeChangedListener", "removeOnNewIntentListener", "removeOnPictureInPictureModeChangedListener", "removeOnTrimMemoryListener", "removeOnUserLeaveHintListener", "reportFullyDrawn", "setContentView", "(Landroid/view/View;)V", "startActivityForResult", "(Landroid/content/Intent;I)V", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "p3", "p4", "p5", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "p6", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "Lo/hasMixIns;", "_viewModelStore", "Lo/hasMixIns;", "activityResultRegistry", "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;", "getActivityResultRegistry", "()Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;", "contentLayoutId", "Lo/ResultReceiver;", "contextAwareHelper", "Lo/ResultReceiver;", "Lo/withFieldVisibility;", "getDefaultViewModelCreationExtras", "()Lo/withFieldVisibility;", "defaultViewModelCreationExtras", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "defaultViewModelProviderFactory$delegate", "Lo/RenewEligible;", "getDefaultViewModelProviderFactory", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "defaultViewModelProviderFactory", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Lo/onSeekTo;", "fullyDrawnReporter$delegate", "getFullyDrawnReporter", "()Lo/onSeekTo;", "fullyDrawnReporter", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Lo/anyIgnorals;", "getLifecycle", "()Lo/anyIgnorals;", LogCategory.LIFECYCLE, "Lo/mapObject;", "menuHostHelper", "Lo/mapObject;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lo/onSetRating;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onMultiWindowModeChangedListeners", "onNewIntentListeners", "onPictureInPictureModeChangedListeners", "onTrimMemoryListeners", "onUserLeaveHintListeners", "reportFullyDrawnExecutor", "Lo/MediaBrowserCompatMediaItem$RemoteActionCompatParcelizer;", "Lo/setOnChartValueSelectedListener;", "getSavedStateRegistry", "()Lo/setOnChartValueSelectedListener;", "savedStateRegistry", "Lo/setRenderer;", "savedStateRegistryController", "Lo/setRenderer;", "getSavedStateRegistryController$annotations", "getViewModelStore", "()Lo/hasMixIns;", "viewModelStore", "Companion", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class MediaBrowserCompatMediaItem extends _checkFloatSpecialValue implements r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, TypeResolutionContext, anyExplicitsWithoutIgnoral, PieChart, onSetShuffleMode, _init_lambda3, r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, _isPosInf, _isTrue, _failDoubleToIntCoercion, _findCoercionFromBlankString, _findCoercionFromEmptyArray, _findCoercionFromEmptyString, UntypedObjectDeserializerNR, onRewind {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final Companion Companion = new Companion(null);
    private hasMixIns _viewModelStore;
    private final r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 activityResultRegistry;
    private int contentLayoutId;
    private final ResultReceiver contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final RenewEligible defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final RenewEligible fullyDrawnReporter;
    private final mapObject menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final RenewEligible onBackPressedDispatcher;
    private final CopyOnWriteArrayList<wrapAsJsonMappingException<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<wrapAsJsonMappingException<_checkTextualNull>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<wrapAsJsonMappingException<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<wrapAsJsonMappingException<_isIntNumber>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<wrapAsJsonMappingException<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final RemoteActionCompatParcelizer reportFullyDrawnExecutor;
    private final setRenderer savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0003\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/MediaBrowserCompatMediaItem$RemoteActionCompatParcelizer;", "Ljava/util/concurrent/Executor;", "", "read", "()V", "Landroid/view/View;", "p0", "(Landroid/view/View;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    interface RemoteActionCompatParcelizer extends Executor {
        void read();

        void read(View p0);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @getRenewGrpId
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public MediaBrowserCompatMediaItem() {
        this.contextAwareHelper = new ResultReceiver();
        this.menuHostHelper = new mapObject(new Runnable() { // from class: o.RatingCompat
            @Override // java.lang.Runnable
            public final void run() {
                MediaBrowserCompatMediaItem.menuHostHelper$lambda$0(this.IconCompatParcelizer);
            }
        });
        setRenderer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setRenderer.AudioAttributesCompatParcelizer;
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this;
        setRenderer setrendererRemoteActionCompatParcelizer = setRenderer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(mediaBrowserCompatMediaItem);
        this.savedStateRegistryController = setrendererRemoteActionCompatParcelizer;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = getRenewExpiresOn.RemoteActionCompatParcelizer(new AnonymousClass5());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new MediaBrowserCompatItemReceiver();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        getLifecycle().IconCompatParcelizer(new findAccess() { // from class: o.MediaDescriptionCompat
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                MediaBrowserCompatMediaItem._init_$lambda$2(this.read, hasgetter, readVar);
            }
        });
        getLifecycle().IconCompatParcelizer(new findAccess() { // from class: o.MediaBrowserCompatSearchResultReceiver
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                MediaBrowserCompatMediaItem._init_$lambda$3(this.AudioAttributesCompatParcelizer, hasgetter, readVar);
            }
        });
        getLifecycle().IconCompatParcelizer(new findAccess() { // from class: o.MediaBrowserCompatMediaItem.2
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                toMagicModuleMetaRepoModel.write(hasgetter, "");
                toMagicModuleMetaRepoModel.write(readVar, "");
                MediaBrowserCompatMediaItem.this.ensureViewModelStore();
                MediaBrowserCompatMediaItem.this.getLifecycle().AudioAttributesCompatParcelizer(this);
            }
        });
        setrendererRemoteActionCompatParcelizer.write();
        withoutIgnored.IconCompatParcelizer(mediaBrowserCompatMediaItem);
        getSavedStateRegistry().IconCompatParcelizer(ACTIVITY_RESULT_TAG, new setOnChartValueSelectedListener.AudioAttributesCompatParcelizer() { // from class: o.MediaMetadataCompat
            @Override // o.setOnChartValueSelectedListener.AudioAttributesCompatParcelizer
            public final Bundle read() {
                return MediaBrowserCompatMediaItem._init_$lambda$4(this.read);
            }
        });
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.onCustomAction
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                MediaBrowserCompatMediaItem._init_$lambda$5(this.AudioAttributesCompatParcelizer, context);
            }
        });
        this.defaultViewModelProviderFactory = getRenewExpiresOn.RemoteActionCompatParcelizer(new AnonymousClass4());
        this.onBackPressedDispatcher = getRenewExpiresOn.RemoteActionCompatParcelizer(new AnonymousClass1());
    }

    public static final class AudioAttributesCompatParcelizer {
        private Object AudioAttributesCompatParcelizer;
        private hasMixIns IconCompatParcelizer;

        public final void RemoteActionCompatParcelizer(Object obj) {
            this.AudioAttributesCompatParcelizer = obj;
        }

        public final Object read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final hasMixIns AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void write(hasMixIns hasmixins) {
            this.IconCompatParcelizer = hasmixins;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        mediaBrowserCompatMediaItem.invalidateMenu();
    }

    public onSeekTo getFullyDrawnReporter() {
        return (onSeekTo) this.fullyDrawnReporter.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.MediaBrowserCompatMediaItem$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/onSeekTo;", "write", "()Lo/onSeekTo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<onSeekTo> {

        /* JADX INFO: renamed from: o.MediaBrowserCompatMediaItem$5$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            final /* synthetic */ MediaBrowserCompatMediaItem IconCompatParcelizer;

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                AudioAttributesCompatParcelizer();
                return getShowPopup.INSTANCE;
            }

            public final void AudioAttributesCompatParcelizer() {
                this.IconCompatParcelizer.reportFullyDrawn();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
                super(0);
                this.IconCompatParcelizer = mediaBrowserCompatMediaItem;
            }
        }

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final onSeekTo invoke() {
            return new onSeekTo(MediaBrowserCompatMediaItem.this.reportFullyDrawnExecutor, new AnonymousClass1(MediaBrowserCompatMediaItem.this));
        }

        AnonymousClass5() {
            super(0);
        }
    }

    public static final class MediaBrowserCompatItemReceiver extends r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 {
        MediaBrowserCompatItemReceiver() {
        }

        @Override // kotlin.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
        public final <I, O> void RemoteActionCompatParcelizer(final int i, accessaddObserverForBackInvoker<I, O> accessaddobserverforbackinvoker, I i2, _checkFloatToStringCoercion _checkfloattostringcoercion) {
            Bundle bundleAudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(accessaddobserverforbackinvoker, "");
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem.this;
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = mediaBrowserCompatMediaItem;
            final accessaddObserverForBackInvoker.IconCompatParcelizer<O> iconCompatParcelizer = accessaddobserverforbackinvoker.read(mediaBrowserCompatMediaItem2, i2);
            if (iconCompatParcelizer != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.onAddQueueItem
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver.read(this.write, i, iconCompatParcelizer);
                    }
                });
                return;
            }
            Intent intentWrite = accessaddobserverforbackinvoker.write(mediaBrowserCompatMediaItem2, i2);
            if (intentWrite.getExtras() != null) {
                Bundle extras = intentWrite.getExtras();
                toMagicModuleMetaRepoModel.write(extras);
                if (extras.getClassLoader() == null) {
                    intentWrite.setExtrasClassLoader(mediaBrowserCompatMediaItem.getClassLoader());
                }
            }
            if (intentWrite.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleAudioAttributesCompatParcelizer = intentWrite.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentWrite.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleAudioAttributesCompatParcelizer = _checkfloattostringcoercion != null ? _checkfloattostringcoercion.AudioAttributesCompatParcelizer() : null;
            }
            Bundle bundle = bundleAudioAttributesCompatParcelizer;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "androidx.activity.result.contract.action.REQUEST_PERMISSIONS", (Object) intentWrite.getAction())) {
                String[] stringArrayExtra = intentWrite.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                _checkBooleanToStringCoercion.AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem, stringArrayExtra, i);
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", (Object) intentWrite.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentWrite.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    toMagicModuleMetaRepoModel.write(intentSenderRequest);
                    _checkBooleanToStringCoercion.IconCompatParcelizer(mediaBrowserCompatMediaItem, intentSenderRequest.getRead(), i, intentSenderRequest.getWrite(), intentSenderRequest.getAudioAttributesCompatParcelizer(), intentSenderRequest.getIconCompatParcelizer(), 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.handleMediaPlayPauseIfPendingOnHandler
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, i, e);
                        }
                    });
                    return;
                }
            }
            _checkBooleanToStringCoercion.read(mediaBrowserCompatMediaItem, intentWrite, i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i, accessaddObserverForBackInvoker.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
            mediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(i, iconCompatParcelizer.IconCompatParcelizer());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver, int i, IntentSender.SendIntentException sendIntentException) {
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
            toMagicModuleMetaRepoModel.write(sendIntentException, "");
            mediaBrowserCompatItemReceiver.IconCompatParcelizer(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }
    }

    @Override // kotlin._init_lambda3
    public final r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, hasGetter hasgetter, anyIgnorals.read readVar) {
        Window window;
        View viewPeekDecorView;
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        if (readVar != anyIgnorals.read.ON_STOP || (window = mediaBrowserCompatMediaItem.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        if (readVar == anyIgnorals.read.ON_DESTROY) {
            mediaBrowserCompatMediaItem.contextAwareHelper.AudioAttributesCompatParcelizer();
            if (!mediaBrowserCompatMediaItem.isChangingConfigurations()) {
                mediaBrowserCompatMediaItem.getViewModelStore().IconCompatParcelizer();
            }
            mediaBrowserCompatMediaItem.reportFullyDrawnExecutor.read();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        Bundle bundle = new Bundle();
        mediaBrowserCompatMediaItem.activityResultRegistry.IconCompatParcelizer(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, Context context) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(context, "");
        Bundle bundleRemoteActionCompatParcelizer = mediaBrowserCompatMediaItem.getSavedStateRegistry().RemoteActionCompatParcelizer(ACTIVITY_RESULT_TAG);
        if (bundleRemoteActionCompatParcelizer != null) {
            mediaBrowserCompatMediaItem.activityResultRegistry.read(bundleRemoteActionCompatParcelizer);
        }
    }

    public MediaBrowserCompatMediaItem(int i) {
        this();
        this.contentLayoutId = i;
    }

    @Override // kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle p0) {
        this.savedStateRegistryController.AudioAttributesCompatParcelizer(p0);
        this.contextAwareHelper.AudioAttributesCompatParcelizer(this);
        super.onCreate(p0);
        withNext.Companion remoteActionCompatParcelizer = withNext.INSTANCE;
        withNext.Companion.RemoteActionCompatParcelizer(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // kotlin._checkFloatSpecialValue, android.app.Activity
    public void onSaveInstanceState(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (getLifecycle() instanceof getSetterUnchecked) {
            anyIgnorals lifecycle = getLifecycle();
            toMagicModuleMetaRepoModel.read(lifecycle, "");
            ((getSetterUnchecked) lifecycle).RemoteActionCompatParcelizer(anyIgnorals.write.read);
        }
        super.onSaveInstanceState(p0);
        this.savedStateRegistryController.RemoteActionCompatParcelizer(p0);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        hasMixIns hasmixinsAudioAttributesCompatParcelizer = this._viewModelStore;
        if (hasmixinsAudioAttributesCompatParcelizer == null && (audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) getLastNonConfigurationInstance()) != null) {
            hasmixinsAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        if (hasmixinsAudioAttributesCompatParcelizer == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer();
        audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer(objOnRetainCustomNonConfigurationInstance);
        audioAttributesCompatParcelizer2.write(hasmixinsAudioAttributesCompatParcelizer);
        return audioAttributesCompatParcelizer2;
    }

    @getRenewGrpId
    public Object getLastCustomNonConfigurationInstance() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) getLastNonConfigurationInstance();
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer.read();
        }
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(int p0) {
        initializeViewTreeOwners();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        remoteActionCompatParcelizer.read(decorView);
        super.setContentView(p0);
    }

    @Override // android.app.Activity
    public void setContentView(View p0) {
        initializeViewTreeOwners();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        remoteActionCompatParcelizer.read(decorView);
        super.setContentView(p0);
    }

    @Override // android.app.Activity
    public void setContentView(View p0, ViewGroup.LayoutParams p1) {
        initializeViewTreeOwners();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        remoteActionCompatParcelizer.read(decorView);
        super.setContentView(p0, p1);
    }

    @Override // android.app.Activity
    public void addContentView(View p0, ViewGroup.LayoutParams p1) {
        initializeViewTreeOwners();
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        remoteActionCompatParcelizer.read(decorView);
        super.addContentView(p0, p1);
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
        isCreatorVisible.IconCompatParcelizer(decorView, this);
        View decorView2 = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView2, "");
        isFieldVisible.AudioAttributesCompatParcelizer(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView3, "");
        setCenterTextRadiusPercent.read(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView4, "");
        onSkipToQueueItem.read(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView5, "");
        onStop.write(decorView5, this);
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.getWrite();
    }

    public final void addOnContextAvailableListener(PlaybackStateCompatCustomAction p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.contextAwareHelper.IconCompatParcelizer(p0);
    }

    public final void removeOnContextAvailableListener(PlaybackStateCompatCustomAction p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.contextAwareHelper.AudioAttributesCompatParcelizer(p0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int p0, View p1, Menu p2) {
        toMagicModuleMetaRepoModel.write(p2, "");
        if (p0 != 0) {
            return true;
        }
        super.onPreparePanel(p0, p1, p2);
        this.menuHostHelper.read(p2);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int p0, Menu p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 != 0) {
            return true;
        }
        super.onCreatePanelMenu(p0, p1);
        this.menuHostHelper.write(p1, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int p0, MenuItem p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (super.onMenuItemSelected(p0, p1)) {
            return true;
        }
        if (p0 == 0) {
            return this.menuHostHelper.AudioAttributesCompatParcelizer(p1);
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int p0, Menu p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        this.menuHostHelper.write(p1);
        super.onPanelClosed(p0, p1);
    }

    @Override // kotlin.UntypedObjectDeserializerNR
    public void addMenuProvider(UntypedObjectDeserializerNRScope p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.menuHostHelper.AudioAttributesCompatParcelizer(p0);
    }

    public void addMenuProvider(UntypedObjectDeserializerNRScope p0, hasGetter p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        this.menuHostHelper.read(p0, p1);
    }

    public void addMenuProvider(UntypedObjectDeserializerNRScope p0, hasGetter p1, anyIgnorals.write p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        this.menuHostHelper.IconCompatParcelizer(p0, p1, p2);
    }

    @Override // kotlin.UntypedObjectDeserializerNR
    public void removeMenuProvider(UntypedObjectDeserializerNRScope p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.menuHostHelper.IconCompatParcelizer(p0);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // kotlin._checkFloatSpecialValue, kotlin.hasGetter
    public anyIgnorals getLifecycle() {
        return super.getLifecycle();
    }

    @Override // kotlin.TypeResolutionContext
    public hasMixIns getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        ensureViewModelStore();
        hasMixIns hasmixins = this._viewModelStore;
        toMagicModuleMetaRepoModel.write(hasmixins);
        return hasmixins;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) getLastNonConfigurationInstance();
            if (audioAttributesCompatParcelizer != null) {
                this._viewModelStore = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new hasMixIns();
            }
        }
    }

    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return (VisibilityChecker.RemoteActionCompatParcelizer) this.defaultViewModelProviderFactory.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.MediaBrowserCompatMediaItem$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/next;", "RemoteActionCompatParcelizer", "()Lo/next;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<next> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final next invoke() {
            Application application = MediaBrowserCompatMediaItem.this.getApplication();
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem.this;
            return new next(application, mediaBrowserCompatMediaItem, mediaBrowserCompatMediaItem.getIntent() != null ? MediaBrowserCompatMediaItem.this.getIntent().getExtras() : null);
        }

        AnonymousClass4() {
            super(0);
        }
    }

    @Override // kotlin.anyExplicitsWithoutIgnoral
    public withFieldVisibility getDefaultViewModelCreationExtras() {
        _defaultOrOverride _defaultoroverride = new _defaultOrOverride(null, 1, null);
        if (getApplication() != null) {
            withFieldVisibility.read<Application> readVar = VisibilityChecker.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            Application application = getApplication();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(application, "");
            _defaultoroverride.AudioAttributesCompatParcelizer(readVar, application);
        }
        _defaultoroverride.AudioAttributesCompatParcelizer(withoutIgnored.read, this);
        _defaultoroverride.AudioAttributesCompatParcelizer(withoutIgnored.AudioAttributesCompatParcelizer, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            _defaultoroverride.AudioAttributesCompatParcelizer(withoutIgnored.write, extras);
        }
        return _defaultoroverride;
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void onBackPressed() {
        getIconCompatParcelizer().RemoteActionCompatParcelizer();
    }

    @Override // kotlin.onSetShuffleMode
    /* JADX INFO: renamed from: getOnBackPressedDispatcher */
    public final onSetRating getIconCompatParcelizer() {
        return (onSetRating) this.onBackPressedDispatcher.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: o.MediaBrowserCompatMediaItem$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/onSetRating;", "read", "()Lo/onSetRating;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<onSetRating> {
        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
            try {
                MediaBrowserCompatMediaItem.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) e.getMessage(), (Object) "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) e2.getMessage(), (Object) "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final onSetRating invoke() {
            final MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem.this;
            final onSetRating onsetrating = new onSetRating(new Runnable() { // from class: o.onPlayFromMediaId
                @Override // java.lang.Runnable
                public final void run() {
                    MediaBrowserCompatMediaItem.AnonymousClass1.AudioAttributesCompatParcelizer(mediaBrowserCompatMediaItem);
                }
            });
            final MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = MediaBrowserCompatMediaItem.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.myLooper(), Looper.getMainLooper())) {
                    mediaBrowserCompatMediaItem2.addObserverForBackInvoker(onsetrating);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.onPause
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaBrowserCompatMediaItem.AnonymousClass1.write(mediaBrowserCompatMediaItem2, onsetrating);
                        }
                    });
                    return onsetrating;
                }
            }
            return onsetrating;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, onSetRating onsetrating) {
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
            toMagicModuleMetaRepoModel.write(onsetrating, "");
            mediaBrowserCompatMediaItem.addObserverForBackInvoker(onsetrating);
        }

        AnonymousClass1() {
            super(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final onSetRating p0) {
        getLifecycle().IconCompatParcelizer(new findAccess() { // from class: o.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            @Override // kotlin.findAccess
            public final void read(hasGetter hasgetter, anyIgnorals.read readVar) {
                MediaBrowserCompatMediaItem.addObserverForBackInvoker$lambda$7(p0, this, hasgetter, readVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(onSetRating onsetrating, MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, hasGetter hasgetter, anyIgnorals.read readVar) {
        toMagicModuleMetaRepoModel.write(onsetrating, "");
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
        toMagicModuleMetaRepoModel.write(hasgetter, "");
        toMagicModuleMetaRepoModel.write(readVar, "");
        if (readVar == anyIgnorals.read.ON_CREATE) {
            onsetrating.by_(IconCompatParcelizer.INSTANCE.bx_(mediaBrowserCompatMediaItem));
        }
    }

    @Override // kotlin.PieChart
    public final setOnChartValueSelectedListener getSavedStateRegistry() {
        return this.savedStateRegistryController.getRead();
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void startActivityForResult(Intent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.startActivityForResult(p0, p1);
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void startActivityForResult(Intent p0, int p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.startActivityForResult(p0, p1, p2);
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void startIntentSenderForResult(IntentSender p0, int p1, Intent p2, int p3, int p4, int p5) throws IntentSender.SendIntentException {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.startIntentSenderForResult(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void startIntentSenderForResult(IntentSender p0, int p1, Intent p2, int p3, int p4, int p5, Bundle p6) throws IntentSender.SendIntentException {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.startIntentSenderForResult(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void onActivityResult(int p0, int p1, Intent p2) {
        if (this.activityResultRegistry.IconCompatParcelizer(p0, p1, p2)) {
            return;
        }
        super.onActivityResult(p0, p1, p2);
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void onRequestPermissionsResult(int p0, String[] p1, int[] p2) {
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (this.activityResultRegistry.IconCompatParcelizer(p0, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", p1).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", p2))) {
            return;
        }
        super.onRequestPermissionsResult(p0, p1, p2);
    }

    public final <I, O> r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<I> registerForActivityResult(accessaddObserverForBackInvoker<I, O> p0, r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 p1, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<O> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        StringBuilder sb = new StringBuilder("activity_rq#");
        sb.append(this.nextLocalRequestCode.getAndIncrement());
        return p1.IconCompatParcelizer(sb.toString(), this, p0, p2);
    }

    public final <I, O> r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<I> registerForActivityResult(accessaddObserverForBackInvoker<I, O> p0, r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM<O> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return registerForActivityResult(p0, this.activityResultRegistry, p1);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onConfigurationChanged(p0);
        Iterator<wrapAsJsonMappingException<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(p0);
        }
    }

    @Override // kotlin._isPosInf
    public final void addOnConfigurationChangedListener(wrapAsJsonMappingException<Configuration> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onConfigurationChangedListeners.add(p0);
    }

    @Override // kotlin._isPosInf
    public final void removeOnConfigurationChangedListener(wrapAsJsonMappingException<Configuration> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onConfigurationChangedListeners.remove(p0);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int p0) {
        super.onTrimMemory(p0);
        Iterator<wrapAsJsonMappingException<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(Integer.valueOf(p0));
        }
    }

    @Override // kotlin._isTrue
    public final void addOnTrimMemoryListener(wrapAsJsonMappingException<Integer> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onTrimMemoryListeners.add(p0);
    }

    @Override // kotlin._isTrue
    public final void removeOnTrimMemoryListener(wrapAsJsonMappingException<Integer> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onTrimMemoryListeners.remove(p0);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onNewIntent(p0);
        Iterator<wrapAsJsonMappingException<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(p0);
        }
    }

    public final void addOnNewIntentListener(wrapAsJsonMappingException<Intent> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onNewIntentListeners.add(p0);
    }

    public final void removeOnNewIntentListener(wrapAsJsonMappingException<Intent> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onNewIntentListeners.remove(p0);
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void onMultiWindowModeChanged(boolean p0) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<wrapAsJsonMappingException<_checkTextualNull>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(new _checkTextualNull(p0));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean p0, Configuration p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(p0, p1);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<wrapAsJsonMappingException<_checkTextualNull>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().AudioAttributesCompatParcelizer(new _checkTextualNull(p0, p1));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // kotlin._findCoercionFromBlankString
    public final void addOnMultiWindowModeChangedListener(wrapAsJsonMappingException<_checkTextualNull> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onMultiWindowModeChangedListeners.add(p0);
    }

    @Override // kotlin._findCoercionFromBlankString
    public final void removeOnMultiWindowModeChangedListener(wrapAsJsonMappingException<_checkTextualNull> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onMultiWindowModeChangedListeners.remove(p0);
    }

    @Override // android.app.Activity
    @getRenewGrpId
    public void onPictureInPictureModeChanged(boolean p0) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<wrapAsJsonMappingException<_isIntNumber>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(new _isIntNumber(p0));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean p0, Configuration p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(p0, p1);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<wrapAsJsonMappingException<_isIntNumber>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().AudioAttributesCompatParcelizer(new _isIntNumber(p0, p1));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // kotlin._findCoercionFromEmptyArray
    public final void addOnPictureInPictureModeChangedListener(wrapAsJsonMappingException<_isIntNumber> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onPictureInPictureModeChangedListeners.add(p0);
    }

    @Override // kotlin._findCoercionFromEmptyArray
    public final void removeOnPictureInPictureModeChangedListener(wrapAsJsonMappingException<_isIntNumber> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onPictureInPictureModeChangedListeners.remove(p0);
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final void addOnUserLeaveHintListener(Runnable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onUserLeaveHintListeners.add(p0);
    }

    public final void removeOnUserLeaveHintListener(Runnable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.onUserLeaveHintListeners.remove(p0);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (MarkerView.IconCompatParcelizer()) {
                MarkerView.AudioAttributesCompatParcelizer("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().write();
        } finally {
            MarkerView.RemoteActionCompatParcelizer();
        }
    }

    private final RemoteActionCompatParcelizer createFullyDrawnExecutor() {
        return new write();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/MediaBrowserCompatMediaItem$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "Landroid/window/OnBackInvokedDispatcher;", "bx_", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class IconCompatParcelizer {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }

        public final OnBackInvokedDispatcher bx_(Activity p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            OnBackInvokedDispatcher onBackInvokedDispatcher = p0.getOnBackInvokedDispatcher();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onBackInvokedDispatcher, "");
            return onBackInvokedDispatcher;
        }
    }

    @Override // kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    final class write implements RemoteActionCompatParcelizer, ViewTreeObserver.OnDrawListener, Runnable {
        private final long AudioAttributesCompatParcelizer = SystemClock.uptimeMillis() + 10000;
        private boolean read;
        private Runnable write;

        public write() {
        }

        @Override // o.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer
        public final void read(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            if (this.read) {
                return;
            }
            this.read = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // o.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer
        public final void read() {
            MediaBrowserCompatMediaItem.this.getWindow().getDecorView().removeCallbacks(this);
            MediaBrowserCompatMediaItem.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            toMagicModuleMetaRepoModel.write(runnable, "");
            this.write = runnable;
            View decorView = MediaBrowserCompatMediaItem.this.getWindow().getDecorView();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decorView, "");
            if (this.read) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Looper.myLooper(), Looper.getMainLooper())) {
                    decorView.invalidate();
                    return;
                } else {
                    decorView.postInvalidate();
                    return;
                }
            }
            decorView.postOnAnimation(new Runnable() { // from class: o.onCommand
                @Override // java.lang.Runnable
                public final void run() {
                    MediaBrowserCompatMediaItem.write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(write writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            Runnable runnable = writeVar.write;
            if (runnable != null) {
                toMagicModuleMetaRepoModel.write(runnable);
                runnable.run();
                writeVar.write = null;
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            Runnable runnable = this.write;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.AudioAttributesCompatParcelizer) {
                    this.read = false;
                    MediaBrowserCompatMediaItem.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.write = null;
            if (MediaBrowserCompatMediaItem.this.getFullyDrawnReporter().AudioAttributesCompatParcelizer()) {
                this.read = false;
                MediaBrowserCompatMediaItem.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            MediaBrowserCompatMediaItem.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Override // kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/MediaBrowserCompatMediaItem$Companion;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
