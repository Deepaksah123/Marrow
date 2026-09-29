package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin._init_lambda5;
import kotlin.getContext;

/* JADX INFO: loaded from: classes.dex */
public final class startIntentSenderForResult {
    private static startIntentSenderForResult RemoteActionCompatParcelizer;
    private static final PorterDuff.Mode write = PorterDuff.Mode.SRC_IN;
    private getContext IconCompatParcelizer;

    public static void IconCompatParcelizer() {
        synchronized (startIntentSenderForResult.class) {
            if (RemoteActionCompatParcelizer == null) {
                startIntentSenderForResult startintentsenderforresult = new startIntentSenderForResult();
                RemoteActionCompatParcelizer = startintentsenderforresult;
                startintentsenderforresult.IconCompatParcelizer = getContext.AudioAttributesCompatParcelizer();
                RemoteActionCompatParcelizer.IconCompatParcelizer.write(new getContext.RemoteActionCompatParcelizer() { // from class: o.startIntentSenderForResult.2
                    private final int[] read = {_init_lambda5.RemoteActionCompatParcelizer.abc_textfield_search_default_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_textfield_default_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_ab_share_pack_mtrl_alpha};
                    private final int[] IconCompatParcelizer = {_init_lambda5.RemoteActionCompatParcelizer.abc_ic_commit_search_api_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_seekbar_tick_mark_material, _init_lambda5.RemoteActionCompatParcelizer.abc_ic_menu_share_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_ic_menu_copy_mtrl_am_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_ic_menu_cut_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_ic_menu_selectall_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_ic_menu_paste_mtrl_am_alpha};
                    private final int[] write = {_init_lambda5.RemoteActionCompatParcelizer.abc_textfield_activated_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_textfield_search_activated_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_cab_background_top_mtrl_alpha, _init_lambda5.RemoteActionCompatParcelizer.abc_text_cursor_material, _init_lambda5.RemoteActionCompatParcelizer.abc_text_select_handle_left_mtrl, _init_lambda5.RemoteActionCompatParcelizer.abc_text_select_handle_middle_mtrl, _init_lambda5.RemoteActionCompatParcelizer.abc_text_select_handle_right_mtrl};
                    private final int[] RemoteActionCompatParcelizer = {_init_lambda5.RemoteActionCompatParcelizer.abc_popup_background_mtrl_mult, _init_lambda5.RemoteActionCompatParcelizer.abc_cab_background_internal_bg, _init_lambda5.RemoteActionCompatParcelizer.abc_menu_hardkey_panel_mtrl_mult};
                    private final int[] AudioAttributesImplBaseParcelizer = {_init_lambda5.RemoteActionCompatParcelizer.abc_tab_indicator_material, _init_lambda5.RemoteActionCompatParcelizer.abc_textfield_search_material};
                    private final int[] AudioAttributesCompatParcelizer = {_init_lambda5.RemoteActionCompatParcelizer.abc_btn_check_material, _init_lambda5.RemoteActionCompatParcelizer.abc_btn_radio_material, _init_lambda5.RemoteActionCompatParcelizer.abc_btn_check_material_anim, _init_lambda5.RemoteActionCompatParcelizer.abc_btn_radio_material_anim};

                    private ColorStateList AudioAttributesCompatParcelizer(Context context) {
                        return RemoteActionCompatParcelizer(context, setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorButtonNormal));
                    }

                    private ColorStateList read(Context context) {
                        return RemoteActionCompatParcelizer(context, 0);
                    }

                    private ColorStateList write(Context context) {
                        return RemoteActionCompatParcelizer(context, setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorAccent));
                    }

                    private ColorStateList RemoteActionCompatParcelizer(Context context, int i) {
                        int iIconCompatParcelizer = setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlHighlight);
                        int iAudioAttributesCompatParcelizer = setPositiveButton.AudioAttributesCompatParcelizer(context, _init_lambda5.read.colorButtonNormal);
                        int[] iArr = setPositiveButton.RemoteActionCompatParcelizer;
                        int[] iArr2 = setPositiveButton.write;
                        int i2 = _verifyNumberForScalarCoercion.read(iIconCompatParcelizer, i);
                        return new ColorStateList(new int[][]{iArr, iArr2, setPositiveButton.AudioAttributesCompatParcelizer, setPositiveButton.read}, new int[]{iAudioAttributesCompatParcelizer, i2, _verifyNumberForScalarCoercion.read(iIconCompatParcelizer, i), i});
                    }

                    private ColorStateList IconCompatParcelizer(Context context) {
                        int[][] iArr = new int[3][];
                        int[] iArr2 = new int[3];
                        ColorStateList colorStateListRemoteActionCompatParcelizer = setPositiveButton.RemoteActionCompatParcelizer(context, _init_lambda5.read.colorSwitchThumbNormal);
                        if (colorStateListRemoteActionCompatParcelizer != null && colorStateListRemoteActionCompatParcelizer.isStateful()) {
                            int[] iArr3 = setPositiveButton.RemoteActionCompatParcelizer;
                            iArr[0] = iArr3;
                            iArr2[0] = colorStateListRemoteActionCompatParcelizer.getColorForState(iArr3, 0);
                            iArr[1] = setPositiveButton.IconCompatParcelizer;
                            iArr2[1] = setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlActivated);
                            iArr[2] = setPositiveButton.read;
                            iArr2[2] = colorStateListRemoteActionCompatParcelizer.getDefaultColor();
                        } else {
                            iArr[0] = setPositiveButton.RemoteActionCompatParcelizer;
                            iArr2[0] = setPositiveButton.AudioAttributesCompatParcelizer(context, _init_lambda5.read.colorSwitchThumbNormal);
                            iArr[1] = setPositiveButton.IconCompatParcelizer;
                            iArr2[1] = setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlActivated);
                            iArr[2] = setPositiveButton.read;
                            iArr2[2] = setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorSwitchThumbNormal);
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    @Override // o.getContext.RemoteActionCompatParcelizer
                    public Drawable write(getContext getcontext, Context context, int i) {
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_cab_background_top_material) {
                            return new LayerDrawable(new Drawable[]{getcontext.read(context, _init_lambda5.RemoteActionCompatParcelizer.abc_cab_background_internal_bg), getcontext.read(context, _init_lambda5.RemoteActionCompatParcelizer.abc_cab_background_top_mtrl_alpha)});
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_ratingbar_material) {
                            return read(getcontext, context, _init_lambda5.AudioAttributesCompatParcelizer.abc_star_big);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_ratingbar_indicator_material) {
                            return read(getcontext, context, _init_lambda5.AudioAttributesCompatParcelizer.abc_star_medium);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_ratingbar_small_material) {
                            return read(getcontext, context, _init_lambda5.AudioAttributesCompatParcelizer.abc_star_small);
                        }
                        return null;
                    }

