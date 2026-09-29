package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import in.juspay.hyper.constants.LogCategory;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\bæ\u0001ç\u0001è\u0001é\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010'\u001a\u00020\u001e\"\u0004\b\u0000\u0010(2\b\u0010)\u001a\u0004\u0018\u0001H(2\b\u0010*\u001a\u0004\u0018\u0001H(H\u0007¢\u0006\u0002\u0010+J7\u0010,\u001a\u0012\u0012\u0004\u0012\u0002H(0-j\b\u0012\u0004\u0012\u0002H(`.\"\u0004\b\u0000\u0010(2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002H(00\"\u0002H(H\u0007¢\u0006\u0002\u00101J-\u00102\u001a\b\u0012\u0004\u0012\u0002H(03\"\u0004\b\u0000\u0010(2\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002H(00\"\u0002H(H\u0007¢\u0006\u0002\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u00182\u0006\u00107\u001a\u00020\u0004H\u0007J&\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u00042\b\u0010;\u001a\u0004\u0018\u00010\u00042\b\u0010<\u001a\u0004\u0018\u00010=H\u0007J\b\u0010>\u001a\u00020?H\u0007J\u0018\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0004H\u0002J\u0010\u0010D\u001a\u00020?2\u0006\u0010A\u001a\u00020BH\u0007J\u0012\u0010E\u001a\u00020?2\b\u0010F\u001a\u0004\u0018\u00010GH\u0007J\u001e\u0010H\u001a\u0004\u0018\u00010\u00042\b\u0010I\u001a\u0004\u0018\u00010\u00042\b\u0010J\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020MH\u0002J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020\u0004032\u0006\u0010O\u001a\u00020PH\u0007J\u001c\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010R2\u0006\u0010S\u001a\u00020\u0018H\u0007J\u001c\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040R2\u0006\u0010S\u001a\u00020\u0018H\u0007J\u001a\u0010U\u001a\u00020\u00062\b\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010X\u001a\u00020YH\u0007J\u0012\u0010Z\u001a\u00020?2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0007J\u0012\u0010]\u001a\u00020?2\b\u0010^\u001a\u0004\u0018\u00010_H\u0007J\b\u0010`\u001a\u00020\u001eH\u0002J4\u0010a\u001a\n\u0012\u0004\u0012\u0002H(\u0018\u000103\"\u0004\b\u0000\u0010(2\u000e\u0010b\u001a\n\u0012\u0004\u0012\u0002H(\u0018\u0001032\f\u0010c\u001a\b\u0012\u0004\u0012\u0002H(0dH\u0007J\u0010\u0010e\u001a\u00020\u00042\u0006\u0010f\u001a\u00020\u0006H\u0007J\u0012\u0010g\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010BH\u0007J\u0010\u0010h\u001a\u00020\u00042\u0006\u0010A\u001a\u00020BH\u0007J\n\u0010i\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010j\u001a\u0004\u0018\u00010k2\b\u0010l\u001a\u0004\u0018\u00010=2\b\u0010m\u001a\u0004\u0018\u00010\u00042\u0006\u0010n\u001a\u00020kH\u0007J\u0010\u0010o\u001a\u00020\u00112\u0006\u0010p\u001a\u000209H\u0007J\u0010\u0010q\u001a\u00020r2\u0006\u00107\u001a\u00020\u0004H\u0002J\u0018\u0010s\u001a\u00020?2\u0006\u00107\u001a\u00020\u00042\u0006\u0010t\u001a\u00020uH\u0007J\u0012\u0010v\u001a\u00020\u00042\b\u0010A\u001a\u0004\u0018\u00010BH\u0007JC\u0010w\u001a\u0004\u0018\u00010x2\n\u0010y\u001a\u0006\u0012\u0002\b\u00030z2\u0006\u0010{\u001a\u00020\u00042\u001e\u0010|\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010z00\"\b\u0012\u0002\b\u0003\u0018\u00010zH\u0007¢\u0006\u0002\u0010}J?\u0010w\u001a\u0004\u0018\u00010x2\u0006\u0010~\u001a\u00020\u00042\u0006\u0010{\u001a\u00020\u00042\u001e\u0010|\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010z00\"\b\u0012\u0002\b\u0003\u0018\u00010zH\u0007¢\u0006\u0002\u0010\u007fJ(\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010S\u001a\u00020\u00182\b\u0010m\u001a\u0004\u0018\u00010\u00042\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u0083\u0001\u001a\u0004\u0018\u000109H\u0007J\u0013\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u0018H\u0007J\u001d\u0010\u0087\u0001\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010\u00182\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0007J\u001c\u0010\u0088\u0001\u001a\u00020\u00042\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0007\u0010L\u001a\u00030\u008b\u0001H\u0002J;\u0010\u008c\u0001\u001a\u0014\u0012\u0004\u0012\u0002H(0\u008d\u0001j\t\u0012\u0004\u0012\u0002H(`\u008e\u0001\"\u0004\b\u0000\u0010(2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002H(00\"\u0002H(H\u0007¢\u0006\u0003\u0010\u008f\u0001J\u001d\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0091\u0001\u001a\u00020\u00042\u0007\u0010L\u001a\u00030\u008b\u0001H\u0002J\u001c\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u0091\u0001\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u0004H\u0002J$\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0093\u0001H\u0007J>\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0098\u0001\u001a\u00020x2\u0017\u0010\u0099\u0001\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000100\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020BH\u0007J\u0011\u0010\u009c\u0001\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020BH\u0007J\u0014\u0010\u009d\u0001\u001a\u00020\u001e2\t\u0010\u0083\u0001\u001a\u0004\u0018\u000109H\u0007J\u0015\u0010\u009e\u0001\u001a\u00020\u001e2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0007J\u0014\u0010¡\u0001\u001a\u00020\u001e2\t\u0010\u0083\u0001\u001a\u0004\u0018\u000109H\u0007J\u0013\u0010¢\u0001\u001a\u00020\u001e2\b\u0010I\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010¢\u0001\u001a\u00020\u001e\"\u0004\b\u0000\u0010(2\u0010\u0010£\u0001\u001a\u000b\u0012\u0004\u0012\u0002H(\u0018\u00010¤\u0001H\u0007J3\u0010¥\u0001\u001a\u00020\u001e\"\u0004\b\u0000\u0010(2\u0010\u0010¦\u0001\u001a\u000b\u0012\u0004\u0012\u0002H(\u0018\u00010¤\u00012\u0010\u0010§\u0001\u001a\u000b\u0012\u0004\u0012\u0002H(\u0018\u00010¤\u0001H\u0007J\u0014\u0010¨\u0001\u001a\u00020\u001e2\t\u0010\u0083\u0001\u001a\u0004\u0018\u000109H\u0007J\u0018\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040ª\u00012\u0006\u0010O\u001a\u00020PH\u0007J\u0017\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u0004032\u0006\u0010O\u001a\u00020PH\u0007J\u001e\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040R2\u0007\u0010\u00ad\u0001\u001a\u00020\u0004H\u0007J'\u0010®\u0001\u001a\u00020?2\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u00042\u0011\u0010°\u0001\u001a\f\u0018\u00010±\u0001j\u0005\u0018\u0001`²\u0001H\u0007J\u001f\u0010®\u0001\u001a\u00020?2\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010³\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J+\u0010®\u0001\u001a\u00020?2\t\u0010¯\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010³\u0001\u001a\u0004\u0018\u00010\u00042\n\u0010´\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0007JF\u0010¶\u0001\u001a\u000b\u0012\u0005\u0012\u0003H·\u0001\u0018\u000103\"\u0004\b\u0000\u0010(\"\u0005\b\u0001\u0010·\u00012\u000e\u0010b\u001a\n\u0012\u0004\u0012\u0002H(\u0018\u0001032\u0015\u0010¸\u0001\u001a\u0010\u0012\u0004\u0012\u0002H(\u0012\u0005\u0012\u0003H·\u00010¹\u0001H\u0007J\"\u0010º\u0001\u001a\u00020\u00042\u0017\u0010¶\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040RH\u0007J\u0013\u0010»\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010m\u001a\u00020\u0004H\u0007J\u0011\u0010¼\u0001\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020BH\u0007J\u0014\u0010½\u0001\u001a\u00020=2\t\u0010¾\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J.\u0010¿\u0001\u001a\u00020?2\u0006\u0010*\u001a\u00020=2\b\u0010m\u001a\u0004\u0018\u00010\u00042\u0011\u0010À\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u000103H\u0007J&\u0010Á\u0001\u001a\u00020\u001e2\u0006\u0010l\u001a\u00020=2\b\u0010m\u001a\u0004\u0018\u00010\u00042\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u0001H\u0007J&\u0010Ã\u0001\u001a\u00020?2\u0006\u0010*\u001a\u00020=2\b\u0010m\u001a\u0004\u0018\u00010\u00042\t\u0010Â\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010Ä\u0001\u001a\u00020?2\u0006\u0010*\u001a\u00020=2\b\u0010m\u001a\u0004\u0018\u00010\u00042\t\u0010\u0083\u0001\u001a\u0004\u0018\u000109H\u0007J\u0013\u0010Å\u0001\u001a\u00020\u00042\b\u0010V\u001a\u0004\u0018\u00010WH\u0007J%\u0010Æ\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010R2\b\u0010Ç\u0001\u001a\u00030È\u0001H\u0007J\t\u0010É\u0001\u001a\u00020?H\u0002J\t\u0010Ê\u0001\u001a\u00020\u0006H\u0002J\u0012\u0010Ë\u0001\u001a\u00020?2\u0007\u0010Ì\u0001\u001a\u00020BH\u0002J\u0012\u0010Í\u0001\u001a\u00020?2\u0007\u0010Ì\u0001\u001a\u00020BH\u0002J\t\u0010Î\u0001\u001a\u00020?H\u0002J\t\u0010Ï\u0001\u001a\u00020?H\u0002J\u0015\u0010Ð\u0001\u001a\u00020?2\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ò\u0001H\u0007J\u001f\u0010Ó\u0001\u001a\u00020\u00042\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J2\u0010Ö\u0001\u001a\u00020?2\u0007\u0010×\u0001\u001a\u00020\u00182\n\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u00012\t\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010Û\u0001\u001a\u00020\u001eH\u0007J\u001b\u0010Ü\u0001\u001a\u00020?2\u0007\u0010×\u0001\u001a\u00020\u00182\u0007\u0010Ì\u0001\u001a\u00020BH\u0007J\u0014\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00042\u0007\u0010L\u001a\u00030\u008b\u0001H\u0007J\u0013\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00042\u0006\u0010m\u001a\u00020\u0004H\u0007J\u0016\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010L\u001a\u0005\u0018\u00010\u008b\u0001H\u0007J\u0015\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00042\b\u0010m\u001a\u0004\u0018\u00010\u0004H\u0007J\u001d\u0010ß\u0001\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010à\u0001\u001a\u0004\u0018\u00010P2\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010á\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J!\u0010â\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00182\t\u0010á\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J0\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u0002H(0¤\u0001\"\u0004\b\u0000\u0010(2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u0002H(00\"\u0002H(H\u0007¢\u0006\u0003\u0010ä\u0001J.\u0010å\u0001\u001a\u00020?2\b\u0010Ç\u0001\u001a\u00030È\u00012\u0019\u0010¶\u0001\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010RH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b\u001d\u0010 R\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b!\u0010 R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u000e\u0010%\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ê\u0001"}, d2 = {"Lcom/facebook/internal/Utility;", "", "()V", "ARC_DEVICE_PATTERN", "", "DEFAULT_STREAM_BUFFER_SIZE", "", "EXTRA_APP_EVENTS_INFO_FORMAT_VERSION", "HASH_ALGORITHM_MD5", "HASH_ALGORITHM_SHA1", "HASH_ALGORITHM_SHA256", "LOG_TAG", "NO_CARRIER", "REFRESH_TIME_FOR_EXTENDED_DEVICE_INFO_MILLIS", "URL_SCHEME", "UTF8", "availableExternalStorageGB", "", "carrierName", "currentLocale", "Ljava/util/Locale;", "getCurrentLocale", "()Ljava/util/Locale;", "dataProcessingOptions", "Lorg/json/JSONObject;", "getDataProcessingOptions", "()Lorg/json/JSONObject;", "deviceTimeZoneName", "deviceTimezoneAbbreviation", "isAutoAppLinkSetup", "", "isAutoAppLinkSetup$annotations", "()Z", "isDataProcessingRestricted", "numCPUCores", "resourceLocale", "getResourceLocale", "timestampOfLastCheck", "totalExternalStorageGB", "areObjectsEqual", "T", CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "arrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ts", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "asListNoNulls", "", "array", "([Ljava/lang/Object;)Ljava/util/List;", "awaitGetGraphMeRequestWithCache", "accessToken", "buildUri", "Landroid/net/Uri;", "authority", "path", "parameters", "Landroid/os/Bundle;", "clearCaches", "", "clearCookiesForDomain", LogCategory.CONTEXT, "Landroid/content/Context;", "domain", "clearFacebookCookies", "closeQuietly", "closeable", "Ljava/io/Closeable;", "coerceValueIfNullOrEmpty", CmcdHeadersFactory.STREAMING_FORMAT_SS, "valueIfNullOrEmpty", "convertBytesToGB", "bytes", "", "convertJSONArrayToList", "jsonArray", "Lorg/json/JSONArray;", "convertJSONObjectToHashMap", "", "jsonObject", "convertJSONObjectToStringMap", "copyAndCloseInputStream", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "deleteDirectory", "directoryOrFile", "Ljava/io/File;", "disconnectQuietly", "connection", "Ljava/net/URLConnection;", "externalStorageExists", "filter", CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET, "predicate", "Lcom/facebook/internal/Utility$Predicate;", "generateRandomString", SessionDescription.ATTR_LENGTH, "getActivityName", "getAppName", "getAppVersion", "getBundleLongAsDate", "Ljava/util/Date;", "bundle", "key", "dateBase", "getContentSize", "contentUri", "getGraphMeRequestWithCache", "Lcom/facebook/GraphRequest;", "getGraphMeRequestWithCacheAsync", "callback", "Lcom/facebook/internal/Utility$GraphMeRequestWithCacheCallback;", "getMetadataApplicationId", "getMethodQuietly", "Ljava/lang/reflect/Method;", "clazz", "Ljava/lang/Class;", "methodName", "parameterTypes", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "className", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getStringPropertyAsJSON", "nonJSONPropertyKey", "getUriString", "uri", "handlePermissionResponse", "Lcom/facebook/internal/Utility$PermissionsLists;", "result", "hasSameId", "hashBytes", "hash", "Ljava/security/MessageDigest;", "", "hashSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "([Ljava/lang/Object;)Ljava/util/HashSet;", "hashWithAlgorithm", "algorithm", "intersectRanges", "", "range1", "range2", "invokeMethodQuietly", "receiver", "method", "args", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "isAutofillAvailable", "isChromeOS", "isContentUri", "isCurrentAccessToken", LoggedUserResponse.KEY_TOKEN, "Lcom/facebook/AccessToken;", "isFileUri", "isNullOrEmpty", "c", "", "isSubset", "subset", "superset", "isWebUri", "jsonArrayToSet", "", "jsonArrayToStringList", "jsonStrToMap", "str", "logd", "tag", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "t", "", "map", "K", "mapper", "Lcom/facebook/internal/Utility$Mapper;", "mapToJsonStr", "md5hash", "mustFixWindowParamsForAutofill", "parseUrlQueryString", "queryString", "putCommaSeparatedStringList", "list", "putJSONValueInBundle", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putNonEmptyString", "putUri", "readStreamToString", "readStringMapFromParcel", "parcel", "Landroid/os/Parcel;", "refreshAvailableExternalStorage", "refreshBestGuessNumberOfCPUCores", "refreshCarrierName", "appContext", "refreshPeriodicExtendedDeviceInfo", "refreshTimezone", "refreshTotalExternalStorage", "runOnNonUiThread", "runnable", "Ljava/lang/Runnable;", "safeGetStringFromResponse", "response", "propertyName", "setAppEventAttributionParameters", "params", "attributionIdentifiers", "Lcom/facebook/internal/AttributionIdentifiers;", "anonymousAppDeviceGUID", "limitEventUsage", "setAppEventExtendedDeviceInfoParameters", "sha1hash", "sha256hash", "stringsEqualOrEmpty", "tryGetJSONArrayFromResponse", "propertyKey", "tryGetJSONObjectFromResponse", "unmodifiableCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "writeStringMapToParcel", "GraphMeRequestWithCacheCallback", "Mapper", "PermissionsLists", "Predicate", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorMediaPeriodQueueTracker {
    private static int MediaBrowserCompatCustomActionResultReceiver;
    public static final DefaultAnalyticsCollectorMediaPeriodQueueTracker read = new DefaultAnalyticsCollectorMediaPeriodQueueTracker();
    private static long AudioAttributesImplApi26Parcelizer = -1;
    private static long MediaBrowserCompatItemReceiver = -1;
    private static long RemoteActionCompatParcelizer = -1;
    private static String IconCompatParcelizer = "";
    private static String AudioAttributesCompatParcelizer = "";
    private static String write = "NoCarrier";

    /* JADX INFO: loaded from: classes2.dex */
    public interface write {
        void IconCompatParcelizer(JSONObject jSONObject);

        void RemoteActionCompatParcelizer(lambdaonMetadata50 lambdaonmetadata50);
    }

    private DefaultAnalyticsCollectorMediaPeriodQueueTracker() {
    }

    @getMagicModuleMeta
    public static final boolean IconCompatParcelizer(String str) {
        return str == null || str.length() == 0;
    }

    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(String str, String str2) {
        return IconCompatParcelizer(str) ? str2 : str;
    }

    @getMagicModuleMeta
    public static final <T> Collection<T> AudioAttributesCompatParcelizer(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        Collection<T> collectionUnmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(tArr, tArr.length)));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionUnmodifiableCollection, "");
        return collectionUnmodifiableCollection;
    }

    @getMagicModuleMeta
    public static final String write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return read.RemoteActionCompatParcelizer("MD5", str);
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        return read("SHA-1", bArr);
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        return read.RemoteActionCompatParcelizer("SHA-256", str);
    }

    private final String RemoteActionCompatParcelizer(String str, String str2) {
        Charset charset = getSubmissionTimestamp.IconCompatParcelizer;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        return read(str, bytes);
    }

    private static String read(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(messageDigest, "");
            return read(messageDigest, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String read(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @getMagicModuleMeta
    public static final void write(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    @getMagicModuleMeta
    public static final String write(Context context) {
        DefaultAnalyticsCollectorExternalSyntheticLambda8.IconCompatParcelizer(context, LogCategory.CONTEXT);
        String strWrite = lambdaonMediaMetadataChanged48.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        return strWrite;
    }

    @getMagicModuleMeta
    public static final Map<String, String> RemoteActionCompatParcelizer(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                map.put(next, strOptString);
            }
        }
        return map;
    }

    @getMagicModuleMeta
    public static final List<String> IconCompatParcelizer(JSONArray jSONArray) {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @getMagicModuleMeta
    public static final Object IconCompatParcelizer(JSONObject jSONObject, String str, String str2) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt == null || (objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
            return objOpt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, objOpt);
            return jSONObject2;
        }
        throw new lambdaonMetadata50("Got an unexpected non-JSON object.");
    }

    @getMagicModuleMeta
    public static final String write(InputStream inputStream) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            BufferedInputStream bufferedInputStream3 = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream3);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i != -1) {
                            sb.append(cArr, 0, i);
                        } else {
                            String string = sb.toString();
                            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                            RemoteActionCompatParcelizer(bufferedInputStream3);
                            RemoteActionCompatParcelizer(inputStreamReader);
                            return string;
                        }
                    }
                } catch (Throwable th2) {
                    bufferedInputStream = bufferedInputStream3;
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                    RemoteActionCompatParcelizer(bufferedInputStream2);
                    RemoteActionCompatParcelizer(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                bufferedInputStream = bufferedInputStream3;
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
    }

    @getMagicModuleMeta
    public static final int AudioAttributesCompatParcelizer(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedInputStream bufferedInputStream;
        toMagicModuleMetaRepoModel.write(outputStream, "");
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = bufferedInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i2);
                    i += i2;
                }
                bufferedInputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i;
            } catch (Throwable th) {
                th = th;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    private static void AudioAttributesCompatParcelizer(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie != null) {
            Object[] array = TestGroupLSModel.write(cookie, new String[]{";"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                for (String str2 : (String[]) array) {
                    Object[] array2 = TestGroupLSModel.write(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr = (String[]) array2;
                        if (strArr.length > 0) {
                            StringBuilder sb = new StringBuilder();
                            String str3 = strArr[0];
                            int length = str3.length() - 1;
                            int i = 0;
                            boolean z = false;
                            while (i <= length) {
                                boolean z2 = toMagicModuleMetaRepoModel.read((int) str3.charAt(!z ? i : length), 32) <= 0;
                                if (z) {
                                    if (!z2) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                } else if (z2) {
                                    i++;
                                } else {
                                    z = true;
                                }
                            }
                            sb.append(str3.subSequence(i, length + 1).toString());
                            sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                            cookieManager.setCookie(str, sb.toString());
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                cookieManager.removeExpiredCookie();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        AudioAttributesCompatParcelizer(context, "facebook.com");
        AudioAttributesCompatParcelizer(context, ".facebook.com");
        AudioAttributesCompatParcelizer(context, "https://facebook.com");
        AudioAttributesCompatParcelizer(context, "https://.facebook.com");
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(String str, Exception exc) {
        if (!lambdaonMediaMetadataChanged48.MediaMetadataCompat() || str == null) {
            return;
        }
        exc.getClass().getSimpleName();
        exc.getMessage();
    }

    @getMagicModuleMeta
    public static final void AudioAttributesImplApi26Parcelizer() {
        lambdaonMediaMetadataChanged48.MediaMetadataCompat();
    }

    @getMagicModuleMeta
    public static final <T> boolean AudioAttributesCompatParcelizer(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t, t2);
    }

    @getMagicModuleMeta
    public static final List<String> write(JSONArray jSONArray) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONArray, "");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    @getMagicModuleMeta
    public static final String write(Map<String, String> map) {
        String string;
        toMagicModuleMetaRepoModel.write(map, "");
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = "";
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @getMagicModuleMeta
    public static final Map<String, String> read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                String string = jSONObject.getString(next);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @getMagicModuleMeta
    public static final void write(JSONObject jSONObject, DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51, String str, boolean z) throws JSONException {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", lambdaonMediaMetadataChanged48.RemoteActionCompatParcelizer());
        if (defaultAnalyticsCollectorExternalSyntheticLambda51 != null) {
            if (defaultAnalyticsCollectorExternalSyntheticLambda51.getWrite() != null) {
                jSONObject.put("attribution", defaultAnalyticsCollectorExternalSyntheticLambda51.getWrite());
            }
            if (defaultAnalyticsCollectorExternalSyntheticLambda51.RemoteActionCompatParcelizer() != null) {
                jSONObject.put("advertiser_id", defaultAnalyticsCollectorExternalSyntheticLambda51.RemoteActionCompatParcelizer());
                jSONObject.put("advertiser_tracking_enabled", !defaultAnalyticsCollectorExternalSyntheticLambda51.getAudioAttributesImplApi21Parcelizer());
            }
            if (!defaultAnalyticsCollectorExternalSyntheticLambda51.getAudioAttributesImplApi21Parcelizer()) {
                String strIconCompatParcelizer = lambdareleaseInternal67.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strIconCompatParcelizer, "");
                if (strIconCompatParcelizer.length() != 0) {
                    jSONObject.put("ud", strIconCompatParcelizer);
                }
            }
            if (defaultAnalyticsCollectorExternalSyntheticLambda51.getAudioAttributesCompatParcelizer() != null) {
                jSONObject.put("installer_package", defaultAnalyticsCollectorExternalSyntheticLambda51.getAudioAttributesCompatParcelizer());
            }
        }
    }

    @getMagicModuleMeta
    public static final String write() {
        Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
        if (contextAudioAttributesCompatParcelizer == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = contextAudioAttributesCompatParcelizer.getPackageManager().getPackageInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void read(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i;
        Object systemService;
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(context, "");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        read.MediaBrowserCompatCustomActionResultReceiver(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            Resources resources = context.getResources();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
            locale = resources.getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(IconCompatParcelizer);
        jSONArray.put(write);
        double d = 0.0d;
        try {
            systemService = context.getSystemService("window");
        } catch (Exception unused3) {
        }
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            try {
                i2 = displayMetrics.heightPixels;
                d = displayMetrics.density;
            } catch (Exception unused4) {
            }
            int i5 = i2;
            i2 = i4;
            i = i5;
        } else {
            i = 0;
        }
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(AudioAttributesImplApi21Parcelizer());
        jSONArray.put(MediaBrowserCompatItemReceiver);
        jSONArray.put(RemoteActionCompatParcelizer);
        jSONArray.put(AudioAttributesCompatParcelizer);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    @getMagicModuleMeta
    public static final Method RemoteActionCompatParcelizer(Class<?> cls, String str, Class<?>... clsArr) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(clsArr, "");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @getMagicModuleMeta
    public static final Method read(String str, String str2, Class<?>... clsArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(clsArr, "");
        try {
            Class<?> cls = Class.forName(str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            return RemoteActionCompatParcelizer(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @getMagicModuleMeta
    public static final Object read(Object obj, Method method, Object... objArr) {
        toMagicModuleMetaRepoModel.write(method, "");
        toMagicModuleMetaRepoModel.write(objArr, "");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @getMagicModuleMeta
    public static final String read(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(simpleName, "");
        return simpleName;
    }

    @getMagicModuleMeta
    public static final long write(Uri uri) {
        toMagicModuleMetaRepoModel.write(uri, "");
        Cursor cursorQuery = null;
        try {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            cursorQuery = contextAudioAttributesCompatParcelizer.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    @getMagicModuleMeta
    public static final boolean read(AccessToken accessToken) {
        if (accessToken == null) {
            return false;
        }
        AccessToken.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = AccessToken.RemoteActionCompatParcelizer;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(accessToken, AccessToken.AudioAttributesCompatParcelizer.read());
    }

    @getMagicModuleMeta
    public static final void read(final String str, final write writeVar) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        JSONObject jSONObjectAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda67.AudioAttributesCompatParcelizer(str);
        if (jSONObjectAudioAttributesCompatParcelizer != null) {
            writeVar.IconCompatParcelizer(jSONObjectAudioAttributesCompatParcelizer);
            return;
        }
        GraphRequest.write writeVar2 = new GraphRequest.write() { // from class: o.DefaultAnalyticsCollectorMediaPeriodQueueTracker.2
            @Override // com.facebook.GraphRequest.write
            public final void IconCompatParcelizer(lambdaonPlayerError41 lambdaonplayererror41) {
                toMagicModuleMetaRepoModel.write(lambdaonplayererror41, "");
                if (lambdaonplayererror41.getWrite() != null) {
                    writeVar.RemoteActionCompatParcelizer(lambdaonplayererror41.getWrite().getMediaBrowserCompatSearchResultReceiver());
                    return;
                }
                String str2 = str;
                JSONObject jSONObject = lambdaonplayererror41.getAudioAttributesImplBaseParcelizer();
                if (jSONObject == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                DefaultAnalyticsCollectorExternalSyntheticLambda67.IconCompatParcelizer(str2, jSONObject);
                writeVar.IconCompatParcelizer(lambdaonplayererror41.getAudioAttributesImplBaseParcelizer());
            }
        };
        GraphRequest graphRequestMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(str);
        graphRequestMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(writeVar2);
        graphRequestMediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
    }

    @getMagicModuleMeta
    public static final JSONObject AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        JSONObject jSONObjectAudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda67.AudioAttributesCompatParcelizer(str);
        if (jSONObjectAudioAttributesCompatParcelizer != null) {
            return jSONObjectAudioAttributesCompatParcelizer;
        }
        lambdaonPlayerError41 lambdaonplayererror41MediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatItemReceiver(str).MediaBrowserCompatCustomActionResultReceiver();
        if (lambdaonplayererror41MediaBrowserCompatCustomActionResultReceiver.getWrite() != null) {
            return null;
        }
        return lambdaonplayererror41MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesImplBaseParcelizer();
    }

    private static GraphRequest MediaBrowserCompatItemReceiver(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        return new GraphRequest(null, "me", bundle, lambdaonPlayWhenReadyChanged36.GET, null, null, 32, null);
    }

    private static int AudioAttributesImplApi21Parcelizer() {
        int i = MediaBrowserCompatCustomActionResultReceiver;
        if (i > 0) {
            return i;
        }
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: o.DefaultAnalyticsCollectorMediaPeriodQueueTracker.3
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]+", str);
                }
            });
            if (fileArrListFiles != null) {
                MediaBrowserCompatCustomActionResultReceiver = fileArrListFiles.length;
            }
        } catch (Exception unused) {
        }
        if (MediaBrowserCompatCustomActionResultReceiver <= 0) {
            MediaBrowserCompatCustomActionResultReceiver = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(Context context) {
        if (AudioAttributesImplApi26Parcelizer == -1 || System.currentTimeMillis() - AudioAttributesImplApi26Parcelizer >= 1800000) {
            AudioAttributesImplApi26Parcelizer = System.currentTimeMillis();
            MediaBrowserCompatSearchResultReceiver();
            IconCompatParcelizer(context);
            RatingCompat();
            MediaBrowserCompatItemReceiver();
        }
    }

    private static void MediaBrowserCompatSearchResultReceiver() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(displayName, "");
            IconCompatParcelizer = displayName;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(timeZone, "");
            String id = timeZone.getID();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
            AudioAttributesCompatParcelizer = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    private static void IconCompatParcelizer(Context context) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) write, (Object) "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(networkOperatorName, "");
                write = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    private static boolean AudioAttributesImplBaseParcelizer() {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "mounted", (Object) Environment.getExternalStorageState());
    }

    private static void MediaBrowserCompatItemReceiver() {
        try {
            if (AudioAttributesImplBaseParcelizer()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(externalStorageDirectory, "");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                RemoteActionCompatParcelizer = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            RemoteActionCompatParcelizer = read(RemoteActionCompatParcelizer);
        } catch (Exception unused) {
        }
    }

    private static void RatingCompat() {
        try {
            if (AudioAttributesImplBaseParcelizer()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(externalStorageDirectory, "");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                MediaBrowserCompatItemReceiver = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            MediaBrowserCompatItemReceiver = read(MediaBrowserCompatItemReceiver);
        } catch (Exception unused) {
        }
    }

    private static long read(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    @getMagicModuleMeta
    public static final Locale AudioAttributesCompatParcelizer() {
        try {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            Resources resources = contextAudioAttributesCompatParcelizer.getResources();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(resources, "");
            return resources.getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    @getMagicModuleMeta
    public static final Locale RemoteActionCompatParcelizer() {
        Locale localeAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (localeAudioAttributesCompatParcelizer != null) {
            return localeAudioAttributesCompatParcelizer;
        }
        Locale locale = Locale.getDefault();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(locale, "");
        return locale;
    }

    @getMagicModuleMeta
    public static final void read(Runnable runnable) {
        try {
            lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(runnable);
        } catch (Exception unused) {
        }
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
            String str = (String) lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, 141222384, iAudioAttributesCompatParcelizer2, new Object[0], lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), -141222384);
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = ((PackageItemInfo) applicationInfo).labelRes;
            if (i == 0) {
                return ((PackageItemInfo) applicationInfo).nonLocalizedLabel.toString();
            }
            String string = context.getString(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final boolean IconCompatParcelizer() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{lambdaonMediaMetadataChanged48.write()}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            intent.setData(Uri.parse(str));
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            PackageManager packageManager = contextAudioAttributesCompatParcelizer.getPackageManager();
            String packageName = contextAudioAttributesCompatParcelizer.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE).iterator();
            while (it.hasNext()) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) packageName, (Object) ((PackageItemInfo) it.next().activityInfo).packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @getMagicModuleMeta
    public static final JSONObject read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorMediaPeriodQueueTracker.class)) {
            return null;
        }
        try {
            String string = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorMediaPeriodQueueTracker.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorMediaPeriodQueueTracker.class)) {
            return false;
        }
        try {
            JSONObject jSONObject = read();
            if (jSONObject != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("data_processing_options");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray.getString(i);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = string.toLowerCase();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) lowerCase, (Object) "ldu")) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorMediaPeriodQueueTracker.class);
            return false;
        }
    }
}
