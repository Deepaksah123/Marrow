package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import kotlin.AppInfoTableDecoder;
import kotlin.FlacReaderFlacOggSeeker;
import kotlin.getPresentationTimeUs;
import kotlin.outputMetadata;
import kotlin.setPendingRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getPresentationTimeUs.RemoteActionCompatParcelizer());
        arrayList.add(setPendingRuntimeException.IconCompatParcelizer());
        arrayList.add(outputMetadata.write("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(outputMetadata.write("fire-core", "20.3.3"));
        arrayList.add(outputMetadata.write("device-name", IconCompatParcelizer(Build.PRODUCT)));
        arrayList.add(outputMetadata.write("device-model", IconCompatParcelizer(Build.DEVICE)));
        arrayList.add(outputMetadata.write("device-brand", IconCompatParcelizer(Build.BRAND)));
        arrayList.add(outputMetadata.write("android-target-sdk", (outputMetadata.write<Context>) new outputMetadata.write() { // from class: o.SefReaderDataReference
            @Override // o.outputMetadata.write
            public final String write(Object obj) {
                return FirebaseCommonRegistrar.read((Context) obj);
            }
        }));
        arrayList.add(outputMetadata.write("android-min-sdk", (outputMetadata.write<Context>) new outputMetadata.write() { // from class: o.getSampleDescriptionEncryptionBox
            @Override // o.outputMetadata.write
            public final String write(Object obj) {
                return FirebaseCommonRegistrar.write((Context) obj);
            }
        }));
        arrayList.add(outputMetadata.write("android-platform", (outputMetadata.write<Context>) new outputMetadata.write() { // from class: o.copyWithFormat
            @Override // o.outputMetadata.write
            public final String write(Object obj) {
                return FirebaseCommonRegistrar.AudioAttributesCompatParcelizer((Context) obj);
            }
        }));
        arrayList.add(outputMetadata.write("android-installer", (outputMetadata.write<Context>) new outputMetadata.write() { // from class: o.sniffUnfragmented
            @Override // o.outputMetadata.write
            public final String write(Object obj) {
                return FirebaseCommonRegistrar.IconCompatParcelizer((Context) obj);
            }
        }));
        String strWrite = AppInfoTableDecoder.write();
        if (strWrite != null) {
            arrayList.add(outputMetadata.write("kotlin", strWrite));
        }
        return arrayList;
    }

    public static /* synthetic */ String read(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String write(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String AudioAttributesCompatParcelizer(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return TtmlNode.TEXT_EMPHASIS_AUTO;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    public static /* synthetic */ String IconCompatParcelizer(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? IconCompatParcelizer(installerPackageName) : "";
    }

    private static String IconCompatParcelizer(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }
}
