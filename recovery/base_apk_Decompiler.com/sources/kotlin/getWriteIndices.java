package kotlin;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.api.models.response.firebase.BuynowBannerResponse;
import com.marrow.data.api.models.response.plan.RenewEligible;
import com.marrow.data.api.models.response.video.PlaybackSettings;
import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.video.ThemeState;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010-J!\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b)\u0010.J\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020 H\u0016¢\u0006\u0004\b\u001e\u0010,J\u0019\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\nJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010/J\u000f\u00100\u001a\u00020\u0016H\u0016¢\u0006\u0004\b0\u0010\u0018J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bJ\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\rJ\u000f\u00102\u001a\u00020\u0016H\u0016¢\u0006\u0004\b2\u0010\u0018J\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\t\u00103J\u000f\u00104\u001a\u00020\u0016H\u0016¢\u0006\u0004\b4\u0010\u0018J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u00105J'\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u00107J\u0017\u00108\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u00103J\u0011\u00109\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b9\u0010\bJ\u0011\u0010:\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010\bJ\u001d\u0010+\u001a\u00020\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060;H\u0016¢\u0006\u0004\b+\u0010<J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000bH\u0016¢\u0006\u0004\b?\u0010\u0014J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010@J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010@J\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010\bJ\u000f\u0010C\u001a\u00020 H\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020 H\u0016¢\u0006\u0004\bD\u0010BJ\u0017\u00101\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b1\u0010@J\u000f\u0010E\u001a\u00020 H\u0016¢\u0006\u0004\bE\u0010BJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010@J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010\u0018J\u000f\u0010F\u001a\u00020\u000eH\u0014¢\u0006\u0004\bF\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020GH\u0016¢\u0006\u0004\b\u001e\u0010HJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0011\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010\bJ\u000f\u0010I\u001a\u00020\u0006H\u0016¢\u0006\u0004\bI\u0010\bJ\u000f\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010\bJ\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\bJ\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\rJ\u000f\u0010M\u001a\u00020\u000eH\u0016¢\u0006\u0004\bM\u0010\u0012J\u000f\u0010N\u001a\u00020\u000eH\u0016¢\u0006\u0004\bN\u0010\u0012J\u0011\u0010O\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bO\u0010\bJ\u0011\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bQ\u0010RJ\u0019\u0010S\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bS\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u0019\u00101\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u0010\rJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\bF\u0010\u0010J\u000f\u0010T\u001a\u00020\u000eH\u0016¢\u0006\u0004\bT\u0010\u0012J\u0019\u0010'\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\b'\u0010UJ\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010@J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u00103J\u000f\u0010V\u001a\u00020 H\u0016¢\u0006\u0004\bV\u0010BJ\u0019\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\nJ\u000f\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bW\u0010\u0012J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0010J\u0011\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bY\u0010ZJ\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010[J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\\J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0011\u0010]\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b]\u0010\bJ\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010@J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u00103J\u000f\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010L\u001a\u00020\u000eH\u0016¢\u0006\u0004\bL\u0010\u0012J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010S\u001a\u00020\u000eH\u0016¢\u0006\u0004\bS\u0010\u0012J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0010J\u000f\u0010^\u001a\u00020\u000eH\u0016¢\u0006\u0004\b^\u0010\u0012J\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u0010J\u000f\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020_H\u0016¢\u0006\u0004\b+\u0010bJ\u000f\u0010c\u001a\u00020\u000eH\u0016¢\u0006\u0004\bc\u0010\u0012J\u000f\u0010d\u001a\u00020\u0016H\u0016¢\u0006\u0004\bd\u0010\u0018J\u000f\u0010e\u001a\u00020\u000bH\u0016¢\u0006\u0004\be\u0010\u0014J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0010J\u0017\u0010]\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b]\u0010\rJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0014J\u000f\u0010f\u001a\u00020\u000eH\u0016¢\u0006\u0004\bf\u0010\u0012J\u000f\u0010g\u001a\u00020\u000bH\u0016¢\u0006\u0004\bg\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010h\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\bh\u0010\u0014J\u000f\u0010i\u001a\u00020 H\u0016¢\u0006\u0004\bi\u0010BJ\u0017\u0010j\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\bj\u0010\u0014J+\u0010)\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010k*\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000lH\u0002¢\u0006\u0004\b)\u0010mJ\u000f\u0010n\u001a\u00020\u000bH\u0016¢\u0006\u0004\bn\u0010\u0014J\u000f\u0010o\u001a\u00020\u000eH\u0016¢\u0006\u0004\bo\u0010\u0012J\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u00103J\u000f\u0010p\u001a\u00020\u0016H\u0016¢\u0006\u0004\bp\u0010\u0018J\u000f\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\br\u0010sJ\u000f\u0010u\u001a\u00020tH\u0016¢\u0006\u0004\bu\u0010vJ\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020tH\u0016¢\u0006\u0004\b'\u0010wJ\u000f\u0010x\u001a\u00020\u000eH\u0016¢\u0006\u0004\bx\u0010\u0012J\u000f\u0010y\u001a\u00020\u000bH\u0016¢\u0006\u0004\by\u0010\u0014J\u000f\u0010z\u001a\u00020 H\u0016¢\u0006\u0004\bz\u0010BJ\u0017\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010@J\u000f\u0010{\u001a\u00020\u0016H\u0016¢\u0006\u0004\b{\u0010\u0018J\u0017\u0010|\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b|\u0010\u0014J\u000f\u0010}\u001a\u00020\u0016H\u0016¢\u0006\u0004\b}\u0010\u0018J\u0017\u0010~\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b~\u0010\u0014J\u000f\u0010\u007f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u007f\u0010\u0018J\u0011\u0010\u0080\u0001\u001a\u00020 H\u0016¢\u0006\u0005\b\u0080\u0001\u0010BJ\u0017\u0010\t\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\t\u0010@J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u00103J\u0015\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010+\u001a\u00020\u000b2\u0007\u0010\u0003\u001a\u00030\u0081\u0001H\u0016¢\u0006\u0005\b+\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u0014J\u001e\u0010+\u001a\u00020\u000b2\f\u0010\u0003\u001a\b0\u0086\u0001j\u0003`\u0087\u0001H\u0016¢\u0006\u0005\b+\u0010\u0088\u0001J\u001c\u0010\u0089\u0001\u001a\f\u0018\u00010\u0086\u0001j\u0005\u0018\u0001`\u0087\u0001H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u0014J\u0011\u0010\u008c\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u008c\u0001\u0010\u0014J\u0011\u0010\u008d\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0012J\u0017\u0010W\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\bW\u0010@J\u0011\u0010\u008e\u0001\u001a\u00020 H\u0016¢\u0006\u0005\b\u008e\u0001\u0010BJ\u0011\u0010\u008f\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008f\u0001\u0010\u0012J\u0011\u0010\u0090\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u0011\u0010\u0091\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0091\u0001\u0010\u0014J\u0011\u0010\u0092\u0001\u001a\u00020 H\u0016¢\u0006\u0005\b\u0092\u0001\u0010BJ\u0017\u0010W\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bW\u0010\rJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\u001e\u0010@J\u0011\u0010\u0093\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0093\u0001\u0010\u0012J\u0011\u0010\u0094\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0094\u0001\u0010\u0012J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010\u0010J\u0017\u0010]\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b]\u0010@J\u0011\u0010\u0095\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0095\u0001\u0010\u0012J\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b\u001b\u0010@J\u0011\u0010\u0096\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0096\u0001\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0011\u0010\u0097\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0014J\u0011\u0010\u0098\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0098\u0001\u0010\u0014R\u0015\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0099\u0001R\u0014\u0010\u001e\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\b"}, d2 = {"Lo/getWriteIndices;", "Lo/getStreamPositionUsForContent;", "Lo/getAvailableSegmentCount;", "p0", "<init>", "(Lo/getAvailableSegmentCount;)V", "", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "()Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "", "handleMediaPlayPauseIfPendingOnHandler", "(Ljava/lang/String;)V", "", "MediaDescriptionCompat", "(Z)V", "_init_lambda4", "()Z", "onPlayFromMediaId", "()V", "RatingCompat", "", "onRemoveQueueItemAt", "()I", "addOnMultiWindowModeChangedListener", "addOnPictureInPictureModeChangedListener", "MediaBrowserCompatCustomActionResultReceiver", "(Ljava/lang/String;)Z", "p1", "write", "(Ljava/lang/String;Z)Z", "", "MediaBrowserCompatItemReceiver", "(Ljava/lang/String;)J", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;J)J", "AudioAttributesImplApi21Parcelizer", "(Ljava/lang/String;)I", "read", "(Ljava/lang/String;I)I", "IconCompatParcelizer", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "(Ljava/lang/String;J)V", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "onRemoveQueueItem", "AudioAttributesImplApi26Parcelizer", "onPrepareFromUri", "(I)V", "_init_lambda3", "(I)Z", "p2", "(IIZ)V", "onSetPlaybackSpeed", "setSessionImpl", "r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0", "", "(Ljava/util/List;)V", "onRewind", "()Ljava/util/List;", "onPrepareFromMediaId", "(J)V", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "()J", "PlaybackStateCompat", "MediaSessionCompatResultReceiverWrapper", "onSetCaptioningEnabled", "MediaBrowserCompatSearchResultReceiver", "Lcom/marrow/data/models/user/LoggedUser;", "(Lcom/marrow/data/models/user/LoggedUser;)V", "onPlayFromUri", "_init_lambda2", "onSetRepeatMode", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "getSavedStateRegistryControllerannotations", "ensureViewModelStore", "MediaSessionCompatQueueItem", "Lcom/marrow/data/api/models/response/plan/RenewEligible;", "r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28", "()Lcom/marrow/data/api/models/response/plan/RenewEligible;", "onCommand", "addContentView", "(Lcom/marrow/data/api/models/response/plan/RenewEligible;)V", "onPrepare", "MediaBrowserCompatMediaItem", "Lcom/marrow/data/api/models/response/firebase/BuynowBannerResponse;", "onPrepareFromSearch", "()Lcom/marrow/data/api/models/response/firebase/BuynowBannerResponse;", "(ILjava/lang/String;)V", "(I)Ljava/lang/String;", "MediaMetadataCompat", "onAddQueueItem", "Lcom/marrow/data/api/models/response/video/PlaybackSettings;", "_init_lambda5", "()Lcom/marrow/data/api/models/response/video/PlaybackSettings;", "(Lcom/marrow/data/api/models/response/video/PlaybackSettings;)V", "accessaddObserverForBackInvoker", "onSetRating", "getOnBackPressedDispatcherannotations", "onCustomAction", "onPlay", "addOnConfigurationChangedListener", "ParcelableVolumeInfo", "getFullyDrawnReporter", "T", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "menuHostHelperlambda0", "onPlayFromSearch", "onSeekTo", "", "onSetShuffleMode$5e726e45", "()Ljava/lang/Enum;", "Lcom/marrow/data/models/video/ThemeState;", "accessgetReportFullyDrawnExecutorp", "()Lcom/marrow/data/models/video/ThemeState;", "(Lcom/marrow/data/models/video/ThemeState;)V", "addObserverForBackInvoker", "addOnUserLeaveHintListener", "onSkipToQueueItem", "onSkipToNext", "getDefaultViewModelProviderFactory", "onStop", "getDefaultViewModelCreationExtras", "MediaSessionCompatToken", "ResultReceiver", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "PlaybackStateCompatCustomAction", "()Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "(Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;)V", "getActivityResultRegistry", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatsLSModel;", "(Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;)V", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "()Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "onPause", "onFastForward", "getOnBackPressedDispatcher", "r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8", "addObserverForBackInvokerlambda7", "addOnTrimMemoryListener", "onMediaButtonEvent", "onSkipToPrevious", "accessensureViewModelStore", "accessonBackPresseds1027565324", "createFullyDrawnExecutor", "addMenuProvider", "addOnNewIntentListener", "addOnContextAvailableListener", "Lo/getAvailableSegmentCount;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class getWriteIndices implements getStreamPositionUsForContent {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAvailableSegmentCount AudioAttributesCompatParcelizer;

    @Override // kotlin.BundledChunkExtractor
    public void IconCompatParcelizer(boolean p0) {
    }

    @Override // kotlin.BundledChunkExtractor
    public boolean MediaBrowserCompatMediaItem() {
        return false;
    }

    @Override // kotlin.BundledChunkExtractor
    public String MediaDescriptionCompat() {
        return null;
    }

    @Override // kotlin.BundledChunkExtractor
    public String MediaMetadataCompat() {
        return null;
    }

    protected getWriteIndices(getAvailableSegmentCount getavailablesegmentcount) {
        toMagicModuleMetaRepoModel.write(getavailablesegmentcount, "");
        this.AudioAttributesCompatParcelizer = getavailablesegmentcount;
    }

    @Override // kotlin.BundledChunkExtractor
    public final String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("sync_next_url");
        String str = strAudioAttributesCompatParcelizer;
        return (str == null || str.length() == 0) ? "?last_updated=0" : strAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.BundledChunkExtractor
    public final String AudioAttributesImplBaseParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer("theme_selected_v3", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void handleMediaPlayPauseIfPendingOnHandler(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer("theme_selected_v3", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaDescriptionCompat(boolean p0) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer("secondary_theme_enabled", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean _init_lambda4() {
        return this.AudioAttributesCompatParcelizer.write("secondary_theme_enabled", false);
    }

    @Override // kotlin.BundledChunkExtractor
    public void onPlayFromMediaId() {
        IconCompatParcelizer("key_review_mode", 2);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RatingCompat(String p0) {
        getAvailableSegmentCount getavailablesegmentcount = this.AudioAttributesCompatParcelizer;
        if (p0 == null) {
            p0 = "";
        }
        getavailablesegmentcount.AudioAttributesImplApi26Parcelizer("sync_next_url", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onRemoveQueueItemAt() {
        return read("db_version", 0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void addOnMultiWindowModeChangedListener() {
        this.AudioAttributesCompatParcelizer.write("last_firebase_sync_v2", 0L);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("free_videos_version", 0);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("plans_version", 0);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("notes_version", 0);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("slides_version", 0);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("buynow_banner_version", 0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void addOnPictureInPictureModeChangedListener() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer("db_version", 120);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaDescriptionCompat(String p0) {
        getAvailableSegmentCount getavailablesegmentcount = this.AudioAttributesCompatParcelizer;
        if (p0 == null) {
            p0 = "";
        }
        getavailablesegmentcount.AudioAttributesImplApi26Parcelizer("version_upgrade_needed", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean MediaBrowserCompatCustomActionResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.write(p0, false);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean write(String p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.write(p0, p1);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long MediaBrowserCompatItemReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, 0L);
    }

    private long AudioAttributesCompatParcelizer(String p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int AudioAttributesImplApi21Parcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, 0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int read(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void IconCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(String p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.write(p0, p1);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void IconCompatParcelizer(String p0, boolean p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getAvailableSegmentCount getavailablesegmentcount = this.AudioAttributesCompatParcelizer;
        if (p1 == null) {
            p1 = "";
        }
        getavailablesegmentcount.AudioAttributesImplApi26Parcelizer(p0, p1);
    }

    private void write(String p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1);
    }

    @Override // kotlin.BundledChunkExtractor
    public final String AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(p0);
    }

    private String write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0);
        String str = strAudioAttributesCompatParcelizer;
        return (str == null || str.length() == 0) ? p1 : strAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onRemoveQueueItem() {
        return read("key_course_id", 1);
    }

    @Override // kotlin.BundledChunkExtractor
    public String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer("key_course_name", "");
    }

    @Override // kotlin.BundledChunkExtractor
    public void IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("key_course_name", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onPrepareFromUri() {
        return read("current_edition", onSetRating());
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplBaseParcelizer(int p0) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer("s_score", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int _init_lambda3() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer("s_score", 0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean AudioAttributesCompatParcelizer(int p0) {
        String str;
        int iOnRemoveQueueItem = onRemoveQueueItem();
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("course_config_data");
        StringBuilder sb = new StringBuilder("edition_sync_done_v2_");
        sb.append(iOnRemoveQueueItem);
        sb.append("_");
        sb.append(p0);
        return (!MediaBrowserCompatCustomActionResultReceiver(sb.toString()) || (str = strAudioAttributesCompatParcelizer) == null || str.length() == 0) ? false : true;
    }

    @Override // kotlin.BundledChunkExtractor
    public final void read(int p0, int p1, boolean p2) {
        StringBuilder sb = new StringBuilder("edition_sync_done_v2_");
        sb.append(p0);
        sb.append("_");
        sb.append(p1);
        IconCompatParcelizer(sb.toString(), p2);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onSetPlaybackSpeed() {
        return read("def_pixel_rate", 540);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void write(int p0) {
        IconCompatParcelizer("def_pixel_rate", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final String setSessionImpl() {
        switch (IconCompatParcelizer()) {
            case 1:
                return "env1-staging.dailyrounds.org";
            case 2:
                return MediaBrowserCompatSearchResultReceiver() ? "api-ap.marrow.com" : "api-a0.marrow.com";
            case 3:
                return "api-marrow-test.dailyrounds.org";
            case 4:
            case 5:
            case 8:
                return AudioAttributesCompatParcelizer("custom_endpoint_url");
            case 6:
                return "api-preprod-reborn.marrow.com";
            case 7:
            default:
                return "api-a0.marrow.com";
        }
    }

    @Override // kotlin.BundledChunkExtractor
    public final String r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        return "https";
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(List<String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String strRemoteActionCompatParcelizer = parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(p0);
        getAvailableSegmentCount getavailablesegmentcount = this.AudioAttributesCompatParcelizer;
        String strConcat = "next_video_ids_".concat(String.valueOf(onRemoveQueueItem()));
        toMagicModuleMetaRepoModel.write((Object) strRemoteActionCompatParcelizer);
        getavailablesegmentcount.AudioAttributesImplApi26Parcelizer(strConcat, strRemoteActionCompatParcelizer);
    }

    @Override // kotlin.BundledChunkExtractor
    public final List<String> onRewind() {
        List<String> listMediaBrowserCompatItemReceiver = parseLastSegmentNumberSupplementalProperty.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer("next_video_ids_".concat(String.valueOf(onRemoveQueueItem()))));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        return listMediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.BundledChunkExtractor
    public final void onPrepareFromMediaId() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer("next_video_ids_".concat(String.valueOf(onRemoveQueueItem())));
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatItemReceiver(long p0) {
        RemoteActionCompatParcelizer("key_last_callback", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        return MediaBrowserCompatItemReceiver("last_tags_sync");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplApi21Parcelizer(long p0) {
        RemoteActionCompatParcelizer("last_tags_sync", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public String AudioAttributesImplBaseParcelizer() {
        return AudioAttributesCompatParcelizer("logged_user_id");
    }

    @Override // kotlin.BundledChunkExtractor
    public String MediaBrowserCompatItemReceiver() {
        return AudioAttributesCompatParcelizer("_email");
    }

    @Override // kotlin.BundledChunkExtractor
    public final long PlaybackStateCompat() {
        return MediaBrowserCompatItemReceiver("last_known_restart_time_ms");
    }

    @Override // kotlin.BundledChunkExtractor
    public final long MediaSessionCompatResultReceiverWrapper() {
        return MediaBrowserCompatItemReceiver("last_known_playback_error_time");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplApi26Parcelizer(long p0) {
        RemoteActionCompatParcelizer("last_known_restart_time_ms", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long onSetCaptioningEnabled() {
        return AudioAttributesCompatParcelizer("device_last_reboot_timestamp_ms", -1L);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(long p0) {
        RemoteActionCompatParcelizer("device_last_reboot_timestamp_ms", p0);
    }

    private int IconCompatParcelizer() {
        return read("key_server_type", 2);
    }

    protected boolean MediaBrowserCompatSearchResultReceiver() {
        return write("key_has_subscription", false);
    }

    @Override // kotlin.BundledChunkExtractor
    public void write(LoggedUser p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public void MediaBrowserCompatCustomActionResultReceiver(boolean p0) {
        IconCompatParcelizer("key_has_subscription", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public String AudioAttributesImplApi21Parcelizer() {
        return AudioAttributesCompatParcelizer("_token");
    }

    @Override // kotlin.BundledChunkExtractor
    public final String onPlayFromUri() {
        return write("access_token", "");
    }

    @Override // kotlin.BundledChunkExtractor
    public final String _init_lambda2() {
        return write("prop_token", "");
    }

    @Override // kotlin.BundledChunkExtractor
    public final String onSetRepeatMode() {
        return write("file_integrity_hash", "");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("prop_token", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean getSavedStateRegistryControllerannotations() {
        return write("is_vibration_enabled", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean ensureViewModelStore() {
        String strAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        return !(strAudioAttributesImplBaseParcelizer == null || strAudioAttributesImplBaseParcelizer.length() == 0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final String MediaSessionCompatQueueItem() {
        return AudioAttributesCompatParcelizer("upgrade_plan_v2_json");
    }

    @Override // kotlin.BundledChunkExtractor
    public final RenewEligible r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        return (RenewEligible) new setDownloadingStatesToQueued().IconCompatParcelizer(AudioAttributesCompatParcelizer("renew_eligible_json_v3".concat(String.valueOf(onRemoveQueueItem()))), RenewEligible.class);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void onCommand(String p0) {
        IconCompatParcelizer("upgrade_plan_json", p0);
    }

    private final String write() {
        return "is_renew_req".concat(String.valueOf(onRemoveQueueItem()));
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplApi26Parcelizer(String p0) {
        IconCompatParcelizer("upgrade_plan_v2_json", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatSearchResultReceiver(boolean p0) {
        IconCompatParcelizer(write(), p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean addContentView() {
        return MediaBrowserCompatCustomActionResultReceiver(write());
    }

    @Override // kotlin.BundledChunkExtractor
    public final void read(RenewEligible p0) {
        IconCompatParcelizer("renew_eligible_json_v3".concat(String.valueOf(onRemoveQueueItem())), new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(p0));
        RemoteActionCompatParcelizer("renew_sync_time_v3_".concat(String.valueOf(onRemoveQueueItem())), System.currentTimeMillis());
    }

    @Override // kotlin.BundledChunkExtractor
    public final void read(long p0) {
        write("key_app_updated_time", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(int p0) {
        IconCompatParcelizer("video_delete_count", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long onPrepare() {
        return MediaBrowserCompatItemReceiver("key_app_updated_time");
    }

    @Override // kotlin.BundledChunkExtractor
    public final String read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final BuynowBannerResponse onPrepareFromSearch() {
        return (BuynowBannerResponse) IconCompatParcelizer(AudioAttributesCompatParcelizer("buy_now_banner"), BuynowBannerResponse.class);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesCompatParcelizer(int p0, String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver(p0), p1);
    }

    private static String MediaBrowserCompatCustomActionResultReceiver(int p0) {
        return "woq_marrowthon_".concat(String.valueOf(p0));
    }

    @Override // kotlin.BundledChunkExtractor
    public boolean RatingCompat() {
        return MediaBrowserCompatCustomActionResultReceiver("is_concise_mode_on");
    }

    @Override // kotlin.BundledChunkExtractor
    public void AudioAttributesImplBaseParcelizer(boolean p0) {
        IconCompatParcelizer("key_show_ans_pref", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public void AudioAttributesCompatParcelizer(long p0) {
        RemoteActionCompatParcelizer("last_recent_update_date", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplApi21Parcelizer(int p0) {
        IconCompatParcelizer("timeline_count_synced_".concat(String.valueOf(p0)), true);
    }

    @Override // kotlin.BundledChunkExtractor
    public boolean RemoteActionCompatParcelizer() {
        return write("video_subtitles_enabled", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public void AudioAttributesCompatParcelizer(boolean p0) {
        IconCompatParcelizer("video_subtitles_enabled", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return write("video_interactive_options", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public void MediaBrowserCompatItemReceiver(boolean p0) {
        IconCompatParcelizer("video_interactive_options", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public boolean onCommand() {
        return MediaBrowserCompatCustomActionResultReceiver("interactive_video_tooltip_shown");
    }

    @Override // kotlin.BundledChunkExtractor
    public void read(boolean p0) {
        IconCompatParcelizer("interactive_video_tooltip_shown", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public boolean onAddQueueItem() {
        return MediaBrowserCompatCustomActionResultReceiver("interactive_video_switch_to_landscape_shown");
    }

    @Override // kotlin.BundledChunkExtractor
    public void RemoteActionCompatParcelizer(boolean p0) {
        IconCompatParcelizer("interactive_video_switch_to_landscape_shown", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final PlaybackSettings _init_lambda5() {
        try {
            PlaybackSettings playbackSettings = (PlaybackSettings) new setDownloadingStatesToQueued().IconCompatParcelizer(AudioAttributesCompatParcelizer("video_config_settings"), PlaybackSettings.class);
            return playbackSettings == null ? PlaybackSettings.INSTANCE.getLocalDefaultPlaybackSettings() : playbackSettings;
        } catch (Exception unused) {
            return PlaybackSettings.INSTANCE.getLocalDefaultPlaybackSettings();
        }
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(PlaybackSettings p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("video_config_settings", new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(p0));
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean accessaddObserverForBackInvoker() {
        int iOnSetRating = onSetRating();
        return iOnSetRating == read("current_edition", iOnSetRating);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onSetRating() {
        return AudioAttributesImplApi21Parcelizer("default_edition_key");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void getOnBackPressedDispatcherannotations() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer("_key LIKE 'edition_sync_done_v2_%'", (String[]) null);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplApi21Parcelizer(boolean p0) {
        IconCompatParcelizer("is_promo_live", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaMetadataCompat(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("buy_now_promo_text", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public void handleMediaPlayPauseIfPendingOnHandler() {
        IconCompatParcelizer("is_cross_device_sync_done", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public boolean onCustomAction() {
        return MediaBrowserCompatCustomActionResultReceiver("is_lesson_sync_done");
    }

    @Override // kotlin.BundledChunkExtractor
    public void onPlay() {
        IconCompatParcelizer("is_lesson_sync_done", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer("course_config_data", (String) null);
        RemoteActionCompatParcelizer("last_course_config_sync", 0L);
        IconCompatParcelizer("course_config_data_version", 0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void addOnConfigurationChangedListener() {
        IconCompatParcelizer("app_session_video", true);
        IconCompatParcelizer("app_session_qbank", true);
        IconCompatParcelizer("app_session_full_page", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long ParcelableVolumeInfo() {
        return MediaBrowserCompatItemReceiver("last_adb_defect_check_time_ms");
    }

    private final String read() {
        return "schema_sync".concat(String.valueOf(onRemoveQueueItem()));
    }

    @Override // kotlin.BundledChunkExtractor
    public final void getFullyDrawnReporter() {
        IconCompatParcelizer(read(), true);
    }

    private static <T> T IconCompatParcelizer(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        try {
            return (T) new ObjectMapper().readValue(str, cls);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // kotlin.BundledChunkExtractor
    public final void menuHostHelperlambda0() {
        IconCompatParcelizer("college_year_update", false);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean onPlayFromSearch() {
        return MediaBrowserCompatCustomActionResultReceiver("college_year_update");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void IconCompatParcelizer(int p0) {
        IconCompatParcelizer("device_decoder_level_v2", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onSeekTo() {
        return AudioAttributesImplApi21Parcelizer("device_decoder_level_v2");
    }

    @Override // kotlin.BundledChunkExtractor
    public final Enum onSetShuffleMode$5e726e45() throws Throwable {
        try {
            Object[] objArr = {Integer.valueOf(onSeekTo())};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1307177257);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), 11634 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 36 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -866137534, false, "IconCompatParcelizer", new Class[]{Integer.TYPE});
            }
            return (Enum) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // kotlin.BundledChunkExtractor
    public final ThemeState accessgetReportFullyDrawnExecutorp() {
        return ThemeState.INSTANCE.toThemeState(Integer.valueOf(read("video_theme", ThemeState.LIGHT_SINGLE.getValue())));
    }

    @Override // kotlin.BundledChunkExtractor
    public final void read(ThemeState p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("video_theme", ThemeState.INSTANCE.fromThemeState(p0));
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean addObserverForBackInvoker() {
        return MediaBrowserCompatCustomActionResultReceiver("video_kyc_dismissed");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void addOnUserLeaveHintListener() {
        IconCompatParcelizer("video_kyc_dismissed", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long onSkipToQueueItem() {
        return MediaBrowserCompatItemReceiver("app_install_time_ms");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void IconCompatParcelizer(long p0) {
        RemoteActionCompatParcelizer("app_install_time_ms", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onSkipToNext() {
        return AudioAttributesImplApi21Parcelizer("app_install_app_version");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void getDefaultViewModelProviderFactory() {
        IconCompatParcelizer("app_install_app_version", 496);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int onStop() {
        return AudioAttributesImplApi21Parcelizer("app_install_db_version");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void getDefaultViewModelCreationExtras() {
        IconCompatParcelizer("app_install_db_version", 120);
    }

    @Override // kotlin.BundledChunkExtractor
    public final int MediaSessionCompatToken() {
        return read("last_drm_fail_value", Integer.MAX_VALUE);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long ResultReceiver() {
        return MediaBrowserCompatItemReceiver("l_con_last_sync");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplBaseParcelizer(long p0) {
        RemoteActionCompatParcelizer("l_con_last_sync", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void read(int p0) {
        IconCompatParcelizer("last_drm_fail_value", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final MagicModuleMetaLSModel PlaybackStateCompatCustomAction() {
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("smart_recall_model");
        if (strAudioAttributesCompatParcelizer == null) {
            return null;
        }
        try {
            return (MagicModuleMetaLSModel) new setDownloadingStatesToQueued().IconCompatParcelizer(strAudioAttributesCompatParcelizer, MagicModuleMetaLSModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(MagicModuleMetaLSModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("smart_recall_model", new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(p0));
    }

    @Override // kotlin.BundledChunkExtractor
    public final void getActivityResultRegistry() {
        RemoteActionCompatParcelizer("smart_recall_download_time", System.currentTimeMillis());
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RemoteActionCompatParcelizer(MagicModuleStatusUcModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("smart_recall_result", new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(p0));
    }

    @Override // kotlin.BundledChunkExtractor
    public final MagicModuleStatusUcModel r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("smart_recall_result");
        if (strAudioAttributesCompatParcelizer == null) {
            return null;
        }
        try {
            return (MagicModuleStatusUcModel) new setDownloadingStatesToQueued().IconCompatParcelizer(strAudioAttributesCompatParcelizer, MagicModuleStatusUcModel.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // kotlin.BundledChunkExtractor
    public final void onPause() {
        IconCompatParcelizer("smart_recall_model", (String) null);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void onFastForward() {
        IconCompatParcelizer("smart_recall_result", (String) null);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean getOnBackPressedDispatcher() {
        if (MediaBrowserCompatItemReceiver("smart_recall_download_time") == 0) {
            return false;
        }
        fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
        return !fromAdPlaybackState.IconCompatParcelizer(r0, System.currentTimeMillis());
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatMediaItem(long p0) {
        RemoteActionCompatParcelizer("notes_purchase_date", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final long r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        return MediaBrowserCompatItemReceiver("notes_purchase_date");
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean addObserverForBackInvokerlambda7() {
        return write("smart_recall_intro_shown", false);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void addOnTrimMemoryListener() {
        IconCompatParcelizer("smart_recall_intro_shown", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void onMediaButtonEvent() {
        IconCompatParcelizer("courses_key_server", "");
    }

    @Override // kotlin.BundledChunkExtractor
    public final long onSkipToPrevious() {
        return AudioAttributesCompatParcelizer("image_token_expiry_timestamp", 0L);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatMediaItem(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("image_token", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void write(long p0) {
        RemoteActionCompatParcelizer("image_token_expiry_timestamp", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean accessensureViewModelStore() {
        return MediaBrowserCompatCustomActionResultReceiver("is_dark_mode_experiment_on");
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean accessonBackPresseds1027565324() {
        return MediaBrowserCompatCustomActionResultReceiver("is_web_experiment_enabled");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void AudioAttributesImplApi26Parcelizer(boolean p0) {
        IconCompatParcelizer("is_web_experiment_enabled", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaMetadataCompat(long p0) {
        RemoteActionCompatParcelizer("module_created_at", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean createFullyDrawnExecutor() {
        return System.currentTimeMillis() >= MediaBrowserCompatItemReceiver("module_created_at");
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatSearchResultReceiver(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        IconCompatParcelizer("file_integrity_hash", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void MediaBrowserCompatCustomActionResultReceiver(long p0) {
        RemoteActionCompatParcelizer("last_known_playback_error_time", p0);
    }

    @Override // kotlin.BundledChunkExtractor
    public final boolean addMenuProvider() {
        return write("experimental_gui_pipeline", false);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void RatingCompat(boolean p0) {
        IconCompatParcelizer("experimental_gui_pipeline", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void addOnNewIntentListener() {
        AudioAttributesImplApi26Parcelizer(false);
        MediaMetadataCompat(0L);
    }

    @Override // kotlin.BundledChunkExtractor
    public final void addOnContextAvailableListener() {
        IconCompatParcelizer("is_dark_mode_experiment_on", true);
    }

    @Override // kotlin.BundledChunkExtractor
    public void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }

    @Override // kotlin.BundledChunkExtractor
    public void write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
    }
}
