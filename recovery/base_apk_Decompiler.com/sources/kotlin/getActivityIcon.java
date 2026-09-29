package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.getActivityBanner;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class getActivityIcon extends getApplicationEnabledSetting implements getActivityBanner {
    private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private Animator.AnimatorListener AudioAttributesImplApi21Parcelizer;
    private ArgbEvaluator AudioAttributesImplApi26Parcelizer;
    private Context AudioAttributesImplBaseParcelizer;
    ArrayList<getActivityBanner.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;
    final Drawable.Callback read;
    IconCompatParcelizer write;

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

    getActivityIcon() {
        this(null, null, null);
    }

    private getActivityIcon(Context context) {
        this(context, null, null);
    }

    private getActivityIcon(Context context, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Resources resources) {
        this.AudioAttributesImplApi26Parcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.RemoteActionCompatParcelizer = null;
        Drawable.Callback callback = new Drawable.Callback() { // from class: o.getActivityIcon.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                getActivityIcon.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                getActivityIcon.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                getActivityIcon.this.unscheduleSelf(runnable);
            }
        };
        this.read = callback;
        this.AudioAttributesImplBaseParcelizer = context;
        if (remoteActionCompatParcelizer != null) {
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        } else {
            this.AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(context, remoteActionCompatParcelizer, callback, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.mutate();
        }
        return this;
    }

    public static getActivityIcon read(Context context, int i) {
        getActivityIcon getactivityicon = new getActivityIcon(context);
        getactivityicon.IconCompatParcelizer = _parseDoublePrimitive.read(context.getResources(), i, context.getTheme());
        getactivityicon.IconCompatParcelizer.setCallback(getactivityicon.read);
        getactivityicon.write = new IconCompatParcelizer(getactivityicon.IconCompatParcelizer.getConstantState());
        return getactivityicon;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.IconCompatParcelizer != null) {
            return new IconCompatParcelizer(this.IconCompatParcelizer.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getChangingConfigurations();
        }
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.draw(canvas);
            return;
        }
        this.AudioAttributesCompatParcelizer.write.draw(canvas);
        if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.setBounds(rect);
        } else {
            this.AudioAttributesCompatParcelizer.write.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.setState(iArr);
        }
        return this.AudioAttributesCompatParcelizer.write.setState(iArr);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.setLevel(i);
        }
        return this.AudioAttributesCompatParcelizer.write.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.IconCompatParcelizer != null) {
            return findFormatOverrides.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        return this.AudioAttributesCompatParcelizer.write.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.setAlpha(i);
        } else {
            this.AudioAttributesCompatParcelizer.write.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.setColorFilter(colorFilter);
        } else {
            this.AudioAttributesCompatParcelizer.write.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        if (this.IconCompatParcelizer != null) {
            return findFormatOverrides.read(this.IconCompatParcelizer);
        }
        return this.AudioAttributesCompatParcelizer.write.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, i);
        } else {
            this.AudioAttributesCompatParcelizer.write.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, colorStateList);
        } else {
            this.AudioAttributesCompatParcelizer.write.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.read(this.IconCompatParcelizer, mode);
        } else {
            this.AudioAttributesCompatParcelizer.write.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.setVisible(z, z2);
        }
        this.AudioAttributesCompatParcelizer.write.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.isStateful();
        }
        return this.AudioAttributesCompatParcelizer.write.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getOpacity();
        }
        return this.AudioAttributesCompatParcelizer.write.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getIntrinsicWidth();
        }
        return this.AudioAttributesCompatParcelizer.write.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer.getIntrinsicHeight();
        }
        return this.AudioAttributesCompatParcelizer.write.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.IconCompatParcelizer != null) {
            return findFormatOverrides.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer);
        }
        return this.AudioAttributesCompatParcelizer.write.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.read(this.IconCompatParcelizer, z);
        } else {
            this.AudioAttributesCompatParcelizer.write.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.RemoteActionCompatParcelizer(this.IconCompatParcelizer, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayWrite = _parseLongPrimitive.write(resources, theme, attributeSet, currentToCanonicalPackageNames.RemoteActionCompatParcelizer);
                    int resourceId = typedArrayWrite.getResourceId(0, 0);
                    if (resourceId != 0) {
                        getActivityInfo getactivityinfoAudioAttributesCompatParcelizer = getActivityInfo.AudioAttributesCompatParcelizer(resources, resourceId, theme);
                        getactivityinfoAudioAttributesCompatParcelizer.IconCompatParcelizer(false);
                        getactivityinfoAudioAttributesCompatParcelizer.setCallback(this.read);
                        if (this.AudioAttributesCompatParcelizer.write != null) {
                            this.AudioAttributesCompatParcelizer.write.setCallback(null);
                        }
                        this.AudioAttributesCompatParcelizer.write = getactivityinfoAudioAttributesCompatParcelizer;
                    }
                    typedArrayWrite.recycle();
                } else if (CourseConfigKeyConstantsKt.KEY_VIDEO_SUBJECT_ITEM_CHILD_TARGET.equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, currentToCanonicalPackageNames.read);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.AudioAttributesImplBaseParcelizer;
                        if (context != null) {
                            write(string, clearPackagePreferredActivities.AudioAttributesCompatParcelizer(context, resourceId2));
                        } else {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // kotlin.getApplicationEnabledSetting, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.IconCompatParcelizer != null) {
            findFormatOverrides.read(this.IconCompatParcelizer, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.IconCompatParcelizer != null) {
            return findFormatOverrides.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        }
        return false;
    }

    static class IconCompatParcelizer extends Drawable.ConstantState {
        private final Drawable.ConstantState RemoteActionCompatParcelizer;

        public IconCompatParcelizer(Drawable.ConstantState constantState) {
            this.RemoteActionCompatParcelizer = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            getActivityIcon getactivityicon = new getActivityIcon();
            getactivityicon.IconCompatParcelizer = this.RemoteActionCompatParcelizer.newDrawable();
            getactivityicon.IconCompatParcelizer.setCallback(getactivityicon.read);
            return getactivityicon;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            getActivityIcon getactivityicon = new getActivityIcon();
            getactivityicon.IconCompatParcelizer = this.RemoteActionCompatParcelizer.newDrawable(resources);
            getactivityicon.IconCompatParcelizer.setCallback(getactivityicon.read);
            return getactivityicon;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            getActivityIcon getactivityicon = new getActivityIcon();
            getactivityicon.IconCompatParcelizer = this.RemoteActionCompatParcelizer.newDrawable(resources, theme);
            getactivityicon.IconCompatParcelizer.setCallback(getactivityicon.read);
            return getactivityicon;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.RemoteActionCompatParcelizer.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.RemoteActionCompatParcelizer.getChangingConfigurations();
        }
    }

    static class RemoteActionCompatParcelizer extends Drawable.ConstantState {
        AnimatorSet AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        ArrayList<Animator> RemoteActionCompatParcelizer;
        setTitleOptional<Animator, String> read;
        getActivityInfo write;

        public RemoteActionCompatParcelizer(Context context, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Drawable.Callback callback, Resources resources) {
            if (remoteActionCompatParcelizer != null) {
                this.IconCompatParcelizer = remoteActionCompatParcelizer.IconCompatParcelizer;
                getActivityInfo getactivityinfo = remoteActionCompatParcelizer.write;
                if (getactivityinfo != null) {
                    Drawable.ConstantState constantState = getactivityinfo.getConstantState();
                    if (resources != null) {
                        this.write = (getActivityInfo) constantState.newDrawable(resources);
                    } else {
                        this.write = (getActivityInfo) constantState.newDrawable();
                    }
                    getActivityInfo getactivityinfo2 = (getActivityInfo) this.write.mutate();
                    this.write = getactivityinfo2;
                    getactivityinfo2.setCallback(callback);
                    this.write.setBounds(remoteActionCompatParcelizer.write.getBounds());
                    this.write.IconCompatParcelizer(false);
                }
                ArrayList<Animator> arrayList = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.RemoteActionCompatParcelizer = new ArrayList<>(size);
                    this.read = new setTitleOptional<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = remoteActionCompatParcelizer.RemoteActionCompatParcelizer.get(i);
                        Animator animatorClone = animator.clone();
                        String str = remoteActionCompatParcelizer.read.get(animator);
                        animatorClone.setTarget(this.write.RemoteActionCompatParcelizer(str));
                        this.RemoteActionCompatParcelizer.add(animatorClone);
                        this.read.put(animatorClone, str);
                    }
                    IconCompatParcelizer();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.IconCompatParcelizer;
        }

        public void IconCompatParcelizer() {
            if (this.AudioAttributesCompatParcelizer == null) {
                this.AudioAttributesCompatParcelizer = new AnimatorSet();
            }
            this.AudioAttributesCompatParcelizer.playTogether(this.RemoteActionCompatParcelizer);
        }
    }

    private void write(String str, Animator animator) {
        animator.setTarget(this.AudioAttributesCompatParcelizer.write.RemoteActionCompatParcelizer(str));
        if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer = new ArrayList<>();
            this.AudioAttributesCompatParcelizer.read = new setTitleOptional<>();
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.add(animator);
        this.AudioAttributesCompatParcelizer.read.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.IconCompatParcelizer != null) {
            return ((AnimatedVectorDrawable) this.IconCompatParcelizer).isRunning();
        }
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.IconCompatParcelizer != null) {
            ((AnimatedVectorDrawable) this.IconCompatParcelizer).start();
        } else {
            if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.isStarted()) {
                return;
            }
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.IconCompatParcelizer != null) {
            ((AnimatedVectorDrawable) this.IconCompatParcelizer).stop();
        } else {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.end();
        }
    }

    private static boolean AudioAttributesCompatParcelizer(AnimatedVectorDrawable animatedVectorDrawable, getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return animatedVectorDrawable.unregisterAnimationCallback(remoteActionCompatParcelizer.read());
    }

    public void RemoteActionCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.IconCompatParcelizer != null) {
            IconCompatParcelizer((AnimatedVectorDrawable) this.IconCompatParcelizer, remoteActionCompatParcelizer);
            return;
        }
        if (remoteActionCompatParcelizer != null) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new ArrayList<>();
            }
            if (this.RemoteActionCompatParcelizer.contains(remoteActionCompatParcelizer)) {
                return;
            }
            this.RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
            if (this.AudioAttributesImplApi21Parcelizer == null) {
                this.AudioAttributesImplApi21Parcelizer = new AnimatorListenerAdapter() { // from class: o.getActivityIcon.3
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ArrayList arrayList = new ArrayList(getActivityIcon.this.RemoteActionCompatParcelizer);
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((getActivityBanner.RemoteActionCompatParcelizer) arrayList.get(i)).read(getActivityIcon.this);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ArrayList arrayList = new ArrayList(getActivityIcon.this.RemoteActionCompatParcelizer);
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((getActivityBanner.RemoteActionCompatParcelizer) arrayList.get(i)).AudioAttributesCompatParcelizer(getActivityIcon.this);
                        }
                    }
                };
            }
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.addListener(this.AudioAttributesImplApi21Parcelizer);
        }
    }

    private static void IconCompatParcelizer(AnimatedVectorDrawable animatedVectorDrawable, getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        animatedVectorDrawable.registerAnimationCallback(remoteActionCompatParcelizer.read());
    }

    private void read() {
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.removeListener(this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi21Parcelizer = null;
        }
    }

    public boolean read(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.IconCompatParcelizer != null) {
            AudioAttributesCompatParcelizer((AnimatedVectorDrawable) this.IconCompatParcelizer, remoteActionCompatParcelizer);
        }
        ArrayList<getActivityBanner.RemoteActionCompatParcelizer> arrayList = this.RemoteActionCompatParcelizer;
        if (arrayList == null || remoteActionCompatParcelizer == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(remoteActionCompatParcelizer);
        if (this.RemoteActionCompatParcelizer.size() == 0) {
            read();
        }
        return zRemove;
    }
}
