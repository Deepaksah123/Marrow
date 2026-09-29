###### Class android.support.v4.media.AudioAttributesCompatParcelizer (android.support.v4.media.AudioAttributesCompatParcelizer)
.class public final Landroid/support/v4/media/AudioAttributesCompatParcelizer;
.super Landroidx/media/AudioAttributesCompatParcelizer;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Landroidx/media/AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/media/AudioAttributesCompat;
    .registers 1

    .line 10
    invoke-static {p0}, Landroidx/media/AudioAttributesCompatParcelizer;->read(Lo/getAllPermissionGroups;)Landroidx/media/AudioAttributesCompat;

    move-result-object p0

    return-object p0
.end method

.method public static write(Landroidx/media/AudioAttributesCompat;Lo/getAllPermissionGroups;)V
    .registers 2

    .line 14
    invoke-static {p0, p1}, Landroidx/media/AudioAttributesCompatParcelizer;->write(Landroidx/media/AudioAttributesCompat;Lo/getAllPermissionGroups;)V

    return-void
.end method
