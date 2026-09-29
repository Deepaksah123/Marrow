package kotlin;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes4.dex */
public final class setHasDecor extends skippableArray implements View.OnClickListener {
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final SearchView AudioAttributesImplApi26Parcelizer;
    private final Context AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final WeakHashMap<String, Drawable.ConstantState> MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final SearchableInfo MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private ColorStateList RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private final int read;
    private int write;

    @Override // kotlin._addSuperInterfaces, android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public setHasDecor(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.MediaBrowserCompatCustomActionResultReceiver());
        this.RemoteActionCompatParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
        this.MediaDescriptionCompat = -1;
        this.MediaMetadataCompat = -1;
        this.MediaBrowserCompatMediaItem = -1;
        this.write = -1;
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.AudioAttributesCompatParcelizer = -1;
        this.AudioAttributesImplApi26Parcelizer = searchView;
        this.MediaBrowserCompatSearchResultReceiver = searchableInfo;
        this.read = searchView.RemoteActionCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = context;
        this.MediaBrowserCompatItemReceiver = weakHashMap;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    @Override // kotlin._addSuperInterfaces, o._contains.write
    public final Cursor read(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.AudioAttributesImplApi26Parcelizer.getVisibility() != 0 || this.AudioAttributesImplApi26Parcelizer.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursorAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, string);
            if (cursorAudioAttributesCompatParcelizer == null) {
                return null;
            }
            cursorAudioAttributesCompatParcelizer.getCount();
            return cursorAudioAttributesCompatParcelizer;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer());
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer());
    }

    private static void AudioAttributesCompatParcelizer(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // kotlin._addSuperInterfaces, o._contains.write
    public final void read(Cursor cursor) {
        try {
            super.read(cursor);
            if (cursor != null) {
                this.MediaDescriptionCompat = cursor.getColumnIndex("suggest_text_1");
                this.MediaMetadataCompat = cursor.getColumnIndex("suggest_text_2");
                this.MediaBrowserCompatMediaItem = cursor.getColumnIndex("suggest_text_2_url");
                this.write = cursor.getColumnIndex("suggest_icon_1");
                this.AudioAttributesImplApi21Parcelizer = cursor.getColumnIndex("suggest_icon_2");
                this.AudioAttributesCompatParcelizer = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // kotlin.skippableArray, kotlin._addSuperInterfaces
    public final View IconCompatParcelizer(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewIconCompatParcelizer = super.IconCompatParcelizer(context, cursor, viewGroup);
        viewIconCompatParcelizer.setTag(new AudioAttributesCompatParcelizer(viewIconCompatParcelizer));
        ((ImageView) viewIconCompatParcelizer.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.edit_query)).setImageResource(this.read);
        return viewIconCompatParcelizer;
    }

    static final class AudioAttributesCompatParcelizer {
        public final TextView AudioAttributesCompatParcelizer;
        public final ImageView IconCompatParcelizer;
        public final TextView RemoteActionCompatParcelizer;
        public final ImageView read;
        public final ImageView write;

        public AudioAttributesCompatParcelizer(View view) {
            this.RemoteActionCompatParcelizer = (TextView) view.findViewById(R.id.text1);
            this.AudioAttributesCompatParcelizer = (TextView) view.findViewById(R.id.text2);
            this.read = (ImageView) view.findViewById(R.id.icon1);
            this.IconCompatParcelizer = (ImageView) view.findViewById(R.id.icon2);
            this.write = (ImageView) view.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.edit_query);
        }
    }

    @Override // kotlin._addSuperInterfaces
    public final void read(View view, Cursor cursor) {
        CharSequence charSequenceWrite;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) view.getTag();
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer != null) {
            read(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer, write(cursor, this.MediaDescriptionCompat));
        }
        if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer != null) {
            String strWrite = write(cursor, this.MediaBrowserCompatMediaItem);
            if (strWrite != null) {
                charSequenceWrite = RemoteActionCompatParcelizer((CharSequence) strWrite);
            } else {
                charSequenceWrite = write(cursor, this.MediaMetadataCompat);
            }
            if (TextUtils.isEmpty(charSequenceWrite)) {
                if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer != null) {
                    audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setSingleLine(false);
                    audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setMaxLines(2);
                }
            } else if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer != null) {
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setSingleLine(true);
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setMaxLines(1);
            }
            read(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, charSequenceWrite);
        }
        if (audioAttributesCompatParcelizer.read != null) {
            read(audioAttributesCompatParcelizer.read, write(cursor), 4);
        }
        if (audioAttributesCompatParcelizer.IconCompatParcelizer != null) {
            read(audioAttributesCompatParcelizer.IconCompatParcelizer, IconCompatParcelizer(cursor), 8);
        }
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            audioAttributesCompatParcelizer.write.setVisibility(0);
            audioAttributesCompatParcelizer.write.setTag(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.getText());
            audioAttributesCompatParcelizer.write.setOnClickListener(this);
            return;
        }
        audioAttributesCompatParcelizer.write.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer((CharSequence) tag);
        }
    }

    private CharSequence RemoteActionCompatParcelizer(CharSequence charSequence) {
        if (this.RatingCompat == null) {
            TypedValue typedValue = new TypedValue();
            this.AudioAttributesImplBaseParcelizer.getTheme().resolveAttribute(_init_lambda5.read.textColorSearchUrl, typedValue, true);
            this.RatingCompat = this.AudioAttributesImplBaseParcelizer.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.RatingCompat, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private static void read(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private Drawable write(Cursor cursor) {
        int i = this.write;
        if (i == -1) {
            return null;
        }
        Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cursor.getString(i));
        return drawableRemoteActionCompatParcelizer != null ? drawableRemoteActionCompatParcelizer : IconCompatParcelizer();
    }

    private Drawable IconCompatParcelizer(Cursor cursor) {
        int i = this.AudioAttributesImplApi21Parcelizer;
        if (i == -1) {
            return null;
        }
        return RemoteActionCompatParcelizer(cursor.getString(i));
    }

    private static void read(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // kotlin._addSuperInterfaces, o._contains.write
    public final CharSequence RemoteActionCompatParcelizer(Cursor cursor) {
        String strWrite;
        String strWrite2;
        if (cursor == null) {
            return null;
        }
        String strWrite3 = write(cursor, "suggest_intent_query");
        if (strWrite3 != null) {
            return strWrite3;
        }
        if (this.MediaBrowserCompatSearchResultReceiver.shouldRewriteQueryFromData() && (strWrite2 = write(cursor, "suggest_intent_data")) != null) {
            return strWrite2;
        }
        if (!this.MediaBrowserCompatSearchResultReceiver.shouldRewriteQueryFromText() || (strWrite = write(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strWrite;
    }

    @Override // kotlin._addSuperInterfaces, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewIconCompatParcelizer = this.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer(), viewGroup);
            if (viewIconCompatParcelizer != null) {
                ((AudioAttributesCompatParcelizer) viewIconCompatParcelizer.getTag()).RemoteActionCompatParcelizer.setText(e.toString());
            }
            return viewIconCompatParcelizer;
        }
    }

    @Override // kotlin._addSuperInterfaces, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer(), viewGroup);
            if (viewRemoteActionCompatParcelizer != null) {
                ((AudioAttributesCompatParcelizer) viewRemoteActionCompatParcelizer.getTag()).RemoteActionCompatParcelizer.setText(e.toString());
            }
            return viewRemoteActionCompatParcelizer;
        }
    }

    private Drawable RemoteActionCompatParcelizer(String str) {
        if (str == null || str.isEmpty() || SessionDescription.SUPPORTED_SDP_VERSION.equals(str)) {
            return null;
        }
        try {
            int i = Integer.parseInt(str);
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(this.AudioAttributesImplBaseParcelizer.getPackageName());
            sb.append("/");
            sb.append(i);
            String string = sb.toString();
            Drawable drawableAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(string);
            if (drawableAudioAttributesCompatParcelizer != null) {
                return drawableAudioAttributesCompatParcelizer;
            }
            Drawable drawable = _isNaN.getDrawable(this.AudioAttributesImplBaseParcelizer, i);
            write(string, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(str);
            if (drawableAudioAttributesCompatParcelizer2 != null) {
                return drawableAudioAttributesCompatParcelizer2;
            }
            Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Uri.parse(str));
            write(str, drawableRemoteActionCompatParcelizer);
            return drawableRemoteActionCompatParcelizer;
        }
    }

    private Drawable RemoteActionCompatParcelizer(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return IconCompatParcelizer(uri);
                } catch (Resources.NotFoundException unused) {
                    StringBuilder sb = new StringBuilder("Resource does not exist: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
            }
            InputStream inputStreamOpenInputStream = this.AudioAttributesImplBaseParcelizer.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                StringBuilder sb2 = new StringBuilder("Failed to open ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException unused2) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                    Objects.toString(uri);
                }
            }
        } catch (FileNotFoundException e) {
            Objects.toString(uri);
            e.getMessage();
            return null;
        }
        Objects.toString(uri);
        e.getMessage();
        return null;
    }

    private Drawable AudioAttributesCompatParcelizer(String str) {
        Drawable.ConstantState constantState = this.MediaBrowserCompatItemReceiver.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private void write(String str, Drawable drawable) {
        if (drawable != null) {
            this.MediaBrowserCompatItemReceiver.put(str, drawable.getConstantState());
        }
    }

    private Drawable IconCompatParcelizer() {
        Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.getSearchActivity());
        return drawableRemoteActionCompatParcelizer != null ? drawableRemoteActionCompatParcelizer : this.AudioAttributesImplBaseParcelizer.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable RemoteActionCompatParcelizer(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (this.MediaBrowserCompatItemReceiver.containsKey(strFlattenToShortString)) {
            Drawable.ConstantState constantState = this.MediaBrowserCompatItemReceiver.get(strFlattenToShortString);
            if (constantState == null) {
                return null;
            }
            return constantState.newDrawable(this.AudioAttributesImplBaseParcelizer.getResources());
        }
        Drawable drawableIconCompatParcelizer = IconCompatParcelizer(componentName);
        this.MediaBrowserCompatItemReceiver.put(strFlattenToShortString, drawableIconCompatParcelizer != null ? drawableIconCompatParcelizer.getConstantState() : null);
        return drawableIconCompatParcelizer;
    }

    private Drawable IconCompatParcelizer(ComponentName componentName) {
        PackageManager packageManager = this.AudioAttributesImplBaseParcelizer.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, ((ComponentInfo) activityInfo).applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String write(Cursor cursor, String str) {
        return write(cursor, cursor.getColumnIndex(str));
    }

    private static String write(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    private Drawable IconCompatParcelizer(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
        try {
            Resources resourcesForApplication = this.AudioAttributesImplBaseParcelizer.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                }
            } else if (size == 2) {
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
            }
            if (identifier == 0) {
                throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
            }
            return resourcesForApplication.getDrawable(identifier);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
        }
    }

    private Cursor AudioAttributesCompatParcelizer(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        builderFragment.appendQueryParameter("limit", "50");
        return this.AudioAttributesImplBaseParcelizer.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr, null);
    }
}
