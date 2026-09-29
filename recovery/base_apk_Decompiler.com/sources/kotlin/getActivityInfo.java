package kotlin;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin._verifyNullForScalarCoercion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class getActivityInfo extends getApplicationEnabledSetting {
    static final PorterDuff.Mode AudioAttributesCompatParcelizer = PorterDuff.Mode.SRC_IN;
    private final Rect AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final float[] AudioAttributesImplBaseParcelizer;
    private PorterDuffColorFilter MediaBrowserCompatCustomActionResultReceiver;
    private final Matrix MediaBrowserCompatItemReceiver;
    private MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatSearchResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    private Drawable.ConstantState read;
    private ColorFilter write;

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    getActivityInfo() {
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesImplBaseParcelizer = new float[9];
        this.MediaBrowserCompatItemReceiver = new Matrix();
        this.AudioAttributesImplApi21Parcelizer = new Rect();
        this.MediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatCustomActionResultReceiver();
    }

    getActivityInfo(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        this.RemoteActionCompatParcelizer = true;
        this.AudioAttributesImplBaseParcelizer = new float[9];
        this.MediaBrowserCompatItemReceiver = new Matrix();
        this.AudioAttributesImplApi21Parcelizer = new Rect();
        this.MediaBrowserCompatSearchResultReceiver = mediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer, mediaBrowserCompatCustomActionResultReceiver.RatingCompat);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.mutate();
            return this;
        }
        if (!this.AudioAttributesImplApi26Parcelizer && super.mutate() == this) {
            this.MediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatSearchResultReceiver);
            this.AudioAttributesImplApi26Parcelizer = true;
        }
        return this;
    }

    Object RemoteActionCompatParcelizer(String str) {
        return this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.IconCompatParcelizer != null) {
            return new AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer.getConstantState());
        }
        this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver = getChangingConfigurations();
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.draw(canvas);
            return;
        }
        copyBounds(this.AudioAttributesImplApi21Parcelizer);
        if (this.AudioAttributesImplApi21Parcelizer.width() <= 0 || this.AudioAttributesImplApi21Parcelizer.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.write;
        if (colorFilter == null) {
            colorFilter = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        canvas.getMatrix(this.MediaBrowserCompatItemReceiver);
        this.MediaBrowserCompatItemReceiver.getValues(this.AudioAttributesImplBaseParcelizer);
        float fAbs = Math.abs(this.AudioAttributesImplBaseParcelizer[0]);
        float fAbs2 = Math.abs(this.AudioAttributesImplBaseParcelizer[4]);
        float fAbs3 = Math.abs(this.AudioAttributesImplBaseParcelizer[1]);
        float fAbs4 = Math.abs(this.AudioAttributesImplBaseParcelizer[3]);
        if (fAbs3 != BitmapDescriptorFactory.HUE_RED || fAbs4 != BitmapDescriptorFactory.HUE_RED) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.AudioAttributesImplApi21Parcelizer.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.AudioAttributesImplApi21Parcelizer.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.AudioAttributesImplApi21Parcelizer.left, this.AudioAttributesImplApi21Parcelizer.top);
        if (RemoteActionCompatParcelizer()) {
            canvas.translate(this.AudioAttributesImplApi21Parcelizer.width(), BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        this.AudioAttributesImplApi21Parcelizer.offsetTo(0, 0);
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(iMin, iMin2);
        if (!this.RemoteActionCompatParcelizer) {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(iMin, iMin2);
        } else if (!this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer()) {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(iMin, iMin2);
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer();
        }
        this.MediaBrowserCompatSearchResultReceiver.write(canvas, colorFilter, this.AudioAttributesImplApi21Parcelizer);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.IconCompatParcelizer != null) {
            return findFormatOverrides.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        return this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.setAlpha(i);
        } else if (this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat.getRootAlpha() != i) {
            this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.setColorFilter(colorFilter);
        } else {
            this.write = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        if (this.IconCompatParcelizer != null) {
            return findFormatOverrides.read(this.IconCompatParcelizer);
        }
        return this.write;
    }

    PorterDuffColorFilter IconCompatParcelizer(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, colorStateList);
            return;
        }
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
        if (mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer != colorStateList) {
            mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer = colorStateList;
            this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, colorStateList, mediaBrowserCompatCustomActionResultReceiver.RatingCompat);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.read(this.IconCompatParcelizer, mode);
            return;
        }
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
        if (mediaBrowserCompatCustomActionResultReceiver.RatingCompat != mode) {
            mediaBrowserCompatCustomActionResultReceiver.RatingCompat = mode;
            this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
        if (mediaBrowserCompatCustomActionResultReceiver == null) {
            return false;
        }
        if (mediaBrowserCompatCustomActionResultReceiver.read()) {
            return true;
        }
        return this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer != null && this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.setState(iArr);
        }
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
        if (mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer == null || mediaBrowserCompatCustomActionResultReceiver.RatingCompat == null) {
            z = false;
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer, mediaBrowserCompatCustomActionResultReceiver.RatingCompat);
            invalidateSelf();
            z = true;
        }
        if (!mediaBrowserCompatCustomActionResultReceiver.read() || !mediaBrowserCompatCustomActionResultReceiver.write(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getIntrinsicWidth();
        }
        return (int) this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat.write;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getIntrinsicHeight();
        }
        return (int) this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat.read;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.IconCompatParcelizer == null) {
            return false;
        }
        findFormatOverrides.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.IconCompatParcelizer != null) {
            return findFormatOverrides.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
        }
        return this.MediaBrowserCompatSearchResultReceiver.write;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.read(this.IconCompatParcelizer, z);
        } else {
            this.MediaBrowserCompatSearchResultReceiver.write = z;
        }
    }

    public static getActivityInfo AudioAttributesCompatParcelizer(Resources resources, int i, Resources.Theme theme) {
        getActivityInfo getactivityinfo = new getActivityInfo();
        getactivityinfo.IconCompatParcelizer = _parseDoublePrimitive.read(resources, i, theme);
        getactivityinfo.read = new AudioAttributesImplApi21Parcelizer(getactivityinfo.IconCompatParcelizer.getConstantState());
        return getactivityinfo;
    }

    static int AudioAttributesCompatParcelizer(int i, float f) {
        return (((int) (Color.alpha(i) * f)) << 24) | (16777215 & i);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.RemoteActionCompatParcelizer(this.IconCompatParcelizer, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
        mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat = new AudioAttributesImplBaseParcelizer();
        TypedArray typedArrayWrite = _parseLongPrimitive.write(resources, theme, attributeSet, currentToCanonicalPackageNames.MediaBrowserCompatCustomActionResultReceiver);
        AudioAttributesCompatParcelizer(typedArrayWrite, xmlPullParser, theme);
        typedArrayWrite.recycle();
        mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = getChangingConfigurations();
        mediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer = true;
        write(resources, xmlPullParser, attributeSet, theme);
        this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer, mediaBrowserCompatCustomActionResultReceiver.RatingCompat);
    }

    private static PorterDuff.Mode RemoteActionCompatParcelizer(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void AudioAttributesCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat;
        mediaBrowserCompatCustomActionResultReceiver.RatingCompat = RemoteActionCompatParcelizer(_parseLongPrimitive.read(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = _parseLongPrimitive.read(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateList != null) {
            mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer = colorStateList;
        }
        mediaBrowserCompatCustomActionResultReceiver.write = _parseLongPrimitive.read(typedArray, xmlPullParser, "autoMirrored", 5, mediaBrowserCompatCustomActionResultReceiver.write);
        audioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver = _parseLongPrimitive.read(typedArray, xmlPullParser, "viewportWidth", 7, audioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver);
        audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "viewportHeight", 8, audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer);
        if (audioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        }
        if (audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArray.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        audioAttributesImplBaseParcelizer.write = typedArray.getDimension(3, audioAttributesImplBaseParcelizer.write);
        audioAttributesImplBaseParcelizer.read = typedArray.getDimension(2, audioAttributesImplBaseParcelizer.read);
        if (audioAttributesImplBaseParcelizer.write <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(typedArray.getPositionDescription());
            sb3.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        if (audioAttributesImplBaseParcelizer.read <= BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(typedArray.getPositionDescription());
            sb4.append("<vector> tag requires height > 0");
            throw new XmlPullParserException(sb4.toString());
        }
        audioAttributesImplBaseParcelizer.setAlpha(_parseLongPrimitive.read(typedArray, xmlPullParser, "alpha", 4, audioAttributesImplBaseParcelizer.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer = string;
            audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver.put(string, audioAttributesImplBaseParcelizer);
        }
    }

    private void write(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(audioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) arrayDeque.peek();
                if ("path".equals(name)) {
                    write writeVar = new write();
                    writeVar.write(resources, attributeSet, theme, xmlPullParser);
                    iconCompatParcelizer.IconCompatParcelizer.add(writeVar);
                    if (writeVar.getPathName() != null) {
                        audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver.put(writeVar.getPathName(), writeVar);
                    }
                    mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = writeVar.RatingCompat | mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
                    audioAttributesCompatParcelizer.IconCompatParcelizer(resources, attributeSet, theme, xmlPullParser);
                    iconCompatParcelizer.IconCompatParcelizer.add(audioAttributesCompatParcelizer);
                    if (audioAttributesCompatParcelizer.getPathName() != null) {
                        audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver.put(audioAttributesCompatParcelizer.getPathName(), audioAttributesCompatParcelizer);
                    }
                    mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.RatingCompat | mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver;
                } else if ("group".equals(name)) {
                    IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
                    iconCompatParcelizer2.RemoteActionCompatParcelizer(resources, attributeSet, theme, xmlPullParser);
                    iconCompatParcelizer.IconCompatParcelizer.add(iconCompatParcelizer2);
                    arrayDeque.push(iconCompatParcelizer2);
                    if (iconCompatParcelizer2.getGroupName() != null) {
                        audioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver.put(iconCompatParcelizer2.getGroupName(), iconCompatParcelizer2);
                    }
                    mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver = iconCompatParcelizer2.RemoteActionCompatParcelizer | mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    void IconCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    private boolean RemoteActionCompatParcelizer() {
        return isAutoMirrored() && findFormatOverrides.write(this) == 1;
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getChangingConfigurations();
        }
        return this.MediaBrowserCompatSearchResultReceiver.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends Drawable.ConstantState {
        private final Drawable.ConstantState write;

        public AudioAttributesImplApi21Parcelizer(Drawable.ConstantState constantState) {
            this.write = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            getActivityInfo getactivityinfo = new getActivityInfo();
            getactivityinfo.IconCompatParcelizer = (VectorDrawable) this.write.newDrawable();
            return getactivityinfo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            getActivityInfo getactivityinfo = new getActivityInfo();
            getactivityinfo.IconCompatParcelizer = (VectorDrawable) this.write.newDrawable(resources);
            return getactivityinfo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            getActivityInfo getactivityinfo = new getActivityInfo();
            getactivityinfo.IconCompatParcelizer = (VectorDrawable) this.write.newDrawable(resources, theme);
            return getactivityinfo;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.write.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.write.getChangingConfigurations();
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver extends Drawable.ConstantState {
        Bitmap AudioAttributesCompatParcelizer;
        ColorStateList AudioAttributesImplApi21Parcelizer;
        ColorStateList AudioAttributesImplApi26Parcelizer;
        PorterDuff.Mode AudioAttributesImplBaseParcelizer;
        boolean IconCompatParcelizer;
        Paint MediaBrowserCompatCustomActionResultReceiver;
        int MediaBrowserCompatItemReceiver;
        AudioAttributesImplBaseParcelizer MediaDescriptionCompat;
        PorterDuff.Mode RatingCompat;
        int RemoteActionCompatParcelizer;
        boolean read;
        boolean write;

        public MediaBrowserCompatCustomActionResultReceiver(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesImplApi26Parcelizer = null;
            this.RatingCompat = getActivityInfo.AudioAttributesCompatParcelizer;
            if (mediaBrowserCompatCustomActionResultReceiver != null) {
                this.MediaBrowserCompatItemReceiver = mediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver;
                this.MediaDescriptionCompat = new AudioAttributesImplBaseParcelizer(mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat);
                if (mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat.IconCompatParcelizer != null) {
                    this.MediaDescriptionCompat.IconCompatParcelizer = new Paint(mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat.IconCompatParcelizer);
                }
                if (mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat.MediaBrowserCompatItemReceiver != null) {
                    this.MediaDescriptionCompat.MediaBrowserCompatItemReceiver = new Paint(mediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat.MediaBrowserCompatItemReceiver);
                }
                this.AudioAttributesImplApi26Parcelizer = mediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer;
                this.RatingCompat = mediaBrowserCompatCustomActionResultReceiver.RatingCompat;
                this.write = mediaBrowserCompatCustomActionResultReceiver.write;
            }
        }

        public void write(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.AudioAttributesCompatParcelizer, (Rect) null, rect, AudioAttributesCompatParcelizer(colorFilter));
        }

        public boolean IconCompatParcelizer() {
            return this.MediaDescriptionCompat.getRootAlpha() < 255;
        }

        public Paint AudioAttributesCompatParcelizer(ColorFilter colorFilter) {
            if (!IconCompatParcelizer() && colorFilter == null) {
                return null;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                Paint paint = new Paint();
                this.MediaBrowserCompatCustomActionResultReceiver = paint;
                paint.setFilterBitmap(true);
            }
            this.MediaBrowserCompatCustomActionResultReceiver.setAlpha(this.MediaDescriptionCompat.getRootAlpha());
            this.MediaBrowserCompatCustomActionResultReceiver.setColorFilter(colorFilter);
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public void AudioAttributesCompatParcelizer(int i, int i2) {
            this.AudioAttributesCompatParcelizer.eraseColor(0);
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(new Canvas(this.AudioAttributesCompatParcelizer), i, i2, (ColorFilter) null);
        }

        public void RemoteActionCompatParcelizer(int i, int i2) {
            if (this.AudioAttributesCompatParcelizer == null || !write(i, i2)) {
                this.AudioAttributesCompatParcelizer = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.IconCompatParcelizer = true;
            }
        }

        public boolean write(int i, int i2) {
            return i == this.AudioAttributesCompatParcelizer.getWidth() && i2 == this.AudioAttributesCompatParcelizer.getHeight();
        }

        public boolean RemoteActionCompatParcelizer() {
            return !this.IconCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == this.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplBaseParcelizer == this.RatingCompat && this.read == this.write && this.RemoteActionCompatParcelizer == this.MediaDescriptionCompat.getRootAlpha();
        }

        public void AudioAttributesCompatParcelizer() {
            this.AudioAttributesImplApi21Parcelizer = this.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesImplBaseParcelizer = this.RatingCompat;
            this.RemoteActionCompatParcelizer = this.MediaDescriptionCompat.getRootAlpha();
            this.read = this.write;
            this.IconCompatParcelizer = false;
        }

        public MediaBrowserCompatCustomActionResultReceiver() {
            this.AudioAttributesImplApi26Parcelizer = null;
            this.RatingCompat = getActivityInfo.AudioAttributesCompatParcelizer;
            this.MediaDescriptionCompat = new AudioAttributesImplBaseParcelizer();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new getActivityInfo(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new getActivityInfo(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public boolean read() {
            return this.MediaDescriptionCompat.IconCompatParcelizer();
        }

        public boolean write(int[] iArr) {
            boolean zWrite = this.MediaDescriptionCompat.write(iArr);
            this.IconCompatParcelizer |= zWrite;
            return zWrite;
        }
    }

    static class AudioAttributesImplBaseParcelizer {
        private static final Matrix MediaBrowserCompatMediaItem = new Matrix();
        int AudioAttributesCompatParcelizer;
        String AudioAttributesImplApi21Parcelizer;
        final IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
        float AudioAttributesImplBaseParcelizer;
        Paint IconCompatParcelizer;
        final setTitleOptional<String, Object> MediaBrowserCompatCustomActionResultReceiver;
        Paint MediaBrowserCompatItemReceiver;
        float MediaBrowserCompatSearchResultReceiver;
        private final Path MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private final Matrix MediaMetadataCompat;
        private final Path RatingCompat;
        Boolean RemoteActionCompatParcelizer;
        private PathMeasure onCommand;
        float read;
        float write;

        private static float AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public AudioAttributesImplBaseParcelizer() {
            this.MediaMetadataCompat = new Matrix();
            this.write = BitmapDescriptorFactory.HUE_RED;
            this.read = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatSearchResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesCompatParcelizer = 255;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.RemoteActionCompatParcelizer = null;
            this.MediaBrowserCompatCustomActionResultReceiver = new setTitleOptional<>();
            this.AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer();
            this.RatingCompat = new Path();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path();
        }

        public void setRootAlpha(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public int getRootAlpha() {
            return this.AudioAttributesCompatParcelizer;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public AudioAttributesImplBaseParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            this.MediaMetadataCompat = new Matrix();
            this.write = BitmapDescriptorFactory.HUE_RED;
            this.read = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatSearchResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesCompatParcelizer = 255;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.RemoteActionCompatParcelizer = null;
            setTitleOptional<String, Object> settitleoptional = new setTitleOptional<>();
            this.MediaBrowserCompatCustomActionResultReceiver = settitleoptional;
            this.AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer(audioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer, settitleoptional);
            this.RatingCompat = new Path(audioAttributesImplBaseParcelizer.RatingCompat);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Path(audioAttributesImplBaseParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            this.write = audioAttributesImplBaseParcelizer.write;
            this.read = audioAttributesImplBaseParcelizer.read;
            this.MediaBrowserCompatSearchResultReceiver = audioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver;
            this.AudioAttributesImplBaseParcelizer = audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer;
            this.MediaDescriptionCompat = audioAttributesImplBaseParcelizer.MediaDescriptionCompat;
            this.AudioAttributesCompatParcelizer = audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplApi21Parcelizer = audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer;
            String str = audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer;
            if (str != null) {
                settitleoptional.put(str, this);
            }
            this.RemoteActionCompatParcelizer = audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
        }

        private void write(IconCompatParcelizer iconCompatParcelizer, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            iconCompatParcelizer.read.set(matrix);
            iconCompatParcelizer.read.preConcat(iconCompatParcelizer.AudioAttributesCompatParcelizer);
            canvas.save();
            for (int i3 = 0; i3 < iconCompatParcelizer.IconCompatParcelizer.size(); i3++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer.get(i3);
                if (remoteActionCompatParcelizer instanceof IconCompatParcelizer) {
                    write((IconCompatParcelizer) remoteActionCompatParcelizer, iconCompatParcelizer.read, canvas, i, i2, colorFilter);
                } else if (remoteActionCompatParcelizer instanceof read) {
                    IconCompatParcelizer(iconCompatParcelizer, (read) remoteActionCompatParcelizer, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void AudioAttributesCompatParcelizer(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            write(this.AudioAttributesImplApi26Parcelizer, MediaBrowserCompatMediaItem, canvas, i, i2, colorFilter);
        }

        private void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, read readVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f;
            float f2 = i / this.MediaBrowserCompatSearchResultReceiver;
            float f3 = i2 / this.AudioAttributesImplBaseParcelizer;
            float fMin = Math.min(f2, f3);
            Matrix matrix = iconCompatParcelizer.read;
            this.MediaMetadataCompat.set(matrix);
            this.MediaMetadataCompat.postScale(f2, f3);
            float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(matrix);
            if (fAudioAttributesCompatParcelizer != BitmapDescriptorFactory.HUE_RED) {
                readVar.write(this.RatingCompat);
                Path path = this.RatingCompat;
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.reset();
                if (readVar.IconCompatParcelizer()) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setFillType(readVar.MediaMetadataCompat == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.addPath(path, this.MediaMetadataCompat);
                    canvas.clipPath(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    return;
                }
                write writeVar = (write) readVar;
                if (writeVar.MediaBrowserCompatMediaItem != BitmapDescriptorFactory.HUE_RED || writeVar.AudioAttributesImplApi26Parcelizer != 1.0f) {
                    float f4 = writeVar.MediaBrowserCompatMediaItem;
                    float f5 = writeVar.MediaBrowserCompatCustomActionResultReceiver;
                    float f6 = writeVar.AudioAttributesImplApi26Parcelizer;
                    float f7 = writeVar.MediaBrowserCompatCustomActionResultReceiver;
                    if (this.onCommand == null) {
                        this.onCommand = new PathMeasure();
                    }
                    this.onCommand.setPath(this.RatingCompat, false);
                    float length = this.onCommand.getLength();
                    float f8 = ((f4 + f5) % 1.0f) * length;
                    float f9 = ((f6 + f7) % 1.0f) * length;
                    path.reset();
                    if (f8 > f9) {
                        this.onCommand.getSegment(f8, length, path, true);
                        PathMeasure pathMeasure = this.onCommand;
                        f = BitmapDescriptorFactory.HUE_RED;
                        pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, f9, path, true);
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                        this.onCommand.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(f, f);
                }
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.addPath(path, this.MediaMetadataCompat);
                if (writeVar.write.RemoteActionCompatParcelizer()) {
                    _parseLong _parselong = writeVar.write;
                    if (this.IconCompatParcelizer == null) {
                        Paint paint = new Paint(1);
                        this.IconCompatParcelizer = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.IconCompatParcelizer;
                    if (_parselong.AudioAttributesCompatParcelizer()) {
                        Shader shaderWrite = _parselong.write();
                        shaderWrite.setLocalMatrix(this.MediaMetadataCompat);
                        paint2.setShader(shaderWrite);
                        paint2.setAlpha(Math.round(writeVar.IconCompatParcelizer * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(getActivityInfo.AudioAttributesCompatParcelizer(_parselong.read(), writeVar.IconCompatParcelizer));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setFillType(writeVar.MediaMetadataCompat == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, paint2);
                }
                if (writeVar.read.RemoteActionCompatParcelizer()) {
                    _parseLong _parselong2 = writeVar.read;
                    if (this.MediaBrowserCompatItemReceiver == null) {
                        Paint paint3 = new Paint(1);
                        this.MediaBrowserCompatItemReceiver = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.MediaBrowserCompatItemReceiver;
                    if (writeVar.MediaBrowserCompatItemReceiver != null) {
                        paint4.setStrokeJoin(writeVar.MediaBrowserCompatItemReceiver);
                    }
                    if (writeVar.RemoteActionCompatParcelizer != null) {
                        paint4.setStrokeCap(writeVar.RemoteActionCompatParcelizer);
                    }
                    paint4.setStrokeMiter(writeVar.AudioAttributesImplApi21Parcelizer);
                    if (_parselong2.AudioAttributesCompatParcelizer()) {
                        Shader shaderWrite2 = _parselong2.write();
                        shaderWrite2.setLocalMatrix(this.MediaMetadataCompat);
                        paint4.setShader(shaderWrite2);
                        paint4.setAlpha(Math.round(writeVar.AudioAttributesCompatParcelizer * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(getActivityInfo.AudioAttributesCompatParcelizer(_parselong2.read(), writeVar.AudioAttributesCompatParcelizer));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(writeVar.AudioAttributesImplBaseParcelizer * fMin * fAudioAttributesCompatParcelizer);
                    canvas.drawPath(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, paint4);
                }
            }
        }

        private float AudioAttributesCompatParcelizer(Matrix matrix) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            return fMax > BitmapDescriptorFactory.HUE_RED ? Math.abs(fAudioAttributesCompatParcelizer) / fMax : BitmapDescriptorFactory.HUE_RED;
        }

        public boolean IconCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = Boolean.valueOf(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
            }
            return this.RemoteActionCompatParcelizer.booleanValue();
        }

        public boolean write(int[] iArr) {
            return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(iArr);
        }
    }

    static abstract class RemoteActionCompatParcelizer {
        public boolean AudioAttributesCompatParcelizer(int[] iArr) {
            return false;
        }

        public boolean RemoteActionCompatParcelizer() {
            return false;
        }

        private RemoteActionCompatParcelizer() {
        }
    }

    static class IconCompatParcelizer extends RemoteActionCompatParcelizer {
        final Matrix AudioAttributesCompatParcelizer;
        private float AudioAttributesImplApi21Parcelizer;
        private float AudioAttributesImplApi26Parcelizer;
        private float AudioAttributesImplBaseParcelizer;
        final ArrayList<RemoteActionCompatParcelizer> IconCompatParcelizer;
        private float MediaBrowserCompatCustomActionResultReceiver;
        private String MediaBrowserCompatItemReceiver;
        private int[] MediaDescriptionCompat;
        private float MediaMetadataCompat;
        private float RatingCompat;
        int RemoteActionCompatParcelizer;
        final Matrix read;
        float write;

        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, setTitleOptional<String, Object> settitleoptional) {
            read audioAttributesCompatParcelizer;
            super();
            this.read = new Matrix();
            this.IconCompatParcelizer = new ArrayList<>();
            this.write = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplApi21Parcelizer = 1.0f;
            this.AudioAttributesImplApi26Parcelizer = 1.0f;
            this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
            this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
            Matrix matrix = new Matrix();
            this.AudioAttributesCompatParcelizer = matrix;
            this.MediaBrowserCompatItemReceiver = null;
            this.write = iconCompatParcelizer.write;
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
            this.AudioAttributesImplBaseParcelizer = iconCompatParcelizer.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            this.MediaMetadataCompat = iconCompatParcelizer.MediaMetadataCompat;
            this.RatingCompat = iconCompatParcelizer.RatingCompat;
            this.MediaDescriptionCompat = iconCompatParcelizer.MediaDescriptionCompat;
            String str = iconCompatParcelizer.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatItemReceiver = str;
            this.RemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer;
            if (str != null) {
                settitleoptional.put(str, this);
            }
            matrix.set(iconCompatParcelizer.AudioAttributesCompatParcelizer);
            ArrayList<RemoteActionCompatParcelizer> arrayList = iconCompatParcelizer.IconCompatParcelizer;
            for (int i = 0; i < arrayList.size(); i++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = arrayList.get(i);
                if (remoteActionCompatParcelizer instanceof IconCompatParcelizer) {
                    this.IconCompatParcelizer.add(new IconCompatParcelizer((IconCompatParcelizer) remoteActionCompatParcelizer, settitleoptional));
                } else {
                    if (remoteActionCompatParcelizer instanceof write) {
                        audioAttributesCompatParcelizer = new write((write) remoteActionCompatParcelizer);
                    } else if (remoteActionCompatParcelizer instanceof AudioAttributesCompatParcelizer) {
                        audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer((AudioAttributesCompatParcelizer) remoteActionCompatParcelizer);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.IconCompatParcelizer.add(audioAttributesCompatParcelizer);
                    if (audioAttributesCompatParcelizer.MediaDescriptionCompat != null) {
                        settitleoptional.put(audioAttributesCompatParcelizer.MediaDescriptionCompat, audioAttributesCompatParcelizer);
                    }
                }
            }
        }

        public IconCompatParcelizer() {
            super();
            this.read = new Matrix();
            this.IconCompatParcelizer = new ArrayList<>();
            this.write = BitmapDescriptorFactory.HUE_RED;
            this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplApi21Parcelizer = 1.0f;
            this.AudioAttributesImplApi26Parcelizer = 1.0f;
            this.MediaMetadataCompat = BitmapDescriptorFactory.HUE_RED;
            this.RatingCompat = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesCompatParcelizer = new Matrix();
            this.MediaBrowserCompatItemReceiver = null;
        }

        public String getGroupName() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public Matrix getLocalMatrix() {
            return this.AudioAttributesCompatParcelizer;
        }

        public void RemoteActionCompatParcelizer(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayWrite = _parseLongPrimitive.write(resources, theme, attributeSet, currentToCanonicalPackageNames.IconCompatParcelizer);
            read(typedArrayWrite, xmlPullParser);
            typedArrayWrite.recycle();
        }

        private void read(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.MediaDescriptionCompat = null;
            this.write = _parseLongPrimitive.read(typedArray, xmlPullParser, "rotation", 5, this.write);
            this.MediaBrowserCompatCustomActionResultReceiver = typedArray.getFloat(1, this.MediaBrowserCompatCustomActionResultReceiver);
            this.AudioAttributesImplBaseParcelizer = typedArray.getFloat(2, this.AudioAttributesImplBaseParcelizer);
            this.AudioAttributesImplApi21Parcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "scaleX", 3, this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi26Parcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "scaleY", 4, this.AudioAttributesImplApi26Parcelizer);
            this.MediaMetadataCompat = _parseLongPrimitive.read(typedArray, xmlPullParser, "translateX", 6, this.MediaMetadataCompat);
            this.RatingCompat = _parseLongPrimitive.read(typedArray, xmlPullParser, "translateY", 7, this.RatingCompat);
            String string = typedArray.getString(0);
            if (string != null) {
                this.MediaBrowserCompatItemReceiver = string;
            }
            AudioAttributesCompatParcelizer();
        }

        private void AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.reset();
            this.AudioAttributesCompatParcelizer.postTranslate(-this.MediaBrowserCompatCustomActionResultReceiver, -this.AudioAttributesImplBaseParcelizer);
            this.AudioAttributesCompatParcelizer.postScale(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesCompatParcelizer.postRotate(this.write, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.AudioAttributesCompatParcelizer.postTranslate(this.MediaMetadataCompat + this.MediaBrowserCompatCustomActionResultReceiver, this.RatingCompat + this.AudioAttributesImplBaseParcelizer);
        }

        public float getRotation() {
            return this.write;
        }

        public void setRotation(float f) {
            if (f != this.write) {
                this.write = f;
                AudioAttributesCompatParcelizer();
            }
        }

        public float getPivotX() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public void setPivotX(float f) {
            if (f != this.MediaBrowserCompatCustomActionResultReceiver) {
                this.MediaBrowserCompatCustomActionResultReceiver = f;
                AudioAttributesCompatParcelizer();
            }
        }

        public float getPivotY() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public void setPivotY(float f) {
            if (f != this.AudioAttributesImplBaseParcelizer) {
                this.AudioAttributesImplBaseParcelizer = f;
                AudioAttributesCompatParcelizer();
            }
        }

        public float getScaleX() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public void setScaleX(float f) {
            if (f != this.AudioAttributesImplApi21Parcelizer) {
                this.AudioAttributesImplApi21Parcelizer = f;
                AudioAttributesCompatParcelizer();
            }
        }

        public float getScaleY() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public void setScaleY(float f) {
            if (f != this.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer = f;
                AudioAttributesCompatParcelizer();
            }
        }

        public float getTranslateX() {
            return this.MediaMetadataCompat;
        }

        public void setTranslateX(float f) {
            if (f != this.MediaMetadataCompat) {
                this.MediaMetadataCompat = f;
                AudioAttributesCompatParcelizer();
            }
        }

        public float getTranslateY() {
            return this.RatingCompat;
        }

        public void setTranslateY(float f) {
            if (f != this.RatingCompat) {
                this.RatingCompat = f;
                AudioAttributesCompatParcelizer();
            }
        }

        @Override // o.getActivityInfo.RemoteActionCompatParcelizer
        public boolean RemoteActionCompatParcelizer() {
            for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                if (this.IconCompatParcelizer.get(i).RemoteActionCompatParcelizer()) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.getActivityInfo.RemoteActionCompatParcelizer
        public boolean AudioAttributesCompatParcelizer(int[] iArr) {
            boolean zAudioAttributesCompatParcelizer = false;
            for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
                zAudioAttributesCompatParcelizer |= this.IconCompatParcelizer.get(i).AudioAttributesCompatParcelizer(iArr);
            }
            return zAudioAttributesCompatParcelizer;
        }
    }

    static abstract class read extends RemoteActionCompatParcelizer {
        protected _verifyNullForScalarCoercion.read[] MediaBrowserCompatSearchResultReceiver;
        String MediaDescriptionCompat;
        int MediaMetadataCompat;
        int RatingCompat;

        public boolean IconCompatParcelizer() {
            return false;
        }

        public read() {
            super();
            this.MediaBrowserCompatSearchResultReceiver = null;
            this.MediaMetadataCompat = 0;
        }

        public read(read readVar) {
            super();
            this.MediaBrowserCompatSearchResultReceiver = null;
            this.MediaMetadataCompat = 0;
            this.MediaDescriptionCompat = readVar.MediaDescriptionCompat;
            this.RatingCompat = readVar.RatingCompat;
            this.MediaBrowserCompatSearchResultReceiver = _verifyNullForScalarCoercion.write(readVar.MediaBrowserCompatSearchResultReceiver);
        }

        public void write(Path path) {
            path.reset();
            _verifyNullForScalarCoercion.read[] readVarArr = this.MediaBrowserCompatSearchResultReceiver;
            if (readVarArr != null) {
                _verifyNullForScalarCoercion.read.RemoteActionCompatParcelizer(readVarArr, path);
            }
        }

        public String getPathName() {
            return this.MediaDescriptionCompat;
        }

        public _verifyNullForScalarCoercion.read[] getPathData() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public void setPathData(_verifyNullForScalarCoercion.read[] readVarArr) {
            if (!_verifyNullForScalarCoercion.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, readVarArr)) {
                this.MediaBrowserCompatSearchResultReceiver = _verifyNullForScalarCoercion.write(readVarArr);
            } else {
                _verifyNullForScalarCoercion.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, readVarArr);
            }
        }
    }

    static class AudioAttributesCompatParcelizer extends read {
        @Override // o.getActivityInfo.read
        public boolean IconCompatParcelizer() {
            return true;
        }

        AudioAttributesCompatParcelizer() {
        }

        AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            super(audioAttributesCompatParcelizer);
        }

        public void IconCompatParcelizer(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (_parseLongPrimitive.read(xmlPullParser, "pathData")) {
                TypedArray typedArrayWrite = _parseLongPrimitive.write(resources, theme, attributeSet, currentToCanonicalPackageNames.AudioAttributesCompatParcelizer);
                AudioAttributesCompatParcelizer(typedArrayWrite, xmlPullParser);
                typedArrayWrite.recycle();
            }
        }

        private void AudioAttributesCompatParcelizer(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.MediaDescriptionCompat = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.MediaBrowserCompatSearchResultReceiver = _verifyNullForScalarCoercion.IconCompatParcelizer(string2);
            }
            this.MediaMetadataCompat = _parseLongPrimitive.read(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    static class write extends read {
        float AudioAttributesCompatParcelizer;
        float AudioAttributesImplApi21Parcelizer;
        float AudioAttributesImplApi26Parcelizer;
        float AudioAttributesImplBaseParcelizer;
        float IconCompatParcelizer;
        float MediaBrowserCompatCustomActionResultReceiver;
        Paint.Join MediaBrowserCompatItemReceiver;
        float MediaBrowserCompatMediaItem;
        Paint.Cap RemoteActionCompatParcelizer;
        private int[] handleMediaPlayPauseIfPendingOnHandler;
        _parseLong read;
        _parseLong write;

        write() {
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesCompatParcelizer = 1.0f;
            this.IconCompatParcelizer = 1.0f;
            this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplApi26Parcelizer = 1.0f;
            this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.RemoteActionCompatParcelizer = Paint.Cap.BUTT;
            this.MediaBrowserCompatItemReceiver = Paint.Join.MITER;
            this.AudioAttributesImplApi21Parcelizer = 4.0f;
        }

        write(write writeVar) {
            super(writeVar);
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesCompatParcelizer = 1.0f;
            this.IconCompatParcelizer = 1.0f;
            this.MediaBrowserCompatMediaItem = BitmapDescriptorFactory.HUE_RED;
            this.AudioAttributesImplApi26Parcelizer = 1.0f;
            this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.RemoteActionCompatParcelizer = Paint.Cap.BUTT;
            this.MediaBrowserCompatItemReceiver = Paint.Join.MITER;
            this.AudioAttributesImplApi21Parcelizer = 4.0f;
            this.handleMediaPlayPauseIfPendingOnHandler = writeVar.handleMediaPlayPauseIfPendingOnHandler;
            this.read = writeVar.read;
            this.AudioAttributesImplBaseParcelizer = writeVar.AudioAttributesImplBaseParcelizer;
            this.AudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer;
            this.write = writeVar.write;
            this.MediaMetadataCompat = writeVar.MediaMetadataCompat;
            this.IconCompatParcelizer = writeVar.IconCompatParcelizer;
            this.MediaBrowserCompatMediaItem = writeVar.MediaBrowserCompatMediaItem;
            this.AudioAttributesImplApi26Parcelizer = writeVar.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = writeVar.MediaBrowserCompatCustomActionResultReceiver;
            this.RemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer;
            this.MediaBrowserCompatItemReceiver = writeVar.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplApi21Parcelizer = writeVar.AudioAttributesImplApi21Parcelizer;
        }

        private Paint.Cap AudioAttributesCompatParcelizer(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join AudioAttributesCompatParcelizer(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        public void write(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayWrite = _parseLongPrimitive.write(resources, theme, attributeSet, currentToCanonicalPackageNames.write);
            read(typedArrayWrite, xmlPullParser, theme);
            typedArrayWrite.recycle();
        }

        private void read(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.handleMediaPlayPauseIfPendingOnHandler = null;
            if (_parseLongPrimitive.read(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.MediaDescriptionCompat = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.MediaBrowserCompatSearchResultReceiver = _verifyNullForScalarCoercion.IconCompatParcelizer(string2);
                }
                this.write = _parseLongPrimitive.RemoteActionCompatParcelizer(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.IconCompatParcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "fillAlpha", 12, this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(_parseLongPrimitive.read(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(_parseLongPrimitive.read(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.MediaBrowserCompatItemReceiver);
                this.AudioAttributesImplApi21Parcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.AudioAttributesImplApi21Parcelizer);
                this.read = _parseLongPrimitive.RemoteActionCompatParcelizer(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.AudioAttributesCompatParcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "strokeAlpha", 11, this.AudioAttributesCompatParcelizer);
                this.AudioAttributesImplBaseParcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "strokeWidth", 4, this.AudioAttributesImplBaseParcelizer);
                this.AudioAttributesImplApi26Parcelizer = _parseLongPrimitive.read(typedArray, xmlPullParser, "trimPathEnd", 6, this.AudioAttributesImplApi26Parcelizer);
                this.MediaBrowserCompatCustomActionResultReceiver = _parseLongPrimitive.read(typedArray, xmlPullParser, "trimPathOffset", 7, this.MediaBrowserCompatCustomActionResultReceiver);
                this.MediaBrowserCompatMediaItem = _parseLongPrimitive.read(typedArray, xmlPullParser, "trimPathStart", 5, this.MediaBrowserCompatMediaItem);
                this.MediaMetadataCompat = _parseLongPrimitive.read(typedArray, xmlPullParser, "fillType", 13, this.MediaMetadataCompat);
            }
        }

        @Override // o.getActivityInfo.RemoteActionCompatParcelizer
        public boolean RemoteActionCompatParcelizer() {
            return this.write.IconCompatParcelizer() || this.read.IconCompatParcelizer();
        }

        @Override // o.getActivityInfo.RemoteActionCompatParcelizer
        public boolean AudioAttributesCompatParcelizer(int[] iArr) {
            return this.read.AudioAttributesCompatParcelizer(iArr) | this.write.AudioAttributesCompatParcelizer(iArr);
        }

        int getStrokeColor() {
            return this.read.read();
        }

        void setStrokeColor(int i) {
            this.read.IconCompatParcelizer(i);
        }

        float getStrokeWidth() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        void setStrokeWidth(float f) {
            this.AudioAttributesImplBaseParcelizer = f;
        }

        float getStrokeAlpha() {
            return this.AudioAttributesCompatParcelizer;
        }

        void setStrokeAlpha(float f) {
            this.AudioAttributesCompatParcelizer = f;
        }

        int getFillColor() {
            return this.write.read();
        }

        void setFillColor(int i) {
            this.write.IconCompatParcelizer(i);
        }

        float getFillAlpha() {
            return this.IconCompatParcelizer;
        }

        void setFillAlpha(float f) {
            this.IconCompatParcelizer = f;
        }

        float getTrimPathStart() {
            return this.MediaBrowserCompatMediaItem;
        }

        void setTrimPathStart(float f) {
            this.MediaBrowserCompatMediaItem = f;
        }

        float getTrimPathEnd() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        void setTrimPathEnd(float f) {
            this.AudioAttributesImplApi26Parcelizer = f;
        }

        float getTrimPathOffset() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        void setTrimPathOffset(float f) {
            this.MediaBrowserCompatCustomActionResultReceiver = f;
        }
    }
}
