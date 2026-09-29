package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin._init_lambda5;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class onMenuItemSelected extends MenuInflater {
    static final Class<?>[] read;
    static final Class<?>[] write;
    Context AudioAttributesCompatParcelizer;
    private Object AudioAttributesImplApi26Parcelizer;
    final Object[] IconCompatParcelizer;
    final Object[] RemoteActionCompatParcelizer;

    static {
        Class<?>[] clsArr = {Context.class};
        write = clsArr;
        read = clsArr;
    }

    public onMenuItemSelected(Context context) {
        super(context);
        this.AudioAttributesCompatParcelizer = context;
        Object[] objArr = {context};
        this.IconCompatParcelizer = objArr;
        this.RemoteActionCompatParcelizer = objArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof handleNestedArrayForSingle)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.AudioAttributesCompatParcelizer.getResources().getLayout(i);
                    AudioAttributesCompatParcelizer(layout, Xml.asAttributeSet(layout), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }

    private void AudioAttributesCompatParcelizer(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    } else if (name2.equals("item")) {
                        if (!audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                            if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.read()) {
                                audioAttributesCompatParcelizer.IconCompatParcelizer();
                            } else {
                                audioAttributesCompatParcelizer.read();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(attributeSet);
                } else if (name3.equals("item")) {
                    audioAttributesCompatParcelizer.write(attributeSet);
                } else if (name3.equals("menu")) {
                    AudioAttributesCompatParcelizer(xmlPullParser, attributeSet, audioAttributesCompatParcelizer.IconCompatParcelizer());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    final Object AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = read(this.AudioAttributesCompatParcelizer);
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    private Object read(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : read(((ContextWrapper) obj).getBaseContext());
    }

    static class RemoteActionCompatParcelizer implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] IconCompatParcelizer = {MenuItem.class};
        private Object AudioAttributesCompatParcelizer;
        private Method read;

        public RemoteActionCompatParcelizer(Object obj, String str) {
            this.AudioAttributesCompatParcelizer = obj;
            Class<?> cls = obj.getClass();
            try {
                this.read = cls.getMethod(str, IconCompatParcelizer);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.read.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.read.invoke(this.AudioAttributesCompatParcelizer, menuItem)).booleanValue();
                }
                this.read.invoke(this.AudioAttributesCompatParcelizer, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    class AudioAttributesCompatParcelizer {
        ThrowableDeserializer AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private String MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private char MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private boolean MediaMetadataCompat;
        private int RatingCompat;
        private int RemoteActionCompatParcelizer;
        private boolean handleMediaPlayPauseIfPendingOnHandler;
        private CharSequence onAddQueueItem;
        private int onCommand;
        private boolean onCustomAction;
        private String onFastForward;
        private int onMediaButtonEvent;
        private ColorStateList onPause = null;
        private PorterDuff.Mode onPlay = null;
        private int onPlayFromMediaId;
        private int onPlayFromSearch;
        private char onPlayFromUri;
        private CharSequence onPrepare;
        private CharSequence onPrepareFromMediaId;
        private CharSequence onPrepareFromSearch;
        private Menu onRewind;
        private boolean onSeekTo;
        private boolean read;

        public AudioAttributesCompatParcelizer(Menu menu) {
            this.onRewind = menu;
            RemoteActionCompatParcelizer();
        }

        public final void RemoteActionCompatParcelizer() {
            this.MediaBrowserCompatItemReceiver = 0;
            this.IconCompatParcelizer = 0;
            this.AudioAttributesImplApi26Parcelizer = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.AudioAttributesImplApi21Parcelizer = true;
            this.read = true;
        }

        public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = onMenuItemSelected.this.AudioAttributesCompatParcelizer.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.MenuGroup);
            this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuGroup_android_id, 0);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getInt(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuGroup_android_menuCategory, 0);
            this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getInt(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuGroup_android_orderInCategory, 0);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuGroup_android_checkableBehavior, 0);
            this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuGroup_android_visible, true);
            this.read = typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuGroup_android_enabled, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public final void write(AttributeSet attributeSet) {
            setTitle settitleIconCompatParcelizer = setTitle.IconCompatParcelizer(onMenuItemSelected.this.AudioAttributesCompatParcelizer, attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem);
            this.onMediaButtonEvent = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_id, 0);
            this.RatingCompat = (settitleIconCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_menuCategory, this.IconCompatParcelizer) & (-65536)) | (settitleIconCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_orderInCategory, this.AudioAttributesImplApi26Parcelizer) & 65535);
            this.onPrepareFromSearch = settitleIconCompatParcelizer.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_title);
            this.onPrepareFromMediaId = settitleIconCompatParcelizer.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_titleCondensed);
            this.onCommand = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_icon, 0);
            this.MediaBrowserCompatSearchResultReceiver = RemoteActionCompatParcelizer(settitleIconCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_alphabeticShortcut));
            this.MediaBrowserCompatMediaItem = settitleIconCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_alphabeticModifiers, 4096);
            this.onPlayFromUri = RemoteActionCompatParcelizer(settitleIconCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_numericShortcut));
            this.onPlayFromMediaId = settitleIconCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_numericModifiers, 4096);
            if (settitleIconCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_checkable)) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
            }
            this.onCustomAction = settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_checked, false);
            this.onSeekTo = settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_visible, this.AudioAttributesImplApi21Parcelizer);
            this.handleMediaPlayPauseIfPendingOnHandler = settitleIconCompatParcelizer.AudioAttributesCompatParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_enabled, this.read);
            this.onPlayFromSearch = settitleIconCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_showAsAction, -1);
            this.onFastForward = settitleIconCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_android_onClick);
            this.MediaDescriptionCompat = settitleIconCompatParcelizer.MediaBrowserCompatItemReceiver(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_actionLayout, 0);
            this.MediaBrowserCompatCustomActionResultReceiver = settitleIconCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_actionViewClass);
            String strAudioAttributesImplApi21Parcelizer = settitleIconCompatParcelizer.AudioAttributesImplApi21Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_actionProviderClass);
            this.AudioAttributesImplBaseParcelizer = strAudioAttributesImplApi21Parcelizer;
            if (strAudioAttributesImplApi21Parcelizer != null && this.MediaDescriptionCompat == 0 && this.MediaBrowserCompatCustomActionResultReceiver == null) {
                this.AudioAttributesCompatParcelizer = (ThrowableDeserializer) write(strAudioAttributesImplApi21Parcelizer, onMenuItemSelected.read, onMenuItemSelected.this.RemoteActionCompatParcelizer);
            } else {
                this.AudioAttributesCompatParcelizer = null;
            }
            this.onAddQueueItem = settitleIconCompatParcelizer.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_contentDescription);
            this.onPrepare = settitleIconCompatParcelizer.AudioAttributesImplBaseParcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_tooltipText);
            if (settitleIconCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_iconTintMode)) {
                this.onPlay = IntentSenderRequest.write(settitleIconCompatParcelizer.read(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_iconTintMode, -1), this.onPlay);
            } else {
                this.onPlay = null;
            }
            if (settitleIconCompatParcelizer.AudioAttributesImplApi26Parcelizer(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_iconTint)) {
                this.onPause = settitleIconCompatParcelizer.write(_init_lambda5.AudioAttributesImplApi26Parcelizer.MenuItem_iconTint);
            } else {
                this.onPause = null;
            }
            settitleIconCompatParcelizer.write();
            this.MediaMetadataCompat = false;
        }

        private static char RemoteActionCompatParcelizer(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private void read(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.onCustomAction).setVisible(this.onSeekTo).setEnabled(this.handleMediaPlayPauseIfPendingOnHandler).setCheckable(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver > 0).setTitleCondensed(this.onPrepareFromMediaId).setIcon(this.onCommand);
            int i = this.onPlayFromSearch;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.onFastForward != null) {
                if (onMenuItemSelected.this.AudioAttributesCompatParcelizer.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new RemoteActionCompatParcelizer(onMenuItemSelected.this.AudioAttributesCompatParcelizer(), this.onFastForward));
            }
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver >= 2) {
                if (menuItem instanceof onRetainNonConfigurationInstance) {
                    ((onRetainNonConfigurationInstance) menuItem).write(true);
                } else if (menuItem instanceof onUserLeaveHint) {
                    ((onUserLeaveHint) menuItem).read();
                }
            }
            String str = this.MediaBrowserCompatCustomActionResultReceiver;
            if (str != null) {
                menuItem.setActionView((View) write(str, onMenuItemSelected.write, onMenuItemSelected.this.IconCompatParcelizer));
            } else {
                z = false;
            }
            int i2 = this.MediaDescriptionCompat;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            ThrowableDeserializer throwableDeserializer = this.AudioAttributesCompatParcelizer;
            if (throwableDeserializer != null) {
                emptyMap.RemoteActionCompatParcelizer(menuItem, throwableDeserializer);
            }
            emptyMap.AudioAttributesCompatParcelizer(menuItem, this.onAddQueueItem);
            emptyMap.write(menuItem, this.onPrepare);
            emptyMap.IconCompatParcelizer(menuItem, this.MediaBrowserCompatSearchResultReceiver, this.MediaBrowserCompatMediaItem);
            emptyMap.write(menuItem, this.onPlayFromUri, this.onPlayFromMediaId);
            PorterDuff.Mode mode = this.onPlay;
            if (mode != null) {
                emptyMap.read(menuItem, mode);
            }
            ColorStateList colorStateList = this.onPause;
            if (colorStateList != null) {
                emptyMap.write(menuItem, colorStateList);
            }
        }

        public final void read() {
            this.MediaMetadataCompat = true;
            read(this.onRewind.add(this.MediaBrowserCompatItemReceiver, this.onMediaButtonEvent, this.RatingCompat, this.onPrepareFromSearch));
        }

        public final SubMenu IconCompatParcelizer() {
            this.MediaMetadataCompat = true;
            SubMenu subMenuAddSubMenu = this.onRewind.addSubMenu(this.MediaBrowserCompatItemReceiver, this.onMediaButtonEvent, this.RatingCompat, this.onPrepareFromSearch);
            read(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.MediaMetadataCompat;
        }

        private <T> T write(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, onMenuItemSelected.this.AudioAttributesCompatParcelizer.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
