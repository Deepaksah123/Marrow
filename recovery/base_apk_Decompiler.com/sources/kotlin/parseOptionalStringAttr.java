package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.paginationV2.PageValue;
import com.marrow.data.models.pearl.PearlMini;
import com.marrow.data.models.test.TestIndex;
import com.marrow.data.models.video.ThemeState;
import com.marrow.designsystem.theme.AppTheme;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.BandwidthMeterEventListenerEventDispatcherHandlerAndListener;
import kotlin.Metadata;
import kotlin.buildRoleString;
import kotlin.getExternalPeriodUid;
import kotlin.withNewAdGroup;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bX\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u0000 h2\u00020\u0001:\u0001hBÿ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010_\u001a\u00020^¢\u0006\u0004\b`\u0010aJ\u0015\u0010d\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020bH\u0002¢\u0006\u0004\bf\u0010eJ\u0015\u0010g\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bg\u0010eJ\r\u0010h\u001a\u00020c¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020c¢\u0006\u0004\bj\u0010iJ\r\u0010k\u001a\u00020c¢\u0006\u0004\bk\u0010iJ\r\u0010l\u001a\u00020c¢\u0006\u0004\bl\u0010iJ\u001f\u0010d\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b2\u0006\u0010\u0005\u001a\u00020mH\u0002¢\u0006\u0004\bd\u0010nJ\r\u0010o\u001a\u00020c¢\u0006\u0004\bo\u0010iJ\r\u0010p\u001a\u00020c¢\u0006\u0004\bp\u0010iJ\u0013\u0010r\u001a\b\u0012\u0004\u0012\u00020m0q¢\u0006\u0004\br\u0010sJ\u0015\u0010j\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020t¢\u0006\u0004\bj\u0010uJ\r\u0010v\u001a\u00020c¢\u0006\u0004\bv\u0010iJ\r\u0010w\u001a\u00020c¢\u0006\u0004\bw\u0010iJ\r\u0010d\u001a\u00020c¢\u0006\u0004\bd\u0010iJ\r\u0010g\u001a\u00020c¢\u0006\u0004\bg\u0010iJ\u0015\u0010x\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bx\u0010eJ\u0015\u0010y\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\by\u0010eJ\u0015\u0010z\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bz\u0010eJ\u0017\u0010{\u001a\u00020c2\b\u0010\u0003\u001a\u0004\u0018\u00010b¢\u0006\u0004\b{\u0010iJ\u0015\u0010|\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\b|\u0010eJ\u0015\u0010}\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\b}\u0010eJ\u0015\u0010~\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\b~\u0010eJ\u0015\u0010\u007f\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\b\u007f\u0010eJ\u0017\u0010\u0080\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0080\u0001\u0010eJ\u0017\u0010\u0081\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0081\u0001\u0010eJ\u0017\u0010\u0082\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0082\u0001\u0010eJ\u0017\u0010\u0083\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0083\u0001\u0010eJ\u0017\u0010\u0084\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0084\u0001\u0010eJ\u0017\u0010\u0085\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0085\u0001\u0010eJ\u0017\u0010\u0086\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0086\u0001\u0010eJ\u0017\u0010\u0087\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0087\u0001\u0010eJ\u0017\u0010\u0088\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0088\u0001\u0010eJ\u0017\u0010\u0089\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0089\u0001\u0010eJ\u0017\u0010\u008a\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u008a\u0001\u0010eJ\u0017\u0010\u008b\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u008b\u0001\u0010eJ\u0017\u0010\u008c\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u008c\u0001\u0010eJ\u0017\u0010\u008d\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u008d\u0001\u0010eJ\u0017\u0010\u008e\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u008e\u0001\u0010eJ\u0017\u0010\u008f\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u008f\u0001\u0010eJ\u0017\u0010\u0090\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0090\u0001\u0010eJ\u0017\u0010\u0091\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0091\u0001\u0010eJ\u0017\u0010\u0092\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0092\u0001\u0010eJ\u0017\u0010\u0093\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0093\u0001\u0010eJ\u0015\u0010h\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bh\u0010eJ\u0015\u0010l\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bl\u0010eJ\u0015\u0010j\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bj\u0010eJ\u0015\u0010k\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bk\u0010eJ\u0015\u0010o\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bo\u0010eJ\u0015\u0010p\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bp\u0010eJ\u0015\u0010{\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\b{\u0010eJ\u0015\u0010r\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\br\u0010eJ\u0015\u0010v\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bv\u0010eJ\u0017\u0010\u0094\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0094\u0001\u0010eJ\u0015\u0010w\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0004\bw\u0010eJ\u0017\u0010\u0095\u0001\u001a\u00020c2\u0006\u0010\u0003\u001a\u00020b¢\u0006\u0005\b\u0095\u0001\u0010eR\u0016\u0010j\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0096\u0001R\u0016\u0010h\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0097\u0001R\u0015\u0010l\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bx\u0010\u0098\u0001R\u0016\u0010g\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0099\u0001R\u0015\u0010d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bw\u0010\u009a\u0001R\u0015\u0010{\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b|\u0010\u009b\u0001R\u0016\u0010p\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u009c\u0001R\u0015\u0010r\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\br\u0010\u009d\u0001R\u0016\u0010k\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u009e\u0001R\u0016\u0010o\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u009f\u0001R\u0016\u0010x\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010 \u0001R\u0016\u0010w\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010¡\u0001R\u0016\u0010v\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010\u0095\u0001\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bf\u0010¤\u0001R\u0017\u0010\u0094\u0001\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010}\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010§\u0001R\u0015\u0010~\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010¨\u0001R\u0015\u0010|\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010©\u0001R\u0015\u0010y\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b{\u0010ª\u0001R\u0016\u0010z\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010«\u0001R\u0017\u0010\u0081\u0001\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010¬\u0001R\u0015\u0010\u007f\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010\u00ad\u0001R\u0017\u0010\u0082\u0001\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010\u0080\u0001\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010°\u0001R\u0017\u0010\u0083\u0001\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010\u0087\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b}\u0010³\u0001R\u0017\u0010\u0084\u0001\u001a\u0002068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010´\u0001R\u0016\u0010\u0086\u0001\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010µ\u0001R\u0017\u0010\u0085\u0001\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010\u0088\u0001\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010¸\u0001R\u0017\u0010\u008a\u0001\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010¹\u0001R\u0017\u0010\u008d\u0001\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010º\u0001R\u0017\u0010\u008b\u0001\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0017\u0010\u0089\u0001\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010½\u0001R\u0017\u0010\u008c\u0001\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010¾\u0001R\u0017\u0010\u008f\u0001\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010¿\u0001R\u0017\u0010\u008e\u0001\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010À\u0001R\u0016\u0010\u0091\u0001\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b~\u0010Á\u0001R\u0017\u0010\u0092\u0001\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010\u0090\u0001\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010Ä\u0001R\u0016\u0010¢\u0001\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bo\u0010Å\u0001R\u0017\u0010®\u0001\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0017\u0010Æ\u0001\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010È\u0001R\u0017\u0010\u0093\u0001\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010É\u0001R\u0015\u0010f\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010Ê\u0001R\u0017\u0010¥\u0001\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010Ë\u0001R\u0017\u0010Â\u0001\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010Ì\u0001R\"\u0010±\u0001\u001a\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030Î\u00010Í\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010Ï\u0001R\"\u0010¶\u0001\u001a\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030Î\u00010Í\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bl\u0010Ï\u0001"}, d2 = {"Lo/parseOptionalStringAttr;", "", "Lo/getAvailableSegmentCount;", "p0", "Lo/getRepresentations;", "p1", "Lo/setCompositeSequenceableLoaderFactory;", "p2", "Lo/setManifestParser;", "p3", "Lo/onInitializationFailed;", "p4", "Lo/DashSegmentIndex;", "p5", "Lo/onUtcTimestampLoadCompleted;", "p6", "Lo/onDashManifestPublishTimeExpired;", "p7", "Lo/getNowPeriodTimeUs;", "p8", "Lo/loadSampleFormat;", "p9", "Lo/newChunkExtractor;", "p10", "Lo/getSegmentUrl;", "p11", "Lo/updateSelectedBaseUrl;", "p12", "Lo/newMediaChunk;", "p13", "Lo/copyWithNewSelectedBaseUrl;", "p14", "Lo/getFirstSegmentNum;", "p15", "Lo/isIndexExplicit;", "p16", "Lo/onUtcTimestampResolved;", "p17", "Lo/resolveUtcTimingElementHttp;", "p18", "Lo/resolveCacheKey;", "p19", "Lo/DashMediaSourceExternalSyntheticLambda1;", "p20", "Lo/processManifest;", "p21", "Lo/createFallbackOptions;", "p22", "Lo/DashMediaSourceUtcTimestampCallback;", "p23", "Lo/newInitializationChunk;", "p24", "Lo/DashMediaSourceXsDateTimeParser;", "p25", "Lo/getFirstAvailableSegmentNum;", "p26", "Lo/scheduleManifestRefresh;", "p27", "Lo/copyWithNewRepresentation;", "p28", "Lo/getStreamPositionUsForContent;", "p29", "Lo/DashMediaSourceExternalSyntheticLambda0;", "p30", "Lo/getAdjustedWindowDefaultStartPositionUs;", "p31", "Lo/DefaultDashChunkSourceRepresentationHolder;", "p32", "Lo/onManifestLoadError;", "p33", "Lo/replaceManifestUri;", "p34", "Lo/onManifestLoadCompleted;", "p35", "Lo/getSegmentNum;", "p36", "Lo/loadNtpTimeOffset;", "p37", "Lo/getLastAvailableSegmentNum;", "p38", "Lo/DashMediaSource1;", "p39", "Lo/DefaultDashChunkSource;", "p40", "Lo/DefaultDashChunkSourceFactory;", "p41", "Lo/loadManifest;", "p42", "Lo/isExplicit;", "p43", "Lo/DashMediaSourceManifestCallback;", "p44", "Lo/loadInitializationData;", "p45", "Lo/getFirstRepresentation;", "p46", "<init>", "(Lo/getAvailableSegmentCount;Lo/getRepresentations;Lo/setCompositeSequenceableLoaderFactory;Lo/setManifestParser;Lo/onInitializationFailed;Lo/DashSegmentIndex;Lo/onUtcTimestampLoadCompleted;Lo/onDashManifestPublishTimeExpired;Lo/getNowPeriodTimeUs;Lo/loadSampleFormat;Lo/newChunkExtractor;Lo/getSegmentUrl;Lo/updateSelectedBaseUrl;Lo/newMediaChunk;Lo/copyWithNewSelectedBaseUrl;Lo/getFirstSegmentNum;Lo/isIndexExplicit;Lo/onUtcTimestampResolved;Lo/resolveUtcTimingElementHttp;Lo/resolveCacheKey;Lo/DashMediaSourceExternalSyntheticLambda1;Lo/processManifest;Lo/createFallbackOptions;Lo/DashMediaSourceUtcTimestampCallback;Lo/newInitializationChunk;Lo/DashMediaSourceXsDateTimeParser;Lo/getFirstAvailableSegmentNum;Lo/scheduleManifestRefresh;Lo/copyWithNewRepresentation;Lo/getStreamPositionUsForContent;Lo/DashMediaSourceExternalSyntheticLambda0;Lo/getAdjustedWindowDefaultStartPositionUs;Lo/DefaultDashChunkSourceRepresentationHolder;Lo/onManifestLoadError;Lo/replaceManifestUri;Lo/onManifestLoadCompleted;Lo/getSegmentNum;Lo/loadNtpTimeOffset;Lo/getLastAvailableSegmentNum;Lo/DashMediaSource1;Lo/DefaultDashChunkSource;Lo/DefaultDashChunkSourceFactory;Lo/loadManifest;Lo/isExplicit;Lo/DashMediaSourceManifestCallback;Lo/loadInitializationData;Lo/getFirstRepresentation;)V", "Landroid/database/sqlite/SQLiteDatabase;", "", "AudioAttributesCompatParcelizer", "(Landroid/database/sqlite/SQLiteDatabase;)V", "setSessionImpl", "IconCompatParcelizer", "read", "()V", "write", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "", "AudioAttributesImplBaseParcelizer", "()[Ljava/lang/String;", "", "(I)V", "RatingCompat", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCommand", "MediaBrowserCompatCustomActionResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "onCustomAction", "onPlayFromMediaId", "onPlay", "onFastForward", "onMediaButtonEvent", "onPause", "onPrepareFromSearch", "onPlayFromUri", "onPrepareFromMediaId", "onPrepare", "onPlayFromSearch", "onRemoveQueueItemAt", "onRewind", "onSeekTo", "onRemoveQueueItem", "onPrepareFromUri", "onSetShuffleMode", "onSetCaptioningEnabled", "onSetRating", "onSetPlaybackSpeed", "onSetRepeatMode", "onSkipToQueueItem", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "Lo/getAvailableSegmentCount;", "Lo/getRepresentations;", "Lo/setCompositeSequenceableLoaderFactory;", "Lo/setManifestParser;", "Lo/onInitializationFailed;", "Lo/DashSegmentIndex;", "Lo/onUtcTimestampLoadCompleted;", "Lo/onDashManifestPublishTimeExpired;", "Lo/getNowPeriodTimeUs;", "Lo/loadSampleFormat;", "Lo/newChunkExtractor;", "Lo/getSegmentUrl;", "onStop", "Lo/updateSelectedBaseUrl;", "Lo/newMediaChunk;", "PlaybackStateCompat", "Lo/copyWithNewSelectedBaseUrl;", "Lo/getFirstSegmentNum;", "Lo/isIndexExplicit;", "Lo/onUtcTimestampResolved;", "Lo/resolveUtcTimingElementHttp;", "Lo/resolveCacheKey;", "Lo/DashMediaSourceExternalSyntheticLambda1;", "Lo/processManifest;", "onSkipToNext", "Lo/createFallbackOptions;", "Lo/DashMediaSourceUtcTimestampCallback;", "ParcelableVolumeInfo", "Lo/newInitializationChunk;", "Lo/DashMediaSourceXsDateTimeParser;", "Lo/getFirstAvailableSegmentNum;", "Lo/scheduleManifestRefresh;", "MediaSessionCompatResultReceiverWrapper", "Lo/copyWithNewRepresentation;", "Lo/getStreamPositionUsForContent;", "Lo/DashMediaSourceExternalSyntheticLambda0;", "Lo/getAdjustedWindowDefaultStartPositionUs;", "MediaSessionCompatToken", "Lo/DefaultDashChunkSourceRepresentationHolder;", "Lo/onManifestLoadError;", "Lo/replaceManifestUri;", "Lo/onManifestLoadCompleted;", "Lo/getSegmentNum;", "Lo/loadNtpTimeOffset;", "MediaSessionCompatQueueItem", "Lo/getLastAvailableSegmentNum;", "Lo/DashMediaSource1;", "Lo/DefaultDashChunkSource;", "onSkipToPrevious", "Lo/DefaultDashChunkSourceFactory;", "Lo/loadManifest;", "Lo/isExplicit;", "Lo/DashMediaSourceManifestCallback;", "Lo/loadInitializationData;", "Lo/getFirstRepresentation;", "", "Lo/getIntervalUntilNextManifestRefreshMs;", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parseOptionalStringAttr {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final scheduleManifestRefresh onPrepareFromMediaId;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final DefaultDashChunkSource onStop;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final isIndexExplicit onCustomAction;
    private final onDashManifestPublishTimeExpired AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final processManifest onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final resolveUtcTimingElementHttp MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final onUtcTimestampResolved handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final setCompositeSequenceableLoaderFactory RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final getAdjustedWindowDefaultStartPositionUs onPrepareFromUri;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final DashMediaSourceUtcTimestampCallback onPlay;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setManifestParser IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final onInitializationFailed AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: from kotlin metadata */
    private final getLastAvailableSegmentNum onSetRepeatMode;

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from kotlin metadata */
    private final copyWithNewRepresentation onPlayFromUri;

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from kotlin metadata */
    private final DefaultDashChunkSourceRepresentationHolder onSeekTo;

    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: from kotlin metadata */
    private final newInitializationChunk onPause;

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from kotlin metadata */
    private final copyWithNewSelectedBaseUrl MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final DashMediaSource1 onSetRating;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<getIntervalUntilNextManifestRefreshMs<?>> MediaSessionCompatResultReceiverWrapper;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final DashSegmentIndex MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final DashMediaSourceXsDateTimeParser onPrepare;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final DashMediaSourceManifestCallback setSessionImpl;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final loadNtpTimeOffset onSetPlaybackSpeed;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final getFirstAvailableSegmentNum onPrepareFromSearch;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final getAvailableSegmentCount write;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final getFirstSegmentNum onAddQueueItem;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final onManifestLoadCompleted onSetCaptioningEnabled;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final getStreamPositionUsForContent onPlayFromSearch;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final DashMediaSourceExternalSyntheticLambda0 onRewind;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final DashMediaSourceExternalSyntheticLambda1 onFastForward;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final onManifestLoadError onRemoveQueueItemAt;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final replaceManifestUri onRemoveQueueItem;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final onUtcTimestampLoadCompleted MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final isExplicit onSkipToQueueItem;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final newChunkExtractor MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final getFirstRepresentation MediaSessionCompatQueueItem;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final getSegmentUrl MediaMetadataCompat;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final getSegmentNum onSetShuffleMode;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private final loadSampleFormat AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private final loadManifest onSkipToPrevious;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private final getNowPeriodTimeUs AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private final resolveCacheKey onCommand;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private final loadInitializationData PlaybackStateCompat;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private final createFallbackOptions onMediaButtonEvent;

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private final DefaultDashChunkSourceFactory onSkipToNext;

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private final getRepresentations read;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private final updateSelectedBaseUrl RatingCompat;

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private final newMediaChunk MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<getIntervalUntilNextManifestRefreshMs<?>> ParcelableVolumeInfo;

    public parseOptionalStringAttr(getAvailableSegmentCount getavailablesegmentcount, getRepresentations getrepresentations, setCompositeSequenceableLoaderFactory setcompositesequenceableloaderfactory, setManifestParser setmanifestparser, onInitializationFailed oninitializationfailed, DashSegmentIndex dashSegmentIndex, onUtcTimestampLoadCompleted onutctimestamploadcompleted, onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, getNowPeriodTimeUs getnowperiodtimeus, loadSampleFormat loadsampleformat, newChunkExtractor newchunkextractor, getSegmentUrl getsegmenturl, updateSelectedBaseUrl updateselectedbaseurl, newMediaChunk newmediachunk, copyWithNewSelectedBaseUrl copywithnewselectedbaseurl, getFirstSegmentNum getfirstsegmentnum, isIndexExplicit isindexexplicit, onUtcTimestampResolved onutctimestampresolved, resolveUtcTimingElementHttp resolveutctimingelementhttp, resolveCacheKey resolvecachekey, DashMediaSourceExternalSyntheticLambda1 dashMediaSourceExternalSyntheticLambda1, processManifest processmanifest, createFallbackOptions createfallbackoptions, DashMediaSourceUtcTimestampCallback dashMediaSourceUtcTimestampCallback, newInitializationChunk newinitializationchunk, DashMediaSourceXsDateTimeParser dashMediaSourceXsDateTimeParser, getFirstAvailableSegmentNum getfirstavailablesegmentnum, scheduleManifestRefresh schedulemanifestrefresh, copyWithNewRepresentation copywithnewrepresentation, getStreamPositionUsForContent getstreampositionusforcontent, DashMediaSourceExternalSyntheticLambda0 dashMediaSourceExternalSyntheticLambda0, getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus, DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder, onManifestLoadError onmanifestloaderror, replaceManifestUri replacemanifesturi, onManifestLoadCompleted onmanifestloadcompleted, getSegmentNum getsegmentnum, loadNtpTimeOffset loadntptimeoffset, getLastAvailableSegmentNum getlastavailablesegmentnum, DashMediaSource1 dashMediaSource1, DefaultDashChunkSource defaultDashChunkSource, DefaultDashChunkSourceFactory defaultDashChunkSourceFactory, loadManifest loadmanifest, isExplicit isexplicit, DashMediaSourceManifestCallback dashMediaSourceManifestCallback, loadInitializationData loadinitializationdata, getFirstRepresentation getfirstrepresentation) {
        toMagicModuleMetaRepoModel.write(getavailablesegmentcount, "");
        toMagicModuleMetaRepoModel.write(getrepresentations, "");
        toMagicModuleMetaRepoModel.write(setcompositesequenceableloaderfactory, "");
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(dashSegmentIndex, "");
        toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        toMagicModuleMetaRepoModel.write(getnowperiodtimeus, "");
        toMagicModuleMetaRepoModel.write(loadsampleformat, "");
        toMagicModuleMetaRepoModel.write(newchunkextractor, "");
        toMagicModuleMetaRepoModel.write(getsegmenturl, "");
        toMagicModuleMetaRepoModel.write(updateselectedbaseurl, "");
        toMagicModuleMetaRepoModel.write(newmediachunk, "");
        toMagicModuleMetaRepoModel.write(copywithnewselectedbaseurl, "");
        toMagicModuleMetaRepoModel.write(getfirstsegmentnum, "");
        toMagicModuleMetaRepoModel.write(isindexexplicit, "");
        toMagicModuleMetaRepoModel.write(onutctimestampresolved, "");
        toMagicModuleMetaRepoModel.write(resolveutctimingelementhttp, "");
        toMagicModuleMetaRepoModel.write(resolvecachekey, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceExternalSyntheticLambda1, "");
        toMagicModuleMetaRepoModel.write(processmanifest, "");
        toMagicModuleMetaRepoModel.write(createfallbackoptions, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceUtcTimestampCallback, "");
        toMagicModuleMetaRepoModel.write(newinitializationchunk, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceXsDateTimeParser, "");
        toMagicModuleMetaRepoModel.write(getfirstavailablesegmentnum, "");
        toMagicModuleMetaRepoModel.write(schedulemanifestrefresh, "");
        toMagicModuleMetaRepoModel.write(copywithnewrepresentation, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(getadjustedwindowdefaultstartpositionus, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSourceRepresentationHolder, "");
        toMagicModuleMetaRepoModel.write(onmanifestloaderror, "");
        toMagicModuleMetaRepoModel.write(replacemanifesturi, "");
        toMagicModuleMetaRepoModel.write(onmanifestloadcompleted, "");
        toMagicModuleMetaRepoModel.write(getsegmentnum, "");
        toMagicModuleMetaRepoModel.write(loadntptimeoffset, "");
        toMagicModuleMetaRepoModel.write(getlastavailablesegmentnum, "");
        toMagicModuleMetaRepoModel.write(dashMediaSource1, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSource, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSourceFactory, "");
        toMagicModuleMetaRepoModel.write(loadmanifest, "");
        toMagicModuleMetaRepoModel.write(isexplicit, "");
        toMagicModuleMetaRepoModel.write(dashMediaSourceManifestCallback, "");
        toMagicModuleMetaRepoModel.write(loadinitializationdata, "");
        toMagicModuleMetaRepoModel.write(getfirstrepresentation, "");
        this.write = getavailablesegmentcount;
        this.read = getrepresentations;
        this.RemoteActionCompatParcelizer = setcompositesequenceableloaderfactory;
        this.IconCompatParcelizer = setmanifestparser;
        this.AudioAttributesCompatParcelizer = oninitializationfailed;
        this.MediaBrowserCompatCustomActionResultReceiver = dashSegmentIndex;
        this.MediaBrowserCompatItemReceiver = onutctimestamploadcompleted;
        this.AudioAttributesImplBaseParcelizer = ondashmanifestpublishtimeexpired;
        this.AudioAttributesImplApi26Parcelizer = getnowperiodtimeus;
        this.AudioAttributesImplApi21Parcelizer = loadsampleformat;
        this.MediaBrowserCompatMediaItem = newchunkextractor;
        this.MediaMetadataCompat = getsegmenturl;
        this.RatingCompat = updateselectedbaseurl;
        this.MediaBrowserCompatSearchResultReceiver = newmediachunk;
        this.MediaDescriptionCompat = copywithnewselectedbaseurl;
        this.onAddQueueItem = getfirstsegmentnum;
        this.onCustomAction = isindexexplicit;
        this.handleMediaPlayPauseIfPendingOnHandler = onutctimestampresolved;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = resolveutctimingelementhttp;
        this.onCommand = resolvecachekey;
        this.onFastForward = dashMediaSourceExternalSyntheticLambda1;
        this.onPlayFromMediaId = processmanifest;
        this.onMediaButtonEvent = createfallbackoptions;
        this.onPlay = dashMediaSourceUtcTimestampCallback;
        this.onPause = newinitializationchunk;
        this.onPrepare = dashMediaSourceXsDateTimeParser;
        this.onPrepareFromSearch = getfirstavailablesegmentnum;
        this.onPrepareFromMediaId = schedulemanifestrefresh;
        this.onPlayFromUri = copywithnewrepresentation;
        this.onPlayFromSearch = getstreampositionusforcontent;
        this.onRewind = dashMediaSourceExternalSyntheticLambda0;
        this.onPrepareFromUri = getadjustedwindowdefaultstartpositionus;
        this.onSeekTo = defaultDashChunkSourceRepresentationHolder;
        this.onRemoveQueueItemAt = onmanifestloaderror;
        this.onRemoveQueueItem = replacemanifesturi;
        this.onSetCaptioningEnabled = onmanifestloadcompleted;
        this.onSetShuffleMode = getsegmentnum;
        this.onSetPlaybackSpeed = loadntptimeoffset;
        this.onSetRepeatMode = getlastavailablesegmentnum;
        this.onSetRating = dashMediaSource1;
        this.onStop = defaultDashChunkSource;
        this.onSkipToNext = defaultDashChunkSourceFactory;
        this.onSkipToPrevious = loadmanifest;
        this.onSkipToQueueItem = isexplicit;
        this.setSessionImpl = dashMediaSourceManifestCallback;
        this.PlaybackStateCompat = loadinitializationdata;
        this.MediaSessionCompatQueueItem = getfirstrepresentation;
        this.ParcelableVolumeInfo = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getIntervalUntilNextManifestRefreshMs[]{getsegmenturl, ondashmanifestpublishtimeexpired, onutctimestamploadcompleted, getnowperiodtimeus, setcompositesequenceableloaderfactory, getfirstsegmentnum, setmanifestparser, oninitializationfailed, dashSegmentIndex, newchunkextractor, updateselectedbaseurl, copywithnewselectedbaseurl, getavailablesegmentcount, newmediachunk, getrepresentations, isindexexplicit, onutctimestampresolved, resolveutctimingelementhttp, processmanifest, resolvecachekey, dashMediaSourceExternalSyntheticLambda1, createfallbackoptions, dashMediaSourceUtcTimestampCallback, loadsampleformat, newinitializationchunk, dashMediaSourceXsDateTimeParser, getfirstavailablesegmentnum, schedulemanifestrefresh, copywithnewrepresentation, dashMediaSourceExternalSyntheticLambda0, getadjustedwindowdefaultstartpositionus, defaultDashChunkSourceRepresentationHolder, onmanifestloaderror, replacemanifesturi, onmanifestloadcompleted, getsegmentnum, loadntptimeoffset, getlastavailablesegmentnum, dashMediaSource1, defaultDashChunkSource, defaultDashChunkSourceFactory, loadmanifest, isexplicit, dashMediaSourceManifestCallback, loadinitializationdata, getfirstrepresentation});
        this.MediaSessionCompatResultReceiverWrapper = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new getIntervalUntilNextManifestRefreshMs[]{getsegmenturl, ondashmanifestpublishtimeexpired, onutctimestamploadcompleted, getnowperiodtimeus, setcompositesequenceableloaderfactory, getfirstsegmentnum, setmanifestparser, dashSegmentIndex, newchunkextractor, isindexexplicit, resolvecachekey, dashMediaSourceExternalSyntheticLambda1, createfallbackoptions, dashMediaSourceXsDateTimeParser, getfirstavailablesegmentnum, dashMediaSourceExternalSyntheticLambda0, getadjustedwindowdefaultstartpositionus, updateselectedbaseurl, defaultDashChunkSourceRepresentationHolder, onmanifestloaderror, replacemanifesturi, onmanifestloadcompleted, loadntptimeoffset, getlastavailablesegmentnum, dashMediaSource1, defaultDashChunkSource, defaultDashChunkSourceFactory, loadmanifest, isexplicit, dashMediaSourceManifestCallback, loadinitializationdata, getfirstrepresentation});
    }

    public final void AudioAttributesCompatParcelizer(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setSessionImpl(p0);
        IconCompatParcelizer(p0);
    }

    private final void setSessionImpl(SQLiteDatabase p0) {
        Iterator<getIntervalUntilNextManifestRefreshMs<?>> it = this.ParcelableVolumeInfo.iterator();
        while (it.hasNext()) {
            p0.execSQL(it.next().AudioAttributesImplApi21Parcelizer());
        }
    }

    public final void IconCompatParcelizer(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Iterator<getIntervalUntilNextManifestRefreshMs<?>> it = this.ParcelableVolumeInfo.iterator();
        while (it.hasNext()) {
            p0.execSQL(it.next().AudioAttributesImplBaseParcelizer());
        }
    }

    public final void read() {
        Iterator<getIntervalUntilNextManifestRefreshMs<?>> it = this.ParcelableVolumeInfo.iterator();
        while (it.hasNext()) {
            it.next().ah_();
        }
    }

    public final void write() {
        Iterator<getIntervalUntilNextManifestRefreshMs<?>> it = this.MediaSessionCompatResultReceiverWrapper.iterator();
        while (it.hasNext()) {
            it.next().ah_();
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.onPause.ah_();
        this.AudioAttributesImplApi21Parcelizer.ah_();
        this.MediaDescriptionCompat.ah_();
        this.onMediaButtonEvent.ah_();
        this.onPlayFromMediaId.ah_();
        this.MediaDescriptionCompat.ah_();
        this.AudioAttributesImplApi21Parcelizer.ah_();
        this.onPlay.ah_();
        this.onAddQueueItem.ah_();
        this.onSkipToNext.ah_();
        this.onSkipToQueueItem.ah_();
    }

    public final void RemoteActionCompatParcelizer() {
        this.MediaBrowserCompatSearchResultReceiver.ah_();
    }

    private static void AudioAttributesCompatParcelizer(SQLiteDatabase p0, String p1) {
        try {
            p0.execSQL(p1);
        } catch (SQLiteException e) {
            buildResolutionString.IconCompatParcelizer("MIGRATION_EXCEPTION", e.getLocalizedMessage());
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.onAddQueueItem.ah_();
    }

    public final void MediaBrowserCompatItemReceiver() {
        this.onSkipToQueueItem.ah_();
    }

    public final String[] AudioAttributesImplBaseParcelizer() {
        ArrayList arrayList = new ArrayList();
        for (getIntervalUntilNextManifestRefreshMs<?> getintervaluntilnextmanifestrefreshms : this.ParcelableVolumeInfo) {
            if (getintervaluntilnextmanifestrefreshms.MediaBrowserCompatMediaItem()) {
                arrayList.add(getintervaluntilnextmanifestrefreshms.AudioAttributesImplApi26Parcelizer());
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void write(int p0) throws Throwable {
        MagicModuleMetaLSModel magicModuleMetaLSModelPlaybackStateCompatCustomAction;
        if (p0 <= 0 || p0 < 65) {
            return;
        }
        if (p0 < 66) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        }
        if (p0 < 67) {
            this.MediaMetadataCompat.ah_();
            getStreamPositionUsForContent getstreampositionusforcontent = this.onPlayFromSearch;
            getstreampositionusforcontent.read(getstreampositionusforcontent.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
            this.onPlayFromSearch.RemoteActionCompatParcelizer("last_firebase_config_sync_2", 0L);
        }
        if (p0 < 74) {
            getStreamPositionUsForContent getstreampositionusforcontent2 = this.onPlayFromSearch;
            getstreampositionusforcontent2.read(getstreampositionusforcontent2.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer2 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
            this.onPlayFromSearch.RemoteActionCompatParcelizer("last_firebase_config_sync_2", 0L);
            this.onPlayFromSearch.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (p0 < 75) {
            getStreamPositionUsForContent getstreampositionusforcontent3 = this.onPlayFromSearch;
            getstreampositionusforcontent3.read(getstreampositionusforcontent3.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer3 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
            this.onPlayFromSearch.RemoteActionCompatParcelizer("last_firebase_config_sync_2", 0L);
            this.onPlayFromSearch.MediaBrowserCompatCustomActionResultReceiver();
        }
        if (p0 < 76) {
            this.onSetPlaybackSpeed.read("schema", true);
            getStreamPositionUsForContent getstreampositionusforcontent4 = this.onPlayFromSearch;
            getstreampositionusforcontent4.read(getstreampositionusforcontent4.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer4 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
        }
        if (p0 < 80) {
            getStreamPositionUsForContent getstreampositionusforcontent5 = this.onPlayFromSearch;
            getstreampositionusforcontent5.read(getstreampositionusforcontent5.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer5 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
        }
        if (p0 < 82 && (magicModuleMetaLSModelPlaybackStateCompatCustomAction = this.onPlayFromSearch.PlaybackStateCompatCustomAction()) != null && magicModuleMetaLSModelPlaybackStateCompatCustomAction.getStatus() == 0) {
            this.onPlayFromSearch.RemoteActionCompatParcelizer("smart_recall_download_time", System.currentTimeMillis());
        }
        if (p0 < 83) {
            MediaMetadataCompat();
        }
        if (p0 < 84) {
            this.onPause.ah_();
        }
        if (p0 < 85) {
            this.onPause.ah_();
        }
        if (p0 < 88) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        }
        if (p0 < 89) {
            getStreamPositionUsForContent getstreampositionusforcontent6 = this.onPlayFromSearch;
            getstreampositionusforcontent6.read(getstreampositionusforcontent6.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            this.onPlayFromSearch.onMediaButtonEvent();
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer6 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
        }
        if (p0 < 91) {
            this.onSkipToPrevious.ah_();
        }
        if (p0 < 92) {
            this.write.IconCompatParcelizer("pearl_search_tip_shown");
            this.write.IconCompatParcelizer("is_mcq_intro_dialog");
        }
        if (p0 < 93) {
            MediaMetadataCompat();
        }
        if (p0 < 94) {
            MediaMetadataCompat();
        }
        if (p0 < 95) {
            this.onSetPlaybackSpeed.read(PageValue.PAGE_VALUE_LESSON, false);
            getStreamPositionUsForContent getstreampositionusforcontent7 = this.onPlayFromSearch;
            getstreampositionusforcontent7.read(getstreampositionusforcontent7.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer7 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
        }
        if (p0 < 96) {
            MediaMetadataCompat();
        }
        if (p0 < 98) {
            this.onSetPlaybackSpeed.read("subject", false);
            this.MediaMetadataCompat.ah_();
            MediaMetadataCompat();
        }
        if (p0 < 99) {
            MediaMetadataCompat();
        }
        if (p0 < 103) {
            MediaMetadataCompat();
        }
        if (p0 < 104) {
            MediaMetadataCompat();
        }
        if (p0 < 105) {
            MediaMetadataCompat();
        }
        if (p0 < 106) {
            getAvailableSegmentCount getavailablesegmentcount = this.write;
            String str = buildRoleString.RemoteActionCompatParcelizer.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            String strAudioAttributesImplBaseParcelizer = getavailablesegmentcount.AudioAttributesImplBaseParcelizer("theme_selected_v2", str);
            setItemVerticalPaddingResource setitemverticalpaddingresource = setItemVerticalPaddingResource.INSTANCE;
            AppTheme appTheme = setItemVerticalPaddingResource.read(strAudioAttributesImplBaseParcelizer);
            setItemVerticalPaddingResource setitemverticalpaddingresource2 = setItemVerticalPaddingResource.INSTANCE;
            boolean zRemoteActionCompatParcelizer = setItemVerticalPaddingResource.RemoteActionCompatParcelizer(strAudioAttributesImplBaseParcelizer);
            this.onPlayFromSearch.handleMediaPlayPauseIfPendingOnHandler(appTheme.getRead());
            this.onPlayFromSearch.MediaDescriptionCompat(zRemoteActionCompatParcelizer);
            this.write.IconCompatParcelizer("theme_selected_v2");
            this.MediaMetadataCompat.ah_();
            this.onSetPlaybackSpeed.read("subject", false);
            getStreamPositionUsForContent getstreampositionusforcontent8 = this.onPlayFromSearch;
            getstreampositionusforcontent8.read(getstreampositionusforcontent8.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer8 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
            Context baseContext = TrainingApplication.read().getBaseContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(baseContext, "");
            setItemVerticalPaddingResource.RemoteActionCompatParcelizer(baseContext, appTheme, zRemoteActionCompatParcelizer);
        }
        if (p0 < 107) {
            TrainingApplication trainingApplication = TrainingApplication.read();
            withNewAdGroup.Companion remoteActionCompatParcelizer = withNewAdGroup.INSTANCE;
            toMagicModuleMetaRepoModel.write(trainingApplication);
            long jIconCompatParcelizer = withNewAdGroup.Companion.IconCompatParcelizer(trainingApplication);
            String strMediaBrowserCompatItemReceiver = this.onPlayFromSearch.MediaBrowserCompatItemReceiver();
            if (strMediaBrowserCompatItemReceiver == null) {
                strMediaBrowserCompatItemReceiver = "";
            }
            String strAudioAttributesImplBaseParcelizer2 = this.onPlayFromSearch.AudioAttributesImplBaseParcelizer();
            String str2 = strAudioAttributesImplBaseParcelizer2 != null ? strAudioAttributesImplBaseParcelizer2 : "";
            getError_types geterror_types = getError_types.INSTANCE;
            this.onPlayFromSearch.IconCompatParcelizer("access_token", getError_types.IconCompatParcelizer(str2, strMediaBrowserCompatItemReceiver, jIconCompatParcelizer));
        }
        if (p0 < 108) {
            this.onSetPlaybackSpeed.read(PageValue.PAGE_VALUE_LESSON, false);
            getStreamPositionUsForContent getstreampositionusforcontent9 = this.onPlayFromSearch;
            getstreampositionusforcontent9.read(getstreampositionusforcontent9.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer9 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
        }
        if (p0 < 109) {
            MediaMetadataCompat();
        }
        if (p0 < 110) {
            this.onSetPlaybackSpeed.read(PageValue.PAGE_VALUE_LESSON, false);
            MediaMetadataCompat();
        }
        if (p0 < 113) {
            MediaMetadataCompat();
        }
        if (p0 < 114) {
            this.onPlayFromSearch.RemoteActionCompatParcelizer(false);
        }
        if (p0 < 115) {
            RatingCompat();
            MediaMetadataCompat();
        }
        if (p0 < 116) {
            this.MediaMetadataCompat.ah_();
            this.onSetPlaybackSpeed.read("subject", false);
            getStreamPositionUsForContent getstreampositionusforcontent10 = this.onPlayFromSearch;
            getstreampositionusforcontent10.read(getstreampositionusforcontent10.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer10 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
        }
        if (p0 < 117) {
            this.MediaMetadataCompat.ah_();
            this.onSetPlaybackSpeed.read("subject", false);
            MediaMetadataCompat();
        }
        if (p0 < 118) {
            MediaMetadataCompat();
        }
        if (p0 < 119) {
            this.MediaBrowserCompatSearchResultReceiver.read(this.onPlayFromSearch.onRemoveQueueItem());
            this.RatingCompat.ah_();
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
            this.onSetPlaybackSpeed.read(PageValue.PAGE_VALUE_LESSON, false);
            getStreamPositionUsForContent getstreampositionusforcontent11 = this.onPlayFromSearch;
            getstreampositionusforcontent11.read(getstreampositionusforcontent11.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer11 = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
            MediaMetadataCompat();
        }
    }

    private void RatingCompat() {
        this.MediaBrowserCompatCustomActionResultReceiver.ah_();
        this.onPrepareFromSearch.ah_();
        this.onPrepare.ah_();
        this.onSetPlaybackSpeed.read("pearl", true);
        this.onSetPlaybackSpeed.read(PageValue.PAGE_VALUE_PEARL_BOOKMARKS, true);
    }

    private void MediaMetadataCompat() {
        getStreamPositionUsForContent getstreampositionusforcontent = this.onPlayFromSearch;
        getstreampositionusforcontent.read(getstreampositionusforcontent.onRemoveQueueItem(), this.onPlayFromSearch.onPrepareFromUri(), false);
        this.onPlayFromSearch.MediaBrowserCompatCustomActionResultReceiver();
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
        BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.ah_();
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.ah_();
        this.AudioAttributesCompatParcelizer.ah_();
    }

    public static void MediaBrowserCompatMediaItem(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL(Companion.IconCompatParcelizer("_step", "video_aspect", SessionDescription.SUPPORTED_SDP_VERSION));
    }

    public static void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _subject_image_attribution (subject_id TEXT, edition TEXT, image_attribution_link TEXT NOT NULL)");
    }

    public static void onCommand(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL(Companion.RemoteActionCompatParcelizer(CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "_res_params"));
        p0.execSQL(Companion.RemoteActionCompatParcelizer(CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "warning_msg"));
        Companion.RemoteActionCompatParcelizer("video_usage");
    }

    public static void MediaBrowserCompatCustomActionResultReceiver() {
        Companion.RemoteActionCompatParcelizer("home_cache");
    }

    public static void handleMediaPlayPauseIfPendingOnHandler(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL(Companion.RemoteActionCompatParcelizer("video_usage"));
        p0.execSQL(Companion.RemoteActionCompatParcelizer("home_cache"));
        p0.execSQL(Companion.RemoteActionCompatParcelizer("test_subject_percentile"));
    }

    public static void onAddQueueItem(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "test_name"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "owner_category"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "is_expired"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        AudioAttributesCompatParcelizer(p0, str3);
    }

    public static void onCustomAction(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS pagination_table (id TEXT, next_url TEXT)");
        p0.execSQL(Companion.RemoteActionCompatParcelizer("_search"));
        p0.execSQL("CREATE TABLE _search (content_id TEXT PRIMARY KEY NOT NULL,sub_content_id TEXT,content_type TEXT,content_title TEXT,sub_title TEXT,desc_text TEXT,vid_start_time INTEGER,hit_count INTEGER,last_updated INTEGER)");
    }

    public static void onPlayFromMediaId(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "module_msg"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
    }

    public static void onPlay(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", Arrays.copyOf(new Object[]{"video_ci", "vd_type", 10}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
    }

    public static void onFastForward(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("DROP TABLE IF EXISTS _schema");
        p0.execSQL("DROP TABLE IF EXISTS _schema_status");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _schema (_id TEXT PRIMARY KEY NOT NULL, is_hyt INTEGER, published_status TEXT, last_updated INTERGER, title TEXT, is_server_updated INTEGER, mcq_count INTEGER)");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _schema_status (schema_id TEXT PRIMARY KEY NOT NULL, since_id TEXT, correctness INTEGER, mcq_count INTEGER, completeness INTEGER, attempted INTEGER, last_updated INTEGER, correct INTEGER, wrong INTEGER)");
    }

    public static void onMediaButtonEvent(SQLiteDatabase p0) {
        Integer num;
        Integer num2;
        Integer num3;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "pyt_mcq_count"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        p0.execSQL("CREATE TABLE IF NOT EXISTS video_timeline_pyt_mapping_table (timeline_id TEXT NOT NULL, pyt_mcq_id TEXT NOT NULL)");
        HashMap map = new HashMap();
        Cursor cursorRawQuery = p0.rawQuery("SELECT _key, _value FROM _preference WHERE _key IN ('key_course_id', 'current_edition', 'default_edition_key')", null);
        if (cursorRawQuery == null) {
            return;
        }
        Cursor cursor = cursorRawQuery;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToFirst()) {
                do {
                    map.put(cursor2.getString(0), Integer.valueOf(cursor2.getInt(1)));
                } while (cursor2.moveToNext());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, null);
            int iIntValue = (!map.containsKey("key_course_id") || (num3 = (Integer) map.get("key_course_id")) == null) ? 1 : num3.intValue();
            int iIntValue2 = 6;
            int iIntValue3 = (!map.containsKey("current_edition") || (num2 = (Integer) map.get("current_edition")) == null) ? 6 : num2.intValue();
            if (map.containsKey("default_edition_key") && (num = (Integer) map.get("default_edition_key")) != null) {
                iIntValue2 = num.intValue();
            }
            String strConcat = PageValue.PAGE_VALUE_LESSON.concat(String.valueOf(iIntValue2));
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
            String str2 = String.format("DELETE FROM pagination_table where id = '%s'", Arrays.copyOf(new Object[]{strConcat}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            p0.execSQL(str2);
            StringBuilder sb = new StringBuilder("edition_sync_done_v2_");
            sb.append(iIntValue);
            sb.append("_");
            sb.append(iIntValue3);
            String string = sb.toString();
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
            String str3 = String.format("UPDATE _preference SET _value = 'false' WHERE _key = '%s'", Arrays.copyOf(new Object[]{string}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            p0.execSQL(str3);
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion audioAttributesCompatParcelizer = BandwidthMeterEventListenerEventDispatcherHandlerAndListener.INSTANCE;
            BandwidthMeterEventListenerEventDispatcherHandlerAndListener.Companion.RemoteActionCompatParcelizer();
        } finally {
        }
    }

    public static void onPrepareFromSearch(SQLiteDatabase p0) {
        Cursor cursor;
        Throwable th;
        Cursor cursor2;
        String string;
        String string2;
        String string3;
        String str;
        String string4;
        String str2 = "mbbs";
        String str3 = LoggedUserResponse.KEY_KYC_FAILURE_COUNT;
        toMagicModuleMetaRepoModel.write(p0, "");
        Context baseContext = TrainingApplication.read().getBaseContext();
        toMagicModuleMetaRepoModel.write(baseContext);
        SharedPreferences.Editor editorEdit = embeddedEmsgTrack.AudioAttributesCompatParcelizer(baseContext).edit();
        Cursor cursorRawQuery = p0.rawQuery("SELECT * FROM _preference", null);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cursorRawQuery, "");
        Cursor cursor3 = cursorRawQuery;
        try {
            Cursor cursor4 = cursor3;
            while (cursor4.moveToNext()) {
                String str4 = str2;
                String string5 = cursor4.getString(0);
                String str5 = str3;
                String string6 = cursor4.getString(1);
                if (string6 == null) {
                    string6 = "";
                }
                editorEdit.putString(string5, string6);
                str2 = str4;
                str3 = str5;
            }
            String str6 = str2;
            String str7 = str3;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            MagicModuleMetaLSModel.IconCompatParcelizer(cursor3, null);
            Cursor cursorRawQuery2 = p0.rawQuery("SELECT * FROM user", null);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cursorRawQuery2, "");
            Cursor cursor5 = cursorRawQuery2;
            try {
                Cursor cursor6 = cursor5;
                if (cursor6.moveToFirst()) {
                    try {
                        string = cursor6.getString(cursor6.getColumnIndex("user_id"));
                        string2 = cursor6.getString(cursor6.getColumnIndex("firstname"));
                        if (string2 == null) {
                            string2 = "";
                        }
                        string3 = cursor6.getString(cursor6.getColumnIndex("lastname"));
                        if (string3 == null) {
                            string3 = "";
                            str = string3;
                        } else {
                            str = "";
                        }
                        string4 = cursor6.getString(cursor6.getColumnIndex(LoggedUserResponse.KEY_PROFESSION));
                        cursor2 = cursor5;
                        if (string4 == null) {
                            string4 = str;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor5;
                        cursor = cursor2;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            MagicModuleMetaLSModel.IconCompatParcelizer(cursor, th);
                            throw th3;
                        }
                    }
                    try {
                        String string7 = cursor6.getString(cursor6.getColumnIndex(LoggedUserResponse.KEY_SPECIALTY));
                        if (string7 == null) {
                            string7 = str;
                        }
                        String string8 = cursor6.getString(cursor6.getColumnIndex(LoggedUserResponse.KEY_EDUCATION));
                        if (string8 == null) {
                            string8 = str;
                        }
                        String string9 = cursor6.getString(cursor6.getColumnIndex("phone_number"));
                        if (string9 == null) {
                            string9 = str;
                        }
                        String string10 = cursor6.getString(cursor6.getColumnIndex("profile_pic"));
                        if (string10 == null) {
                            string10 = str;
                        }
                        int i = cursor6.getInt(cursor6.getColumnIndex(LoggedUserResponse.KEY_KYC_STATUS));
                        int i2 = cursor6.getInt(cursor6.getColumnIndex(str7));
                        String string11 = cursor6.getString(cursor6.getColumnIndex(str6));
                        if (string11 == null) {
                            string11 = str;
                        }
                        long j = cursor6.getLong(cursor6.getColumnIndex(LoggedUserResponse.KEY_CREATED_ON));
                        editorEdit.putString("user_id", string);
                        editorEdit.putString("firstname", string2);
                        editorEdit.putString("lastname", string3);
                        editorEdit.putString(LoggedUserResponse.KEY_PROFESSION, string4);
                        editorEdit.putString(LoggedUserResponse.KEY_SPECIALTY, string7);
                        editorEdit.putString(LoggedUserResponse.KEY_EDUCATION, string8);
                        editorEdit.putString("phone_number", string9);
                        editorEdit.putString("profile_pic", string10);
                        editorEdit.putInt(LoggedUserResponse.KEY_KYC_STATUS, i);
                        editorEdit.putInt(str7, i2);
                        editorEdit.putString(str6, string11);
                        editorEdit.putLong("created_on_v2", j);
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = cursor2;
                        th = th;
                        throw th;
                    }
                } else {
                    cursor2 = cursor5;
                }
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                MagicModuleMetaLSModel.IconCompatParcelizer(cursor2, null);
                editorEdit.apply();
            } catch (Throwable th5) {
                th = th5;
                cursor = cursor5;
            }
        } finally {
        }
    }

    public static void onPlayFromUri(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("DROP TABLE IF EXISTS _subject");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _subject (course_id INTEGER, _id TEXT PRIMARY KEY NOT NULL, title TEXT, image_url TEXT, lesson_count INTEGER, last_updated INTEGER, sort_order INTEGER, published_status TEXT, parent_id TEXT, do_not_consider INTEGER, qbank_dynamics_last_updated INTEGER, video_dynamics_last_updated INTEGER, editor_info TEXT, last_opened INTEGER, category INTEGER)");
        p0.execSQL("DELETE FROM pagination_table WHERE id = 'subject'");
    }

    public static void onPrepareFromMediaId(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "expired_on"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "start_datetime"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
    }

    public static void onPlayFromSearch(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("DELETE FROM _test");
        p0.execSQL("ALTER TABLE _test ADD COLUMN is_mock_test INTEGER");
        p0.execSQL("ALTER TABLE _test ADD COLUMN max_mcq_count INTEGER");
        p0.execSQL("DELETE FROM pagination_table WHERE id = 'test'");
        p0.execSQL("ALTER TABLE _subscription ADD COLUMN started_on INTEGER");
        p0.execSQL("UPDATE _preference SET _value = '-1' WHERE _key = 'course_version_server'");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{LogSubCategory.Action.USER, LoggedUserResponse.KEY_MBBS}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        p0.execSQL("UPDATE user SET college_details = mbbs");
        Context baseContext = TrainingApplication.read().getBaseContext();
        toMagicModuleMetaRepoModel.write(baseContext);
        SharedPreferences sharedPreferencesAudioAttributesCompatParcelizer = embeddedEmsgTrack.AudioAttributesCompatParcelizer(baseContext);
        String string = sharedPreferencesAudioAttributesCompatParcelizer.getString("mbbs", "");
        if (string != null && !TestGroupLSModel.IconCompatParcelizer((CharSequence) string)) {
            SharedPreferences.Editor editorEdit = sharedPreferencesAudioAttributesCompatParcelizer.edit();
            editorEdit.putString(LoggedUserResponse.KEY_MBBS, sharedPreferencesAudioAttributesCompatParcelizer.getString("mbbs", ""));
            editorEdit.apply();
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferencesAudioAttributesCompatParcelizer.edit();
        editorEdit2.putString("course_version_server", TestIndex.ALL_INDIA_ID);
        editorEdit2.apply();
    }

    public static void onRemoveQueueItemAt(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _smart_recall_timeline (_id TEXT PRIMARY KEY NOT NULL, title TEXT NOT NULL, correct_count INTEGER NOT NULL, mcq_count INTEGER NOT NULL, submitted_on INTEGER NOT NULL)");
    }

    public static void onRewind(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("ALTER TABLE video_lic_info ADD COLUMN _qh TEXT");
    }

    public static void onSeekTo(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS interactive_video_element_table (_id TEXT PRIMARY KEY NOT NULL, lesson_id TEXT NOT NULL, start_time INTEGER NOT NULL, end_time INTEGER NOT NULL, answer TEXT NOT NULL)");
    }

    public static void onRemoveQueueItem(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("ALTER TABLE video_ci ADD COLUMN ds_id TEXT");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _vi_conf (_id TEXT PRIMARY KEY NOT NULL, _conf TEXT)");
    }

    public static void onPrepareFromUri(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _test_group (_id TEXT NOT NULL, parent_id TEXT NOT NULL, name TEXT NOT NULL, question_count INTEGER NOT NULL, section_time INTEGER NOT NULL, type INTEGER NOT NULL, cut_off_time INTEGER NOT NULL)");
    }

    public static void onSetShuffleMode(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(p0, "ALTER TABLE lesson ADD COLUMN active_new INTEGER");
        AudioAttributesCompatParcelizer(p0, "ALTER TABLE lesson ADD COLUMN new_expiry INTEGER");
    }

    public static void onSetCaptioningEnabled(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"mcq_questions", "image_url_v2"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
    }

    public static void onSetRating(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "exam_duration_seconds"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CourseConfigKeyConstantsKt.KEY_CUSTOM_MODULE, "exam_started_on"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
    }

    public static void onSetPlaybackSpeed(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{"_subject", "group_id"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{"_subject", "is_interactive"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
    }

    public static void onSetRepeatMode(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _subject_intro_skip (subject_id TEXT PRIMARY KEY, skipped_intro_count INTEGER)");
    }

    public static void onSkipToQueueItem(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            p0.execSQL("DROP TABLE IF EXISTS job");
        } catch (SQLiteException unused) {
        }
    }

    public static void read(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"_test", TestIndex.KEY_TEST_LAST_VISITED_MCQ_ID}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
    }

    public static void RemoteActionCompatParcelizer(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{"_test_group", "section_skipped_timestamp"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{"_test", "modified_end_datetime"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
    }

    public static void write(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "has_active_recall", 0}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        p0.execSQL("CREATE TABLE IF NOT EXISTS active_recall (active_recall_lesson_id TEXT PRIMARY KEY NOT NULL,mcq_count INTEGER,status INTEGER,score INTEGER,possible_score INTEGER,submitted_on INTEGER, last_attempted_time_ms INTEGER, is_server_content_updated INTEGER)");
    }

    public static void AudioAttributesImplApi26Parcelizer(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("DROP TABLE IF EXISTS active_recall");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "lesson_type", 0}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "ar_qbank_id"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
    }

    public static void AudioAttributesImplApi21Parcelizer(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"video_lic_info", "_lvst"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"video_lic_info", "_lvbt"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"video_lic_info", "_lest"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        AudioAttributesCompatParcelizer(p0, str3);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"video_lic_info", "_lebt"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        AudioAttributesCompatParcelizer(p0, str4);
    }

    public static void MediaBrowserCompatItemReceiver(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", Arrays.copyOf(new Object[]{"video_ci", "theme_state", Integer.valueOf(ThemeState.LIGHT_SINGLE.getValue())}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
    }

    public static void MediaBrowserCompatCustomActionResultReceiver(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS mcq_timer_analytics (\n    test_id TEXT NOT NULL,\n    mcq_id TEXT NOT NULL,\n    first_attempt_time INTEGER,\n    change_answer_time INTEGER,\n    review_time INTEGER,\n    has_been_answered INTEGER,\n    PRIMARY KEY (test_id, mcq_id)\n)");
    }

    public static void AudioAttributesImplBaseParcelizer(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"_pearl", PearlMini.KEY_THUMBNAIL_V2}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
    }

    public static void RatingCompat(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS suggested_subject (course_id INTEGER, parent_subject_id TEXT, subject_id TEXT, criterion TEXT)");
    }

    public static void MediaDescriptionCompat(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.execSQL("CREATE TABLE IF NOT EXISTS _subject_updated_status (subject_id TEXT PRIMARY KEY NOT NULL, is_active INTEGER NOT NULL, expires_on INTEGER NOT NULL, active_edition INTEGER NOT NULL)");
    }

    public static void MediaMetadataCompat(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", Arrays.copyOf(new Object[]{"video_ci", FilterParams.KEY_COURSE_ID, 0}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        AudioAttributesCompatParcelizer(p0, str);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "tag_type"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        AudioAttributesCompatParcelizer(p0, str2);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
        String str3 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "tag_active"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
        AudioAttributesCompatParcelizer(p0, str3);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
        String str4 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "tag_expiry"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
        AudioAttributesCompatParcelizer(p0, str4);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
        String str5 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "tag_label"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
        AudioAttributesCompatParcelizer(p0, str5);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
        String str6 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "tag_active"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
        AudioAttributesCompatParcelizer(p0, str6);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel7 = toMagicModuleStatusUcModel.INSTANCE;
        String str7 = String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "tag_expiry"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str7, "");
        AudioAttributesCompatParcelizer(p0, str7);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel8 = toMagicModuleStatusUcModel.INSTANCE;
        String str8 = String.format("ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{"video_bookmark_timeline", "tag_label"}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str8, "");
        AudioAttributesCompatParcelizer(p0, str8);
    }

    public static void MediaBrowserCompatSearchResultReceiver(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            for (String str : IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"UPDATE video_ci SET vd_type = 10 WHERE vd_type = 0", "UPDATE video_ci SET vd_type = 20 WHERE vd_type = 1", "UPDATE video_ci SET vd_type = 30 WHERE zd_version_code = 200"})) {
                StringBuilder sb = new StringBuilder();
                sb.append("Migrate 119 to 120 : ");
                sb.append(str);
                buildResolutionString.IconCompatParcelizer("DB_UPDATE", sb.toString());
                p0.execSQL(str);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("INSERT INTO video_ci_new (_id, _dp, downloading_pixel_rate, _last_updated, download_start, reference_id, d_status, _last_queued, e_s_t, vd_type, ds_id, theme_state, course_id) SELECT _id, _dp, downloading_pixel_rate, _last_updated, download_start, reference_id, d_status, _last_queued, e_s_t, vd_type, ds_id, theme_state, course_id");
            sb2.append(" FROM video_ci WHERE _id IS NOT NULL");
            for (String str2 : IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"DROP TABLE IF EXISTS video_ci_new", "CREATE TABLE video_ci_new (_id TEXT PRIMARY KEY NOT NULL, _dp REAL, downloading_pixel_rate INTEGER, _last_updated INTEGER, download_start INTEGER, reference_id     \n  TEXT, d_status INTEGER, _last_queued INTEGER, e_s_t TEXT, vd_type INTEGER, ds_id TEXT, theme_state INTEGER, course_id INTEGER DEFAULT 0) ", sb2.toString(), "DROP TABLE IF EXISTS video_ci", "ALTER TABLE video_ci_new RENAME TO video_ci"})) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Migrate 119 to 120 : ");
                sb3.append(str2);
                buildResolutionString.IconCompatParcelizer("DB_UPDATE", sb3.toString());
                p0.execSQL(str2);
            }
        } catch (Exception e) {
            getExternalPeriodUid.Companion companion = getExternalPeriodUid.INSTANCE;
            getExternalPeriodUid.Companion.read(e, null, 6);
        }
    }

    /* JADX INFO: renamed from: o.parseOptionalStringAttr$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\f"}, d2 = {"Lo/parseOptionalStringAttr$read;", "", "<init>", "()V", "", "p0", "p1", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "p2", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String RemoteActionCompatParcelizer(String p0, String p1) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.getDefault(), "ALTER TABLE %s ADD COLUMN %s TEXT", Arrays.copyOf(new Object[]{p0, p1}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String IconCompatParcelizer(String p0, String p1, String p2) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.getDefault(), "ALTER TABLE %s ADD COLUMN %s REAL DEFAULT %s", Arrays.copyOf(new Object[]{p0, p1, p2}, 3));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String RemoteActionCompatParcelizer(String p0) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.getDefault(), "DROP TABLE IF EXISTS %s", Arrays.copyOf(new Object[]{p0}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static void onPause(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    public static void onPrepare(SQLiteDatabase p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }
}
