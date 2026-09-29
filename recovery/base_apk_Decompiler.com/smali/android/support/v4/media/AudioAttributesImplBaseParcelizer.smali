###### Class android.support.v4.media.AudioAttributesImplBaseParcelizer (android.support.v4.media.AudioAttributesImplBaseParcelizer)
.class public final Landroid/support/v4/media/AudioAttributesImplBaseParcelizer;
.super Landroidx/media/AudioAttributesImplBaseParcelizer;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 8
    invoke-direct {p0}, Landroidx/media/AudioAttributesImplBaseParcelizer;-><init>()V

    return-void
.end method

.method public static read(Lo/getAllPermissionGroups;)Landroidx/media/AudioAttributesImplBase;
    .registers 1

    .line 10
    invoke-static {p0}, Landroidx/media/AudioAttributesImplBaseParcelizer;->read(Lo/getAllPermissionGroups;)Landroidx/media/AudioAttributesImplBase;

    move-result-object p0

    return-object p0
.end method

.method public static write(Landroidx/media/AudioAttributesImplBase;Lo/getAllPermissionGroups;)V
    .registers 2

    .line 14
    invoke-static {p0, p1}, Landroidx/media/AudioAttributesImplBaseParcelizer;->write(Landroidx/media/AudioAttributesImplBase;Lo/getAllPermissionGroups;)V

    return-void
.end method
