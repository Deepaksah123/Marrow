package kotlin;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.ValueClassSerializerStaticJsonValue;
import kotlin.setEntryLabelTextSize;

/* JADX INFO: loaded from: classes2.dex */
public final class UShortDeserializer {
    public final boolean AudioAttributesCompatParcelizer;
    public final File AudioAttributesImplApi21Parcelizer;
    public final String AudioAttributesImplApi26Parcelizer;
    public final Callable<InputStream> AudioAttributesImplBaseParcelizer;
    public final List<setVisibleXRangeMaximum> IconCompatParcelizer;
    public final Context MediaBrowserCompatCustomActionResultReceiver;
    public final ValueClassSerializerStaticJsonValue.IconCompatParcelizer MediaBrowserCompatItemReceiver;
    public final String MediaBrowserCompatMediaItem;
    public final ValueClassSerializerStaticJsonValue.write MediaBrowserCompatSearchResultReceiver;
    public final Executor MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final Intent MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final ValueClassSerializerStaticJsonValue.AudioAttributesImplApi21Parcelizer RatingCompat;
    public final List<ValueClassSerializerStaticJsonValue.read> RemoteActionCompatParcelizer;
    public final CurrentQuery handleMediaPlayPauseIfPendingOnHandler;
    public final boolean onAddQueueItem;
    public final setEntryLabelTextSize.AudioAttributesCompatParcelizer onCommand;
    public final setCenterTextTypeface onCustomAction;
    private boolean onMediaButtonEvent;
    public final List<Object> onPause;
    public final Executor onPlay;
    private final Set<Integer> onPlayFromMediaId;
    public final boolean read;
    public final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    public UShortDeserializer(Context context, String str, setEntryLabelTextSize.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ValueClassSerializerStaticJsonValue.write writeVar, List<? extends ValueClassSerializerStaticJsonValue.read> list, boolean z, ValueClassSerializerStaticJsonValue.IconCompatParcelizer iconCompatParcelizer, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, ValueClassSerializerStaticJsonValue.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, List<? extends Object> list2, List<? extends setVisibleXRangeMaximum> list3, boolean z4, setCenterTextTypeface setcentertexttypeface, CurrentQuery currentQuery) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(executor, "");
        toMagicModuleMetaRepoModel.write(executor2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.MediaBrowserCompatCustomActionResultReceiver = context;
        this.MediaBrowserCompatMediaItem = str;
        this.onCommand = audioAttributesCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = writeVar;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = iconCompatParcelizer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = executor;
        this.onPlay = executor2;
        this.MediaDescriptionCompat = intent;
        this.onAddQueueItem = z2;
        this.read = z3;
        this.onPlayFromMediaId = set;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.AudioAttributesImplApi21Parcelizer = file;
        this.AudioAttributesImplBaseParcelizer = callable;
        this.RatingCompat = audioAttributesImplApi21Parcelizer;
        this.onPause = list2;
        this.IconCompatParcelizer = list3;
        this.write = z4;
        this.onCustomAction = setcentertexttypeface;
        this.handleMediaPlayPauseIfPendingOnHandler = currentQuery;
        this.MediaMetadataCompat = intent != null;
        this.onMediaButtonEvent = true;
    }

    public final Set<Integer> RemoteActionCompatParcelizer() {
        return this.onPlayFromMediaId;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.onMediaButtonEvent;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.onMediaButtonEvent = z;
    }

    public final boolean AudioAttributesCompatParcelizer(int i, int i2) {
        return setMarker.RemoteActionCompatParcelizer(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UShortDeserializer AudioAttributesCompatParcelizer(Context context, String str, setEntryLabelTextSize.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ValueClassSerializerStaticJsonValue.write writeVar, List<? extends ValueClassSerializerStaticJsonValue.read> list, boolean z, ValueClassSerializerStaticJsonValue.IconCompatParcelizer iconCompatParcelizer, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, ValueClassSerializerStaticJsonValue.AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, List<? extends Object> list2, List<? extends setVisibleXRangeMaximum> list3, boolean z4, setCenterTextTypeface setcentertexttypeface, CurrentQuery currentQuery) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(executor, "");
        toMagicModuleMetaRepoModel.write(executor2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        return new UShortDeserializer(context, str, audioAttributesCompatParcelizer, writeVar, list, z, iconCompatParcelizer, executor, executor2, intent, z2, z3, set, str2, file, callable, audioAttributesImplApi21Parcelizer, list2, list3, z4, setcentertexttypeface, currentQuery);
    }
}
