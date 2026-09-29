package kotlin;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.marrow.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0011\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014"}, d2 = {"Lo/determineIdealSelectedIndex;", "Lo/argCount;", "<init>", "()V", "Lo/determineIdealSelectedIndex$IconCompatParcelizer;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/determineIdealSelectedIndex$IconCompatParcelizer;)V", "Landroid/os/Bundle;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDestroyView", "Lo/buildSegmentList;", "write", "Lo/buildSegmentList;", "IconCompatParcelizer", "()Lo/buildSegmentList;", "RemoteActionCompatParcelizer", "Lo/determineIdealSelectedIndex$IconCompatParcelizer;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class determineIdealSelectedIndex extends argCount {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private IconCompatParcelizer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private buildSegmentList IconCompatParcelizer;

    public interface IconCompatParcelizer {
        void read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final buildSegmentList write() {
        buildSegmentList buildsegmentlist = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(buildsegmentlist);
        return buildsegmentlist;
    }

    public final void AudioAttributesCompatParcelizer(IconCompatParcelizer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = p0;
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        Serializable serializable;
        String string;
        String str;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), R.style.Theme_Marrow2);
        this.IconCompatParcelizer = buildSegmentList.AudioAttributesCompatParcelizer(LayoutInflater.from(contextThemeWrapper));
        Dialog dialog = new Dialog(contextThemeWrapper);
        dialog.setContentView(write().IconCompatParcelizer());
        dialog.setCancelable(false);
        Bundle arguments = getArguments();
        if (arguments == null) {
            serializable = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            serializable = arguments.getSerializable("key_error_config", standardIsEmpty.class);
        } else {
            serializable = arguments.getSerializable("key_error_config");
        }
        if (serializable == standardIsEmpty.AudioAttributesCompatParcelizer) {
            string = getString(R.string.text_video_pb_error);
        } else {
            string = getString(R.string.video_err_top_desc);
        }
        toMagicModuleMetaRepoModel.write((Object) string);
        if (serializable == standardIsEmpty.AudioAttributesCompatParcelizer) {
            TextView textView = write().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            bytesRead.read(textView, shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(contextRequireContext, R.attr.bodySmall, new TypedValue(), true));
            String string2 = getString(R.string.video_err_action_support_desc);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            String string3 = getString(R.string.support_email);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            sb.append(" ");
            sb.append(string3);
            String string4 = sb.toString();
            int length = string2.length() + 1;
            int length2 = string3.length() + length;
            SpannableString spannableString = new SpannableString(string4);
            if (length < length2 && length2 <= string4.length()) {
                spannableString.setSpan(new ForegroundColorSpan(createExtractors.RemoteActionCompatParcelizer(write().IconCompatParcelizer(), R.attr.onSurfaceBgLinks)), length, length2, 33);
                spannableString.setSpan(new write(), length, length2, 33);
            }
            str = spannableString;
        } else {
            TextView textView2 = write().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            bytesRead.read(textView2, shouldEscapeCharacter.Companion.AudioAttributesCompatParcelizer(contextRequireContext2, R.attr.heading6, new TypedValue(), true));
            String string5 = getString(R.string.video_err_action_restart_desc);
            toMagicModuleMetaRepoModel.write((Object) string5);
            str = string5;
        }
        write().read.setText(string);
        write().IconCompatParcelizer.setText(str);
        write().IconCompatParcelizer.setMovementMethod(LinkMovementMethod.getInstance());
        write().write.setOnClickListener(new View.OnClickListener() { // from class: o.getAllocatedBandwidth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                determineIdealSelectedIndex.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        return dialog;
    }

    public static final class write extends ClickableSpan {
        write() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            toMagicModuleMetaRepoModel.write(view, "");
            IconCompatParcelizer iconCompatParcelizer = determineIdealSelectedIndex.this.AudioAttributesCompatParcelizer;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.read();
            }
            determineIdealSelectedIndex.this.dismiss();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            toMagicModuleMetaRepoModel.write(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(createExtractors.RemoteActionCompatParcelizer(determineIdealSelectedIndex.this.write().IconCompatParcelizer(), R.attr.onSurfaceBgLinks));
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(determineIdealSelectedIndex determineidealselectedindex) {
        determineidealselectedindex.dismiss();
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.IconCompatParcelizer = null;
    }

    /* JADX INFO: renamed from: o.determineIdealSelectedIndex$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/determineIdealSelectedIndex$read;", "", "<init>", "()V", "Lo/standardIsEmpty;", "p0", "Lo/determineIdealSelectedIndex;", "RemoteActionCompatParcelizer", "(Lo/standardIsEmpty;)Lo/determineIdealSelectedIndex;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static determineIdealSelectedIndex RemoteActionCompatParcelizer(standardIsEmpty p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            determineIdealSelectedIndex determineidealselectedindex = new determineIdealSelectedIndex();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_error_config", p0);
            determineidealselectedindex.setArguments(bundle);
            return determineidealselectedindex;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final determineIdealSelectedIndex RemoteActionCompatParcelizer(standardIsEmpty standardisempty) {
        return Companion.RemoteActionCompatParcelizer(standardisempty);
    }
}