                    private LayerDrawable read(getContext getcontext, Context context, int i) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                        Drawable drawable = getcontext.read(context, _init_lambda5.RemoteActionCompatParcelizer.abc_star_black_48dp);
                        Drawable drawable2 = getcontext.read(context, _init_lambda5.RemoteActionCompatParcelizer.abc_star_half_black_48dp);
                        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) drawable2;
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, R.id.background);
                        layerDrawable.setId(1, R.id.secondaryProgress);
                        layerDrawable.setId(2, R.id.progress);
                        return layerDrawable;
                    }

                    private void AudioAttributesCompatParcelizer(Drawable drawable, int i, PorterDuff.Mode mode) {
                        IntentSenderRequest.write();
                        Drawable drawableMutate = drawable.mutate();
                        if (mode == null) {
                            mode = startIntentSenderForResult.write;
                        }
                        drawableMutate.setColorFilter(startIntentSenderForResult.IconCompatParcelizer(i, mode));
                    }

                    @Override // o.getContext.RemoteActionCompatParcelizer
                    public boolean read(Context context, int i, Drawable drawable) {
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            AudioAttributesCompatParcelizer(layerDrawable.findDrawableByLayerId(R.id.background), setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlNormal), startIntentSenderForResult.write);
                            AudioAttributesCompatParcelizer(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlNormal), startIntentSenderForResult.write);
                            AudioAttributesCompatParcelizer(layerDrawable.findDrawableByLayerId(R.id.progress), setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlActivated), startIntentSenderForResult.write);
                            return true;
                        }
                        if (i != _init_lambda5.RemoteActionCompatParcelizer.abc_ratingbar_material && i != _init_lambda5.RemoteActionCompatParcelizer.abc_ratingbar_indicator_material && i != _init_lambda5.RemoteActionCompatParcelizer.abc_ratingbar_small_material) {
                            return false;
                        }
                        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                        AudioAttributesCompatParcelizer(layerDrawable2.findDrawableByLayerId(R.id.background), setPositiveButton.AudioAttributesCompatParcelizer(context, _init_lambda5.read.colorControlNormal), startIntentSenderForResult.write);
                        AudioAttributesCompatParcelizer(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlActivated), startIntentSenderForResult.write);
                        AudioAttributesCompatParcelizer(layerDrawable2.findDrawableByLayerId(R.id.progress), setPositiveButton.IconCompatParcelizer(context, _init_lambda5.read.colorControlActivated), startIntentSenderForResult.write);
                        return true;
                    }

                    private boolean write(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // o.getContext.RemoteActionCompatParcelizer
                    public ColorStateList read(Context context, int i) {
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_edit_text_material) {
                            return getDefaultViewModelCreationExtras.IconCompatParcelizer(context, _init_lambda5.write.abc_tint_edittext);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_switch_track_mtrl_alpha) {
                            return getDefaultViewModelCreationExtras.IconCompatParcelizer(context, _init_lambda5.write.abc_tint_switch_track);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_switch_thumb_material) {
                            return IconCompatParcelizer(context);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_btn_default_mtrl_shape) {
                            return AudioAttributesCompatParcelizer(context);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_btn_borderless_material) {
                            return read(context);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_btn_colored_material) {
                            return write(context);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_spinner_mtrl_am_alpha || i == _init_lambda5.RemoteActionCompatParcelizer.abc_spinner_textfield_background_material) {
                            return getDefaultViewModelCreationExtras.IconCompatParcelizer(context, _init_lambda5.write.abc_tint_spinner);
                        }
                        if (write(this.IconCompatParcelizer, i)) {
                            return setPositiveButton.RemoteActionCompatParcelizer(context, _init_lambda5.read.colorControlNormal);
                        }
                        if (write(this.AudioAttributesImplBaseParcelizer, i)) {
                            return getDefaultViewModelCreationExtras.IconCompatParcelizer(context, _init_lambda5.write.abc_tint_default);
                        }
                        if (write(this.AudioAttributesCompatParcelizer, i)) {
                            return getDefaultViewModelCreationExtras.IconCompatParcelizer(context, _init_lambda5.write.abc_tint_btn_checkable);
                        }
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_seekbar_thumb_material) {
                            return getDefaultViewModelCreationExtras.IconCompatParcelizer(context, _init_lambda5.write.abc_tint_seek_thumb);
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[RETURN] */
                    @Override // o.getContext.RemoteActionCompatParcelizer
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean AudioAttributesCompatParcelizer(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
                        /*
                            r5 = this;
                            android.graphics.PorterDuff$Mode r0 = kotlin.startIntentSenderForResult.read()
                            int[] r1 = r5.read
                            boolean r1 = r5.write(r1, r7)
                            r2 = -1
                            r3 = 0
                            r4 = 1
                            if (r1 == 0) goto L12
                            int r5 = o._init_lambda5.read.colorControlNormal
                            goto L45
                        L12:
                            int[] r1 = r5.write
                            boolean r1 = r5.write(r1, r7)
                            if (r1 == 0) goto L1d
                            int r5 = o._init_lambda5.read.colorControlActivated
                            goto L45
                        L1d:
                            int[] r1 = r5.RemoteActionCompatParcelizer
                            boolean r5 = r5.write(r1, r7)
                            if (r5 == 0) goto L28
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                            goto L42
                        L28:
                            int r5 = o._init_lambda5.RemoteActionCompatParcelizer.abc_list_divider_mtrl_alpha
                            if (r7 != r5) goto L3b
                            r5 = 1109603123(0x42233333, float:40.8)
                            int r5 = java.lang.Math.round(r5)
                            r7 = 16842800(0x1010030, float:2.3693693E-38)
                            r1 = r0
                            r0 = r7
                            r7 = r5
                            r5 = r4
                            goto L4a
                        L3b:
                            int r5 = o._init_lambda5.RemoteActionCompatParcelizer.abc_dialog_material_background
                            if (r7 == r5) goto L42
                            r5 = r3
                            r7 = r5
                            goto L47
                        L42:
                            r5 = 16842801(0x1010031, float:2.3693695E-38)
                        L45:
                            r7 = r5
                            r5 = r4
                        L47:
                            r1 = r0
                            r0 = r7
                            r7 = r2
                        L4a:
                            if (r5 == 0) goto L64
                            kotlin.IntentSenderRequest.write()
                            android.graphics.drawable.Drawable r5 = r8.mutate()
                            int r6 = kotlin.setPositiveButton.IconCompatParcelizer(r6, r0)
                            android.graphics.PorterDuffColorFilter r6 = kotlin.startIntentSenderForResult.IconCompatParcelizer(r6, r1)
                            r5.setColorFilter(r6)
                            if (r7 == r2) goto L63
                            r5.setAlpha(r7)
                        L63:
                            return r4
                        L64:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.startIntentSenderForResult.AnonymousClass2.AudioAttributesCompatParcelizer(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    @Override // o.getContext.RemoteActionCompatParcelizer
                    public PorterDuff.Mode RemoteActionCompatParcelizer(int i) {
                        if (i == _init_lambda5.RemoteActionCompatParcelizer.abc_switch_thumb_material) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }
                });
            }
        }
    }

    public static startIntentSenderForResult write() {
        startIntentSenderForResult startintentsenderforresult;
        synchronized (startIntentSenderForResult.class) {
            if (RemoteActionCompatParcelizer == null) {
                IconCompatParcelizer();
            }
            startintentsenderforresult = RemoteActionCompatParcelizer;
        }
        return startintentsenderforresult;
    }

    public final Drawable AudioAttributesCompatParcelizer(Context context, int i) {
        Drawable drawable;
        synchronized (this) {
            drawable = this.IconCompatParcelizer.read(context, i);
        }
        return drawable;
    }

    final Drawable read(Context context, int i, boolean z) {
        Drawable drawable;
        synchronized (this) {
            drawable = this.IconCompatParcelizer.read(context, i, z);
        }
        return drawable;
    }

    public final void IconCompatParcelizer(Context context) {
        synchronized (this) {
            this.IconCompatParcelizer.IconCompatParcelizer(context);
        }
    }

    final ColorStateList write(Context context, int i) {
        ColorStateList colorStateListAudioAttributesCompatParcelizer;
        synchronized (this) {
            colorStateListAudioAttributesCompatParcelizer = this.IconCompatParcelizer.AudioAttributesCompatParcelizer(context, i);
        }
        return colorStateListAudioAttributesCompatParcelizer;
    }

    static void AudioAttributesCompatParcelizer(Drawable drawable, setView setview, int[] iArr) {
        getContext.read(drawable, setview, iArr);
    }

    public static PorterDuffColorFilter IconCompatParcelizer(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterIconCompatParcelizer;
        synchronized (startIntentSenderForResult.class) {
            porterDuffColorFilterIconCompatParcelizer = getContext.IconCompatParcelizer(i, mode);
        }
        return porterDuffColorFilterIconCompatParcelizer;
    }
}
