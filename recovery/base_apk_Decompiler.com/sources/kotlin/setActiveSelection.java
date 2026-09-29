package kotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.marrow.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0014\u0010\u0016J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0016J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0017J-\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0019R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d"}, d2 = {"Lo/setActiveSelection;", "Landroid/widget/PopupWindow;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "Lkotlin/Function0;", "p3", "Lo/isVariantUrl;", "p4", "<init>", "(Landroid/content/Context;ILo/getAnswerMap;Lo/getCreatedOnDateMs;Lo/isVariantUrl;)V", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;I)V", "IconCompatParcelizer", "(Landroid/content/Context;)V", "RemoteActionCompatParcelizer", "write", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "()V", "Landroid/view/View;", "(Landroid/view/View;ILandroid/content/Context;I)V", "read", "Lo/getAnswerMap;", "Lo/getCreatedOnDateMs;", "Lo/isVariantUrl;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setActiveSelection extends PopupWindow {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final isVariantUrl read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<Integer, getShowPopup> write;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setActiveSelection(Context context, int i, getAnswerMap getanswermap, getCreatedOnDateMs getcreatedondatems, isVariantUrl isvarianturl, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i2 & 16) != 0) {
            isvarianturl = isVariantUrl.read(LayoutInflater.from(context));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(isvarianturl, "");
        }
        this(context, i, getanswermap, getcreatedondatems, isvarianturl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private setActiveSelection(final Context context, int i, getAnswerMap<? super Integer, getShowPopup> getanswermap, getCreatedOnDateMs<getShowPopup> getcreatedondatems, isVariantUrl isvarianturl) {
        super((View) isvarianturl.IconCompatParcelizer(), -2, -2, true);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(isvarianturl, "");
        this.write = getanswermap;
        this.IconCompatParcelizer = getcreatedondatems;
        this.read = isvarianturl;
        setTouchable(true);
        setOutsideTouchable(true);
        setAnimationStyle(R.style.PopupAnimation);
        setSoftInputMode(16);
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.TimePickerView
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                setActiveSelection.write(this.RemoteActionCompatParcelizer);
            }
        });
        getContentView();
        AudioAttributesCompatParcelizer(context, i);
        isvarianturl.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.RadialViewGroup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setActiveSelection.RemoteActionCompatParcelizer(this.write, context);
            }
        });
        isvarianturl.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.TimeModel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setActiveSelection.write(this.write, context);
            }
        });
        isvarianturl.write.setOnClickListener(new View.OnClickListener() { // from class: o.FabTransformationBehavior
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setActiveSelection.IconCompatParcelizer(this.RemoteActionCompatParcelizer, context);
            }
        });
        isvarianturl.read.setOnClickListener(new View.OnClickListener() { // from class: o.setHourClickDelegate
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setActiveSelection.read(this.IconCompatParcelizer, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(setActiveSelection setactiveselection) {
        setactiveselection.IconCompatParcelizer.invoke();
    }

    static final void RemoteActionCompatParcelizer(setActiveSelection setactiveselection, Context context) {
        setactiveselection.AudioAttributesCompatParcelizer(context);
        setactiveselection.write.invoke(0);
        setactiveselection.IconCompatParcelizer();
    }

    static final void write(setActiveSelection setactiveselection, Context context) {
        setactiveselection.write(context);
        setactiveselection.write.invoke(1);
        setactiveselection.IconCompatParcelizer();
    }

    static final void IconCompatParcelizer(setActiveSelection setactiveselection, Context context) {
        setactiveselection.RemoteActionCompatParcelizer(context);
        setactiveselection.write.invoke(2);
        setactiveselection.IconCompatParcelizer();
    }

    static final void read(setActiveSelection setactiveselection, Context context) {
        setactiveselection.IconCompatParcelizer(context);
        setactiveselection.write.invoke(3);
        setactiveselection.IconCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer(Context p0, int p1) {
        if (p1 == 0) {
            AudioAttributesCompatParcelizer(p0);
            return;
        }
        if (p1 == 1) {
            write(p0);
        } else if (p1 == 2) {
            RemoteActionCompatParcelizer(p0);
        } else {
            if (p1 != 3) {
                return;
            }
            IconCompatParcelizer(p0);
        }
    }

    private final void IconCompatParcelizer(Context p0) {
        ImageView imageView = this.read.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
        this.read.AudioAttributesImplBaseParcelizer.setImageDrawable(_isNaN.getDrawable(p0, R.drawable.blue_tick_revamp));
        ImageView imageView2 = this.read.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView2);
        ImageView imageView3 = this.read.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView3);
        ImageView imageView4 = this.read.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView4);
        TextView textView = this.read.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        write(textView);
        TextView textView2 = this.read.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        RemoteActionCompatParcelizer(textView2);
        TextView textView3 = this.read.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        RemoteActionCompatParcelizer(textView3);
        TextView textView4 = this.read.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
        RemoteActionCompatParcelizer(textView4);
    }

    private final void RemoteActionCompatParcelizer(Context p0) {
        ImageView imageView = this.read.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
        this.read.AudioAttributesImplApi26Parcelizer.setImageDrawable(_isNaN.getDrawable(p0, R.drawable.blue_tick_revamp));
        ImageView imageView2 = this.read.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView2);
        ImageView imageView3 = this.read.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView3);
        ImageView imageView4 = this.read.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView4);
        TextView textView = this.read.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        write(textView);
        TextView textView2 = this.read.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        RemoteActionCompatParcelizer(textView2);
        TextView textView3 = this.read.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        RemoteActionCompatParcelizer(textView3);
        TextView textView4 = this.read.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
        RemoteActionCompatParcelizer(textView4);
    }

    private final void write(Context p0) {
        ImageView imageView = this.read.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView);
        ImageView imageView2 = this.read.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView2);
        this.read.AudioAttributesImplApi21Parcelizer.setImageDrawable(_isNaN.getDrawable(p0, R.drawable.blue_tick_revamp));
        ImageView imageView3 = this.read.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView3);
        ImageView imageView4 = this.read.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView4);
        TextView textView = this.read.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        write(textView);
        TextView textView2 = this.read.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        RemoteActionCompatParcelizer(textView2);
        TextView textView3 = this.read.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        RemoteActionCompatParcelizer(textView3);
        TextView textView4 = this.read.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
        RemoteActionCompatParcelizer(textView4);
    }

    private final void AudioAttributesCompatParcelizer(Context p0) {
        ImageView imageView = this.read.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(imageView);
        this.read.RemoteActionCompatParcelizer.setImageDrawable(_isNaN.getDrawable(p0, R.drawable.blue_tick_revamp));
        ImageView imageView2 = this.read.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView2);
        ImageView imageView3 = this.read.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView3);
        ImageView imageView4 = this.read.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
        bytesRead.MediaBrowserCompatItemReceiver(imageView4);
        TextView textView = this.read.MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        write(textView);
        TextView textView2 = this.read.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        RemoteActionCompatParcelizer(textView2);
        TextView textView3 = this.read.MediaBrowserCompatMediaItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        RemoteActionCompatParcelizer(textView3);
        TextView textView4 = this.read.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
        RemoteActionCompatParcelizer(textView4);
    }

    private static void write(TextView p0) {
        bytesRead.read(p0, R.attr.heading6);
    }

    private static void RemoteActionCompatParcelizer(TextView p0) {
        bytesRead.read(p0, R.attr.bodyLarge);
    }

    private final void IconCompatParcelizer() {
        if (isShowing()) {
            dismiss();
        }
    }

    public final void IconCompatParcelizer(View p0, int p1, Context p2, int p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        IconCompatParcelizer();
        AudioAttributesCompatParcelizer(p2, p1);
        showAsDropDown(p0, -p3, 0);
    }
}
