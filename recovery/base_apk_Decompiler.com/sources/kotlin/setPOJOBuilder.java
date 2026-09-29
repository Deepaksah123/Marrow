package kotlin;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0013J+\u0010\u001f\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001f\u0010 J#\u0010\u001f\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010!JA\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\u0006\u0010%\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001f\u0010&J9\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010'J)\u0010(\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0017¢\u0006\u0004\b(\u0010)J!\u0010(\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010*J?\u0010(\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011H\u0017¢\u0006\u0004\b(\u0010+J7\u0010(\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010,J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010\u0013J\u0017\u0010/\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010\u0017J\u001f\u00100\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"H\u0016¢\u0006\u0004\b5\u00101J\u0019\u00107\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b9\u00108J\u0017\u0010:\u001a\u00020\n2\u0006\u0010\u0005\u001a\u000206H\u0017¢\u0006\u0004\b:\u00108J\u001f\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020;H\u0017¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020;H\u0017¢\u0006\u0004\b<\u0010>J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b<\u0010?J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010\bJ7\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020;H\u0017¢\u0006\u0004\b<\u0010@J/\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b<\u0010AJ/\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\bC\u0010?J\u0017\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\bJ/\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bC\u0010AJ/\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\bC\u0010BJ\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020D2\u0006\u0010\u001d\u001a\u00020;H\u0017¢\u0006\u0004\bE\u0010FJ\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010GJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020DH\u0016¢\u0006\u0004\bH\u0010GJ\u0011\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020NH\u0017¢\u0006\u0004\bO\u0010PJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\bO\u0010?J\u001f\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020D2\u0006\u0010\u001d\u001a\u00020NH\u0017¢\u0006\u0004\bO\u0010QJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020DH\u0016¢\u0006\u0004\bO\u0010GJ7\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020NH\u0017¢\u0006\u0004\bO\u0010RJ/\u0010O\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\bO\u0010AJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u001f\u0010T\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020S2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\bT\u0010VJ\u001f\u0010T\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020S2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\bT\u0010WJ7\u0010X\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\bX\u0010YJO\u0010X\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\u00062\u0006\u0010[\u001a\u00020\u001cH\u0016¢\u0006\u0004\bX\u0010\\J/\u0010]\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b]\u0010^J1\u0010_\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b_\u0010`J3\u0010_\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b_\u0010aJ3\u0010_\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b_\u0010bJY\u0010_\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020\u00112\u0006\u0010[\u001a\u00020\u00062\b\u0010d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b_\u0010eJY\u0010_\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020\u00112\u0006\u0010[\u001a\u00020\u00062\b\u0010d\u001a\u0004\u0018\u00010\u001cH\u0017¢\u0006\u0004\b_\u0010fJ)\u0010_\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u001d\u001a\u0002062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b_\u0010gJS\u0010i\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020h2\u0006\u0010$\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010c2\u0006\u0010Z\u001a\u00020\u00112\b\u0010[\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\bi\u0010jJ/\u0010k\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\bm\u0010\u0017J\u0017\u0010m\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020nH\u0016¢\u0006\u0004\bm\u0010oJ\u001f\u0010m\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020pH\u0016¢\u0006\u0004\bm\u0010qJ\u001f\u0010m\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020rH\u0016¢\u0006\u0004\bm\u0010sJ\u001f\u0010m\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020n2\u0006\u0010\u001d\u001a\u00020rH\u0016¢\u0006\u0004\bm\u0010tJ7\u0010u\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\bu\u0010vJ/\u0010w\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020h2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\bw\u0010xJ\u001f\u0010w\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020h2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bw\u0010yJ\u001f\u0010z\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bz\u0010{J7\u0010z\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\bz\u0010vJ\u0017\u0010|\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b|\u0010}J*\u0010\u007f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020~2\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J*\u0010\u007f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020~2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0005\b\u007f\u0010\u0081\u0001J\"\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020D2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J*\u0010\u0084\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J3\u0010\u0086\u0001\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010h2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u0086\u0001\u0010xJ!\u0010\u0086\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020h2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u0086\u0001\u0010yJ;\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u0087\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020h2\u0006\u0010$\u001a\u00020\u001cH\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J+\u0010\u0088\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u008a\u00012\u0006\u0010\u001d\u001a\u00020h2\u0006\u0010\u001e\u001a\u00020\u001cH\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u008b\u0001J!\u0010\u008c\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u008c\u0001\u0010{J\"\u0010\u008c\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J9\u0010\u008c\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u008c\u0001\u0010vJ*\u0010\u008e\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J2\u0010\u0090\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001JJ\u0010\u0090\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0092\u0001JJ\u0010\u0093\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J:\u0010\u0093\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020h2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020h2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0095\u0001JK\u0010\u0097\u0001\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020c2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020h2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0007\u0010%\u001a\u00030\u0096\u00012\u0006\u0010Z\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001JC\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u0087\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J3\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u008a\u00012\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009b\u0001JC\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u008a\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009c\u0001JC\u0010\u0099\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u009d\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009e\u0001JK\u0010\u009f\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u0087\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020D2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J;\u0010\u009f\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u008a\u00012\u0006\u0010\u001d\u001a\u00020D2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0006\b\u009f\u0001\u0010¡\u0001J[\u0010¢\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u0087\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u001cH\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J[\u0010¢\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030\u009d\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u001cH\u0016¢\u0006\u0006\b¢\u0001\u0010¤\u0001J[\u0010¢\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030¥\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\"2\u0006\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u001cH\u0016¢\u0006\u0006\b¢\u0001\u0010¦\u0001J}\u0010¬\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030§\u00012\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020h2\u0006\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010h2\u0006\u0010%\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010c2\u0006\u0010[\u001a\u00020\u00112\t\u0010d\u001a\u0005\u0018\u00010¨\u00012\u0007\u0010©\u0001\u001a\u00020\u00112\u0007\u0010ª\u0001\u001a\u00020\u00112\u0007\u0010«\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001b\u0010¯\u0001\u001a\u00020\n2\u0007\u0010\u0005\u001a\u00030®\u0001H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001R#\u0010´\u0001\u001a\u0004\u0018\u00010\u00018\u0000@\u0001X\u0080\u000e¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\"\u0006\b±\u0001\u0010³\u0001R\u0017\u0010·\u0001\u001a\u00020\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001"}, d2 = {"Lo/setPOJOBuilder;", "Landroid/graphics/Canvas;", "<init>", "()V", "Landroid/graphics/Rect;", "p0", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "p1", "p2", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "p3", "p4", "p5", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "restoreToCount", "translate", "(FF)V", "scale", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "getMatrix", "Landroid/graphics/Region$Op;", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "drawPicture", "(Landroid/graphics/Picture;)V", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "p6", "p7", "(FFFFFFZLandroid/graphics/Paint;)V", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "p8", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "Landroid/graphics/fonts/Font;", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "", "p9", "p10", "p11", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "IconCompatParcelizer", "Landroid/graphics/Canvas;", "(Landroid/graphics/Canvas;)V", "write", "RemoteActionCompatParcelizer", "()Landroid/graphics/Canvas;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setPOJOBuilder extends Canvas {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Canvas write;

    public final void IconCompatParcelizer(Canvas canvas) {
        this.write = canvas;
    }

    private final Canvas RemoteActionCompatParcelizer() {
        Canvas canvas = this.write;
        if (canvas != null) {
            return canvas;
        }
        withStackTrace.IconCompatParcelizer("Text drawing wrapper is missing a Canvas!");
        throw new PlanDetailsCreator();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect p0) {
        boolean clipBounds = RemoteActionCompatParcelizer().getClipBounds(p0);
        if (clipBounds) {
            p0.set(0, 0, p0.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap p0) {
        RemoteActionCompatParcelizer().setBitmap(p0);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        _handleBadAccess.INSTANCE.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer());
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        _handleBadAccess.INSTANCE.write(RemoteActionCompatParcelizer());
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return RemoteActionCompatParcelizer().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return RemoteActionCompatParcelizer().getWidth();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return RemoteActionCompatParcelizer().getHeight();
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return RemoteActionCompatParcelizer().getDensity();
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int p0) {
        RemoteActionCompatParcelizer().setDensity(p0);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return RemoteActionCompatParcelizer().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return RemoteActionCompatParcelizer().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return RemoteActionCompatParcelizer().save();
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final int saveLayer(RectF p0, Paint p1, int p2) {
        return RemoteActionCompatParcelizer().saveLayer(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF p0, Paint p1) {
        return RemoteActionCompatParcelizer().saveLayer(p0, p1);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final int saveLayer(float p0, float p1, float p2, float p3, Paint p4, int p5) {
        return RemoteActionCompatParcelizer().saveLayer(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float p0, float p1, float p2, float p3, Paint p4) {
        return RemoteActionCompatParcelizer().saveLayer(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final int saveLayerAlpha(RectF p0, int p1, int p2) {
        return RemoteActionCompatParcelizer().saveLayerAlpha(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF p0, int p1) {
        return RemoteActionCompatParcelizer().saveLayerAlpha(p0, p1);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final int saveLayerAlpha(float p0, float p1, float p2, float p3, int p4, int p5) {
        return RemoteActionCompatParcelizer().saveLayerAlpha(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float p0, float p1, float p2, float p3, int p4) {
        return RemoteActionCompatParcelizer().saveLayerAlpha(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        RemoteActionCompatParcelizer().restore();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return RemoteActionCompatParcelizer().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int p0) {
        RemoteActionCompatParcelizer().restoreToCount(p0);
    }

    @Override // android.graphics.Canvas
    public final void translate(float p0, float p1) {
        RemoteActionCompatParcelizer().translate(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void scale(float p0, float p1) {
        RemoteActionCompatParcelizer().scale(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float p0) {
        RemoteActionCompatParcelizer().rotate(p0);
    }

    @Override // android.graphics.Canvas
    public final void skew(float p0, float p1) {
        RemoteActionCompatParcelizer().skew(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix p0) {
        RemoteActionCompatParcelizer().concat(p0);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix p0) {
        RemoteActionCompatParcelizer().setMatrix(p0);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final void getMatrix(Matrix p0) {
        RemoteActionCompatParcelizer().getMatrix(p0);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final boolean clipRect(RectF p0, Region.Op p1) {
        return RemoteActionCompatParcelizer().clipRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final boolean clipRect(Rect p0, Region.Op p1) {
        return RemoteActionCompatParcelizer().clipRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF p0) {
        return RemoteActionCompatParcelizer().clipRect(p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect p0) {
        return RemoteActionCompatParcelizer().clipRect(p0);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final boolean clipRect(float p0, float p1, float p2, float p3, Region.Op p4) {
        return RemoteActionCompatParcelizer().clipRect(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float p0, float p1, float p2, float p3) {
        return RemoteActionCompatParcelizer().clipRect(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int p0, int p1, int p2, int p3) {
        return RemoteActionCompatParcelizer().clipRect(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF p0) {
        return addCreatorProperty.INSTANCE.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect p0) {
        return addCreatorProperty.INSTANCE.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float p0, float p1, float p2, float p3) {
        return addCreatorProperty.INSTANCE.IconCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int p0, int p1, int p2, int p3) {
        return addCreatorProperty.INSTANCE.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final boolean clipPath(Path p0, Region.Op p1) {
        return RemoteActionCompatParcelizer().clipPath(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path p0) {
        return RemoteActionCompatParcelizer().clipPath(p0);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path p0) {
        return addCreatorProperty.INSTANCE.write(RemoteActionCompatParcelizer(), p0);
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return RemoteActionCompatParcelizer().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter p0) {
        RemoteActionCompatParcelizer().setDrawFilter(p0);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final boolean quickReject(RectF p0, Canvas.EdgeType p1) {
        return RemoteActionCompatParcelizer().quickReject(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF p0) {
        return _findCaseInsensitivity.INSTANCE.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), p0);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final boolean quickReject(Path p0, Canvas.EdgeType p1) {
        return RemoteActionCompatParcelizer().quickReject(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path p0) {
        return _findCaseInsensitivity.INSTANCE.write(RemoteActionCompatParcelizer(), p0);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final boolean quickReject(float p0, float p1, float p2, float p3, Canvas.EdgeType p4) {
        return RemoteActionCompatParcelizer().quickReject(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float p0, float p1, float p2, float p3) {
        return _findCaseInsensitivity.INSTANCE.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture p0) {
        RemoteActionCompatParcelizer().drawPicture(p0);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture p0, RectF p1) {
        RemoteActionCompatParcelizer().drawPicture(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture p0, Rect p1) {
        RemoteActionCompatParcelizer().drawPicture(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF p0, float p1, float p2, boolean p3, Paint p4) {
        RemoteActionCompatParcelizer().drawArc(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, Paint p7) {
        RemoteActionCompatParcelizer().drawArc(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int p0, int p1, int p2, int p3) {
        RemoteActionCompatParcelizer().drawARGB(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, float p1, float p2, Paint p3) {
        RemoteActionCompatParcelizer().drawBitmap(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, Rect p1, RectF p2, Paint p3) {
        RemoteActionCompatParcelizer().drawBitmap(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, Rect p1, Rect p2, Paint p3) {
        RemoteActionCompatParcelizer().drawBitmap(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final void drawBitmap(int[] p0, int p1, int p2, float p3, float p4, int p5, int p6, boolean p7, Paint p8) {
        RemoteActionCompatParcelizer().drawBitmap(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final void drawBitmap(int[] p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7, Paint p8) {
        RemoteActionCompatParcelizer().drawBitmap(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap p0, Matrix p1, Paint p2) {
        RemoteActionCompatParcelizer().drawBitmap(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap p0, int p1, int p2, float[] p3, int p4, int[] p5, int p6, Paint p7) {
        RemoteActionCompatParcelizer().drawBitmapMesh(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float p0, float p1, float p2, Paint p3) {
        RemoteActionCompatParcelizer().drawCircle(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int p0) {
        RemoteActionCompatParcelizer().drawColor(p0);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long p0) {
        _handleBadAccess.INSTANCE.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), p0);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int p0, PorterDuff.Mode p1) {
        RemoteActionCompatParcelizer().drawColor(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int p0, BlendMode p1) {
        _handleBadAccess.INSTANCE.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long p0, BlendMode p1) {
        _handleBadAccess.INSTANCE.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float p0, float p1, float p2, float p3, Paint p4) {
        RemoteActionCompatParcelizer().drawLine(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] p0, int p1, int p2, Paint p3) {
        RemoteActionCompatParcelizer().drawLines(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] p0, Paint p1) {
        RemoteActionCompatParcelizer().drawLines(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF p0, Paint p1) {
        RemoteActionCompatParcelizer().drawOval(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float p0, float p1, float p2, float p3, Paint p4) {
        RemoteActionCompatParcelizer().drawOval(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint p0) {
        RemoteActionCompatParcelizer().drawPaint(p0);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch p0, Rect p1, Paint p2) {
        _fixAccess.INSTANCE.IconCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch p0, RectF p1, Paint p2) {
        _fixAccess.INSTANCE.read(RemoteActionCompatParcelizer(), p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path p0, Paint p1) {
        RemoteActionCompatParcelizer().drawPath(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float p0, float p1, Paint p2) {
        RemoteActionCompatParcelizer().drawPoint(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] p0, int p1, int p2, Paint p3) {
        RemoteActionCompatParcelizer().drawPoints(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] p0, Paint p1) {
        RemoteActionCompatParcelizer().drawPoints(p0, p1);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final void drawPosText(char[] p0, int p1, int p2, float[] p3, Paint p4) {
        RemoteActionCompatParcelizer().drawPosText(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    @getRenewGrpId
    public final void drawPosText(String p0, float[] p1, Paint p2) {
        RemoteActionCompatParcelizer().drawPosText(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF p0, Paint p1) {
        RemoteActionCompatParcelizer().drawRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect p0, Paint p1) {
        RemoteActionCompatParcelizer().drawRect(p0, p1);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float p0, float p1, float p2, float p3, Paint p4) {
        RemoteActionCompatParcelizer().drawRect(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int p0, int p1, int p2) {
        RemoteActionCompatParcelizer().drawRGB(p0, p1, p2);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF p0, float p1, float p2, Paint p3) {
        RemoteActionCompatParcelizer().drawRoundRect(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, Paint p6) {
        RemoteActionCompatParcelizer().drawRoundRect(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF p0, float p1, float p2, RectF p3, float p4, float p5, Paint p6) {
        _handleBadAccess.INSTANCE.read(RemoteActionCompatParcelizer(), p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF p0, float[] p1, RectF p2, float[] p3, Paint p4) {
        _handleBadAccess.INSTANCE.write(RemoteActionCompatParcelizer(), p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] p0, int p1, float[] p2, int p3, int p4, Font p5, Paint p6) {
        _fixAccess.INSTANCE.write(RemoteActionCompatParcelizer(), p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] p0, int p1, int p2, float p3, float p4, Paint p5) {
        RemoteActionCompatParcelizer().drawText(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String p0, float p1, float p2, Paint p3) {
        RemoteActionCompatParcelizer().drawText(p0, p1, p2, p3);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String p0, int p1, int p2, float p3, float p4, Paint p5) {
        RemoteActionCompatParcelizer().drawText(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence p0, int p1, int p2, float p3, float p4, Paint p5) {
        RemoteActionCompatParcelizer().drawText(p0, p1, p2, p3, p4, p5);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] p0, int p1, int p2, Path p3, float p4, float p5, Paint p6) {
        RemoteActionCompatParcelizer().drawTextOnPath(p0, p1, p2, p3, p4, p5, p6);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String p0, Path p1, float p2, float p3, Paint p4) {
        RemoteActionCompatParcelizer().drawTextOnPath(p0, p1, p2, p3, p4);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, Paint p8) {
        _collectAliases.INSTANCE.IconCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, Paint p8) {
        _collectAliases.INSTANCE.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, Paint p8) {
        _handleBadAccess.INSTANCE.read(RemoteActionCompatParcelizer(), p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode p0, int p1, float[] p2, int p3, float[] p4, int p5, int[] p6, int p7, short[] p8, int p9, int p10, Paint p11) {
        RemoteActionCompatParcelizer().drawVertices(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode p0) {
        _handleBadAccess.INSTANCE.write(RemoteActionCompatParcelizer(), p0);
    }
}
